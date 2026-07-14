/* Write your PL/SQL query statement below */
SELECT query_name, round(sum(rating/position)/count(*),2) AS quality,
       round(count(CASE WHEN(rating<3)THEN rating ELSE null END)/count(*)*100,2) AS poor_query_percentage
FROM Queries
GROUP BY query_name ;