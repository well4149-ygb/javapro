-- 2021.03.05(��)

--  �ε���(index) : ���� �˻��� �ϱ� ���ؼ� ���Ǵ� ��ü

-- �ε��� ��� Ȯ��
select * from user_indexes;

-- �⺻Ű(primary key)�� ������ �÷��� �ڵ����� ���� �ε����� �����ȴ�.

--[�ǽ�]
-- �ε��� �ǽ� (�ε��� ��� ��.���� ���� �˻� �ӵ� ��)
--1.���̺� ����
 drop table emp01 purge;
 
 -- ���纻 ���̺� ���� : ���� ������ ������� �ʴ´�.
create table emp01 as select * from emp;
select * from emp01;

--2. emp01 ���̺� ������ �Է� : 14,680,065��
insert into emp01 select * from emp01;

--3. �˻��� ������ �Է�
insert into emp01(empno, ename) values(1111, 'ahn');

--4. �ð� ���� Ÿ�̸� ��
set timing on

--5. �˻��� �����ͷ� �˻��ð��� ���� : �ε����� �������� ���� ���
select * from emp01 where ename = 'ahn';    -- 11.85��

--6. �ε��� ���� : ename �÷��� �ε��� ����
create index idx_emp01_ename on emp01(ename);

select * from user_indexes;     -- �ε��� ��� Ȯ��

--7. �˻��� �����ͷ� �˻��ð��� ���� : �ε����� ������ ���
select * from emp01 where ename = 'ahn';    -- 0.568��

-- �ε��� ����
-- ���� : drop index  index_name;
drop index idx_emp01_ename;

-- �ε��� ����
-- ���� �ε��� : �ߺ��� �����Ͱ� ���� �÷��� ������ �� �ִ� �ε���
-- ����� �ε��� : �ߺ��� �����Ͱ� �ִ� �÷��� ������ �� �ִ� �ε���

--1. ���̺� ����
drop table dept01 purge;
create table dept01 as select * from dept where 1=0; --���̺� ������ ����

--2. ������ �Է� : loc �÷��� �ߺ� ������ �Է�
select * from dept01;
insert into dept01 values(10, '�λ��', '����');
insert into dept01 values(20, '�ѹ���', '����');
insert into dept01 values(30, '������', '����');

--3. ���� �ε���  : deptno �÷��� ���� �ε��� ����
create unique index idx_dept01_deptno on dept01(deptno);

-- ���� �ε����� ������ deptno �÷��� �ߺ� �����͸� �Է� �غ���?
insert into dept01 values(30, '������', '����');
-- deptno �÷��� ���� �ε����� ������ ���Ŀ��� �ߺ��� �����͸� �Է��� �� ����.

--4. �ε��� ��� Ȯ��
select * from user_indexes;

--5. ����� �ε��� : loc �÷��� ����, ����� �ε����� ���� �غ���?
--   loc �÷��� �ߺ��� ���� �ֱ� ������ ����� �ε����� ������ �Ѵ�.
create unique index idx_dept01_loc 
    on dept01(loc);              --  ���� �ε����� ����� ���� �߻�   

create index idx_dept01_loc 
    on dept01(loc);             -- ����� �ε��� ������
    
    
------------------------------------------------------------------------------
--��ü ����
--1. ���� ������ user01 �������� scott ���� ������ EMP ���̺� ��ü�� ���� 
--   select ��ü ������ �ο��Ѵ�.
conn scott/tiger
grant select on emp to user01;

--2. user01 �������� ���� ��  EMP ���̺� ���ؼ� select �غ���.
conn user01/tiger
select * from emp;          -- �����߻�
select * from scott.emp;    -- �˻� ������

--3. ��ü ���� ���
revoke select on emp from user01;

-- with grant option
-- : �Ϲ� ������ user02�������� scott���� ������ EMP ���̺� ��ü�� ���� select
--   ��ü ������ �ο��Ҷ� with grant option�� �ٿ��� ������ �ο��Ǹ�, user02������
--   �ڱ�� �ο����� ������ �� 3�� ����(user01)���� �� �ο��� �� �ִ�.
--1. user02 �������� scott ���� ������ emp��ü�� ���� select��ü ���� �ο��Ѵ�.
conn scott/tiger
grant select on emp to user02 with grant option;

--2. user02�������� ���� ��, user01�������� �ڱⰡ �ο����� ��ü������ ��ο� �Ѵ�.
conn user02/tiger
select * from scott.emp;

grant select on scott.emp to user01;   -- user01��������  ��ü���� �ο�

--3. user01 �������� ���� ��, �˻� �غ���.
conn user01/tiger
select * from scott.emp;                -- �˻� ������.

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