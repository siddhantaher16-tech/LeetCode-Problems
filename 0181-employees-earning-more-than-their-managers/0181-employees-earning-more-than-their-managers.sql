/* Write your PL/SQL query statement below */
SELECT E1.name as Employee
FROM Employee E1, Employee E2
WHERE E1.MANAGERID = E2.ID AND
      E1.salary>E2.salary;