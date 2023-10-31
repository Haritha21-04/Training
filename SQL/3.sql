
-- Display the second word of job_title if it has more than one word
use hr;
SELECT job_title,
CASE WHEN LENGTH(job_title) - LENGTH(REPLACE(job_title, ' ', '')) > 0 
THEN SUBSTRING_INDEX(SUBSTRING_INDEX(job_title, ' ', 2), ' ', -1)
        ELSE
            NULL END AS second_word_of_job_title
FROM jobs;

-- Replace occurrences of 'Manager' with 'Analyst' in job_title
use hr;
UPDATE jobs
SET job_title = REPLACE(job_title, 'Manager', 'Analyst');


-- Display previous job history with years of experience
use hr;
SELECT e.employee_id,CONCAT(e.first_name, ' ', e.last_name) AS employee_name,
    jh.start_date,jh.end_date,jh.job_id,jh.department_id,
    TIMESTAMPDIFF(YEAR, jh.start_date, jh.end_date) AS years_of_experience
FROM employees e
JOIN job_history jh ON e.employee_id = jh.employee_id
ORDER BY e.employee_id, jh.start_date;


-- Display details of employees with 'ON BENCH' for department ID where no employees are assigned
use hr;
SELECT e.employee_id, CONCAT(e.first_name, ' ', e.last_name) AS employee_name,e.department_id,
    'ON BENCH' AS assignment_status
FROM employees e
WHERE e.department_id IS NULL
    OR NOT EXISTS (
        SELECT 1
        FROM employees
        WHERE department_id = e.department_id
    );

 

USE hr;
-- Display revised salary based on job role
SELECT employee_id,CONCAT(first_name, ' ', last_name) AS employee_name,job_id,salary,
    CASE
        WHEN job_id = 'Manager' THEN salary * 1.5
        WHEN job_id = 'Representative' THEN salary * 1.2
        WHEN job_id = 'Programmer' THEN salary * 1.3
        ELSE salary -- Keep the salary unchanged for other job roles
    END AS revised_salary
FROM employees;

 

USE hr;
-- Display country-wise details with the region name using CASE expression
SELECT c.country_id,c.country_name,r.region_name
FROM countries c
JOIN regions r ON c.region_id = r.region_id;
    
    -- Display revised salary based on job role
    USE hr;
SELECT employee_id,CONCAT(first_name, ' ', last_name) AS employee_name,job_id,salary,
    CASE
        WHEN job_id = 'Manager' THEN salary * 1.5
        WHEN job_id = 'Representative' THEN salary * 1.2
        WHEN job_id = 'Programmer' THEN salary * 1.3
        ELSE salary -- Keep the salary unchanged for other job roles
    END AS revised_salary
FROM employees;


-- Display country-wise details with the region name using CASE expression
USE hr;
SELECT c.country_id,c.country_name,r.region_name
FROM countries c
JOIN regions r ON c.region_id = r.region_id;