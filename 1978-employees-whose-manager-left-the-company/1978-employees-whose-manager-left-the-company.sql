/* Write your PL/SQL query statement below */
SELECT employee_id
FROM Employees e
WHERE salary < 30000 AND
      e.manager_id IS NOT null AND
      NOT EXISTS (SELECT 1
                  FROM Employees m
                  WHERE e.manager_id=m.employee_id)
ORDER BY employee_id;