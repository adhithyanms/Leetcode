CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
declare nth int;
set nth=N-1;
  RETURN (
      # Write your MySQL query statement below.
      select distinct salary 
      from Employee
      order by salary desc 
      limit 1 offset  nth 

  );
END