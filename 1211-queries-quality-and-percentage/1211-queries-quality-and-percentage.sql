select query_name ,
 Round(avg(rating/position),2) as quality , 
 Round(Avg(if(rating<3, 1,0)*100),2) as poor_query_percentage 
 from Queries group by query_name order by quality;