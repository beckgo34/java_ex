package memo;

public class mysqlDB {
    /*
      use db_dbclass;

create table table1(
	col1 int,
    col2 varchar(5)
    );

-- 테이블 조회
select * from table1;

-- 테이블에 데이터 저장
insert into table1(col1, col2) values(1, '안녕');
insert into table1(col1, col2) values(2, '화요일');

-- 정의한 컬럼에 맞지 않는 데이터가 들어오면 에러
insert into table1(col1, col2) values('ㅁㅁ', '안녕');

-- 데이터 크기가 맞지않으면 에러
insert into table1(col1, col2) values(4, '화요일입니다');
insert into table1(col1, col2) values(5, 'asdfgh');


 관리번호(id) bigint,
 학번(studentNumber),
 이름<studentName),
 전화번호(studentMobile),
 학과(studentMajor) 정보를 저정하는 student_table생성


    create table student_table(
            id bigint,
            studentNumber varchar(8),
    studentName varchar(20),
    studentMobile varchar(13),
    studentMajor varchar(30)
);

    insert into student_table(id, studentNumber, studentName, studentMobile, studentMajor)
    values(1, '20241111', '학생1', '010-1234-5678', '컴퓨터공학');

    select * from student_table;


    create table dept (
            deptno int,
            dname varchar(14),
    loc varchar(13)
);

    create table emp (
            empno int,
            ename varchar(10),
    job varchar(9),
    mgr int,
    hiredate date,
    sal int,
    comm int,
    deptno int
);

    create table bonus (
            ename varchar(10),
    job varchar(9),
    sal int,
    comm int
);


    create table salgrade (
            grade int,
            losal int,
            hisal int
    );

    insert into dept values	(10,'ACCOUNTING','NEW YORK');
    insert into dept values (20,'RESEARCH','DALLAS');
    insert into dept values (30,'SALES','CHICAGO');
    insert into dept values	(40,'OPERATIONS','BOSTON');

    insert into emp values (7369,'SMITH','CLERK',7902, str_to_date('17-12-1980','%d-%m-%Y'),800,NULL,20);
    insert into emp values (7499,'ALLEN','SALESMAN',7698,str_to_date('20-2-1981','%d-%m-%Y'),1600,300,30);
    insert into emp values (7521,'WARD','SALESMAN',7698,str_to_date('22-2-1981','%d-%m-%Y'),1250,500,30);
    insert into emp values (7566,'JONES','MANAGER',7839,str_to_date('2-4-1981','%d-%m-%Y'),2975,NULL,20);
    insert into emp values (7654,'MARTIN','SALESMAN',7698,str_to_date('28-9-1981','%d-%m-%Y'),1250,1400,30);
    insert into emp values (7698,'BLAKE','MANAGER',7839,str_to_date('1-5-1981','%d-%m-%Y'),2850,NULL,30);
    insert into emp values (7782,'CLARK','MANAGER',7839,str_to_date('9-6-1981','%d-%m-%Y'),2450,NULL,10);
    insert into emp values (7788,'SCOTT','ANALYST',7566,str_to_date('13-7-87','%d-%m-%Y'),3000,NULL,20);
    insert into emp values (7839,'KING','PRESIDENT',NULL,str_to_date('17-11-1981','%d-%m-%Y'),5000,NULL,10);
    insert into emp values (7844,'TURNER','SALESMAN',7698,str_to_date('8-9-1981','%d-%m-%Y'),1500,0,30);
    insert into emp values (7876,'ADAMS','CLERK',7788,str_to_date('13-7-87','%d-%m-%Y'),1100,NULL,20);
    insert into emp values (7900,'JAMES','CLERK',7698,str_to_date('3-12-1981','%d-%m-%Y'),950,NULL,30);
    insert into emp values (7902,'FORD','ANALYST',7566,str_to_date('3-12-1981','%d-%m-%Y'),3000,NULL,20);
    insert into emp values (7934,'MILLER','CLERK',7782,str_to_date('23-1-1982','%d-%m-%Y'),1300,NULL,10);

    insert into salgrade values (1,700,1200);
    insert into salgrade values (2,1201,1400);
    insert into salgrade values (3,1401,2000);
    insert into salgrade values (4,2001,3000);
    insert into salgrade values (5,3001,9999);

    select * from emp;
    select * from bonus; -- 조회결과 없음
    select * from salgrade;
    select * from dept;

-- emp 테이블 전체 컬럼 조회
    select * from emp;
-- emp 테이블의 empno, ename 컬럼만 조회
    select empno, ename from emp;
-- select SMITH from emp; -- X
-- emp 테이블의 job 컬럼만 조회
    select job from emp;
-- 중복값은 한 번만 조회
    select distinct job from emp;
-- 사원 이름 조회(오름차순)
    select * from emp order by ename asc;
-- 사원 이름 조회(오름차순)
    select * from emp order by ename desc;
-- 급여(sal) 기준 오름차순 정렬
    select * from emp order by sal asc;
-- 급여(sal) 기준 내림차순 정렬
    select * from emp order by sal desc;
-- 입사일(hirdate) 기준 오름차순 정렬
    select * from emp order by hiredate asc;
-- 입사일(hirdate) 기준 내림차순 정렬
    select * from emp order by hiredate desc;
-- 정렬 기준이 두가지라면 콤마(,)로 구분
-- 입사일 기준 내림차순정렬하고 입사일이 같다면 이름 기준 오른차순
    select * from emp order by hiredate desc, ename asc;
-- 조건: 특정 데이터를 기준으로 조회하고자 할 때
-- where
-- 직급(job)이 salesman인 사원 조회
    select * from emp where job = 'salesman';
-- 직급이(job)이 manager인 사원 조회
    select * from emp where job = 'manager';
-- 부서번호(deptno)가 10인 사원 조회
    select * from emp where deptno = 10;
-- 사번(empno)이 7654인 사원 조회
    select * from emp where empno = 7654;
-- 이름(ename)이 james인 사원 조회
    select * from emp where ename = 'james';

-- 조건이 2가지 이상
-- 직급이 manager 이고 부서번호가20인 사원
    select * from emp where job = 'manager' and deptno = 20;
-- 직급이 salesman 이고 clerk인 사원
    select * from emp where job = 'salesman' or job = 'clerk';
-- 급여(sal)가 3000 이상인 사원
    select * from emp where sal >= 3000;
-- 급여가 1000이상 3000이하인 사원
    select * from emp where sal >= 1000 and sal <= 3000;
    select * from emp where sal between 1000 and 3000;
-- 급여가 1000 미만이거나 3000초과
    select * from emp where sal not between 1000 and 3000;
-- 급여가 1000이상 3000이하인 사원 급여 오름차순
    select * from emp where sal >= 1000 and sal <= 3000 order by sal;
-- 급여가 3000 이하인 사원
    select * from emp where sal <= 3000;
-- 급여가 3000 이하인 사원 조회 결과를 sal 기준으로 오름차순 정렬
    select * from emp where sal <= 3000 order by sal;
-- 직급이 salesman이 아닌사원
    select * from emp where job != 'salesman';
    select * from emp where not job = 'salesman';
-- 입사일자가 81년 4월 1일 이후인 사원
    select * from emp where hiredate > '1981-04-01';
    select * from emp where hiredate > '1981-04-01' order by hiredate;
-- str_to_date(): 문자를 날짜형으로 변환하는 함수
    select * from emp where hiredate > str_to_date('1981-04-01', '%Y-%m-%d');

-- like 연산자
    select * from emp where ename like 'm%';  -- martin miller
    select * from emp where ename like '%n';  -- allen, martin
    select * from emp where ename like '%m%'; -- smith, martin, adams, james, miller
    select * from emp where ename like '_m%'; -- smith
    select * from emp where ename like '__m%'; -- james
-- 김씨성의 이름이 3글자인 사원
    select * from emp where ename like '김__';
-- 이씨성의 이름이 2글자인 사원
    select * from emp where ename like '이_';
-- 이름이 3글자인 사원 중에서 이름 중간에 '가' 가 있는사원
    select * from emp where ename like '_가_';

-- 함수
-- sum(), avg(), max(), min(), count()
-- 급여 총합
    select sum(sal) from emp;
    select sum(sal) as '급여총합' from emp;
-- salesman 급여 총합
    select sum(sal) as '급여총합' from emp where job = 'salesman';
    select sum(sal) as '급여총합' from emp where job = 'manager';
-- 평균 급여 조회
    select avg(sal) from emp;
-- 평균값을 소수 둘쨰자리 까지만 조회하려면
    select avg(sal) from emp;
    select round(avg(sal), 2) from emp;
-- round() 함수
-- dual: 문장을 완성하기 위한 가상 테이블
    select round(12.3456, 2) from dual;  -- 12.35
    select round(12.3456, 1) from dual;  -- 12.3
    select round(12.3456, 0) from dual;  -- 12
    select round(12.5678, 0) from dual;  -- 13

    select sysdate() from dual;

-- 가장 많은 급여
    select max(sal) from emp;
-- 가장 적은 급여
    select min(sal) from emp;
-- 전체 사원 수
    select count(*) from emp;
-- 부서번호가 20인 사원수
    select count(*) from emp where deptno = 20;
     */
}
