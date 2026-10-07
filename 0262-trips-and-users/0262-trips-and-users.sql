/* Write your PL/SQL query statement below */
/* Write your PL/SQL query statement below */


select request_at as day,
       round(sum(case when status in ('cancelled_by_driver',                            'cancelled_by_client')
        then 1 else 0 end)/count(*),2) as "Cancellation Rate"
from trips 
where client_id not in (select users_id 
                        from users 
                        where banned='Yes') and 
       driver_id not in (select users_id 
                        from users where banned='Yes') AND
       request_at between '2013-10-01' AND '2013-10-03' 
group by request_at;