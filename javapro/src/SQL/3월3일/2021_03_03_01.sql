-- 2021.03.03(��)

-- Ʈ�����(Transaction) : ������ �۾� ����

-- TCL(Transaction Control Language)
-- commit : Ʈ������� ����
-- rollback : Ʈ������� ���
-- savepoint : ������ ����(������)�� �����ϴ� ����

-- [�ǽ�]
drop table dept01 purge;
create table dept01 as select * from dept;  -- ���纻 ���̺� ����
select * from  dept01;

-- rollback : Ʈ������� ���(������ ����)
delete from dept01;
rollback;   -- Ʈ������� ���

-- commit : Ʈ������� ����
delete from dept01 where deptno=20;
commit;     -- Ʈ������� ����
rollback;   -- Ʈ������� ���� �Ǿ��� ������ ������ 20�� �����͸� �������� ���Ѵ�


-- �ڵ� Ŀ�� : �ڵ����� Ŀ���� ����
-- 1) �������� ���� : quit, exit, con.close()
-- 2) DDL(create, alter, rename, truncate, drop), DCL(grant, revoke) 
--    ����� ����

-- ��1.
select * from dept01;   -- 10, 30, 40
delete from dept01 where deptno = 40;       -- 40�� ������ ����

create table dept03 as select * from dept;  -- �ڵ� Ŀ�� ����(DDL)

rollback;    -- ������ 40�� �μ��� �������� ���Ѵ�.
select * from dept01;

--��2.
-- DML(delete), DDL(truncate)
select * from dept01;   -- 10, 30

delete from dept01 where deptno=30;     -- DML(delete)
rollback;               --  ������ 30�� �μ��� �����Ѵ�.

select * from dept01;   -- 10, 30
truncate table dept01;  -- �ڵ� Ŀ�� ����(DDL)
rollback;               --  dept01 ���̺��� �����͸� �������� ���Ѵ�.

-- �ڵ� �ѹ�
-- : ���������� ���� (������ â�� �ݴ� ���, ��ǻ�Ͱ� �ٿ�Ǵ� ���)

-- savepoint : �ӽ� �������� ����
--[�ǽ�]
drop table dept01 purge;

--1. dept01 ���̺� ����
create table dept01 as select * from dept;
select * from dept01;

--2. 40�� �μ� ����
delete from dept01 where deptno=40;

--3. commit ���� : Ʈ����� ����
commit;

--4. 30�� �μ� ����
delete from dept01 where deptno=30;

--5. c1������ ����
savepoint c1;

--6. 20�� �μ� ����
delete from dept01 where deptno=20;

--7. c2 ������ ����
savepoint c2;

--8. 10�� �μ� ����
delete from dept01 where deptno=10;

--9. c2���������� ����
rollback to c2;
select * from dept01;       -- 10

--10. c1���������� ����
rollback to c1;
select * from dept01;       -- 10, 20

--11. ���� Ʈ����� ���� ���ĸ� ����
rollback;
select * from dept01;       -- 10, 20, 30

--------------------------------------------------------------------------
--  ���Ἲ ��������
-- : ���̺� �������� �����Ͱ� �ԷµǴ� ���� �����ϱ� ���ؼ� ���̺��� ������ ��
--    �� �÷��� ���ؼ� �����ϴ� �������� ��Ģ�� ���Ѵ�.
--   ex) not null, unique, primary key, foreign key, check, default

--1. not null ���� ����
--   null�� ������� �ʴ´�.
--   �ݵ�� ���� �Է� �ؾ� �ȴ�.
--[�ǽ�]
drop table emp02 purge;
create table emp02(
    empno number(4) not null,
    ename varchar2(12) not null,
    job varchar2(12),
    deptno number(2));

insert into emp02 values(1111, '��ȭ��', 'MANAGER', 30);  --������ �Է�
select * from emp02;

-- ��������(NOT NULL)�� ����Ǳ� ������ ������ �Է��� �ȵ�
insert into emp02 values(null, null, 'SALESMAN', 30); 

--2. unique ���� ����
--   ������ ���� �Է��� �� �ִ�.
--   �ߺ��� ���� �Է��� �� ����.
--   null ���� �Է��� �� �ִ�.(null���� ���ȴ�)
drop table emp03 purge;
create table emp03(
    empno number(4) unique,
    ename varchar2(12) not null,
    job varchar2(12),
    deptno number(2));
    
select * from emp03;
insert into emp03 values(1111, '��ȭ��', 'MANAGER', 10);

-- unique �������ǿ� ����
insert into emp03 values(1111, 'ȫ�浿', 'MANAGER', 10);

-- unique���������� ������ �÷��� null �� �Է� ������
insert into emp03 values(null, '��ȭ��', '������', 20);
insert into emp03 values(null, 'ȫ�浿', '������', 30);

