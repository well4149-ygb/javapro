show databases;
show tables;
select * from member;
----mysql에서는 시퀸스가 없음.
---1.예제 테이블
--------------------------------
create table customer( 
	no int(4) auto_increment primary key, 
    name varchar(20),
    email varchar(20),
    tel varchar(20),  
    address varchar(50),
    reg_date timestamp
);

select * from customer;

select * from board;
----예2.board테이블

drop table board;----테이블 삭제

create table board(
	no int auto_increment primary key,
	writer varchar(20) not null,
 	passwd varchar(20) not null,
	subject varchar(100) not null,
	content varchar(1000) not null,
	reg_date timestamp );




