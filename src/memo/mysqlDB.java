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

    -- 1/3 오전
-- 그룹화(grouping, 특정 컬럼을 동일한 데이터끼리 묶는것)
-- 그룹화한 결과를 조회할 때는 그룹화한 컬럼으로 조회만 가능
-- job을 기준으로
    select * from emp group by job; -- x
    select job, ename from emp group by job; -- x
    select job from emp group by job;
    select job, ename from emp group by job, ename;
-- 직급별 평균급여
    select job, avg(sal) from emp group by job;
    select job, round(avg(sal),2) from emp group by job;
-- 직급이 clerk인 사원들의 평균급여
    select job, avg(sal) from emp where job = 'clerk';
-- 부서별(deptno) 평균급여
    select deptno, avg(sal) from emp group by deptno;
-- 직급별 사원수
    select job,count(*) from emp group by job;
-- 직급별 평균급여, 사원수
    select job,avg(sal),count(*) from emp group by job;
-- 위의 결과에서 직급기준 오름차순 정렬
    select job,avg(sal),count(*) from emp group by job order by job;
-- 위의 결과에서 평균 급여 소수 첫째자리 까지
    select job, round(avg(sal) ,1),count(*) from emp group by job order by job;
-- 위의 결과에서 job은 '직급' 급여 평균값은 '평균급여', 사원수는 '사원수'로 표현하여 조회
    select job as '직급', round(avg(sal) ,1) as '평균급여',count(*) as '사원수' from emp group by job order by job;

-- 두 개 이상 컬럼 그룹화
-- deptno를 기준은로 그룹화하고 그 결과내에서 job 기준으로 그룹화
    select deptno, job, count(*) from emp group by deptno, job;
    select deptno, job, count(*), avg(sal) from emp group by deptno, job;
    select deptno, job, count(*), round(avg(sal), 1) from emp group by deptno, job order by deptno;

-- 그룹화한 결과에 조건을 적용
-- having
-- 위의 결과에서 평균 급여가 2000 이상인 결과만 조회
    select deptno, job, count(*), avg(sal) from emp group by deptno, job having avg(sal) >= 2000;
    select deptno, job, count(*), avg(sal) from emp group by deptno, job having avg(sal) >= 2000 order by deptno asc;
-- 급여가 3000 이하인 사원만 가지고 부서별, 직급별 그룹화를 하고 평균급여가 2000 이상인 결과 조회
    select deptno, job, count(*), avg(sal) from emp where sal <= 3000 group by deptno, job having avg(sal) >= 2000 order by deptno;

-- date 타입으로 문자 표현: date_format()
    select date_format(hiredate, '%Y') from emp;


	연습문제
	1. 부서별 평균급여, 최고급여, 최저급여, 사원수 조회(평균급여는 소수점 둘째자리에서 반올림)
    2. 직급별 사원수 조회(단 3명 이상인 결과만 출력)
    3. 연도별 입사한 사원수 조회(조회결과 : 연도(yyyy), 사원수)
    3.1. 위의 결과에서 각 연도별로 부서별 입사한 사원수 조회(조회결과 : 연도(yyyy), 부서번호, 사원수)

-- 1. 부서별 평균급여, 최고급여, 최저급여, 사원수 조회(평균급여는 소수점 둘째자리에서 반올림)
    select deptno as '부서별', round(avg(sal), 1) as '평균급여', max(sal) as '최고급여', min(sal) as '최저급여', count(*) as '사원수' from emp group by deptno order by deptno asc;
--  2. 직급별 사원수 조회(단 3명 이상인 결과만 출력)
    select job, count(empno) from emp group by job having count(*) >= 3;
-- 연도별 입사한 사원수 조회(조회결과 : 연도(yyyy), 사원수)
    select date_format(hiredate, '%Y'), count(*) from emp group by date_format(hiredate, '%Y');
-- 위의 결과에서 각 연도별로 부서별 입사한 사원수 조회(조회결과 : 연도(yyyy), 부서번호, 사원수)
    select date_format(hiredate, '%Y'), deptno, count(*) from emp group by date_format(hiredate, '%Y'), deptno order by date_format(hiredate, '%Y');

-- 조인(join)
-- 두 개 이상의 테이블을 하나의 테이블처럼 사용할 때
    select * from emp;
    select * from dept;
    select * from emp, dept;
-- 내부조인(inner join)
-- 조인하려는 두 테이블에 공통 컬럼이 존재해야 함.
            select * from emp, dept where emp.deptno = dept.deptno;
-- 테이블 이름을 줄여서 사용
    select * from emp e, dept d where e.deptno = d.deptno;
-- deptno 컬럼은 두 테이블에 모두 있기 때문에 ambiguous 에러
    select empno, ename, job, deptno, dname, loc from emp e, dept d where e.deptno = d.deptno;
    select e.empno, e.ename, e.job, e.deptno, dname, loc from emp e, dept d where e.deptno = d.deptno;
-- emp 테이블 전체 조회
    select e.* from emp e , dept d where e.deptno = d.deptno;
-- emp, dept를 조인하여 empno, ename, deptno, dname, loc 조회
-- (단, 급여가 2500 이상인 사원만 조회하고, 조회결과는 사원이름 기준으로 오름차순 정렬)
    select e.empno, e.ename, e.deptno, d.dname, d.loc from emp e, dept d where e.deptno = d.deptno and e.sal >= 2500 order by e.ename asc;
-- 1/3 오전끝

*/
}
