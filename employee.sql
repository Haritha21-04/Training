use hr;
select employee_id,first_name,e.department_id,department_name,city,salary
 from employees e join departments d
on e.department_id=d.department_id
join locations l
on d.location_id=l.location_id
and salary>8000