/* Write your PL/SQL query statement below */
select email
FROM Person
GROUP BY email 
HAVING COUNT(email)>1;