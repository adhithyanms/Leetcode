select actor_id , director_id
From ActorDirector 
-- where actor_id = director_id
group by actor_id ,director_id
having count(timestamp)>=3 ;