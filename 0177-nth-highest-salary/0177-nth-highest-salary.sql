CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
DECLARE nth int;
SET nth = N-1;
  RETURN (
      # Write your MySQL query statement below.
        SELECT DISTINCT salary 
        FROM Employee 
        ORDER BY salary DESC 
        LIMIT 1 OFFSET nth 
  );
END