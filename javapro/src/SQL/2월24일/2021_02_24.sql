 -- 2021.02.24(수)
 
 -- 테이블 목록
 select * from tab;
 
 -- DEPT 테이블 구조
 describe dept;
 desc dept;
 
 -- dept 테이블의 데이터 검색
 select * from dept;
 
-- EMP 테이블 구조
desc emp;

-- EMP 테이블의 데이터 검색
select * from emp;

-- 오라클의 데이터 타입
-- 1. 숫자 데이터
--    number(n)      :  number(2)  정수 2자리까지 저장
--    number(n1, n2) :  n1 : 전체 자리수
--                      n2 : 소숫점에 할당된 자리수    

-- 2. 문자 데이터
-- char() : 고정 길이 문자형
--          최대 2000byte 까지 저장 가능함.
-- varchar2() : 가변 길이 문자형
--              최대 4000byte 까지 저장 가능함. 
-- long :  2GB 까지 저장 가능

-- 3. 날짜 데이터
-- date :  년/월/일 정보 저장
-- timestamp : 년/월/일 시:분:초

-- select SQL문
select * from dept;

select loc, deptno, dname from dept;

select empno, ename, sal from emp;

-- 산술 연산자 : +, -, *, /
select sal + comm from emp;
select sal - 100 from emp;
select sal * 100 from emp;
select sal / 100 from emp;

--Q. 사원테이블(EMP)에 소속된 사원들의 연봉을 구해보자?
--  연봉 = 급여(SAL) * 12  +  커미션(COMM)

select ename, job, sal, comm, sal*12, sal*12+comm from emp;

-- NULL
--1. 정해지지 않은 값을 의미
--2. NULL 값은 산술연산을 할 수 없다.
--3. NULL 값의 예
--   EX) EMP 테이블 : MGR 컬럼
--                   COMM 컬럼

-- NVL(컬럼, 변환될 값) : NULL 값을 다른 값(0)으로 변환 해주는 함수
-- ex) NVL( comm, 0 )

select ename, job, sal, comm, sal*12, sal*12+nvl(comm, 0) from emp;

-- 별칭 부여하기 :  as  "별칭명"
select ename, sal*12+nvl(comm, 0) as "Annsal" from emp;
select ename, sal*12+nvl(comm, 0) "Annsal" from emp;  -- as 생략 가능
select ename, sal*12+nvl(comm, 0) Annsal from emp;    -- "" 생략 가능

-- 별칭명에 띄어쓰기가 있을 경우에는 쌍따옴표를 생략 할 수 없다.
select ename, sal*12+nvl(comm, 0) as "연 봉" from emp;
select ename, sal*12+nvl(comm, 0)  "연봉" from emp;     -- as 생략 가능
select ename, sal*12+nvl(comm, 0)  연봉 from emp;       -- "" 생략 가능

-- Concatenation 연산자 : ||
-- : 컬럼과 문자열을 연결할 때 사용함
select ename, 'is a', job from emp;

select ename || 'is a' || job from emp;

-- distinct : 중복행을 제거하고 1번만 출력
select deptno from emp;

select distinct deptno from emp;    -- 3개의 부서번호 출력 : 10, 20, 30

--Q. EMP 테이블에서 각 사원들의 JOB을 1번만 출력하는 SQL문을 작성하세요?
select job from emp;

select distinct job from emp;   -- 5개의 JOB출력

-- EMP 테이블의 총 데이터 수 구하기
--  count(컬럼명) : 데이터 갯수 구하기
select count(*) from dept;
select count(*) from emp;
select count(job) from emp;     -- 14

--Q. EMP 테이블에서 중복을 제거한 JOB의 갯수를 구하는 SQL문 작성 하세요?
select count(distinct job) from emp;  -- 5

------------------------------------------------------------------------
-- where 조건절 : 비교 연산자 ( =, >, >=, <, <= , !=, ^=, <> )

--1. 숫자 데이터 검색
-- Q. 사원 테이블에서 급여를 3000 이상 받는 사원을 검색하는 SQL문 작성?
select * from emp where sal >= 3000;

-- Q. 급여가 3000인 사원을 검색?
select * from emp where sal = 3000;

-- Q. 급여가 3000이 아닌 사원을 검색?
select * from emp where sal != 3000;
select * from emp where sal ^= 3000;
select * from emp where sal <> 3000;

-- Q. 급여가 1500 이하인 사원의 사원번호, 사원명, 급여를 출력하는 SQL문 작성?
select empno, ename, sal from emp where sal <= 1500;

--2. 문자 데이터 검색
-- 1) 문자 데이터는 대.소문자를 구분한다.
-- 2) 문자 데이터를 검색 할때는 문자열 좌.우에 외따옴표(')를 붙여야 한다.

--Q. 사원 테이블 사원명이 FORD 인 사원의 정보를 검색하는 SQL문 작성?
select * from emp where ename = 'ford';     -- 검색결과 없음
select * from emp where ename = FORD;       -- 오류 발생
select * from emp where ename = "FORD";     -- 오류 발생
select * from emp where ename = 'FORD';     -- 정상적인 검색

--Q. SCOTT 사원의 사원번호, 사원명, 급여를 출력하는 SQL문 작성?
select empno, ename, sal from emp where ename = 'SCOTT';

--3. 날짜 데이터 검색
-- 1) 날짜 데이터를 검색할때 날짜 좌.우에 외따옴표(')를 붙여야 한다.
-- 2) 날짜 데이터를 비교할때 비교 연산자를 사용한다.

-- Q. 1982년 1월 1일 이후에 입사한 사원을 검색하는 SQL문 작성?
select * from emp where hiredate >= 82/01/01;       -- 오류 발생
select * from emp where hiredate >= '82/01/01';     -- 정상적인 검색
select * from emp where hiredate >= '1982/01/01';   -- 정상적인 검색

select * from emp where hiredate >= '1982/01/01' order by hiredate asc;


 