--3. primary key (�⺻Ű)
--   primary key = not null + unique
--   �ݵ�� �ߺ����� �ʴ� ���� �Է� �ؾߵȴ�.
--   ex) �μ����̺�(DEPT) - deptno (pk)
--       ������̺�(EMP) - empno (pk)

select * from dept;
insert into dept values(10,'���ߺ�','����');    --unique�������� ����
insert into dept values(null,'���ߺ�','����');  --not null�������� ����
-- DEPT ���̺��� deptno �÷��� primary key ���������� �����Ǿ� �ֱ� ������,
-- �ߺ��� ���� null���� �Է��� �� ����.

select * from emp;
insert into emp(empno, ename) values(7788, '��ȭ��');--unique�������� ����
insert into emp(empno, ename) values(null, '��ȭ��');--not null�������� ����

drop table emp05 purge;
create table emp05(
    empno number(4) primary key,
    ename varchar2(12) not null,
    job varchar2(12),
    deptno number(2));
    
 select * from emp05;   
insert into emp05 values(1111,'��ȭ��','������',20); -- �������� �Է�
insert into emp05 values(1111,'ȫ�浿','������',20); --unique�������� ����
insert into emp05 values(null,'ȫ�浿','������',20); --not null�������� ����

--4. foreign key (�ܷ�Ű)
--   DEPT(�θ����̺�) - deptno(pk, �θ�Ű) : 10, 20, 30, 40
--   EMP(�ڽ����̺�) - deptno(fk) : 10, 20, 30

-- 1) ������̺�(EMP)�� deptno �÷��� foreign key ���������� �����Ǿ� �ִ�.
-- 2) foreign key ���������� ������ �ִ� �ǹ̴� �θ����̺�(DEPT)�� �θ�Ű(deptno)��
--    ���� ������ �� �ִ�. (10, 20, 30, 40�� �μ���ȣ�� ������ �� �ִ�.)
-- 3) �θ�Ű�� �Ǳ� ���� ������ primary key�� unique ���������� �����Ǿ� �־�� �Ѵ�.

--Q.������̺�(EMP)�� ��������� ��� �غ���?
--  �ܷ�Ű�� ������ �÷�(EMP-deptno)�� �θ�Ű(DEPT-deptno)�ȿ� �ִ� ��(10,20,30,40)��
--  ������ �� �ִ�.
insert into emp(empno, deptno) values(1111, 50); -- �������� ����

--[�ǽ�]
drop table emp06 purge;
create table emp06(
    empno number(4) primary key,
    ename varchar2(10) not null,
    job varchar2(10),
    deptno number(2) references dept(deptno) );  -- foreign key
    
select * from emp06;    
insert into emp06 values(1111, '��ȭ��', 'MANAGER', 10);
insert into emp06 values(1112, '��ȭ��', 'MANAGER', 20);
insert into emp06 values(1113, '��ȭ��', 'MANAGER', 30);
insert into emp06 values(1114, '��ȭ��', 'MANAGER', 40);
insert into emp06 values(1115, '��ȭ��', 'MANAGER', 50); -- �������ǿ� ����

--5. check ��������
--   : �����Ͱ� �Էµɶ� Ư�� ������ �����ϴ� �����͸� �Էµǵ��� ����� �ִ� ��������
create table emp07(
    empno number(4) primary key,
    ename varchar2(10) not null,
    sal number(7,2) check(sal between 500 and 5000), -- sal : 500 ~ 5000
    gender varchar2(1) check(gender in('M','F') ));  -- gender : 'M','F'

select * from emp07;
insert into emp07 values(1111,'��ȭ��',3000,'M');  -- �������� �Է�
insert into emp07 values(1112,'��ȭ��',8000,'M');  -- check�������� ����
insert into emp07 values(1113,'��ȭ��',5000,'m');  -- check�������� ����

--6. default ��������
--   default ���������� ������ �÷���  ���� �Էµ��� ������ default�� ������ ����
--   �ڵ����� �Էµȴ�.

drop table dept01 purge;
create table dept01(
    deptno number(2) primary key,
    dname varchar2(14),
    loc varchar2(13) default 'SEOUL');
--  count number default 0,

select * from dept01;
insert into dept01 values(10, 'ACCOUNTING', 'NEW YORK');
insert into dept01(deptno, dname) values(20, 'RESEARCH'); 

--------------------------------------------------------------------------
-- �������� ���� ���
--1. �÷����� ������� �������� ����
--2. ���̺��� ������� �������� ����

--1. �÷����� ������� �������� ����
drop table emp01 purge;

create  table  emp01(	
	empno  number(4)  primary  key,
	ename  varchar2(15)  not null,
	job  varchar2(10)  unique,
 	deptno  number(4)  references  dept(deptno) );
    
