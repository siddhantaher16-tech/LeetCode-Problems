/* Write your PL/SQL query statement below */
-- SELECT *
-- FROM Users
-- WHERE email LIKE '%@%.com' AND 
--       email NOT LIKE '%.%@%1%2%3%4%5%6%7%8%9%';

SELECT * FROM Users
WHERE REGEXP_LIKE (email, '^[a-zA-Z0-9_]+@[a-zA-Z]+\.com$')
ORDER BY user_id;