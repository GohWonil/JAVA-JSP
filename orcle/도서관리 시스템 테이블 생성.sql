CREATE TABLE BOOK(
    NO NUMBER PRIMARY KEY
    ,TITLE   VARCHAR2(100) NOT NULL
    ,RENTYN  CHAR(1) DEFAULT 'N' CHECK (RENTYN IN ('Y','N'))
    ,AUTHOR  VARCHAR2(20)
);

INSERT INTO BOOK VALUES (1, '책1', 'N', '작가1');
INSERT INTO BOOK VALUES (2, '책2', 'N', '작가2');
INSERT INTO BOOK VALUES (3, '책3', 'N', '작가3');
INSERT INTO BOOK VALUES (4, '책4', 'N', '작가4');
INSERT INTO BOOK VALUES (5, '책5', 'N', '작가5');
INSERT INTO BOOK VALUES (6, '책6', 'N', '작가6');

CREATE TABLE MEMBER (
    ID      VARCHAR2(20) PRIMARY KEY
    ,PW      VARCHAR2(20) NOT NULL
    ,NAME    VARCHAR2(20) NOT NULL
    ,ADMINYN CHAR(1) DEFAULT 'N' CHECK (ADMINYN IN ('Y','N'))
    ,STATUS  CHAR(1) DEFAULT 'N' CHECK (STATUS IN ('Y','N'))
    ,GRADE   CHAR(1) DEFAULT 'B'
);

INSERT INTO MEMBER VALUES ('admin','1234','관리자','Y','Y','B');

CREATE SEQUENCE SEQ_BOOK_NO;

CREATE TABLE 대여(
    대여번호    VARCHAR2(10)      PRIMARY KEY
    ,아이디      VARCHAR2(20)
    ,도서번호    NUMBER
    ,대여여부    CHAR(1) DEFAULT 'Y'
    ,대여일     DATE    DEFAULT SYSDATE
    ,반납일     DATE
    ,반납가능일  DATE --(대여일+7)
    ,연체일     NUMBER
);

insert into 대여 values 
(seq_대여.nextval, 'user',1,'Y','2023-04-28',null,to_date('2023-04-28')+7,null);
insert into 대여 values 
(seq_대여.nextval, 'user',2,'Y','2023-04-28',null,to_date('2023-04-28')+7,null);
insert into 대여 values 
(seq_대여.nextval, 'user',1,'N','2023-04-28',null,to_date('2023-04-28')+7,null);

select * from 대여 where 도서no=1 and 대여여부='Y';
create sequence seq_대여;
select * from 대여 where 도서no=1 and 대여여부='Y';


select no, title, 대여여부, author
from book, 대여
where no = 도서번호(+)
and 대여여부(+) = 'Y'
order by no;

select no, title, author, (select 대여여부 from 대여 where 도서번호=no and 대여여부='Y') 
from book 
order by no;


