/* Write your PL/SQL query statement below */
select email
from Person
group by email 
HAVING COUNT(email)>1;