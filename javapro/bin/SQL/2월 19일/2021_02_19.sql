--���̺� ����
create table member01(
id varchar2(20),
name varchar2(20),
address varchar2(50),
phone varchar2(20));

--���̺� ��� ���
select * from tab;

--������ �Է�
insert into member01 values('test','ygb','����� ���ϱ�',
    '010-8991-8570');
insert into member01 values('test1','����','����� ������',
    '010-8991-8570');
insert into member01 values('test2','ygb','����� ������',
    '010-8931-8670');
update member01 set phone = '010-1111-8570' where id= 'test2';
update member01 set address='��õ�� ��籸' where id = 'well';
commit;
rollback;
select * from member01;

create table customer( 
    no number(4)  primary key, 

    name varchar2(20),

    email varchar2(20),

    tel varchar2(20)  );
drop table customer;