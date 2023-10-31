-- Find the number of employees working in each country
use hr;
SELECT
    c.country_name,
    COUNT(e.employee_id) AS number_of_employees
FROM
    employees e
JOIN
    departments d ON e.department_id = d.department_id
JOIN
    locations l ON d.location_id = l.location_id
JOIN
    countries c ON l.country_id = c.country_id
GROUP BY
    c.country_name
ORDER BY
    number_of_employees DESC, c.country_name;

-- Find the number of employees reporting to each department head
USE hr;
SELECT
    d.manager_id AS department_head_id,
    CONCAT(m.first_name, ' ', m.last_name) AS department_head_name,
    COUNT(e.employee_id) AS number_of_employees
FROM
    departments d
JOIN
    employees m ON d.manager_id = m.employee_id
LEFT JOIN
    employees e ON d.department_id = e.department_id
GROUP BY
    d.manager_id, m.first_name, m.last_name
ORDER BY
    number_of_employees DESC, department_head_name;

-- Return the number of employees and average yearly salary by department and job category
USE hr;
SELECT
    d.department_id,
    d.department_name,
    e.job_id,
    COUNT(e.employee_id) AS number_of_employees,
    AVG(e.salary) AS average_salary
FROM
    employees e
JOIN
    departments d ON e.department_id = d.department_id
GROUP BY
    d.department_id, d.department_name, e.job_id
ORDER BY
    d.department_id, e.job_id;


-- Display department name, job title, total number of employees, and average salary
USE hr;
SELECT
    d.department_name,
    e.job_id,
    COUNT(e.employee_id) AS total_employees,
    AVG(e.salary) AS average_salary
FROM
    employees e
JOIN
    departments d ON e.department_id = d.department_id
GROUP BY
    d.department_name, e.job_id
ORDER BY
    d.department_name, e.job_id;