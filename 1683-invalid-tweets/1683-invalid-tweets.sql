# Write your MySQL query statement below
SELECT tweet_id 
FROM (
    SELECT * 
    FROM Tweets 
    GROUP BY tweet_id 
    HAVING LENGTH(content)>15
)As tble;