-- 2021.03.04(��)

-- ������(sequence)
-- : ���̺� ���ڸ� �ڵ����� ���� ���Ѽ� ó�����ִ� ����

-- ������ ����
create sequence dept_deptno_seq
start with 10           -- ������ ��ȣ
increment by 10;        -- ����ġ

-- ������ ���
select * from seq;
select * from user_sequences;

-- currval : ������ ���簪�� ��ȯ
-- nextval : ������ �������� ��ȯ

select dept_deptno_seq.nextval from dual;
select dept_deptno_seq.currval from dual;

-- ��1. �������� ���̺��� �⺻Ű�� �����ϱ�
drop table emp01 purge;
create table emp01(
    empno number(4) primary key,
    ename varchar2(10),
    hiredate date);

create sequence emp01_empno_seq;    -- 1���� 1�� �����Ǵ� ������ ����

select * from tab;      -- ���̺� ��� Ȯ��
select * from seq;      -- ������ ��� Ȯ��

-- ������ �Է�
insert into emp01 values(emp01_empno_seq.nextval, '��ȭ��', sysdate );

select * from emp01;

-- ������ ����
-- drop  sequence  ������ �̸�;
drop sequence dept_deptno_seq;

-- ������ ����
create sequence dept_deptno_seq
start with 10       -- ���۰�
increment by 10     -- ����ġ
maxvalue 30;        -- �ִ밪

-- ������ ���
select * from seq;

-- ������ ������ ���ؿ���
select dept_deptno_seq.nextval from dual;   -- 10 ���ؿ�
select dept_deptno_seq.nextval from dual;   -- 20 ���ؿ�
select dept_deptno_seq.nextval from dual;   -- 30 ���ؿ�
select dept_deptno_seq.nextval from dual;   -- ���� �߻�

-- ������ ���� : maxvalue : 30 -->  100000
alter sequence dept_deptno_seq maxvalue 100000;

-- ������ ���� Ȯ��
select * from seq;

-- ������ ������ ���ؿ���
select dept_deptno_seq.nextval from dual;   -- 40 ���ؿ�


-----------------------------------------------------------------------
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