--2. ���̺��� ������� �������� ����    
drop table emp02 purge;

create table emp02(
    empno number(2),
    ename varchar2(15) not null,
    job varchar2(10),
    deptno number(4),
    primary key(empno),
    unique(job),
    foreign key(deptno) references dept(deptno) );
    
    
-- ���������� �����Ҷ� ���̺� ���� ��ĸ� ������ ���
--1. ����Ű�� �⺻Ű�� ������ ���
--    2�� �̻��� �÷��� �⺻Ű�� �����ϴ� ���
--2. alter table�� ���� ������ �߰��� ���

--1. 2�� �̻��� �÷��� �⺻Ű�� �����ϴ� ���
drop table member01 purge;

-- �÷����� ������� 2���� �÷��� primary key�� ������ �� ����.
create table member01(
    id varchar2(20)  primary key,
    passwd varchar2(20) primary key);   -- ���̺� �����ȵ�

-- ���̺��� ������� 2���� �÷��� primary key�� ������ �� �ִ�.
create table member01(
    id varchar2(20),
    passwd varchar2(20),
    primary key(id, passwd));           -- ���̺� ������
    
    
--2. alter table�� ���� ������ �߰��� ���    
drop table emp01 purge;

-- ���������� ���� ���̺� ����
create  table  emp01(	
	empno  number(4),
	ename  varchar2(15),
	job  varchar2(10),
 	deptno  number(4) );
    
-- primary key �������� �߰� : empno    
alter table emp01 add primary key(empno);   

-- not null �������� �߰� : ename
alter table emp01 modify ename not null;

-- unique �������� �߰� : job
alter table emp01 add unique(job);

-- foreign key �������� �߰� : deptno
alter table emp01 add foreign key(deptno) references dept(deptno); 


-- �������� ����
-- ���� : alter table ���̺� drop  constraint  constraint_name;

-- primary key �������� ����
alter table emp01 drop constraint SYS_C007031;
alter table emp01 drop primary key;

-- unique �������� ����
alter table emp01 drop constraint SYS_C007033;
alter table emp01 drop unique(job); 

-- not null �������� ����
alter table emp01 drop constraint SYS_C007032;

-- foreign key �������� ����
alter table emp01 drop constraint SYS_C007034;


-- ���� ������ Ȱ��ȭ / ��Ȱ��ȭ
--1. �θ� ���̺� ����
drop table dept01 purge;
create table dept01(
    deptno number(2) primary key,
    dname varchar2(14),
    loc varchar2(13));
    
insert into dept01 values(10, 'ACCOUNTING', 'NEW YORK');    

--2.�ڽ� ���̺� ����
drop table emp01 purge;
create table emp01(
    empno number(4) primary key,
    ename varchar2(10) not null,
    job varchar2(10) unique,
    deptno number(2) references dept01(deptno) );

insert into emp01 values(1111, '��ȭ��', 'SALESMAN', 10);
select * from emp01;

--3. �θ� ���̺��� ������ ����
delete from dept01; -- �ڽ����̺�(emp01)���� �����ϰ� �ֱ� ������ ���� �ȵ�.

-- �θ� ���̺�(DEPT01)�� �����͸� �����ϱ� ���ؼ��� �ڽ� ���̺�(EMP01)��
-- foreign key ���������� ��Ȱ��ȭ ��Ű��, �θ� ���̺��� �����͸� ������ �� �ִ�.

-- �ڽ� ���̺�(EMP01)�� foreign key ���������� ��Ȱ��ȭ ���Ѻ���?
-- ���� : alter table ���̺��  disable constraint  constraint_name;
alter table emp01 disable constraint SYS_C007040;

--cf. foreign key ���������� Ȱ��ȭ
alter table emp01 enable constraint SYS_C007040;

--4. cascade �ɼ�
-- �θ��� ���������� ��Ȱ��ȭ ��Ű��, �����ϰ� �ִ� �ڽ��� �������ǵ� ���� ��Ȱ��ȭ 
-- �����ִ� �ɼ�

-- cascade �ɼ��� �ٿ��� �θ� ���̺�(DEPT01)�� ���������� ��Ȱ��ȭ ��Ű��, �����ϰ�
--  �ִ� �ڽ� ���̺�(EMP01)�� foreign key�������ǵ� ���� ��Ȱ��ȭ �ȴ�.
alter table dept01 disable constraint SYS_C007036 cascade;

-- cascade �ɼ��� �ٿ��� �θ� ���̺�(DEPT01)�� ���������� �����ϸ�, �����ϰ� �ִ�
-- �ڽ� ���̺�(EMP01)�� foreign key �������ǵ� ���� ���ŵȴ�.
alter table dept01 drop constraint SYS_C007036 cascade;
alter table dept01 drop primary key cascade;

