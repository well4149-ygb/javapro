-- 2021.02.25(��)

-- �� ������ : and, or, not
--1. and ������ : �� ���ǽ��� ��� �����ϴ� �����͸� �˻�
--Q. ��� ���̺��� �μ���ȣ�� 10���̰�, job�� MANAGER�� ����� �˻��ϴ� SQL�� �ۼ�?
select * from emp where deptno=10 AND job='MANAGER';

--2. or ������ : �� ���ǽ� �߿��� �Ѱ����� �����ص� �˻�
--Q.��� ���̺��� �μ� ��ȣ�� 10�� �̰ų�, job�� MANAGER�� ����� �˻��ϴ� SQL�� �ۼ�?
select * from emp where deptno=10 or job='MANAGER';

--3. not ������ : ������ �ݴ�� �ٲ��ִ� ����
--Q. �μ���ȣ�� 10���� �ƴ� ����� �˻��ϴ� SQL�� �ۼ�?
select * from emp where deptno = 10;        -- 10�� �μ�

select * from emp where not deptno = 10;    -- �� ������
select * from emp where deptno != 10;       -- �� ������
select * from emp where deptno ^= 10;       -- �� ������
select * from emp where deptno <> 10;       -- �� ������

--Q1.�޿��� 2000���� 3000 ������ �޿��� �޴� ����� �˻��ϴ� SQL�� �ۼ�?
select * from emp where sal>=2000 and sal<=3000;

--Q2.Ŀ�̼��� 300�̰ų� 500�̰ų� 1400�� ����� �˻��ϴ� SQL�� �ۼ�?
select * from emp where comm=300 or comm=500 or comm=1400;

--Q3.�����ȣ�� 7521�̰ų� 7654�̰ų� 7844�� ����� �˻��ϴ� SQL�� �ۼ�?
select * from emp where empno=7521 or empno=7654 or empno=7844;

-- between  and ������
-- : where  �÷���  between  ������ and  ū��
--Q.�޿��� 2000���� 3000 ������ �޿��� �޴� ����� �˻��ϴ� SQL�� �ۼ�?
select * from emp where sal>=2000 and sal<=3000;
select * from emp where sal between 2000 and 3000;
select * from emp where sal between 3000 and 2000;  -- �˻� ��� ����

--Q. �޿��� 2000 �̸��̰ų� 3000�� �ʰ��� ����� �˻��ϴ� SQL�� �ۼ�?
select * from emp where sal < 2000 or sal > 3000;
select * from emp where sal not between 2000 and 3000;

--Q.1987�⵵�� �Ի��� ����� �˻��ϴ� SQL�� �ۼ�?
select * from emp where hiredate >='87/01/01' and hiredate <= '87/12/31';
select * from emp where hiredate between '87/01/01' and '87/12/31';

-- in������
-- : where  �÷���  in (������1, ������2,....)
--Q.Ŀ�̼��� 300�̰ų� 500�̰ų� 1400�� ����� �˻��ϴ� SQL�� �ۼ�?
select * from emp where comm=300 or comm=500 or comm=1400;
select * from emp where comm in(300, 500, 1400);

--Q.Ŀ�̼��� 300, 500, 1400�� �ƴ� ����� �˻��ϴ� SQL�� �ۼ�?
select * from emp where comm != 300 and comm != 500 and comm != 1400;
select * from emp where comm not in(300, 500, 1400);

--Q.�����ȣ�� 7521�̰ų� 7844�� ������� �˻��ϴ� SQL���� in�����ڷ� �ۼ�?
select * from emp where empno = 7521 or empno = 7844;
select * from emp where empno in(7521, 7844);

-------------------------------------------------------------------------
-- like �����ڿ� ���ϵ� ī��
-- : where  �÷�  like  pattern

-- ���ϵ� ī��
-- 1. % : ���ڰ� ���ų�, �ϳ� �̻��� ���ڰ� � ���� �͵� �������.
-- 2. _ : �ϳ��� ���ڰ� � ���� �͵� �������.

-- % ���ϵ� ���
--Q.������̺��� ������� �빮�� F�� �����ϴ� ����� �˻��ϴ� SQL�� �ۼ�?
select * from emp where ename = 'FORD';     -- FORD ����� �˻���
select * from emp where ename like 'F%';

--Q.������̺��� ������� �빮�� N���� ������ ����� �˻��ϴ� SQL�� �ۼ�?
select * from emp where ename like '%N';

--Q.������̺��� ����� �빮�� A�� ���Ե� ����� �˻��ϴ� SQL�� �ۼ�?
select * from emp where ename like '%A%';

-- ����(_) ���ϵ� ī��
-- ����(_) :  �ϳ��� ���ڿ� � ���� �͵� �������.
--Q. ��� �̸��� �ι�° ���ڰ� A�� ����� �˻��ϴ� SQL�� �ۼ�?
select * from emp where ename like '_A%';

--Q. ��� �̸��� ����° ���ڰ� A�� ����� �˻��ϴ� SQL�� �ۼ�?
select * from emp where ename like '__A%';

