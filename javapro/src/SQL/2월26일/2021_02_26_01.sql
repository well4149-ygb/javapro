-- 2021.02.26(��)

-- ����ȯ �Լ� : to_char(), to_date(), to_number()

-- 1. to_char() : ��¥��, ������ �����͸� ���������� ��ȯ�����ִ� �Լ�
--    to_char( ��¥ ������, '�������')

-- 1) ��¥�� �����͸� ���������� ��ȯ
--Q.���� �ý����� ��¥�� ��, ��, ��, ��, ��, ��, ������ ���
    select sysdate from dual;
    
select sysdate, to_char(sysdate, 'yyyy-mm-dd am hh:mi:ss dy') from dual;
select sysdate, to_char(sysdate, 'yyyy-mm-dd hh24:mi:ss day') from dual;

--Q.��� ���̺��� �� ������� �Ի����� ��,��,��,��,��,��,������ ����ϴ� SQL�� �ۼ�?
select hiredate, to_char(hiredate, 'yyyy-mm-dd hh24:mi:ss day') from emp;

-- 2) ������ �����͸� ���������� ��ȯ
--   to_char( ���� ������, '���б�ȣ')
--Q. ���� 1230000�� 3�ڸ��� �ĸ��� �����ؼ� ���
select 1230000 from dual;

-- 0���� �ڸ����� �����ϸ�, �������� ���̰� 9�ڸ��� ���� ������ 0���� ä���.
select 1230000, to_char(1230000, '000,000,000') from dual;-- 001,230,000

-- 9�� �ڸ����� �����ϸ�, �������� ���̰� 9�ڸ��� ���� �ʾƵ� ä���� �ʴ´�.
select 1230000, to_char(1230000, '999,999,999') from dual;-- 1,230,000

--Q.������̺��� �� ������� �޿��� 3�ڸ��� �ĸ�(,)�� �����ؼ� ����ϴ� SQL�� �ۼ�?
select ename, sal, to_char(sal, '9,999') from emp;
select ename, sal, to_char(sal, 'L9,999') from emp; --������ ��ȭ��ȣ ���

--2.to_date() : ���ڸ� ��¥������ ��ȯ���ִ� �Լ�
--  to_date('����', 'format')
--Q. 2021�� 1�� 1�� ���� ������� ����� �ϼ��� ���ϴ� SQL�� �ۼ�?
select sysdate - '2021/01/01' from dual;    -- ���� �߻�

select sysdate - to_date('2021/01/01','yyyy/mm/dd') from dual;
select round(sysdate - to_date('2021/01/01','yyyy/mm/dd')) from dual;
select trunc(sysdate - to_date('2021/01/01','yyyy/mm/dd')) from dual;

--Q. 2021�� 12�� 25�� ũ������������ ���� �ϼ��� ���ϴ� SQL�� �ۼ�?
select '2021/12/25' - sysdate from dual;    -- ���� �߻�
select to_date('2021/12/25','yyyy/mm/dd') - sysdate from dual;
select round(to_date('2021/12/25','yyyy/mm/dd') - sysdate) from dual;
select trunc(to_date('2021/12/25','yyyy/mm/dd') - sysdate) from dual;

-- 3. to_number() : �������� ���������� ��ȯ���ִ� �Լ�
--    to_number( '���� ������' , '���б�ȣ')
select '20,000'  - '10,000' from dual;  -- ���� �߻�
select to_number('20,000','99,999') - to_number('10,000','99,999') from dual;

-- Q1. ������̺�(EMP)���� �Ի���(HIREDATE)�� 4�ڸ� ������ ���                                
--           �ǵ��� SQL���� �ۼ��ϼ���? (ex. 1980/01/01)
select  to_char(hiredate,'YYYY/MM/DD') from emp;

---------------------------------------------------------------------
-- nvl() : null���� �ٸ������� ��ȯ���ִ� �Լ�
--1. null���� �������� ���� ���� �ǹ�
--2. null���� �������(+,-,*,/)�� ���� �ʴ´�.

--Q. ������̺� �ִ� �� ������� ������ ����ϴ� SQL�� �ۼ�?
--   ���� = �޿�(sal) * 12  + comm
--   nvl( comm, 0 ) : comm �� null���� �����͸� 0���� ��ȯ

