CREATE TABLE BOOK(
    NO NUMBER PRIMARY KEY
    ,TITLE   VARCHAR2(100) NOT NULL
    ,RENTYN  CHAR(1) DEFAULT 'N' CHECK (RENTYN IN ('Y','N'))
    ,AUTHOR  VARCHAR2(20)
);

INSERT INTO BOOK VALUES (1, 'å1', 'N', '�۰�1');
INSERT INTO BOOK VALUES (2, 'å2', 'N', '�۰�2');
INSERT INTO BOOK VALUES (3, 'å3', 'N', '�۰�3');
INSERT INTO BOOK VALUES (4, 'å4', 'N', '�۰�4');
INSERT INTO BOOK VALUES (5, 'å5', 'N', '�۰�5');
INSERT INTO BOOK VALUES (6, 'å6', 'N', '�۰�6');

CREATE TABLE MEMBER (
    ID      VARCHAR2(20) PRIMARY KEY
    ,PW      VARCHAR2(20) NOT NULL
    ,NAME    VARCHAR2(20) NOT NULL
    ,ADMINYN CHAR(1) DEFAULT 'N' CHECK (ADMINYN IN ('Y','N'))
    ,STATUS  CHAR(1) DEFAULT 'N' CHECK (STATUS IN ('Y','N'))
    ,GRADE   CHAR(1) DEFAULT 'B'
);

INSERT INTO MEMBER VALUES ('admin','1234','������','Y','Y','B');

CREATE SEQUENCE SEQ_BOOK_NO;

CREATE TABLE �뿩(
    �뿩��ȣ    VARCHAR2(10)      PRIMARY KEY
    ,���̵�      VARCHAR2(20)
    ,������ȣ    NUMBER
    ,�뿩����    CHAR(1) DEFAULT 'Y'
    ,�뿩��     DATE    DEFAULT SYSDATE
    ,�ݳ���     DATE
    ,�ݳ�������  DATE --(�뿩��+7)
    ,��ü��     NUMBER
);

insert into �뿩 values 
(seq_�뿩.nextval, 'user',1,'Y','2023-04-28',null,to_date('2023-04-28')+7,null);
insert into �뿩 values 
(seq_�뿩.nextval, 'user',2,'Y','2023-04-28',null,to_date('2023-04-28')+7,null);
insert into �뿩 values 
(seq_�뿩.nextval, 'user',1,'N','2023-04-28',null,to_date('2023-04-28')+7,null);

select * from �뿩 where ����no=1 and �뿩����='Y';
create sequence seq_�뿩;
select * from �뿩 where ����no=1 and �뿩����='Y';


select no, title, �뿩����, author
from book, �뿩
where no = ������ȣ(+)
and �뿩����(+) = 'Y'
order by no;

select no, title, author, (select �뿩���� from �뿩 where ������ȣ=no and �뿩����='Y') 
from book 
order by no;


