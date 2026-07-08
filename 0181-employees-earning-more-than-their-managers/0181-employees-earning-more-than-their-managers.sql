/* Write your PL/SQL query statement below */
SELECT EMP.name as Employee
FROM Employee EMP, Employee MGR
WHERE EMP.MANAGERID = MGR.ID AND
      EMP.salary>MGR.salary;