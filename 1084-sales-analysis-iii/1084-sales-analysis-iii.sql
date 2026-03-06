select p.product_id , p.product_name 
from Product p 
Join Sales s 
on p.product_id = s.product_id 
group by p.product_id 
having min(s.sale_date) Between '2019-01-01'  And '2019-03-31'
and max(s.sale_date) Between '2019-01-01'  And '2019-03-31';