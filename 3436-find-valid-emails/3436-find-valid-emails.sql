# Write your MySQL query statement below
select user_id ,email From Users where email like '%@%.com' and email not like '%.%@%.com'