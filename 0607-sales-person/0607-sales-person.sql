select s.name from SalesPerson s
except select  p.name from SalesPerson p 
left join orders o on p.sales_id=o.sales_id 
left join company c on c.com_id=o.com_id 
where c.name='RED'