
-- Display names of employees and department names working in Europe
USE hr;
SELECT CONCAT(e.first_name, ' ', e.last_name) AS employee_name,d.department_name,region_name
FROM employees e
JOIN  departments d ON e.department_id = d.department_id
JOIN locations l ON d.location_id = l.location_id
JOIN countries c ON l.country_id = c.country_id
JOIN regions r ON c.region_id = r.region_id
-- WHERE r.region_name = 'Americas';
WHERE r.region_name = 'Europe';

-- Display department-wise details including the Manager's name
use hr;
SELECT d.department_id,d.department_name,CONCAT(m.first_name, ' ', m.last_name) AS manager_name,
COALESCE(CONCAT(m.first_name, ' ', m.last_name), 'No manager assigned yet') AS manager_display -- returns first not null
FROM departments d
LEFT JOIN employees m ON d.manager_id = m.employee_id;

-- Display old job title and current job title for each employee
use hr;
SELECT
    e.employee_id,
    CONCAT(e.first_name, ' ', e.last_name) AS employee_name,
    jh.start_date AS old_job_start_date,
    jh.end_date AS old_job_end_date,
    jh.job_id AS old_job_title,
    e.job_id AS current_job_title
FROM
    employees e
LEFT JOIN
    job_history jh ON e.employee_id = jh.employee_id
ORDER BY
    e.employee_id, jh.start_date DESC;