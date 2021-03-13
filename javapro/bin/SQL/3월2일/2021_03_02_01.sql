-- 2021.03.02(ȭ)

-- ANSI JOIN
-- : ANSI(�̱� ǥ�� ��ȸ) ǥ�ؾȿ� ���� ������� JOIN���

-- ANSI CROSS JOIN
select * from dept cross join emp; -- 4 * 14 = 56�� ������ �˻�
select * from emp cross join dept; -- 14 * 4 = 56�� ������ �˻�

-- ASIN INNER JOIN
--Q. SCOTT ����� �Ҽӵ� �μ����� ����ϴ� SQL�� �ۼ�?
select ename, dname from dept inner join emp
    on dept.deptno = emp.deptno where ename = 'SCOTT';
    
-- USING�� �̿��ؼ� ����
select ename, dname from dept inner join emp
    using(deptno) where ename = 'SCOTT';
    
-- ANSI NATURAL JOIN
-- : dept�� emp ���̺� ������ �����÷��� ���ٴ� �ǹ̸� ������ ����.
select ename, dname from dept natural join emp where ename='SCOTT';


--ANSI OUTER JOIN
-- selec * from table1 [ left | right | full ] outer join table2;

drop table dept01 purge;  -- �ӽ����̺�� ��ü���� �ʰ� �����ϰ� ���̺� ����  
purge recyclebin;         -- �ӽ� ���̺� ����

--1. dept01 ���̺� ����
create table dept01(deptno number(2), dname varchar2(14));
insert into dept01 values(10, 'ACCOUNTING');
insert into dept01 values(20, 'RESEARCH');
select * from dept01;

--2. dept02 ���̺� ����
create table dept02(deptno number(2), dname varchar2(14));
insert into dept02 values(10, 'ACCOUTING');
insert into dept02 values(30, 'SALES');
select * from dept02;

--3. left outer join
-- dept01 ���̺��� ������ ��µ�
select * from dept01 left outer join dept02 using(deptno);

--4. right outer join
-- dept02 ���̺��� ������ ��µ�
select * from dept01 right outer join dept02 using(deptno);

--5. full outer join
-- dept01, dept02 ���̺��� ��� ������ ��µ�
select * from dept01 full outer join dept02 using(deptno);

-----------------------------------------------------------------------
-- ��������
--Q.SCOTT ����� �Ҽӵ� �μ����� ���ϴ� SQL�� �ۼ�?

-- JOIN ���� ���ϱ�
select dname from dept, emp where dept.deptno=emp.deptno and ename='SCOTT';
select dname from dept inner join emp on dept.deptno=emp.deptno 
    where ename='SCOTT';
select dname from dept inner join emp using(deptno) where ename='SCOTT';
select dname from dept natural join emp where ename = 'SCOTT';

-- ���������� ���ϱ�
select dname from dept where deptno =               -- ��������        
    (select deptno from emp where ename='SCOTT');   -- ��������
    
 --1.������ ��������
 --  1) ����������  �˻� ����� 1���� ��ȯ�Ǵ� ����
 --  2) ���� ������ where ���������� �� �����ڸ� ��� ����(=, >, >=, <, <=, !=)
 
 -- Q1.������̺��� ���� �ֱٿ� �Ի��� ������� ����ϴ� SQL�� �ۼ�?
 select ename from emp where hiredate = 
    (select max(hiredate) from emp);
    
--Q2. ��� ���̺��� �ִ� �޿��� �޴� ������ �ִ�޿� �ݾ��� ����ϴ� SQL�� �ۼ�?
select ename, max(sal) from emp;--�����߻�:�׷��Լ��� �Ϲ��÷��� ���� ����� �� ����.
select ename, sal from emp where sal = (select max(sal) from emp);
 
--Q3. SCOTT�� �޿�(SAL)�� �����ϰų� SCOTT���� �� ���� �޿��� �޴� ������ �޿���
--    ����ϴ� SQL�� �ۼ�?
select ename, sal from emp where sal >= 
    (select sal from emp where ename = 'SCOTT');      -- 3000
    
