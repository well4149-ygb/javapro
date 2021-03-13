-- 2021.03.05(��)

-- �����ͺ��̽� ������ ���� ����
--1.�ý��� ����
--2.��ü ����

--�ý��� ���� : �����ͺ��̽� ������(DBA)�� ������ �ִ� ����
-- ex) create user, drop user, .....

--�ý��� �����ڰ� �Ϲ� ����ڿ��� �ο��ϴ� ����
--ex) create session : �����ͺ��̽� ���� ����
--    create table : ���̺��� ������ �� �ִ� ����
--    create view : �並 ������ �� �ִ� ����
--    create sequence : �������� ������ �� �ִ� ����
--    create procedure : ���ν����� ������ �� �ִ� ����

-- ���ο� ���� ���� : user01/tiger
create user user01 identified by tiger;

--������ ���� ���
select * from dba_users;

-- user01 �������� �����ͺ��̽� ���� ���� �ο� : create session
grant create session to user01;
grant create session, create table, create view to user01;

-- with admin option
-- : grant ������� ������ �ο� ������ with admin option�� �ٿ��� ������ �ο��Ǹ�,
--  ������ �ο����� �Ϲ� ������ �ڱⰡ �ο����� ������ �� 3�� �������� ��ο� �� �� �ִ�.
--1. ���ο� ���� ���� : user02/tiger
create user user02 identified by tiger;

--2. �����ͺ��̽� ���� ���� �ο� : create session
grant create session to user02 with admin option;

--3. �� 3�� ���� ���� : user03/tiger
create user user03 identified by tiger;

--4. user01 �������� ������ user03�������� create session ������ �ο��غ���.
SQL> conn user01/tiger
SQL> grant create session to user03;    -- ���� �߻�

--5. user02 �������� ������ user03�������� create session ������ �ο��غ���.
SQL> conn user02/tiger
SQL> grant create session to user03;    -- user03 �������� ���� �ο���

--6. user03�������� ����
-- user03 ������ user02�������� ���� create session ������ �ο� �޾ұ� ������
-- �����ͺ��̽� ������ �����ϴ�.
SQL> conn user03/tiger

------------------------------------------------------------------------
-- ��(ROLE) : �������� ������ ���� ���� ��

-- ����Ŭ���� �⺻������ �����Ǵ� ��
--  EX) connect(8���� ����), resource(20���� ����), dba(130���� ����)

--1. ���ο� ���� ���� : user04/tiger
create user user04 identified by tiger;

--2. ������ ���� Ȯ��
select * from dba_users;

--3. user04 �������� role �ο� : connect, resource 2���� �Ѻο�
grant connect, resource to user04;

--4. user04 �������� ���� �� ���̺� ����
conn user04/tiger
create table member(id varchar2(20), passwd varchar2(20));

------------------------------------------------------------------
--  ����� ���� �� : �ѿ� �ý��� ���� �ο�
--1. �� ����
create role mrole;

--2. ������ �ѷ� �ý��� ������ �߰��Ѵ�.
grant create session, create table, create view to mrole;

--3. mrole�� �����ϱ� ���� ���� ���� : user05/tiger
create user user05 identified by tiger;

--4. user05�������� mrole�� �ο��Ѵ�.
grant mrole to user05;

--5. user05 �������� ����
conn user05/tiger

--------------------------------------------------------------------------
-- ����� ���� �� : �ѿ� ��ü ���� �ο�
--1.�� ����
conn system/ora123
create role mrole02;

--2. ������ �ѿ� ��ü������ �߰��Ѵ�.
conn scott/tiger
grant select on emp to mrole02;

--3. user05 �������� mrole02�� �ο��Ѵ�.
conn system/ora123
grant mrole02 to user05;

--4. user05 �������� ���� ��, �˻��� �غ���.
conn user05/tiger
select * from scott.emp;

-- �� ȸ��
-- ���� : revoke  ���̸�  from  ����ڸ�;
conn system/ora123
revoke mrole from user05;
revoke mrole02 from user05;

-- �� ����
conn system/ora123
drop role mrole;
drop role mrole02;

----------------------------------------------------------------------
-- ���Ǿ�(synonym)
--1. ����� ���Ǿ�
--  : ��ü�� ���� ���� ������ �ο����� ����ڰ� ������ ���Ǿ�� �ش� ����ڸ�
--    ����� �� �ִ�.

--2. ���� ���Ǿ�
--   DBA ������ ���� ����ڸ� ������ �� ������, ������ ����� �� �ִ�.

--   ���� ���Ǿ��� ��
--   sys.tab    --->  tab
--   sys.dual   --->  dual

select * from sys.tab;
select * from tab;              --  ���� ���Ǿ�

select 10+20 from sys.dual;
select 10+20 from dual;         --  ���� ���Ǿ�

-- ����� ���Ǿ� ����
--1. system �������� ���� �� ���̺� ����
conn system/ora123
create table systbl(ename varchar2(20));

--2. ������ ���̺� ������ �߰�
conn system/ora123
insert into systbl values('��ȭ��');
insert into systbl values('ȫ�浿');

select * from systbl;

--3. scott �������� systbl ���̺� select��ü ���� �ο�
conn system/ora123
grant select on systbl to scott;

--4. scott �������� ���� �� �˻�
conn scott/tiger
select * from systbl;           --  ���� �߻�
select * from system.systbl;    --  �˻� ������

--5. scott �������� ���Ǿ ������ �� �ִ� ������ �ο��Ѵ�.
conn system/ora123
grant create synonym to scott;

--6. scott �������� ���� �� ����� ���Ǿ� ���� : system.systbl --> systbl
--   ������ ����� ���Ǿ�� scott ������ ��� ������.
conn scott/tiger
create synonym  systbl for system.systbl;

--7. ���Ǿ �̿��ؼ� �˻�
conn scott/tiger
select * from system.systbl;
select * from systbl;           -- �˻� ������ (����� ���Ǿ�)

--8. ���Ǿ� ���
conn scott/tiger
select * from user_synonyms;

--9. ���Ǿ� ����
conn scott/tiger
-- ���� : drop synonym  synonym_name;
drop synonym systbl;


-- ���� ���Ǿ�
-- 1. DBA �������� �����ؼ� ���� ���Ǿ ������ �� �ִ�.
-- 2. ���� ���Ǿ ���鶧 public �� �ٿ��� ������ �� �ִ�.

-- ���� ���Ǿ� ����
conn system/ora123
create public synonym  pubdept for scott.dept;

-- ���� ���Ǿ� ���
conn system/ora123
select * from dba_synonyms;

-- ���� ���Ǿ� ����
conn system/ora123
drop public synonym pubdept;



