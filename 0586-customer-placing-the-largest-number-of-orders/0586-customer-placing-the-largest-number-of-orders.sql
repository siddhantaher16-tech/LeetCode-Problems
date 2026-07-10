/* Write your PL/SQL query statement below */
SELECT customer_number
FROM Orders
GROUP BY customer_number 
HAVING count(customer_number) >= ALL (SELECT count(customer_number)
                                  FROM Orders
                                  GROUP BY customer_number) ; 