--Q. ��� �̸��� ������ 2��° ���ڰ� E�� ����� �˻��ϴ� SQL�� �ۼ�?
select * from emp where ename like '%E_';

-- not like ������
--Q. ����� A�� ���ԵǾ� ���� ���� ����� �˻��ϴ� SQL�� �ۼ�?
select * from emp where ename like '%A%';       -- A�� ���Ե� ����˻�
select * from emp where ename not like '%A%';
------------------------------------------------------------------------
-- null �� �˻�
-- ex) EMP���̺� : MGR�÷�, COMM�÷�
--Q. MGR �÷��� null ���� �����͸� �˻�?
select * from emp where mgr = null;     -- �˻� �ȵ�
select * from emp where mgr = '';       -- �˻� �ȵ�

select * from emp where mgr is null;

--Q. COMM �÷��� null ���� �����͸� �˻�?
select * from emp where comm = null;    -- �˻� �ȵ�
select * from emp where comm = '';      -- �˻� �ȵ�

select * from emp where comm is null;

--Q. COMM �÷��� null ���� �ƴ� ������ �˻�?
select * from emp where comm is not null;

-----------------------------------------------------------------------
-- ���� :  order  by  �÷���   ���Ĺ��(asc, desc)
-- ���� ��� : ��������(ascending), ��������(descending)

--           ��������                           ��������
-----------------------------------------------------------------------
-- ����: ���� ���ں��� ū���ڷ� ����(1,2,3..)    ū���ں��� ���� ���ڷ� ����
-- ����: ������ ����(a,b,c..)                  ���� ���� ����(z,y,x,,,)
-- ��¥: ������¥ ������ ����                   ������¥ ������ ����
-- NULL: NULL���� ���� �������� ���            NULL���� ���� ���� ���

--1.���� ������ ����
--Q.��� ���̺��� �޿��� �������� �������� ����
select ename, sal from emp order by sal asc;

-- ���Ĺ��(asc, desc)�� �����Ǹ�, �⺻ ���� ����� ������������ ������.
select ename, sal from emp order by sal;

--Q.��� ���̺��� �޿��� �������� �������� ����
select ename, sal from emp order by sal desc;

--2.���� ������ ����
--Q.��� ���̺��� ������� �������� �������� ���� : ������ ����
select ename from emp order by ename asc;
select ename from emp order by ename;

--Q.��� ���̺��� ������� �������� �������� ���� : �������� ����
select ename from emp order by ename desc;

--3.��¥ ������ ����
--Q.��� ���̺��� �Ի����� �������� �������� ���� : ���� ��¥�� ����
select  hiredate from emp order by hiredate asc;

--Q.��� ���̺��� �Ի����� �������� �������� ���� : ���� ��¥�� ����
select hiredate from emp order by hiredate desc;

--4.NULL�� ����
-- 1) �������� ����: NULL���� ���� �������� ���
-- 2) �������� ����: NULL���� ���� ���� ���

--Q. MGR�÷��� �������� �������� ����
select mgr from emp order by mgr asc;   -- NULL���� ���� �������� ���

--Q. MGR�÷��� �������� �������� ����
select mgr from emp order by mgr desc;  -- NULL���� ���� ���� ���

--Q. comm�÷��� �������� �������� ����
select comm from emp order by comm asc; -- NULL���� ���� �������� ���

--Q. comm�÷��� �������� �������� ����
select comm from emp order by comm desc; -- NULL���� ���� ���� ���


-- ������ �����ϱ�
--1. �ѹ� ���������� ������ ����� ������ �����Ͱ� ���� ��쿡 �ѹ� �� ������ �ؾ��Ѵ�.
--2. �ι�° ���� ������ �ѹ� ���������� ������ ����� ���� �����͸� �ι�° ����������
--   ������ �޴´�.
--3. ��� �Խ����� ���� ��쿡 �ַ� ����Ѵ�.

--Q. ��� ���̺��� �޿��� �������� �������� ������ �Ѵ�. �̶� ������ �޿��� �޴� 
--   ������� ������� �������� ������������ �����ؼ� ����ϴ� SQL���� �ۼ�?
select ename, sal from emp order by sal desc;

select ename, sal from emp order by sal desc, ename asc;

-- ���� ����
--Q1. ��� ���̺��� �ڷῡ�� �Ի����� �������� ������������ �����Ͽ� ����ϵ� �����ȣ,
--    �����, ����, �Ի��� �÷��� ����ϴ� SQL�� �ۼ�?
select empno, ename, job, hiredate from emp order by hiredate asc;

--Q2. ��� ���̺��� �ڷῡ�� �����ȣ�� �������� ������������ �����Ͽ� �����ȣ�� �����
--    �÷��� ����ϴ� SQL�� �ۼ�?
select empno, ename from emp order by empno desc;

--Q3. �μ���ȣ�� ���� ������� ����ϵ�, ������ �μ����� ����� ����ϴ� ��쿡��
--    �ֱٿ� �Ի��� ������� ����ϵ� �����ȣ, �Ի���, �����, �޿������� ����ϴ�
--    SQL�� �ۼ�?
select empno, hiredate, ename, sal, deptno from emp 
    order by deptno asc, hiredate desc;





