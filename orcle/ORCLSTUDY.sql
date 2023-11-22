select * 
from board 
where title like '%157%' and 
content like '%157%' and
id like 'test'
order by num desc;

select * from 
				(select rownum rnum, b.* 
				from 
				(select * from board 
				where
				order by num desc) 
				b) 
				where rnum between '123' and '123';