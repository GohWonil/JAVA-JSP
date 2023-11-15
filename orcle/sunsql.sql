--------------------------------------------------------
----------------sql developer 사용자 생성----------------
--------------------------------------------------------
-- -- 사용자 생성
-- CREATE USER shop IDENTIFIED BY 1234;
-- -- 권한 부여
-- GRANT CONNECT, RESOURCE TO shop;
--------------------------------------------------------
-- drop table t_shopping_member;
-- drop table t_shopping_goods;
-- drop table t_goods_detail_image;
-- drop table t_shopping_order;
-- drop table t_shopping_cart;
--------------------------------------------------------


--------------------------------------------------------
--  DDL for Table T_GOODS_DETAIL_IMAGE
--------------------------------------------------------

  CREATE TABLE "T_GOODS_DETAIL_IMAGE" 
   (   "IMAGE_ID" NUMBER(20,0) primary key, 
   "GOODS_ID" NUMBER(20,0), 
   "FILENAME" VARCHAR2(50 BYTE), 
   "REG_ID" VARCHAR2(20 BYTE), 
   "FILETYPE" VARCHAR2(40 BYTE), 
   "CREDATE" DATE DEFAULT sysdate
   ) ;
--------------------------------------------------------
--  DDL for Table T_SHOPPING_GOODS
--------------------------------------------------------

  CREATE TABLE "T_SHOPPING_GOODS" 
   (   "GOODS_ID" NUMBER(20,0) primary key, 
   "GOODS_SORT" VARCHAR2(50 BYTE),
   "GOODS_STATUS" VARCHAR2(50 BYTE), 
   "GOODS_TITLE" VARCHAR2(200 BYTE),  
   "GOODS_INTRO" VARCHAR2(2000 BYTE),  
   "GOODS_PRICE" number(5, 0),
   "GOODS_DELIVERY_PRICE" number(5, 0),
   "GOODS_DELIVERY_DATE" DATE,
   "GOODS_CREDATE" DATE DEFAULT sysdate
   ) ;
--------------------------------------------------------
--  DDL for Table T_SHOPPING_MEMBER
--------------------------------------------------------

   CREATE TABLE "T_SHOPPING_MEMBER" 
   (   "MEMBER_ID" VARCHAR2(20 BYTE) primary key, 
   "MEMBER_NAME" VARCHAR2(50 BYTE),
   "MEMBER_PW" VARCHAR2(20 BYTE), 
   "HP1" VARCHAR2(100 BYTE), 
   "ZIPCODE" VARCHAR2(20 BYTE), 
   "MEMBER_ADDRESS" VARCHAR2(500 BYTE), 
   "SUBADDRESS" VARCHAR2(500 BYTE), 
   "SUN_MONEY" NUMBER (10, 0),
   "JOINDATE" DATE DEFAULT sysdate, 
   "DEL_YN" VARCHAR2(20 BYTE) DEFAULT 'N'
   ) ;
--------------------------------------------------------
--  DDL for Table T_SHOPPING_ORDER
--------------------------------------------------------

  CREATE TABLE "T_SHOPPING_ORDER" 
   (   "ORDER_SEQ_NUM" NUMBER(20,0) primary key, 
   "ORDER_ID" NUMBER(20,0),
   "GOODS_ID" NUMBER(20,0),   
   "GOODS_TITLE" VARCHAR2(100 BYTE),
   "GOODS_PRICE" NUMBER(5,0),
   "GOODS_FILENAME" VARCHAR2(60 BYTE), 
   "ORDER_GOODS_QTY" NUMBER(5,0),
   "DELIVERY_STATE" VARCHAR2(20 BYTE),
      "MEMBER_ID" VARCHAR2(20 BYTE),
   "ORDERER_HP" VARCHAR2(50 BYTE), 
   "RECEIVER_NAME" VARCHAR2(50 BYTE), 
   "RECEIVER_HP1" VARCHAR2(20 BYTE), 
   "DELIVERY_ADDRESS" VARCHAR2(500 BYTE), 
   "PAY_METHOD" VARCHAR2(200 BYTE), 
   "CARD_COM_NAME" VARCHAR2(50 BYTE),  
   "PAY_ORDERER_HP_NUM" VARCHAR2(20 BYTE), 
   "CARD_PAY_MONTH" VARCHAR2(20 BYTE),
   "PAY_ORDER_TIME" DATE DEFAULT sysdate
   ) ;
