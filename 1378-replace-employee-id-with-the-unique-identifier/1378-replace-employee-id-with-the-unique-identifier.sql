/* Write your PL/SQL query statement below */
SELECT u.unique_id, e.name
FROM Employees e, EmployeeUNI u
WHERE e.id=u.id(+);