SHOW TABLES;


-- Display employee information
USE hr;
SELECT
    employee_id AS employeeID,
    first_name,
    last_name,
    email,
    phone_number
FROM
    employees;


-- Display all columns of the JOB_HISTORY table
USE hr;
SELECT *
FROM job_history;

-- Display concatenated employee names
USE hr;
SELECT
    CONCAT(first_name, ' ', last_name) AS "EMPLOYEE NAME"
FROM
    employees;

-- Display employee information with job title
USE hr;
SELECT
    CONCAT(first_name, ' ', last_name, ' working as ', job_id) AS employee_info
FROM
    employees;
    
-- Display employee names with annual salary
USE hr;
SELECT
    CONCAT(first_name, ' ', last_name) AS employee_name,
    salary AS annual_salary
FROM
    employees;



