SELECT Max(salary) as SecondHighestSalary from Employee 
where salary Not in ( 
    select max(salary) from Employee
) ; 