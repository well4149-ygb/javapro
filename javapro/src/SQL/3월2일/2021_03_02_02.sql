-- 2021.03.02(ȭ)

--DDL(Data Definition Language) : ������ ���Ǿ�
-- create : ���̺� ����
-- alter : ���̺� ���� ����
-- rename : ���̺� �̸� ����
-- drop : ���̺� ����
-- truncate : ������ ����

-- ���̺� ��� Ȯ��
select * from tab;

--1. create
--  : �����ͺ��̽�, ���̺� ����
--  1) ���̺� ����
create table emp01(
    empno number(4),
    ename varchar2(20),
    sal number(7,2));
    
--  2) ���������� ���̺� ����
--     ���纻 ���̺��� ������
--     ��, ���������� ���� ���� �ʴ´�.
drop table emp02 purge;     -- �ӽ����̺�� ��ü���� �����ϰ� ����
purge recyclebin;           -- �ӽ����̺� ����
create table emp02 as select * from emp;    -- ���������� ���̺� ����
select * from emp02;
desc emp02;

-- ���ϴ� �÷����� ������ ���纻 ���̺� ����
create table emp03 as select empno, ename from emp;
select * from emp03;
desc emp03;

-- ���ϴ� ������ ������ ���纻 ���̺� ����
create table emp04 as select * from emp where deptno=10;
select * from emp04;

-- ���̺� ������ �����ϱ�
create table emp05 as select * from emp where 1=0;
select * from emp05;

--2. alter
--  : ���̺� ������ ���� (�÷��߰�, �÷��� ����, �÷� ����)
--  1) �÷� �߰�
alter table emp01 add(job varchar2(10));
desc emp01;

--  2) �÷��� ����
--    i) �ش� �÷��� �����Ͱ� ���� ���
--       �÷��� ������ Ÿ���� ������ �� �ִ�.
--       �÷��� ũ�⸦ ������ �� �ִ�.
--    ii) �ش� �÷��� �����Ͱ� �ִ� ���
--        �÷��� ������ Ÿ���� ������ �� ����.
--        �ڷ����� ũ��� �ø����� ������, ������ �������� ũ�⺸�� ���� ũ���
--         ������ �� ����.
alter table emp01 modify(job varchar2(30));
desc emp01;

-- 3) �÷� ����
alter table emp01 drop column job; 
alter table emp01 drop(job);
desc emp01;

-- cf. ��� ����
alter user  ������ identified  by ��й�ȣ;

--3. rename
--  : ���̺� �̸� ����
-- ���� : rename  old_name  to  new_name;
--Q. emp01 ���̺��� test ���̺������ ���� �غ���?
rename emp01 to test;
select * from tab;

--4. truncate
--   : ���̺��� ��� ������ ����
-- ���� : truncate  table  table_name;
select * from emp02;
truncate table emp02;

--5. drop
--  : ���̺� ����
-- ���� : drop table table_name; (oracle 10g���ʹ� �ӽ����̺�� ��ü)
--       drop table table_name purge; (�����ϰ� ������) 

drop table test;    -- �ӽ� ���̺�� ��ü
select * from tab;

-- �ӽ� ���̺� ����
purge recyclebin;

-------------------------------------------------------------------------
-- 1.����Ŭ�� ��ü
--    ���̺�, ��, ������, �ε���, ���Ǿ�, ���ν���, Ʈ����

-- 2. ������ ��ųʸ��� ������ ��ųʸ� ��

--    ������ ��ųʸ� �� : user_xxxx
--    (���� ���̺�)       all_xxxx
--                      dba_xxxx

 --   ������ ��ųʸ�(�ý��� ���̺�)
 
 -- SCOTT ���� ������ ���̺� ��ü�� ���� ������ ��ȸ
select * from tab;

select * from user_tables;

-- �ڽ� ���� ���� �Ǵ� ������ �ο����� ��ü � ���� ������ ��ȸ
select * from all_tables;

-- DBA ������ ��� ������.
select * from dba_tables;

-- ����Ŭ �ý����� ���� ���� �˻�
select * from dba_users;

-------------------------------------------------------------------------
-- DML(Data Manipulation Language, ������ ���۾�) : insert, update, delete

--1. insert
--1)���� : insert into ���̺�(�÷�1, �÷�2,...) values(������1, ������2,...);  
--        insert into ���̺�  values(������1, ������2, ....);

-- [�ǽ�]
drop table dept01 purge;

-- ����ִ� dept01 ���纻 ���̺� ����
create table dept01 as select * from dept where 1=0;

select * from dept01;

insert into dept01(deptno, dname, loc) values(10, 'ACCOUNTING', 'NEW YORK');
insert into dept01 values(20, 'RESEARCH', 'DALLAS');
insert into dept01 values(30, '������', '����');

-- null �� �Է�
insert into dept01(deptno, dname) values(40, '���ߺ�');
insert into dept01 values(50, '��ȹ��', NULL);

-- 2)���������� ������ �Է�
drop table dept02 purge;

-- dept02 ���̺� ����
create table dept02 as select * from dept where 1=0;   --���̺� ������ ����
select * from dept02;
select count(*) from dept02;

insert into dept02 select * from dept;
insert into dept02 select * from dept02;

--2. update : ������ ����
-- ���� : update  ���̺��  set  �÷�1 = ������ ��1,
--                             �÷�2 = ������ ��2,...
--        where  ������;

--[�ǽ�]
drop table emp01 purge;
create table emp01 as select * from emp;    -- ���纻 ���̺� ����
select * from emp01;

-- 1) ��� ������ ����
-- Q1. ��� ������� �μ���ȣ�� 30�� ����
update emp01 set deptno = 30;

--Q2. ��� ������� �Ի����� ���ó�¥�� ����
update emp01 set hiredate = sysdate;

-- 2) Ư�� �����͸� ���� : where ������ ���
--Q3. �޿��� 3000 �̻��� ����� �޿��� 10% �λ� 
update emp01 set sal = sal * 1.1 where sal >= 3000;

--3. delete : ������ ����
-- ���� : delete from ���̺��  where ������; 

-- 1) ��� ������ ����
delete from dept01;
select * from dept01;
rollback;               -- Ʈ������� ���

-- 2) ������ �����ϴ� ������ ����
delete from dept01 where deptno = 30;

-------------------------------------------------------------------
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
rollback;   -- Ʈ������� ���� �Ǿ��� ������ ������ 20�� �����͸� �������� ���Ѵ�.
