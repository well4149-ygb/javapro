 -- 2021.02.24(��)
 
 -- ���̺� ���
 select * from tab;
 
 -- DEPT ���̺� ����
 describe dept;
 desc dept;
 
 -- dept ���̺��� ������ �˻�
 select * from dept;
 
-- EMP ���̺� ����
desc emp;

-- EMP ���̺��� ������ �˻�
select * from emp;

-- ����Ŭ�� ������ Ÿ��
-- 1. ���� ������
--    number(n)      :  number(2)  ���� 2�ڸ����� ����
--    number(n1, n2) :  n1 : ��ü �ڸ���
--                      n2 : �Ҽ����� �Ҵ�� �ڸ���    

-- 2. ���� ������
-- char() : ���� ���� ������
--          �ִ� 2000byte ���� ���� ������.
-- varchar2() : ���� ���� ������
--              �ִ� 4000byte ���� ���� ������. 
-- long :  2GB ���� ���� ����

-- 3. ��¥ ������
-- date :  ��/��/�� ���� ����
-- timestamp : ��/��/�� ��:��:��

-- select SQL��
select * from dept;

select loc, deptno, dname from dept;

select empno, ename, sal from emp;

-- ��� ������ : +, -, *, /
select sal + comm from emp;
select sal - 100 from emp;
select sal * 100 from emp;
select sal / 100 from emp;

--Q. ������̺�(EMP)�� �Ҽӵ� ������� ������ ���غ���?
--  ���� = �޿�(SAL) * 12  +  Ŀ�̼�(COMM)

select ename, job, sal, comm, sal*12, sal*12+comm from emp;

-- NULL
--1. �������� ���� ���� �ǹ�
--2. NULL ���� ��������� �� �� ����.
--3. NULL ���� ��
--   EX) EMP ���̺� : MGR �÷�
--                   COMM �÷�

-- NVL(�÷�, ��ȯ�� ��) : NULL ���� �ٸ� ��(0)���� ��ȯ ���ִ� �Լ�
-- ex) NVL( comm, 0 )

select ename, job, sal, comm, sal*12, sal*12+nvl(comm, 0) from emp;

-- ��Ī �ο��ϱ� :  as  "��Ī��"
select ename, sal*12+nvl(comm, 0) as "Annsal" from emp;
select ename, sal*12+nvl(comm, 0) "Annsal" from emp;  -- as ���� ����
select ename, sal*12+nvl(comm, 0) Annsal from emp;    -- "" ���� ����

-- ��Ī�� ���Ⱑ ���� ��쿡�� �ֵ���ǥ�� ���� �� �� ����.
select ename, sal*12+nvl(comm, 0) as "�� ��" from emp;
select ename, sal*12+nvl(comm, 0)  "����" from emp;     -- as ���� ����
select ename, sal*12+nvl(comm, 0)  ���� from emp;       -- "" ���� ����

-- Concatenation ������ : ||
-- : �÷��� ���ڿ��� ������ �� �����
select ename, 'is a', job from emp;

select ename || 'is a' || job from emp;

-- distinct : �ߺ����� �����ϰ� 1���� ���
select deptno from emp;

select distinct deptno from emp;    -- 3���� �μ���ȣ ��� : 10, 20, 30

--Q. EMP ���̺��� �� ������� JOB�� 1���� ����ϴ� SQL���� �ۼ��ϼ���?
select job from emp;

select distinct job from emp;   -- 5���� JOB���

-- EMP ���̺��� �� ������ �� ���ϱ�
--  count(�÷���) : ������ ���� ���ϱ�
select count(*) from dept;
select count(*) from emp;
select count(job) from emp;     -- 14

--Q. EMP ���̺��� �ߺ��� ������ JOB�� ������ ���ϴ� SQL�� �ۼ� �ϼ���?
select count(distinct job) from emp;  -- 5

------------------------------------------------------------------------
-- where ������ : �� ������ ( =, >, >=, <, <= , !=, ^=, <> )

--1. ���� ������ �˻�
-- Q. ��� ���̺��� �޿��� 3000 �̻� �޴� ����� �˻��ϴ� SQL�� �ۼ�?
select * from emp where sal >= 3000;

-- Q. �޿��� 3000�� ����� �˻�?
select * from emp where sal = 3000;

-- Q. �޿��� 3000�� �ƴ� ����� �˻�?
select * from emp where sal != 3000;
select * from emp where sal ^= 3000;
select * from emp where sal <> 3000;

-- Q. �޿��� 1500 ������ ����� �����ȣ, �����, �޿��� ����ϴ� SQL�� �ۼ�?
select empno, ename, sal from emp where sal <= 1500;

--2. ���� ������ �˻�
-- 1) ���� �����ʹ� ��.�ҹ��ڸ� �����Ѵ�.
-- 2) ���� �����͸� �˻� �Ҷ��� ���ڿ� ��.�쿡 �ܵ���ǥ(')�� �ٿ��� �Ѵ�.

--Q. ��� ���̺� ������� FORD �� ����� ������ �˻��ϴ� SQL�� �ۼ�?
select * from emp where ename = 'ford';     -- �˻���� ����
select * from emp where ename = FORD;       -- ���� �߻�
select * from emp where ename = "FORD";     -- ���� �߻�
select * from emp where ename = 'FORD';     -- �������� �˻�

--Q. SCOTT ����� �����ȣ, �����, �޿��� ����ϴ� SQL�� �ۼ�?
select empno, ename, sal from emp where ename = 'SCOTT';

--3. ��¥ ������ �˻�
-- 1) ��¥ �����͸� �˻��Ҷ� ��¥ ��.�쿡 �ܵ���ǥ(')�� �ٿ��� �Ѵ�.
-- 2) ��¥ �����͸� ���Ҷ� �� �����ڸ� ����Ѵ�.

-- Q. 1982�� 1�� 1�� ���Ŀ� �Ի��� ����� �˻��ϴ� SQL�� �ۼ�?
select * from emp where hiredate >= 82/01/01;       -- ���� �߻�
select * from emp where hiredate >= '82/01/01';     -- �������� �˻�
select * from emp where hiredate >= '1982/01/01';   -- �������� �˻�

select * from emp where hiredate >= '1982/01/01' order by hiredate asc;


 