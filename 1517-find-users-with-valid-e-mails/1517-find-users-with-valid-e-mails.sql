SELECT * 
FROM Users 
WHERE mail REGEXP '^[A-Za-z][-._A_Za-z0-9]*@leetcode[.]com$'

-- SELECT *
-- FROM Users
-- WHERE mail REGEXP '^[A-Za-z][A-Za-z0-9_.-]*@leetcode[.]com$';