/* Write your PL/SQL query statement below */
SELECT s.product_id, p.product_name
FROM Sales s, Product p
WHERE s.product_id=p.product_id
GROUP BY s.product_id, p.product_name
HAVING min(s.sale_date)>='2019-01-01' AND max(s.sale_date)<= '2019-03-31'