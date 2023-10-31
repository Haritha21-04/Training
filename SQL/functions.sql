-- select upper('Haritha');

use hr;
select first_name, substr(first_name,3,2)
from employees;

select first_name, position('en' in first_name)
from employees;
select replace ('hello world','wor','go');
select repeat ('hello world',3);
select reverse('hello');
select char_length('   hello   '),
char_length(trim('   hello   '));


select round(56.87,-1),round(55.32),ceil(56.43),floor(58.22),
truncate(56.87,0),truncate(55.32,0);


-- system date 
select current_date();
-- or
select curdate();
select current_timestamp();


use hr;
select datediff(current_date(),hire_date)duration
from employees;
-- dispaly date 
select date_format(current_date,'%W %D %M %Y');

-- adding intervals of month,yr and day
select year(curdate()),month(curdate()),day(curdate());
select date_add(curdate(),interval 5 month);

-- extracting hrs,min secs,date,yr,mnth
select extract(month from curdate());
-- casting 
select cast('2023-10-19' as date);
select char_length(cast(150 as char));-- explicit
select char_length(233147);
-- conversion 
select convert('2023-10-05',date);

select now();

select lcase(first_name)
from employees;

select count(first_name),avg(salary),min(salary),max(salary)
from employees;

-- create subgroups(from->where->group->select->order)

select department_id,job_id,count(employee_id) empcount
from employees
group by department_id,job_id
having count(employee_id)>1 -- having empcount>1
order by empcount desc;

-- grp func does not consider nulls

select count(commission_pct),sum(commission_pct),
avg(commission_pct)
from employees;

select count(commission_pct),sum(commission_pct),
avg(ifnull(commission_pct),0)
from employees;

-- subquery
/*use hr;
select * from employees e
where salary>(select avg(salary) from employees where dept_id=e.dept_id)*/

/* subquery using exists
select * from employees e
where exists(select empid from employees where manager=e.emp_id