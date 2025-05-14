# Write your MySQL query statement below
select user_id , 
ROUND(AVG(CASE WHEN activity_type='free_trial' THEN activity_duration END),2) as trial_avg_duration,
 ROUND(AVG(CASE when activity_type='paid' THEN activity_duration END ),2) as paid_avg_duration from UserActivity where activity_type in('free_trial','paid')  group by user_id having count(distinct activity_type)=2