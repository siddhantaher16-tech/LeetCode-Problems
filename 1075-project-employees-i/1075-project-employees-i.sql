/* Write your PL/SQL query statement below */
SELECT project_id, round(avg(experience_years),2) AS average_years
FROM Project NATURAL JOIN Employee
GROUP BY project_id
ORDER BY project_id