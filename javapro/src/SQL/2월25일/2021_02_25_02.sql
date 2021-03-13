-- 2021.02.25(��)

-- SQL �Լ�

select 10+20 from dept;     -- 4�� ���
select 10+20 from emp;      -- 14�� ���

select 10+20 from dual;     -- 1�� ���

-- dual ���̺�
--1. sys ���� ������ ���̺�� ���� ���Ǿ�� ���� �Ǿ� �ִ�.
--2. dual ���̺��� ������ �Ǿ� �ֱ� ������ ������ ��� �����ϴ�.
--3. dual ���̺��� �����Ͱ� 1�� �ۿ� ���� ������, ���� ����� 1���� ����Ѵ�.

desc dual;                  -- dummy �÷� 1�� �ۿ� ����
select * from dual;         -- X ������ 1�� �ۿ� ����
select 10+20 from sys.dual;
select 10+20 from dual;   

--1. ���� �Լ�
-- abs() : ���밪�� �����ִ� �Լ�
select -10, abs(-10), ABS(-10) from dual;

-- floor() : �Ҽ��� �Ʒ��� ������ ����
select 34.5678, floor(34.5678) from dual;

-- round() : Ư�� �ڸ����� �ݿø��� �ϴ� ����
-- round(���, �ڸ���)
select 34.5678, round(34.5678) from dual;    -- 35��� : �Ҽ� ù��° �ڸ����� �ݿø�
select 34.5678, round(34.5678, 2) from dual; -- 34.57��� : 3�ڸ����� �ݿø�
select 34.5678, round(34.5678, -1) from dual;-- 30���
select 34.5678, round(35.5678, -1) from dual;-- 40���

-- trunc() : Ư�� �ڸ����� �߶󳻴� ����
select trunc(34.5678), trunc(34.5678, 2), trunc(34.5678, -1) from dual;
--         34              34.56                 30

-- mod() : �������� �����ִ� �Լ�
select mod(27, 2), mod(27, 5), mod(27, 7) from dual;

--Q. ������̺��� �����ȣ�� Ȧ���� ������� �˻��ϴ� SQL�� �ۼ�?
select * from emp where mod(empno, 2) = 1;

------------------------------------------------------------------------
--2. ���� ó�� �Լ�

-- upper() : �빮�ڷ� ��ȯ�� �ִ� �Լ�
select 'Welcome to Oracle', upper('Welcome to Oracle') from dual;

-- lower() : �ҹ��ڷ� ��ȯ�� �ִ� �Լ�
select 'Welcome to Oracle', lower('Welcome to Oracle') from dual;

-- initcap() : �̴ϼ��� �빮�ڷ� ��ȯ���ִ� �Լ�
select 'Welcome to Oracle', initcap('welcome to oracle') from dual;

--Q.��� ���̺��� job�� manager�� ����� �˻��ϴ� SQL�� �ۼ�?
select empno, ename, job from emp where job = 'manager';        -- �˻� �ȵ�
select empno, ename, job from emp where lower(job) = 'manager';
select empno, ename, job from emp where job = upper('manager');

-- length() : ������ ���̸� �����ִ� �Լ�(���ڼ�)
select length('Oracle'), length('����Ŭ') from dual;

-- lengthb() : ������ ���̸� ����Ʈ�� �����ִ� �Լ�
-- ���� 1���� : 1Byte, �ѱ� 1���� : 3Byte
select lengthb('Oracle'), lengthb('����Ŭ') from dual;

-- substr() : ���ڿ��� �Ϻθ� �����ϴ� �Լ�
-- ���� : substr(��� ���ڿ�,  ������ġ, ������ ���� ����)
-- ���� ��ġ ��ȣ�� ���ʺ��� 1������ �����Ѵ�.
-- ���� ��ġ ��ȣ�� ������ ��쿡�� ������ ���� �����Ѵ�.
select substr('Welcome to Oracle', 4, 3) from dual;     -- com ���
select substr('Welcome to Oracle', -4, 3) from dual;    -- acl ���

--Q. ������̺��� �Ի����� ��, ��, ���� �����ؼ� ����ϴ� SQL�� �ۼ�?
select substr(hiredate,1,2) as "��",
       substr(hiredate,4,2) as "��",
       substr(hiredate,7,2) as "��"  from emp;

--Q. ������̺��� 9���޿� �Ի��� ����� �˻��ϴ� SQL�� �ۼ�?
select * from emp where substr(hiredate,4,2) = '09';

--Q. ������̺��� 87�⵵�� �Ի��� ����� �˻��ϴ� SQL�� �ۼ�?
select * from emp where substr(hiredate,1,2) = '87';

--Q. ������̺��� ������� E�� ������ ����� �˻��ϴ� SQL�� �ۼ�? (2���� ���)
select * from emp where ename like '%E';
select * from emp where substr(ename, -1, 1) = 'E';

-- lpad() / rpad() : Ư�� ��ȣ�� ä���ִ� �Լ�
select lpad('Oracle',20,'#') from dual;  -- ##############Oracle
select rpad('Oracle',20,'#') from dual;  -- Oracle##############

-- ltrim() : ���� ������ �����ϴ� �Լ�
-- rtrim() : ������ ������ �����ϴ� �Լ�
select  '   Oracle  ',  ltrim('   Oracle  ') from dual;
select  '   Oracle  ',  rtrim('   Oracle  ') from dual;

-- trim() : ���ڿ� ��.���� ������ �����ϴ� �Լ�
--          Ư�� ���ڸ� �߶󳻴� �Լ�
select trim('   Oracle  ') from dual;
select trim('a' from 'aaaaOracleaaaa') from dual;

--------------------------------------------------------------------
-- 3. ��¥ �Լ�
-- sysdate : �ý����� ��¥�� �����ִ� �Լ�

select sysdate from dual;       -- 21/02/25

select sysdate-1 ����, sysdate ����, sysdate+1  ���� from dual;

--Q. ������̺��� �� ������� ������� �ٹ��ϼ��� ���ϴ� SQL�� �ۼ�?
select sysdate - hiredate from emp;
select round(sysdate - hiredate) from emp;  -- �Ҽ� 1°�ڸ����� �ݿø�
select trunc(sysdate - hiredate) from emp;  -- �Ҽ��� �ڸ��� ����

-- months_between() : �� ��¥ ������ ����� ���� ���� �����ִ� �Լ�
-- months_between(date1, date2)
--Q.������̺��� �� ������� �ٹ��� ���� ���� ���ϴ� SQL�� �ۼ�?
select ename, sysdate, hiredate, months_between(sysdate, hiredate) from emp;

-- add_months() : Ư�� ��¥�� ����� ������ ��¥�� �����ִ� �Լ�
-- add_months( date, ������)
--Q. ���� ��¥�� 6���� ����� ���ڸ� ���ϴ� SQL�� �ۼ�?
select sysdate, add_months(sysdate, 6) from dual;

-- next_day() : �ش� ������ ���� ����� ��¥�� �����ִ� �Լ�
-- next_day( date, ���� )
--Q.������ �������� ����� ���� ������� �������� ���ϴ� SQL�� �ۼ�?
select sysdate, next_day(sysdate, '�����') from dual;
select sysdate, next_day(sysdate, 'MONDAY') from dual; --����OS

-- last_day() : �ش� ���� ������ ��¥�� �����ִ� �Լ�
--Q.�̹����� ���� ������ ��¥�� ���ϴ� SQL�� �ۼ�?
select sysdate, last_day(sysdate) from dual;
select last_day('21/01/01') from dual;