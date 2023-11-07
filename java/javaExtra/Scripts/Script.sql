create table user (
 	userid			varchar(50)			primary key,
 	username		varchar(50)			not null,
 	userpassword	varchar(50)			not null,
 	userage			numeric(3)			not null,
 	useremail		varchar(50)			not null
);

-- boards 테이블 생성
create table boards (
 	bno				int					primary key auto_increment,
 	btitle			varchar(100)		not null,
 	bcontent		longtext			not null,
 	bwriter			varchar(50)			not null,
 	bdate			datetime			default now(),
 	bfilename		varchar(50)			null,
 	bfiledata		longblob			null
);

-- accounts 테이블 생성
create table accounts (
	ano				varchar(50),
	owner			varchar(50)			not null,
	balance			numeric				not null,
	primary key(ano)
);

insert into accounts (ano, owner, balance)
	values ('111-111-1111', '한여름', 1000000);
	
insert into accounts (ano, owner, balance)
	values ('222-222-2222', '한겨울', 1000000);

-- insert into accounts (ano, owner, balance) values 
-- 	('333-333-3333', '한가을', 1000000),
-- 	('444-444-4444', '한봄', 100);
	
select * from accounts;