select sal, sal*12, comm, sal*12+comm, sal*12+nvl(comm,0) as "����" from emp;


--Q2. ������̺�(EMP)���� MGR�÷���  ����  null �� �������� MGR                              
--          �÷��� ����  CEO ��  ����ϴ� SQL���� �ۼ� �ϼ���?
select ename, mgr from emp where mgr is null;   -- MGR�÷��� NULL�� �˻�
select ename, nvl(mgr,'CEO') from emp where mgr is null; -- ���� �߻�
select ename, nvl(to_char(mgr,'9999'),'CEO') from emp where mgr is null;
select ename, nvl(to_char(mgr,'9999'),'CEO') MANAGER  from emp where mgr is null;

-- decode() : switch ~ case ������ ����
-- decode( �÷���, ��1, ���1,
--                ��2, ���2,
--                ��3, ���3,
--                ............)
--Q. ������̺��� �μ���ȣ(deptno)�� �μ������� �ٲ㼭 ����ϴ� SQL�� �ۼ�?
select ename, deptno, decode( deptno, 10, 'ACCOUNTING', 
                                      20, 'RESEARCH',
                                      30, 'SALES',
                                      40, 'OPERATIONS') as dname from emp;


-- case() : if ~ else if ���� ����
-- case   when  ����1  then  ���1
--        when  ����2  then  ���2
--        else  ���3
-- end
--Q. ������̺��� �μ���ȣ(deptno)�� �μ������� �ٲ㼭 ����ϴ� SQL�� �ۼ�?
select ename, deptno, case  when deptno=10 then 'ACCOUNTING'
                                 when deptno=20 then 'RESEARCH'
                                 when deptno=30 then 'SALES'
                                 when deptno=40 then 'OPERATIONS'
                      end  as dname from emp;
                      
-----------------------------------------------------------------------
-- �׷��Լ� : �ϳ� �̻��� �����͸� �׷����� ��� ������ �����ϰ�
--           �ϳ��� ����� ó�����ִ� �Լ�

-- sum() : ���� �����ִ� �Լ�
select sum(sal) from emp;       -- �޿��� ��
select sum(comm) from emp;      -- comm�� ��, null���� ����
select sum(ename) from emp;     -- ���� �߻�
select sum(hiredate) from emp;  -- ���� �߻�

select sum(sal), sum(comm) from emp;    -- �׷��Լ����� ��� ������
select sal, sum(sal) from emp;  --�׷��Լ��� �Ϲ� �÷��� ���� ����� �� ����.

select sum(sal) from emp where deptno=10;   -- 8750
select sum(sal) from emp where deptno=20;   -- 10875
select sum(sal) from emp where deptno=30;   -- 9400
select sum(sal) from emp where deptno=40;   -- null

-- avg() : ��հ��� �����ִ� �Լ�
select avg(sal) from emp;
select avg(sal), avg(comm) from emp;
select avg(sal), avg(comm) from emp where deptno=10;
select avg(sal), avg(comm) from emp where deptno=20;
select avg(sal), avg(comm) from emp where deptno=30;

-- max() : �ִ밪�� �����ִ� �Լ�
select max(sal) from emp;   -- 5000
select ename, max(sal) from emp; -- �����߻� : �׷��Լ��� �Ϲ��÷��� ���� ����� �� ����.                   
select max(sal) from emp where deptno = 10; 
select max(sal) from emp where deptno = 20; 
select max(sal) from emp where deptno = 30; 

--Q.��� ���̺��� ���� �ֱٿ� �Ի��� ����� �Ի����� ����ϴ� SQL�� �ۼ�?
select max(hiredate) from emp;  -- 87/07/13
select hiredate from emp order by hiredate desc;

select max(ename) from emp;     -- WARD
select ename from emp order by ename desc;  -- �������� ���� (���� ���� ����)

-- min() : �ּҰ��� �����ִ� �Լ�
select min(sal) from emp;   -- 800
select min(sal) from emp where deptno = 10; -- 1300
select min(sal) from emp where deptno = 20; -- 800
select min(sal) from emp where deptno = 30; -- 950

--Q. ������̺��� ���� ���� �Ի��� ����� �Ի����� �˻��ϴ� SQL�� �ۼ�?
select min(hiredate) from emp;      -- 80/12/17
select hiredate from emp order by hiredate asc;

