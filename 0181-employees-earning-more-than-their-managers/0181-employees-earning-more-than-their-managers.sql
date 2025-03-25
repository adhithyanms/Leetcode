# Write your MySQL query statement below

select Emp.name as Employee from Employee Emp join Employee Mng where Emp.managerId = Mng.id and Emp.salary>Mng.salary;