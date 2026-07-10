/* Write your PL/SQL query statement below */
SELECT name, bonus
FROM Employee E, Bonus B
WHERE E.empID=B.empID(+) AND
      (bonus<1000 OR bonus IS NULL) ;