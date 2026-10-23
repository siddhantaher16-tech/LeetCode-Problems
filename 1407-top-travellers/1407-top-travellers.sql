# Write your MySQL query statement below
SELECT name, CASE 
             WHEN distance IS NULL THEN 0
             WHEN distance IS NOT NULL THEN sum(distance)
             END AS travelled_distance
FROM Users u LEFT JOIN Rides r
ON u.id=r.user_id
GROUP BY user_id
ORDER BY travelled_distance DESC, name;