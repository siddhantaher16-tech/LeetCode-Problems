/* Write your PL/SQL query statement below */
-- SELECT EMP.name as Employee
-- FROM Employee EMP, Employee MGR
-- WHERE EMP.MANAGERID = MGR.ID AND
--       EMP.salary>MGR.salary;

-- SELECT e2.name as Employee
-- FROM employee e1 INNER JOIN employee e2
-- ON e1.id = e2.managerID
-- WHERE e1.salary < e2.salary
SELECT e2.name as Employee
FROM employee e1
INNER JOIN employee e2 ON e1.id = e2.managerID
WHERE
e1.salary < e2.salary