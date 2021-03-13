-- 2021.03.05(��)

-- PL/SQL

--Q. Hello World~!!  ���
set serveroutput on
begin
DBMS_OUTPUT.PUT_LINE('Hello World~!!');
end;

-- ���� ����ϱ�
set serveroutput on
declare                        -- ����� ����
    vempno number(4);          -- ���� ���� : ��Į�� ����
    vename varchar2(10);       -- �������� ��.�ҹ��ڸ� �������� �ʴ´�.
begin                          -- ����� ����
    vempno := 7788;            -- vempno ������ 7788 �Ҵ�
    vename := 'SCOTT';         -- vename ������ SCOTT �� �Ҵ�
    DBMS_OUTPUT.PUT_LINE('��� /  �̸�');
    DBMS_OUTPUT.PUT_LINE(VEMPNO || '/' || VENAME);
end;                           --  ����� ��


-- ����� �̸� �˻��ϱ�
set serveroutput on
declare
    vempno emp.empno%type;          --  ���۷��� ����
    vename emp.ename%type;  
begin
    select empno, ename into vempno, vename from emp where ename='SCOTT';    
    DBMS_OUTPUT.PUT_LINE('��� /  �̸�');
    DBMS_OUTPUT.PUT_LINE(VEMPNO || '/' || VENAME);
end;


-- ���ǹ� (=���ù�)
--1. if ~ then ~ end if
--Q. SCOTT ����� �μ���ȣ�� �˻��ؼ� �μ����� ����ϴ� PL/SQL�� �ۼ�?

set SERVEROUTPUT on
declare
    vempno number(4);
    vename varchar2(20);
    vdeptno dept.deptno%type;
    vdname varchar2(20) := null;
begin
    select empno, ename, deptno into vempno, vename, vdeptno from emp
        where ename = 'SCOTT';
    
    if vdeptno = 10 then
        vdname := 'ACCOUNTING';
    end if;
    if vdeptno = 20 then
        vdname := 'RESEARCH';
    end if;
    if vdeptno = 30 then
        vdname := 'SALES';
    end if;
    if vdeptno = 40 then
        vdname := 'OPERATIONS';
    end if;    
    DBMS_OUTPUT.PUT_LINE('��� / �̸� / �μ���');
    DBMS_OUTPUT.PUT_LINE(vempno || '/' || vename || '/' || vdname);
end;


--Q. ��� ���̺��� SCOTT ����� ������ ���ϴ� PL/SQL�� �ۼ�
set SERVEROUTPUT ON
declare
    vemp emp%rowtype;              -- ���۷��� ����
    annsal number(7, 2);           -- ��Į�� ���� 
begin
    select * into vemp from emp where ename = 'SCOTT';
    
    if vemp.comm is null then
        vemp.comm := 0;
    end if;
    annsal := vemp.sal * 12 + vemp.comm;
    
    DBMS_OUTPUT.PUT_LINE('��� / �̸� / ����');
    DBMS_OUTPUT.PUT_LINE(vemp.empno || '/' || vemp.ename || '/' || annsal);
end;




