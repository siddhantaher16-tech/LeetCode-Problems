/* Write your PL/SQL query statement below */
-- SELECT name
-- FROM Employee
-- WHERE id IN (SELECT managerId
--             FROM Employee
--             GROUP BY managerId
--             HAVING COUNT(*)>4);

SELECT m.name
FROM Employee e, Employee m
WHERE e.managerId = m.id
GROUP BY m.id, m.name
HAVING count(*)>4;