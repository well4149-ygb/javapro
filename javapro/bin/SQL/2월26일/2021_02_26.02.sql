--2021.02.26 (��)

-- ����(join)
-- : 2�� �̻��� ���̺��� �����ؼ� ������ ���ؿ��� ��

--Q. SCOTT ����� �Ҽӵ� �μ����� ����ϴ� SQL�� �ۼ�?
--1. ��� ���̺�(EMP)���� SCOTT ����� �μ���ȣ�� ���Ѵ�.
select deptno from emp where ename = 'SCOTT';   -- 20
--2. �μ� ���̺�(DEPT)���� 20�� �μ��� �μ����� ���Ѵ�.
select dname from dept where deptno = 20;       -- RESEARCH

-- CROSS JOIN
select * from dept, emp;    -- 4 * 14 = 56�� ������ �˻�
select * from emp, dept;    -- 14 * 4 = 56�� ������ �˻�

-- CROSS JOIN ����
--1. � ����(Equi Join)
--2. �� ����(Non-Equi Join)
--3. ��ü ����(Self Join)
--4. �ܺ� ����(Outer Join)

--1. � ����(Equi Join)
--   : �� ���̺� ������ �÷��� �������� ����
select * from dept, emp where dept.deptno=emp.deptno; -- 14���� ������ �˻�

--Q. SCOTT ����� �Ҽӵ� �μ����� ����ϴ� SQL�� �ۼ�? (���� �̿�)
select ename, dname from dept, emp
    where dept.deptno=emp.deptno and ename = 'SCOTT';
  
-- ���� �÷�(deptno)�� ���̺�.�����÷��� �������� ����ؾ� �ȴ�.
-- ���� �÷��� �ƴ� �÷����� �տ� ���̺���� ���� �� �� �ִ�.
select deptno, ename, dname from dept, emp
    where dept.deptno=emp.deptno and ename = 'SCOTT';  -- ���� �߻�  
    
select dept.deptno, ename, dname from dept, emp         -- dept.deptno
    where dept.deptno=emp.deptno and ename = 'SCOTT';   
    
select emp.deptno, ename, dname from dept, emp         -- emp.deptno
    where dept.deptno=emp.deptno and ename = 'SCOTT';   
    
-- ���̺� ��Ī �ο��ϱ�
--1.���̺� ���� ��Ī�� �ο��� ���� ���ʹ� ���̺���� ����� �� ����,
--   ��Ī�� ����ؾ� �ȴ�.
--2.��Ī���� ��.�ҹ��ڸ� �������� �ʴ´�.

--�����߻�(��Ī�� ��밡��)
select D.deptno, emp.ename, D.dname from emp E, dept D 
    where D.deptno = E.deptno and E.ename = 'SCOTT';
 
-- ��Ī���� ��.�ҹ��ڸ� �������� �ʴ´�.    
select d.deptno, e.ename, d.dname from emp E, dept D 
    where D.deptno = E.deptno and E.ename = 'SCOTT';   

-- �����÷��� �ƴ� �÷��� �տ� ��Ī���� ������ �� �ִ�.   
select d.deptno, ename, dname from emp E, dept D 
    where D.deptno = E.deptno and ename = 'SCOTT';   

--Q. ������ ����Ͽ� ���忡 �ٹ��ϴ� ����� �̸��� �޿��� ����ϴ� SQL�� �ۼ�?
select dept.deptno, ename, sal from dept, emp
    where dept.deptno = emp.deptno and loc = 'NEW YORK';
    
--Q. ������ ����Ͽ� SALES�μ� �Ҽ� ����� �̸��� �Ի����� ����ϴ� SQL�� �ۼ�?
select dept.deptno, ename, hiredate from dept, emp
    where dept.deptno = emp.deptno and dname='SALES';
    
 --2.�� ����
 --  : �ΰ��� ���̺� ������ �÷� ���� �ٸ� ������ ����Ͽ� �����ϴ°�
 
 --Q. ��� ���̺� �ִ� �� ������� �޿��� �� ��������� ����ϴ� SQL�� �ۼ�?
 --    EMP(SAL)  -  SALGRADE(DRADE)
 
select ename, sal, grade from emp, salgrade
    where sal >= losal and sal <= hisal;
    
select ename, sal, grade from emp, salgrade
    where sal between losal and hisal;   
 
select e.ename, e.sal, s.grade from emp e, salgrade s
    where e.sal between s.losal and s.hisal;
 
--3. ��ü����(Self Join)
--   : �� ���� ���̺� ������ �÷��� �÷� ������ ���踦 �̿��ؼ� ����
--Q. ��ü����(Self Join)�� �̿��Ͽ� ��� ���̺��� �� ������� ������
--   �Ŵ���(=���ӻ��)�� ����ϴ� SQL�� �ۼ�?
--   EMP(EMPNO)  -  EMP(MGR)    
    
select employee.ename || '�� �Ŵ�����' || manager.ename from emp employee, emp manager where employee.mgr = manager.empno;  
-- 13���� �˻� ����� ��µȴ�.
-- KING ����� ���ӻ���� ���� ������ ��µ��� �ʴ´�.

--4.�ܺ� ����(Outer JOin)
-- : ���� ������ �������� �ʴ� �����͸� ��� ���ִ� ����
-- 1) ���̺��� �����Ҷ� ��� ������ ���̺��� �����Ͱ� ����������, �ٸ� ���̺��� �����Ͱ� �������� �ʴ� ��쿡,
--    �� �����Ͱ� ��µ��� �ʴ� ������ ����ϱ� ���ؼ� ���Ǵ� ���� ���
-- 2) ������ ������ ���� (+)�� �߰��Ѵ�.
--Q1. ���� ��ü���� ���, KING����� ���ӻ�� ���� ������ ��µ��� �ʾҴµ�, KING ����� �ܺ������� �̿��ؼ� ����ϼ���
select employee.ename || '�� �Ŵ�����' || manager.ename from emp employee, emp manager where employee.mgr = manager.empno(+);

--Q2. �μ����̺�(DEPT)�� 40�� �μ��� ������ ������̺�(EMP)�� �μ���ȣ���� ��Ÿ���� ������, 40�� �μ��� �μ����� ����ϴ� SQL�� �ۼ�
-- 1) DEPT - EMP � ���� : 40�� �μ��� ��¾ȵ�
select ename, d.deptno, dname from emp e, dept d where e.deptno = d.deptno order by deptno asc;

--2) �ܺ����� : ��µ��� �ʴ� 40�� �μ��� ����� �ִ� ����
select ename, d.deptno, dname from emp e, dept d where e.deptno(+) = d.deptno order by deptno asc;