--Q4. ���ӻ��(MGR)�� KING�� ����� ������ �޿��� ����ϴ� SLQ�� �ۼ�?
select ename, sal from emp where mgr =
    (select empno from emp where ename = 'KING');      -- 7839
 
 -------------------------------------------------------------------------   
-- ����.
-- Q1. ������ MANAGER�� ����� �̸�, �μ����� ����ϴ� SQL����
--     �ۼ� �ϼ���? (JOIN�� ����Ͽ� ó��)   
select ename, dname from emp, dept 
                  where emp.deptno=dept.deptno  and  job='MANAGER';     
select ename, dname from emp inner join dept 
                     on emp.deptno=dept.deptno  where  job='MANAGER'; 
select ename, dname from emp inner join dept 
                     using(deptno)  where  job='MANAGER'; 
select ename, dname from emp natural join dept 
                     where job='MANAGER';   
                     
-- Q2. �Ŵ����� KING �� ������� �̸��� ������ ����ϴ� SQL�� �ۼ�?  
-- JOIN ���� ���ϱ�
select employee.ename, employee.job 
                   from emp employee, emp manager
                   where employee.mgr=manager.empno and manager.ename='KING';
-- ���������� ���ϱ�
select ename, job from emp where mgr = 
                 (select empno from emp where ename='KING');    -- 7839
                 
--  Q3. SCOTT�� ������ �ٹ������� �ٹ��ϴ� ����� �̸��� ����ϴ� SQL�� �ۼ�?                 
select deptno, ename from emp 
                   where deptno = (select deptno from emp where ename = 'SCOTT'); 
                   
-----------------------------------------------------------------------------------
--2. ������ ��������
--   1) ���� �������� ��ȯ�Ǵ� �˻� ����� 2�� �̻��� ��������
--   2) ���� ������ where ���������� ������ ������(in, all, any,...)�� ����ؾ� �ȴ�.

--in ������
--: ���������� �˻� ��� �߿��� �ϳ��� ��ġ�Ǹ� ���� �ȴ�.

--Q. �޿��� 3000�̻� �޴� ����� �Ҽӵ� �μ��� ������ �μ����� �ٹ��ϴ� ������� 
--   ������ ����ϴ� SQL�� �ۼ�?

-- �� �μ��� �ִ�޿� �ݾ� ���ϱ�
select deptno, max(sal) from  emp group by deptno;  -- 10, 20�� �μ�
--30	2850
--20	3000
--10	5000

select ename, sal, deptno from emp where deptno in
    (select distinct deptno from emp where sal >= 3000);     -- 10, 20
    
-- all������
-- : ���� ������ �� ������ ���������� �˻� ����� ��� ���� ��ġ�ϸ� ���̵ȴ�.
--Q. 30�� �μ��� �Ҽӵ� ��� �߿��� �޿��� ���� ���� �޴� ������� �� ���� �޿��� 
--    �޴� ����� �̸��� �޿��� ����ϴ� SQL�� �ۼ�?

-- 30�� �μ� �Ҽ� ��� �߿��� �ִ� �޿� �ݾ� ���ϱ�
select max(sal) from emp where deptno = 30;         -- 2850

-- 1) ������ ���������� ���ϱ�
select ename, sal from emp where sal >
    (select max(sal) from emp where deptno = 30);   -- 2850
-- 2) ������ ���������� ���ϱ�
select ename, sal from emp where sal >all
    (select sal from emp where deptno = 30);    -- ������ ��������
    
--any ������
--: ���� ������ �� ������ ���������� �˻� ����� �ϳ� �̻� ��ġ�Ǹ� ���̵ȴ�.
--Q. �μ���ȣ�� 30���� ������� �޿��� ���� ���� �޿�(950)���� �� ���� �޿��� �޴�
--   ������ �޿��� ����ϴ� SQL�� �ۼ�?

-- 30�� �μ��� ���� ���� �޿� ���ϱ�
select min(sal) from emp where deptno=30;   -- 950

--1) ������ ���������� ���ϱ�
select ename, sal from emp where sal >
    (select min(sal) from emp where deptno=30); -- ������ �������� : 950
--2) ������ ���������� ���ϱ�
select ename, sal from emp where sal >any
    (select sal from emp where deptno = 30);    -- ������ �������� 

    