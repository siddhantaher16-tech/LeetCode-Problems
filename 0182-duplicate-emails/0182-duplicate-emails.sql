/* Write your PL/SQL query statement below */
select email
from Person
group by email 
having Count(email)>1;