select min(ename) from emp;         -- ADAMS
select ename from emp order by ename asc;   -- �������� ���� (������ ����)

select sum(sal), avg(sal), max(sal), min(sal) from emp;
select sum(sal), avg(sal), max(sal), min(sal) from emp where deptno=10;
select sum(sal), avg(sal), max(sal), min(sal) from emp where deptno=20;
select sum(sal), avg(sal), max(sal), min(sal) from emp where deptno=30;

-- count() : �� ������ ������ �����ִ� �Լ�
select count(sal) from emp;  -- 14
select count(mgr) from emp;  -- 13 : null���� counting�� ���� �ʴ´�.
select count(comm) from emp; -- 4 : null���� counting�� ���� �ʴ´�.
select count(empno) from emp;-- 14 : (empno�÷� : �⺻Ű�� ������ �÷�)
select count(*) from emp;    -- 14

--Q. ��� ���̺��� JOB�� ���� ���ϱ�
select count(job) from emp;  -- 14 : �ߺ� �����͵� counting �ȴ�.
select job from emp;
select distinct job from emp; -- �ߺ����� ������ JOB ���

-- �ߺ����� ������ job�� ���� ���ϱ�?
select count(distinct job) from emp;    -- 5

--Q.��� ���̺��� ���� �ֱٿ� ����� �Ի��ϰ� ���� ���� �Ի��� ����� �Ի����� 
--  ���ϴ� SQL�� �ۼ�?
select max(hiredate) �ֱ��Ի�, min(hiredate) �����Ի� from emp;

--Q.10�� �μ� �Ҽ� ��� �߿��� Ŀ�̼��� �޴� ����� ���� ���ϴ� SQL�� �ۼ�?
select count(comm) from emp where deptno=10;


-- group by ��
-- : Ư�� �÷��� �������� ���̺� �����ϴ� �����͸� �׷����� �����Ͽ� 
--   ó���� �ִ� ������ �Ѵ�.

--Q.�� �μ�(10,20,30)�� �޿��� ��, ��ձ޿�, �ִ�޿�, �ּұ޿��� ���ϴ� SQL�� �ۼ�?
select sum(sal), avg(sal), max(sal), min(sal) from emp where deptno=10;
select sum(sal), avg(sal), max(sal), min(sal) from emp where deptno=20;
select sum(sal), avg(sal), max(sal), min(sal) from emp where deptno=30;

-- �׷��Լ��� �Ϲ��÷��� ���� ����� �� ������, ���������� group by���� ���Ǵ� 
-- �÷��� �׷��Լ��� ���� ����� �� �ִ�.
select deptno, sum(sal), avg(sal), max(sal), min(sal) from emp
       group by deptno order by deptno asc;

select deptno from emp group by deptno;
select job from emp group by job;

--Q.JOB�÷��� �������� �޿��� ��, ��ձ޿�, �ִ�޿�, �ּұ޿��� ���ϴ� SQL�� �ۼ�?
select job, sum(sal), avg(sal), max(sal), min(sal) from emp
        group by job;
        
--Q.�� �μ���ȣ�� ������� Ŀ�̼��� �޴� ����� ���� ���ϴ� SQL�� �ۼ�?
select deptno, count(*) �����, count(comm) Ŀ�̼� from emp
        group by deptno order by deptno asc;
        
-- having ������
--Q.�� �μ��� ��ձ޿� �ݾ��� ���ϴ� SQL�� �ۼ�?
select deptno, avg(sal) from emp group by deptno;

--Q.�� �μ��� ��ձ޿� �ݾ��� 2000 �̻��� �μ��� ����ϴ� SQL�� �ۼ�?
select deptno, avg(sal) from emp group by deptno
       where avg(sal) >= 2000;      -- �����߻�

 -- group by ���� ���Ǵ� ��쿡 ������ ������ ���ϱ� ���ؼ��� where ������
 -- ��ſ� having �������� ����ؾ� �ȴ�.
select deptno, avg(sal) from emp group by deptno
       having avg(sal) >= 2000;  
       
--Q. �� �μ��� �ִ�޿� �ݾ���  2900 �̻��� �μ��� ����ϴ� SQL�� �ۼ�?
select deptno, max(sal) from emp group by deptno;

select deptno, max(sal) from emp group by deptno 
        having max(sal) >= 2900;
       