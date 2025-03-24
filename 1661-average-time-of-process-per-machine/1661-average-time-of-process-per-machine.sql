SELECT A1.machine_id , round(avg(A2.timestamp-A1.timestamp),3)As processing_time
from Activity A1 
join Activity A2 
on A1.machine_id=A2.machine_id 
and A1.process_id=A2.process_id 
and A1.activity_type='start'
and A2.activity_type='end'
Group by A1.machine_id;