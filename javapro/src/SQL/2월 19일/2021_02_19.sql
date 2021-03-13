--테이블 생성
create table member01(
id varchar2(20),
name varchar2(20),
address varchar2(50),
phone varchar2(20));

--테이블 목록 출력
select * from tab;

--데이터 입력
insert into member01 values('test','ygb','서울시 강북구',
    '010-8991-8570');
insert into member01 values('test1','양경빈','서울시 강서구',
    '010-8991-8570');
insert into member01 values('test2','ygb','서울시 강남구',
    '010-8931-8670');
update member01 set phone = '010-1111-8570' where id= 'test2';
update member01 set address='인천시 계양구' where id = 'well';
commit;
rollback;
select * from member01;

create table customer( 
    no number(4)  primary key, 

    name varchar2(20),

    email varchar2(20),

    tel varchar2(20)  );
drop table customer;