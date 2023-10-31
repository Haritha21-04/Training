-- Select employees in department 30
USE hr;
SELECT *
FROM employees
WHERE department_id = 30;

-- Select name, job, salary, and department number of employees in department 30, excluding purchase clerks
USE hr;
SELECT
    CONCAT(first_name, ' ', last_name) AS employee_name,job_id AS job,salary,department_id
FROM
    employees
WHERE
    department_id != 30
    AND job_id != 'PURCHASE CLERK';

-- Display employee name and department number for employees in departments 10 and 30
USE hr;
SELECT CONCAT(first_name, ' ', last_name) AS employee_name,department_id
FROM employees
WHERE department_id IN (10, 30)
ORDER BY employee_name;

-- Display employee information for hires between specified dates
use hr;
SELECT CONCAT(first_name, ' ', last_name) AS employee_name,job_id,email
FROM employees
WHERE hire_date BETWEEN '1993-01-01' AND '1995-12-31'
ORDER BY hire_date ASC;


-- Search for employees with the pattern 'A_B' in their name
use hr;
SELECT CONCAT(first_name, ' ', last_name) AS employee_name
FROM employees
where concat(first_name,last_name) like '%A_B%'
-- WHERE (first_name LIKE 'A_B' OR last_name LIKE 'A_B');
select * from employees
 