--------------------------------------------------------
--  DDL for Table T_SHOPPING_CART
--------------------------------------------------------

  CREATE TABLE "T_SHOPPING_CART" 
   (   "MEMBER_ID" VARCHAR2(20 BYTE) primary key, 
   "GOODS_ID" NUMBER(20, 0), 
   "CART_ID" NUMBER(10, 0), 
   "CART_GOODS_QTY" NUMBER(4, 0) DEFAULT 1, 
   "CREDATE" DATE DEFAULT sysdate
   ) ;
--------------------------------------------------------



REM INSERTING into T_GOODS_DETAIL_IMAGE
SET DEFINE OFF;

-- 과일 insert

Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (101,       101,        'main.png',          'admin',    'main_image',       to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (102,       101,        'detail1.png',       'admin',    'detail_image1',    to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (103,       101,        'detail2.png',       'admin',    'detail_image2',    to_date('23/08/23','RR/MM/DD'));

Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (104,       102,        'main.png',          'admin',    'main_image',       to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (105,       102,        'detail1.png',       'admin',    'detail_image1',    to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (106,       102,        'detail2.png',       'admin',    'detail_image2',    to_date('23/08/23','RR/MM/DD'));

Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (107,       103,        'main.png',          'admin',    'main_image',       to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (108,       103,        'detail1.png',       'admin',    'detail_image1',    to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (109,       103,        'detail2.png',       'admin',    'detail_image2',    to_date('23/08/23','RR/MM/DD'));

Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (110,       104,        'main.png',          'admin',    'main_image',       to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (111,       104,        'detail1.png',       'admin',    'detail_image1',    to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (112,       104,        'detail2.png',       'admin',    'detail_image2',    to_date('23/08/23','RR/MM/DD'));

Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (113,       105,        'main.png',          'admin',    'main_image',       to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (114,       105,        'detail1.png',       'admin',    'detail_image1',    to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (115,       105,        'detail2.png',       'admin',    'detail_image2',    to_date('23/08/23','RR/MM/DD'));

------------------------------------------------------------------------------------------------------------------------------------------------

-- 곡류 insert

Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (116,       201,        'main.png',          'admin',    'main_image',       to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (117,       201,        'detail1.png',       'admin',    'detail_image1',    to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (118,       201,        'detail2.png',       'admin',    'detail_image2',    to_date('23/08/23','RR/MM/DD'));

Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (119,       202,        'main.png',          'admin',    'main_image',       to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (120,       202,        'detail1.png',       'admin',    'detail_image1',    to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (121,       202,        'detail2.png',       'admin',    'detail_image2',    to_date('23/08/23','RR/MM/DD'));

Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (122,       203,        'main.png',          'admin',    'main_image',       to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (123,       203,        'detail1.png',       'admin',    'detail_image1',    to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (124,       203,        'detail2.png',       'admin',    'detail_image2',    to_date('23/08/23','RR/MM/DD'));

Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (125,       204,        'main.png',          'admin',    'main_image',       to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (126,       204,        'detail1.png',       'admin',    'detail_image1',    to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (127,       204,        'detail2.png',       'admin',    'detail_image2',    to_date('23/08/23','RR/MM/DD'));

Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (128,       205,        'main.png',          'admin',    'main_image',       to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (129,       205,        'detail1.png',       'admin',    'detail_image1',    to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (130,       205,        'detail2.png',       'admin',    'detail_image2',    to_date('23/08/23','RR/MM/DD'));

------------------------------------------------------------------------------------------------------------------------------------------------

-- 채소 insert

Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (131,       301,        'main.png',          'admin',    'main_image',       to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (132,       301,        'detail1.png',       'admin',    'detail_image1',    to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (133,       301,        'detail2.png',       'admin',    'detail_image2',    to_date('23/08/23','RR/MM/DD'));

Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (134,       302,        'main.png',          'admin',    'main_image',       to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (135,       302,        'detail1.png',       'admin',    'detail_image1',    to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (136,       302,        'detail2.png',       'admin',    'detail_image2',    to_date('23/08/23','RR/MM/DD'));

Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (137,       303,        'main.png',          'admin',    'main_image',       to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (138,       303,        'detail1.png',       'admin',    'detail_image1',    to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (139,       303,        'detail2.png',       'admin',    'detail_image2',    to_date('23/08/23','RR/MM/DD'));

Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (140,       304,        'main.png',          'admin',    'main_image',       to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (141,       304,        'detail1.png',       'admin',    'detail_image1',    to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (142,       304,        'detail2.png',       'admin',    'detail_image2',    to_date('23/08/23','RR/MM/DD'));

Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (143,       305,        'main.png',          'admin',    'main_image',       to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (144,       305,        'detail1.png',       'admin',    'detail_image1',    to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (145,       305,        'detail2.png',       'admin',    'detail_image2',    to_date('23/08/23','RR/MM/DD'));


------------------------------------------------------------------------------------------------------------------------------------------------

-- 버섯 insert

Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (146,       401,        'main.png',          'admin',    'main_image',       to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (147,       401,        'detail1.png',       'admin',    'detail_image1',    to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (148,       401,        'detail2.png',       'admin',    'detail_image2',    to_date('23/08/23','RR/MM/DD'));

Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (149,       402,        'main.png',          'admin',    'main_image',       to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (150,       402,        'detail1.png',       'admin',    'detail_image1',    to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (151,       402,        'detail2.png',       'admin',    'detail_image2',    to_date('23/08/23','RR/MM/DD'));

Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (152,       403,        'main.png',          'admin',    'main_image',       to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (153,       403,        'detail1.png',       'admin',    'detail_image1',    to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (154,       403,        'detail2.png',       'admin',    'detail_image2',    to_date('23/08/23','RR/MM/DD'));

Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (155,       404,        'main.png',          'admin',    'main_image',       to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (156,       404,        'detail1.png',       'admin',    'detail_image1',    to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (157,       404,        'detail2.png',       'admin',    'detail_image2',    to_date('23/08/23','RR/MM/DD'));

Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (158,       405,        'main.png',          'admin',    'main_image',       to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (159,       405,        'detail1.png',       'admin',    'detail_image1',    to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (160,       405,        'detail2.png',       'admin',    'detail_image2',    to_date('23/08/23','RR/MM/DD'));


------------------------------------------------------------------------------------------------------------------------------------------------

-- 베스트셀러 insert

-- Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
-- values                           (161,       501,        'main.png',          'admin',    'main_image',       to_date('23/08/23','RR/MM/DD'));
-- Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
-- values                           (162,       501,        'detail1.png',       'admin',    'detail_image1',    to_date('23/08/23','RR/MM/DD'));
-- Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
-- values                           (163,       501,        'detail2.png',       'admin',    'detail_image2',    to_date('23/08/23','RR/MM/DD'));

Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (164,       502,        'main.png',          'admin',    'main_image',       to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (165,       502,        'detail1.png',       'admin',    'detail_image1',    to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (166,       502,        'detail2.png',       'admin',    'detail_image2',    to_date('23/08/23','RR/MM/DD'));

-- Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
-- values                           (167,       503,        'main.png',          'admin',    'main_image',       to_date('23/08/23','RR/MM/DD'));
-- Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
-- values                           (168,       503,        'detail1.png',       'admin',    'detail_image1',    to_date('23/08/23','RR/MM/DD'));
-- Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
-- values                           (169,       503,        'detail2.png',       'admin',    'detail_image2',    to_date('23/08/23','RR/MM/DD'));

-- Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
-- values                           (170,       504,        'main.png',          'admin',    'main_image',       to_date('23/08/23','RR/MM/DD'));
-- Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
-- values                           (171,       504,        'detail1.png',       'admin',    'detail_image1',    to_date('23/08/23','RR/MM/DD'));
-- Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
-- values                           (172,       504,        'detail2.png',       'admin',    'detail_image2',    to_date('23/08/23','RR/MM/DD'));

Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (173,       505,        'main.png',          'admin',    'main_image',       to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (174,       505,        'detail1.png',       'admin',    'detail_image1',    to_date('23/08/23','RR/MM/DD'));
Insert into T_GOODS_DETAIL_IMAGE (IMAGE_ID,  GOODS_ID,   FILENAME,            REG_ID,     FILETYPE,           CREDATE) 
values                           (175,       505,        'detail2.png',       'admin',    'detail_image2',    to_date('23/08/23','RR/MM/DD'));

------------------------------------------------------------------------------------------------------------------------------------------------



REM INSERTING into T_SHOPPING_GOODS
SET DEFINE OFF;

-- GOODS_SORT '과일' 카테고리
Insert into T_SHOPPING_GOODS (GOODS_ID,GOODS_SORT,GOODS_STATUS, GOODS_TITLE, GOODS_INTRO,GOODS_PRICE, GOODS_DELIVERY_PRICE,GOODS_DELIVERY_DATE )
values (101,'과일','cate_fruit','조생감귤L 3kg','주황빛을 띄기 시작하며 당도가 좋아 호불호 없는 감귤입니다.', 13900, 3000, to_date('23/08/23','RR/MM/DD'));
Insert into T_SHOPPING_GOODS (GOODS_ID,GOODS_SORT,GOODS_STATUS, GOODS_TITLE, GOODS_INTRO,GOODS_PRICE, GOODS_DELIVERY_PRICE,GOODS_DELIVERY_DATE )
values (102,'과일','cate_fruit','굿뜨래 멜론 8kg(2수)','굿뜨래는 부여군 공동 브랜드로 엄격한 기준을 통과한 상품만 굿뜨래 브랜드를 달 수 있습니다.', 24200, 3000, to_date('23/08/23','RR/MM/DD'));
Insert into T_SHOPPING_GOODS (GOODS_ID,GOODS_SORT,GOODS_STATUS, GOODS_TITLE, GOODS_INTRO,GOODS_PRICE, GOODS_DELIVERY_PRICE,GOODS_DELIVERY_DATE )
values (103,'과일','cate_fruit','의성사과 2.5kg','아삭아삭 산뜻한 과즙이 가득한 의성사과(부사) 입니다.', 26500, 3000, to_date('23/08/23','RR/MM/DD'));
Insert into T_SHOPPING_GOODS (GOODS_ID,GOODS_SORT,GOODS_STATUS, GOODS_TITLE, GOODS_INTRO,GOODS_PRICE, GOODS_DELIVERY_PRICE,GOODS_DELIVERY_DATE )
values (104,'과일','cate_fruit','아름답게 그린배 5kg','미네랄이 풍부하게 함유된 해풍을 4계절 내내 듬뿍 맞고 자랍니다.', 16900, 3000, to_date('23/08/23','RR/MM/DD'));
Insert into T_SHOPPING_GOODS (GOODS_ID,GOODS_SORT,GOODS_STATUS, GOODS_TITLE, GOODS_INTRO,GOODS_PRICE, GOODS_DELIVERY_PRICE,GOODS_DELIVERY_DATE )
values (105,'과일','cate_fruit','김천 샤인머스켓 2kg','영양이 풍부하고 망고향이 은은하게 난다하여 망고포도라 불리는 샤인머스켓입니다.', 30200, 3000, to_date('23/08/23','RR/MM/DD'));

-- GOODS_SORT '곡류' 카테고리
Insert into T_SHOPPING_GOODS (GOODS_ID,GOODS_SORT,GOODS_STATUS, GOODS_TITLE, GOODS_INTRO,GOODS_PRICE, GOODS_DELIVERY_PRICE,GOODS_DELIVERY_DATE )
values (201,'곡류','cate_grain','조은쌀 10kg','깨끗한 공기, 맑은 물, 비옥한 토양의 전라남도 영암군 생산.', 42000, 3000, to_date('23/08/23','RR/MM/DD'));
Insert into T_SHOPPING_GOODS (GOODS_ID,GOODS_SORT,GOODS_STATUS, GOODS_TITLE, GOODS_INTRO,GOODS_PRICE, GOODS_DELIVERY_PRICE,GOODS_DELIVERY_DATE )
values (202,'곡류','cate_grain','철원 오대쌀 10kg','비무장지대 DMZ에서 직접 농사지은 쌀.', 39000, 3000, to_date('23/08/23','RR/MM/DD'));
Insert into T_SHOPPING_GOODS (GOODS_ID,GOODS_SORT,GOODS_STATUS, GOODS_TITLE, GOODS_INTRO,GOODS_PRICE, GOODS_DELIVERY_PRICE,GOODS_DELIVERY_DATE )
values (203,'곡류','cate_grain','농사꾼 현미 10kg','인체에 유해한 쌀벌레 퇴치약을 쓰지 않는 깨끗하고 안전한 쌀.', 27900, 3000, to_date('23/08/23','RR/MM/DD'));
Insert into T_SHOPPING_GOODS (GOODS_ID,GOODS_SORT,GOODS_STATUS, GOODS_TITLE, GOODS_INTRO,GOODS_PRICE, GOODS_DELIVERY_PRICE,GOODS_DELIVERY_DATE )
values (204,'곡류','cate_grain','찰보리 10kg','깨끗하고 안전하게 재배하여 수확도정 한 찰보리.', 22900, 3000, to_date('23/08/23','RR/MM/DD'));
Insert into T_SHOPPING_GOODS (GOODS_ID,GOODS_SORT,GOODS_STATUS, GOODS_TITLE, GOODS_INTRO,GOODS_PRICE, GOODS_DELIVERY_PRICE,GOODS_DELIVERY_DATE )
values (205,'곡류','cate_grain','기장 700g','식이섬유와 비타민이 풍부, 특히 칼슘과 칼륨이 많이 들어있는 찰기장.', 10800, 3000, to_date('23/08/23','RR/MM/DD'));

-- GOODS_SORT '채소' 카테고리
Insert into T_SHOPPING_GOODS (GOODS_ID,GOODS_SORT,GOODS_STATUS, GOODS_TITLE, GOODS_INTRO,GOODS_PRICE, GOODS_DELIVERY_PRICE,GOODS_DELIVERY_DATE )
values (301,'채소','cate_vege','절임배추 10kg','대관령 원협작목반이 직접 관리하는 국내산 배추로 절임작업 됩니다.', 37000, 3000, to_date('23/08/23','RR/MM/DD'));
Insert into T_SHOPPING_GOODS (GOODS_ID,GOODS_SORT,GOODS_STATUS, GOODS_TITLE, GOODS_INTRO,GOODS_PRICE, GOODS_DELIVERY_PRICE,GOODS_DELIVERY_DATE )
values (302,'채소','cate_vege','못난이 파프리카 1kg','못난이라고 해서 맛이 떨어지지 않습니다. 아삭아삭한 식감과 달콤한 맛을 그대로 느낄 수 있습니다.', 10900, 3000, to_date('23/08/23','RR/MM/DD'));
Insert into T_SHOPPING_GOODS (GOODS_ID,GOODS_SORT,GOODS_STATUS, GOODS_TITLE, GOODS_INTRO,GOODS_PRICE, GOODS_DELIVERY_PRICE,GOODS_DELIVERY_DATE )
values (303,'채소','cate_vege','청양고추 500g','일반 고추보다 작은 크기에 과피가 두꺼운 특징을 가진 한국인이 사랑하는 매운맛의 청양고추입니다.', 8900, 3000, to_date('23/08/23','RR/MM/DD'));
Insert into T_SHOPPING_GOODS (GOODS_ID,GOODS_SORT,GOODS_STATUS, GOODS_TITLE, GOODS_INTRO,GOODS_PRICE, GOODS_DELIVERY_PRICE,GOODS_DELIVERY_DATE )
values (304,'채소','cate_vege','양배추 1kg','묵직하게 층층의 잎으로 속이 꽉 찬 양배추는 어느요리에나 잘 어울리는 재료입니다.', 6500, 3000, to_date('23/08/23','RR/MM/DD'));
Insert into T_SHOPPING_GOODS (GOODS_ID,GOODS_SORT,GOODS_STATUS, GOODS_TITLE, GOODS_INTRO,GOODS_PRICE, GOODS_DELIVERY_PRICE,GOODS_DELIVERY_DATE )
values (305,'채소','cate_vege','오감드레 백오이 4kg','청량한 풍미와 아삭아삭한 식감이 살아있는 오감드레 진천 오이입니다.', 18900, 3000, to_date('23/08/23','RR/MM/DD'));

-- GOODS_SORT '버섯' 카테고리
Insert into T_SHOPPING_GOODS (GOODS_ID,GOODS_SORT,GOODS_STATUS, GOODS_TITLE, GOODS_INTRO,GOODS_PRICE, GOODS_DELIVERY_PRICE,GOODS_DELIVERY_DATE )
values (401,'버섯','cate_mush','건표고버섯 200g','은은한 풍미가 가득한 건표고버섯은 쫄깃한 식감과 진한 향으로 음식에 맛을 더해줍니다.', 15900, 3000, to_date('23/08/23','RR/MM/DD'));
Insert into T_SHOPPING_GOODS (GOODS_ID,GOODS_SORT,GOODS_STATUS, GOODS_TITLE, GOODS_INTRO,GOODS_PRICE, GOODS_DELIVERY_PRICE,GOODS_DELIVERY_DATE )
values (402,'버섯','cate_mush','송화고버섯 1kg','갓과 대를 모두 이용 가능하며 자연송이와 유사한 식감과 향을 가지고 있습니다.', 17100, 3000, to_date('23/08/23','RR/MM/DD'));
Insert into T_SHOPPING_GOODS (GOODS_ID,GOODS_SORT,GOODS_STATUS, GOODS_TITLE, GOODS_INTRO,GOODS_PRICE, GOODS_DELIVERY_PRICE,GOODS_DELIVERY_DATE )
values (403,'버섯','cate_mush','목이버섯 1kg','탱글하고 야들야들한 식감으로 부드러워 맛있게 먹기 좋은 목이버섯입니다.', 12900, 3000, to_date('23/08/23','RR/MM/DD'));
Insert into T_SHOPPING_GOODS (GOODS_ID,GOODS_SORT,GOODS_STATUS, GOODS_TITLE, GOODS_INTRO,GOODS_PRICE, GOODS_DELIVERY_PRICE,GOODS_DELIVERY_DATE )
values (404,'버섯','cate_mush','미니새송이 2kg','쫄깃하고 풍부한 웰빙식품으로 육질이 부드럽고 단단하며 탄력이 있는 미니 새송이버섯입니다.', 12000, 3000, to_date('23/08/23','RR/MM/DD'));
Insert into T_SHOPPING_GOODS (GOODS_ID,GOODS_SORT,GOODS_STATUS, GOODS_TITLE, GOODS_INTRO,GOODS_PRICE, GOODS_DELIVERY_PRICE,GOODS_DELIVERY_DATE )
values (405,'버섯','cate_mush','느타리버섯 1kg','어느 요리에나 잘 어울리며 쫄깃한 식감으로 요리를 더욱 풍부하게 해주고 저칼로리로 부담없이 포만감있는 음식을 즐길수있습니다.', 8900, 3000, to_date('23/08/23','RR/MM/DD'));

-- GOODS_SORT 'bestseller' 카테고리
-- Insert into T_SHOPPING_GOODS (GOODS_ID,GOODS_SORT,GOODS_STATUS, GOODS_TITLE, GOODS_INTRO,GOODS_PRICE, GOODS_DELIVERY_PRICE,GOODS_DELIVERY_DATE )
-- values (501,'버섯','bestseller','금강송 송이버섯 120g','인공재배가 불가능하고 생산조건이 까다로운 솔향 가득한 자연산 송이버섯입니다.', 99999, 3000, to_date('23/08/23','RR/MM/DD'));
Insert into T_SHOPPING_GOODS (GOODS_ID,GOODS_SORT,GOODS_STATUS, GOODS_TITLE, GOODS_INTRO,GOODS_PRICE, GOODS_DELIVERY_PRICE,GOODS_DELIVERY_DATE )
values (502,'곡류','bestseller','이천쌀 10kg','물을 일절 사용하지 않고 공기나 바람으로 쌀을 연미 가공하여 쌀의 손상이 적어 맛있습니다.', 43900, 3000, to_date('23/08/23','RR/MM/DD'));
-- Insert into T_SHOPPING_GOODS (GOODS_ID,GOODS_SORT,GOODS_STATUS, GOODS_TITLE, GOODS_INTRO,GOODS_PRICE, GOODS_DELIVERY_PRICE,GOODS_DELIVERY_DATE )
-- values (503,'과일','bestseller','대저 짭짤이 토마토 2.5kg','김해 대저에서 자라는 토마토로 단맛이 강한 로얄사이즈가 짭짤이 토마토로 분류됩니다.', 29000, 3000, to_date('23/08/23','RR/MM/DD'));
-- Insert into T_SHOPPING_GOODS (GOODS_ID,GOODS_SORT,GOODS_STATUS, GOODS_TITLE, GOODS_INTRO,GOODS_PRICE, GOODS_DELIVERY_PRICE,GOODS_DELIVERY_DATE )
-- values (504,'과일','bestseller','태국 골드망고 5kg','열대과일의 여왕 망고입니다. 생망고의 신선함과 향긋함을 느껴보세요.', 79700, 3000, to_date('23/08/23','RR/MM/DD'));
Insert into T_SHOPPING_GOODS (GOODS_ID,GOODS_SORT,GOODS_STATUS, GOODS_TITLE, GOODS_INTRO,GOODS_PRICE, GOODS_DELIVERY_PRICE,GOODS_DELIVERY_DATE )
values (505,'과일','bestseller','수박 6~7kg','비파괴 당도 선별을 통과한 신선한 특등급 이상의 수박만을 보내드립니다.', 33600, 3000, to_date('23/08/23','RR/MM/DD'));



------------------------------------------------------------------------------------------------------------------------------------------------



REM INSERTING into T_SHOPPING_MEMBER
SET DEFINE OFF;

Insert into T_SHOPPING_MEMBER (MEMBER_ID, MEMBER_NAME, MEMBER_PW, HP1, ZIPCODE, MEMBER_ADDRESS, SUBADDRESS, SUN_MONEY, JOINDATE, DEL_YN) 
values ('admin', '관리자', '1234', '010-7476-5200', '16954', '경기 용인시 기흥구 흥덕1로79번길 7', '113동 502호', 500000, to_date('23/08/23', 'RR/MM/DD'), 'N');
Insert into T_SHOPPING_MEMBER (MEMBER_ID, MEMBER_NAME, MEMBER_PW, HP1, ZIPCODE, MEMBER_ADDRESS, SUBADDRESS, SUN_MONEY, JOINDATE, DEL_YN) 
values ('anatkh03', '조기동', '1234', '010-7476-5200', '16954', '경기 용인시 기흥구 흥덕1로79번길 7', '113동 502호', 10000, to_date('23/09/01','RR/MM/DD'), 'N');
Insert into T_SHOPPING_MEMBER (MEMBER_ID, MEMBER_NAME, MEMBER_PW, HP1, ZIPCODE, MEMBER_ADDRESS, SUBADDRESS, SUN_MONEY, JOINDATE, DEL_YN) 
values ('tsad', '김택수', '1234', '010-5831-1070', '16944', '경기 용인시 수지구 광교중앙로 315', '805호', 1000000, to_date('23/10/11','RR/MM/DD'), 'N');
Insert into T_SHOPPING_MEMBER (MEMBER_ID, MEMBER_NAME, MEMBER_PW, HP1, ZIPCODE, MEMBER_ADDRESS, SUBADDRESS, SUN_MONEY, JOINDATE, DEL_YN) 
values ('test', '테스트', '1234', '010-7476-5200', '46624', '부산 북구 모분재로 138', '허브아트빌 401호', 1000, to_date('23/10/24','RR/MM/DD'), 'N');



------------------------------------------------------------------------------------------------------------------------------------------------


REM INSERTING into T_SHOPPING_ORDER
SET DEFINE OFF;


------------------------------------------------------------------------------------------------------------------------------------------------


REM INSERTING into T_SHOPPING_CART
SET DEFINE OFF;


------------------------------------------------------------------------------------------------------------------------------------------------


-- drop sequence ORDER_SEQ_NUM;
-- drop sequence SEQ_GOODS_ID;
-- drop sequence SEQ_IMAGE_ID;
-- drop sequence SEQ_ORDER_ID;

--------------------------------------------------------
--  DDL for Sequence ORDER_SEQ_NUM
--------------------------------------------------------

   CREATE SEQUENCE  "ORDER_SEQ_NUM"  MINVALUE 0 MAXVALUE 10000000 INCREMENT BY 1 START WITH 400 CACHE 20 NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence SEQ_GOODS_ID
--------------------------------------------------------

   CREATE SEQUENCE  "SEQ_GOODS_ID"  MINVALUE 100 MAXVALUE 1000000 INCREMENT BY 1 START WITH 400 CACHE 20 ORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence SEQ_IMAGE_ID
--------------------------------------------------------

   CREATE SEQUENCE  "SEQ_IMAGE_ID"  MINVALUE 1 MAXVALUE 11111111 INCREMENT BY 1 START WITH 400 NOCACHE  NOORDER  NOCYCLE ;
--------------------------------------------------------
--  DDL for Sequence SEQ_ORDER_ID
--------------------------------------------------------

   CREATE SEQUENCE  "SEQ_ORDER_ID"  MINVALUE 0 MAXVALUE 10000000 INCREMENT BY 1 START WITH 400 NOCACHE  ORDER  NOCYCLE ;


commit; 