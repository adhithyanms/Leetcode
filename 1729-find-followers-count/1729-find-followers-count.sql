SELECT F1.user_id , COUNT(DISTINCT F1.follower_id) as followers_count 
FROM Followers F1
INNER JOIN Followers F2 
ON F1.user_id = F2.user_id 
GROUP BY user_id
ORDER BY F1.user_id;