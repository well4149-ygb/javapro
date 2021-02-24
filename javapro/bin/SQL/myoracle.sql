select * from customer;
select * from seq;
delete from CUSTOMER;
--테이블 삭제
drop table customer purge;
---예1.
create table customer( no number(4)  primary key, 

		       name varchar2(20),

		       email varchar2(20),

		       tel varchar2(20)  );


alter table customer add(address varchar2(50));
alter table customer add(reg_date timestamp);

create sequence customer_no_seq
  start with 1
  increment by 1;

commit;
--게시판
create table board(
	no number primary key,
	writer varchar2(20) not null,
 	passwd varchar2(20) not null,
	subject varchar2(100) not null,
	content varchar2(1000) not null,
	reg_date timestamp );
---테이블 시퀸스 생성
create sequence board_seq
start with 1
increment by 1;

select * from board;
select * from seq;
