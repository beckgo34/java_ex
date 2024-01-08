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

-- 1/4 오후 시작

-- 서브쿼리(sub query)
-- 하나의 쿼리문 안에서 다른 쿼리문을 수행하는 것
-- 최저 급여를 받는 사원의 이름
select * from emp;
-- 1. 최저급여거 얼마인지? => 800
select min(sal) from emp;
-- 2. 800 급여를 받는 사원의 이름 => smith
select ename from emp where sal = 800;
-- 위의 두 문장을 서브쿼리로
select ename from emp where sal=(select min(sal) from emp);
-- 최고 급여를 받는 사원의 정보 조회
select * from emp where sal=(select max(sal) from emp);
-- allen 보다 높은 급여를 받는 사원 조회
select sal from emp where ename = 'allen';
select * from emp where sal > 1600;
select * from emp where sal > (select sal from emp where ename = 'allen');


	연습문제
    1. clark 보다 늦게 입사한 사원 조회
    2. 부서번호가 20인 사원 중에서 전체 사원 평균 급여보다 높은 급여를 받는 사원 조회
    3. 2번 조회 결과에서 부서이름, 부서위치도 함께 조회

-- 1.clark 보다 늦게 입사한 사원 조회
    select * from emp where hiredate > (select hiredate from emp where ename = 'clark');
-- 2. 부서번호가 20인 사원 중에서 전체 사원 평균 급여보다 높은 급여를 받는 사원 조회
    select * from emp where deptno = 20 and sal > (select avg(sal) from emp);
    select * from emp where sal > (select avg(sal) from emp) and deptno = 20;
--  3. 2번 조회 결과에서 부서이름, 부서위치도 함께 조회
    select * from emp e, dept d where e.deptno = d.deptno and sal > (select avg(sal) from emp) and e.deptno = 20;
-- 4. martin과 같은 부서 사원 중에서 전체 사원 평균 급여보다 높은 급여를 받는 사원 조회
    select deptno from emp where ename = 'martin';
    select * from emp where sal > (select avg(sal) from emp) and deptno = (select deptno from emp where ename = 'martin');

-- 제약조건
-- id, member_email, member_password 클럼이 있는 테이블
    drop table if exists member1;
    create table member1(
            id bigint,
            member_email varchar(20),
    member_password varchar(20)
);
    insert into member1(id, member_email, member_password) values(1, 'aa@aa.com', '1234');
-- 모든 컬럼에 값을 다 넣을 때는 컬럼이름 생략 가능
    insert into member1 values(2, 'bb@bb.com', '1234');
-- 특정 컬럼만 값을 넣을 때는
    insert into member1 values(3, 'cc@cc.com');
    insert into member1(id, member_email) values(3, 'cc@cc.com');
    select * from member1;
    insert into member1 values(4, 'dd@dd.com', null);

    drop table if exists member2;
    create table member2(
            id bigint not null,
            member_email varchar(20),
    member_password varchar(20)
);
    select * from member2;
    insert into member2(id, member_email, member_password) values(1, 'aa@aa.com', '1234');
-- id를 제외하고 나머지 값만 입력
    insert into member2(member_email, member_password) values('bb@bb.com', '1234');
    insert into member2(id, member_email, member_password) values(null, 'cc@cc.com', '1234');
    insert into member2(id, member_email, member_password) values(4, null, '1234');

    drop table if exists member3;
    create table member3(
            id bigint not null unique,
            member_email varchar(20) not null,
    member_password varchar(20) not null
            );
    select * from member3;
    insert into member3(id, member_email, member_password) values(1, 'aa@aa.com', '1234');
    insert into member3(id, member_email, member_password) values(1, 'bb@bb.com', '1234');
    insert into member3(id, member_email, member_password) values(2, 'bb@bb.com', not null);

    drop table if exists member4;
    create table member4(
            id bigint not null unique,
            member_email varchar(20) not null unique,
    member_password varchar(20) not null,
    created_at datetime
);
    select * from member4;
    insert into member4(id, member_email, member_password, created_at) values(1, 'aa@aa.com', '1234', now());
    insert into member4(id, member_email, member_password) values(2, 'bb@bb.com', '1234');

    drop table if exists member5;
    create table member5(
            id bigint not null unique,
            member_email varchar(20) not null unique,
    member_password varchar(20) not null,
    created_at datetime default now()
);
    select * from member5;
-- default로 지정한 컬럼은 따로 값을 주지 않아도 값이 default로 지정한 값으로 저장됨
    insert into member5(id, member_email, member_password, created_at) values(1, 'aa@aa.com', '1234', now());
    insert into member5(id, member_email, member_password) values(2, 'bb@bb.com', '1234');

-- primary key
    drop table if exists member6;
    create table member6(
            id bigint primary key,
            member_email varchar(20) not null unique,
    member_password varchar(20) not null,
    created_at datetime default now()
);
    select * from member6;
    insert into member6(id, member_email, member_password) values(1, 'aa@aa.com', '1234');
    insert into member6(id, member_email, member_password) values(2, 'bb@bb.com', '1234');


    drop table if exists member7;
    create table member7(
            id bigint,
            member_email varchar(20) not null unique,
    member_password varchar(20) not null,
    created_at datetime default now(),
    constraint pk_member7 primary key(id)
);
-- 자동 번호 적용하기 (auto_increment는 pk 컬럼에만 지정가능)
    drop table if exists member8;
    create table member8(
            id bigint auto_increment,
            member_email varchar(20) not null unique,
    member_password varchar(20) not null,
    created_at datetime default now(),
    -- id2 bigint auto_increment, -- 일반 컬럼에는 지정 불가
    constraint pk_member8 primary key(id)
);
    select * from member8;
-- auto_increment를 지정하면 값을 따로 주지 않아도 됨
    insert into member8(member_email, member_password) values('aa@aa.com', '1234');
    insert into member8(member_email, member_password) values('bb@bb.com', '1234');

    -- 1/4 오전 시작
-- 참조관계
drop table if exists parent1;
create table parent1(
	id bigint primary key,
    p1 varchar(10),
    p2 varchar(20)
);

drop table if exists child1;
create table child1(
	id bigint primary key,
    c1 varchar(10),
    c2 varchar(20),
    p_id bigint, -- 참조할 컬럼
    -- 외래키 지정(p_id 컬럼을 parent1 테이블의 id 컬럼을 참조하도록 함)
    constraint fk_child1 foreign key (p_id) references parent1(id)
);
select * from parent1;
insert into parent1(id, p1, p2) values(1, 'aa', 'bb');
insert into parent1(id, p1, p2) values(2, 'bb', 'bb');
insert into parent1(id, p1, p2) values(3, 'cc', 'cc');
insert into parent1(id, p1, p2) values(4, 'dd', 'dd');

select * from child1;
insert into child1(id, c1, c2, p_id) values(1, 'aaa', 'aaa', 1);
-- 부모 id 컬럼에 없는 값을 p_id에 저장
insert into child1(id, c1, c2, p_id) values(2, 'bbb', 'bbb', 2);
insert into child1(id, c1, c2, p_id) values(3, 'ccc', 'ccc', 3);

-- 부모테이블의 데이터 삭제
-- id=2인 데이터 한 줄을 삭제
-- 자식테이블에 id=2인 데이터를 참조하는 부분이 있기 때문에 삭제 불가
delete from parent1 where id = 2;
-- 자식테이블에 id=4인 데이터를 참조하는 부분이 없기 때문에 삭제 가능
delete from parent1 where id = 4;
-- 자식테이블의 부모 id=2를 참조하는 데이터 삭제
delete from child1 where id = 2;


drop table if exists parent2;
create table parent2(
	id bigint primary key,
    p1 varchar(10),
    p2 varchar(20)
);

drop table if exists child2;
create table child2(
	id bigint primary key,
    c1 varchar(10),
    c2 varchar(20),
    p_id bigint, -- 참조할 컬럼
    -- 외래키 지정(p_id 컬럼을 parent1 테이블의 id 컬럼을 참조하도록 함)
    -- 부모데이터 삭제시 자식데이터도 삭제
    constraint fk_child2 foreign key (p_id) references parent2(id) on delete cascade
);

select * from parent2;
insert into parent2(id, p1, p2) values(1, 'aa', 'bb');
insert into parent2(id, p1, p2) values(2, 'bb', 'bb');
insert into parent2(id, p1, p2) values(3, 'cc', 'cc');
insert into parent2(id, p1, p2) values(4, 'dd', 'dd');

select * from child2;
insert into child2(id, c1, c2, p_id) values(1, 'aaa', 'aaa', 1);
insert into child2(id, c1, c2, p_id) values(2, 'bbb', 'bbb', 2);
insert into child2(id, c1, c2, p_id) values(3, 'ccc', 'ccc', 3);
insert into child2(id, c1, c2, p_id) values(4, 'ddd', 'ddd', 5);

delete from parent2 where id = 3;


drop table if exists parent3;
create table parent3(
	id bigint primary key,
    p1 varchar(10),
    p2 varchar(20)
);

drop table if exists child3;
create table child3(
	id bigint primary key,
    c1 varchar(10),
    c2 varchar(20),
    p_id bigint, -- 참조할 컬럼
    -- 외래키 지정(p_id 컬럼을 parent1 테이블의 id 컬럼을 참조하도록 함)
    -- 부모데이터 삭제시 자식데이터는 유지되지만 참조 컬럼은 null이 됨
    constraint fk_child3 foreign key (p_id) references parent3(id) on delete set null
);

select * from parent3;
insert into parent3(id, p1, p2) values(1, 'aa', 'bb');
insert into parent3(id, p1, p2) values(2, 'bb', 'bb');
insert into parent3(id, p1, p2) values(3, 'cc', 'cc');
insert into parent3(id, p1, p2) values(4, 'dd', 'dd');
delete from parent3 where id = 1;

select * from child3;
insert into child3(id, c1, c2, p_id) values(1, 'aaa', 'aaa', 1);
insert into child3(id, c1, c2, p_id) values(2, 'bbb', 'bbb', 2);
insert into child3(id, c1, c2, p_id) values(3, 'ccc', 'ccc', 3);
insert into child3(id, c1, c2, p_id) values(4, 'ddd', 'ddd', 5);

-- 수정쿼리
update child3 set c1= '수정내용' where id=2;
update child3 set c1= '수정내용', c2 = 'ㅎㅎㅎ' where id=2;

drop table if exists book;
create table book(
	id bigint auto_increment,
    b_bookname varchar(20),
    b_publisher varchar(20),
    b_price int,
    constraint pk_book primary key(id)
);
insert into book(b_bookname, b_publisher, b_price) values('축구 역사', '좋은출판사', 7000);
insert into book(b_bookname, b_publisher, b_price) values('축구 리포트', '나무출판사', 13000);
insert into book(b_bookname, b_publisher, b_price) values('축구를 알려주마', '대한출판사', 22000);
insert into book(b_bookname, b_publisher, b_price) values('배구의 바이블', '대한출판사', 35000);
insert into book(b_bookname, b_publisher, b_price) values('피겨 교과서', '좋은출판사', 8000);
insert into book(b_bookname, b_publisher, b_price) values('피칭의 단계별기술', '좋은출판사', 6000);
insert into book(b_bookname, b_publisher, b_price) values('야구의 추억 이야기', '나이스미디어', 20000);
insert into book(b_bookname, b_publisher, b_price) values('야구 읽어주는 남자', '나이스미디어', 13000);
insert into book(b_bookname, b_publisher, b_price) values('올림픽 스토리', '이야기당', 7500);
insert into book(b_bookname, b_publisher, b_price) values('olympic history', 'strawberry', 13000);
select * from book;

drop table if exists customer;
create table customer(
	id bigint auto_increment,
    c_name varchar(10),
    c_address varchar(20),
    c_phone varchar(15),
    constraint pk_customer primary key (id)
);

insert into customer(c_name, c_address, c_phone) values('손흥민', '영국 런던', '000-5000-0001');
insert into customer(c_name, c_address, c_phone) values('김연아', '대한민국 서울', '000-6000-0001');
insert into customer(c_name, c_address, c_phone) values('김연경', '대한민국 서울', '000-7000-0001');
insert into customer(c_name, c_address, c_phone) values('류현진', '캐나다 토론토', '000-8000-0001');
insert into customer(c_name, c_address, c_phone) values('이강인', '프랑스 파리', '000-9000-0001');
select * from customer;

drop table if exists orders;
create table orders(
	id bigint auto_increment,
    customer_id bigint,
    book_id bigint,
    o_saleprice int,
    o_oderdate date,
    constraint fk_orders1 foreign key (book_id) references book(id),
    constraint fk_orders2 foreign key (customer_id) references customer(id),
    constraint pk_orders primary key (id)
);
insert into orders(customer_id, book_id, o_saleprice, o_oderdate) values(1, 1, 6000, str_to_date('01-07-2023','%d-%m-%Y'));
insert into orders(customer_id, book_id, o_saleprice, o_oderdate) values(1, 3, 21000, str_to_date('03-07-2023','%d-%m-%Y'));
insert into orders(customer_id, book_id, o_saleprice, o_oderdate) values(2, 5, 8000, str_to_date('03-07-2023','%d-%m-%Y'));
insert into orders(customer_id, book_id, o_saleprice, o_oderdate) values(3, 6, 6000, str_to_date('04-07-2023','%d-%m-%Y'));
insert into orders(customer_id, book_id, o_saleprice, o_oderdate) values(4, 7, 20000, str_to_date('05-07-2023','%d-%m-%Y'));
insert into orders(customer_id, book_id, o_saleprice, o_oderdate) values(1, 2, 12000, str_to_date('07-07-2023','%d-%m-%Y'));
insert into orders(customer_id, book_id, o_saleprice, o_oderdate) values(4, 8, 13000, str_to_date('07-07-2023','%d-%m-%Y'));
insert into orders(customer_id, book_id, o_saleprice, o_oderdate) values(3, 10, 12000, str_to_date('08-07-2023','%d-%m-%Y'));
insert into orders(customer_id, book_id, o_saleprice, o_oderdate) values(2, 10, 7000, str_to_date('09-07-2023','%d-%m-%Y'));
insert into orders(customer_id, book_id, o_saleprice, o_oderdate) values(3, 8, 13000, str_to_date('10-07-2023','%d-%m-%Y'));
select * from orders;

-- 1/4 오후 시작
-- 1. 모든 도서의 가격과 도서명 조회
select
	b_bookname,
	b_price
	from book;
-- 2. 모든 출판사 이름 조회
select
	b_publisher
	from book;
-- 2.1 중복값을 제외한 출판사 이름 조회
select
	distinct b_publisher
	from book;
-- 3. BOOK테이블의 모든 내용 조회
select
	*
	from book;
-- 4. 20000원 미만의 도서만 조회
select
	*
	from book
		where b_price < 20000;
-- 5. 10000원 이상 20000원 이하인 도서만 조회
select
	*
	from book
		where b_price >= 10000
			and b_price <=20000;
-- 6. 출판사가 좋은출판사 또는 대한출판사인 도서 조회
select
	*
	from book
		where b_publisher = '좋은출판사'
			or  b_publisher = '대한출판사';

select
	*
	from book
		where b_publisher
			in('좋은출판사','대한출판사');
-- 7. 도서명에 축구가 포함된 모든 도서를 조회
select
	*
	from book
		where b_bookname
			like '%축구%';
-- 8. 도서명의 두번째 글자가 구인 도서 조회
select
	b_bookname
	from book
		where b_bookname
			like '_구%';
-- 9. 축구 관련 도서 중 가격이 20000원 이상인 도서 조회
select
	b_bookname
	from book
		where b_bookname
			like '%축구%'
            and b_price >=20000;
-- 10. 책 이름순으로 전체 도서 조회
select
	*
	from book
		order by b_bookname asc;
-- 11. 도서를 가격이 낮은 것 부터 조회하고 같은 가격일 경우 도서명을 가나다 순으로 조회
select
	*
	from book
		order by b_price asc,
				 b_bookname asc;
-- 12. 주문 도서의 총 판매액 조회
select
	sum(o_saleprice)
    from orders;
-- 13. 1번 고객이 주문한 도서 총 판매액 조회
select
	sum(o_saleprice)
    from orders
    where customer_id = 1;
-- 14. ORDERS 테이블로 부터 평균판매가, 최고판매가, 최저판매가 조회
select
	avg(o_saleprice),
    max(o_saleprice),
    min(o_saleprice)
    from orders;
-- 15. 고객별로 주문한 도서의 총 수량과 총 판매액 조회 (GROUP BY 활용)
select
	customer_id,
	count(*),
	sum(o_saleprice)
    from orders
    group by customer_id;
-- 16. 가격이 8,000원 이상인 도서(where)를 구매한 고객에 대해 고객별(group by) 주문 도서의 총 수량 조회 (GROUP BY 활용)
--    (단, 8,000원 이상 도서 두 권 이상 구매(having)한 고객만)
select
	customer_id,
	count(*)
    from orders
    where o_saleprice >= 8000
    group by customer_id
    having count(*) >=2;
-- 17. 김연아고객(고객번호 : 2) 총 구매액
select
	sum(o_saleprice)
    from orders
    where customer_id = 2;
-- 18. 김연아고객(고객번호 : 2)이 구매한 도서의 수
select
	count(*)
	from orders
    where customer_id = 2;
-- 19. 서점에 있는 도서의 총 권수
select
	count(b_bookname)
    from book;
-- 20. 출판사의 총 수
select
	 count(distinct b_publisher)
    from book;
-- 21. 7월 4일 ~ 7일 사이에 주문한 도서의 주문번호 조회
select
	*
    from orders
    where o_oderdate >= str_to_date('04-07-2023','%d-%m-%Y')
		and o_oderdate <= str_to_date('07-07-2023','%d-%m-%Y') ;
select
	*
    from orders
    where o_oderdate
		between str_to_date('04-07-2023','%d-%m-%Y')
		and str_to_date('07-07-2023','%d-%m-%Y') ;
-- 22. 7월 4일 ~ 7일 사이에 주문하지 않은 도서의 주문번호 조회
select
	*
    from orders
    where o_oderdate
		not between '04-07-2023'
        and '07-07-2023';
select
	*
    from customer c,
		 orders o
			where c.id = o.customer_id
            order by c.id;
-- 24. 고객이름(CUSTOMER), 고객이 주문한 도서 가격(ORDERS) 조회
select
	c.c_name,
	o.o_saleprice
    from customer c,
		 orders o
         where c.id=o.customer_id;
-- 25. 고객별(GROUP)로 주문한 도서의 총 판매액(SUM)과 고객이름을 조회하고 조회 결과를 가나다 순으로 정렬
select
	c.c_name,
	sum(o.o_saleprice)
    from customer c,
		 orders o
         where c.id=o.customer_id
         group by c.c_name
         order by c.c_name;
-- 26. 고객명과 고객이 주문한 도서명을 조회(3테이블 조인)
select
	c.c_name,
    b.b_bookname
    from book b,
		 customer c,
         orders o
         where c.id = o.o_customer_id
			and b.id = o.book_id;
-- 27. 2만원(SALEPRICE) 이상 도서를 주문한 고객의 이름과 도서명을 조회
select
	c.c_name,
    b.b_bookname
    from book b,
		 customer c,
         orders o
         where c.id = o.o_customer_id
			and b.id = o.book_id
            and o.o_saleprice >= 20000;
-- 28. 손흥민 고객의 총 구매액과 고객명을 함께 조회
select
	c.c_name,
	sum(o.o_saleprice)
    from customer c,
		 orders o
         where c.id = o.customer_id
         and c.c_name = '손흥민';
-- 29. 손흥민 고객의 총 구매수량과 고객명을 함께 조회
select
	c.c_name,
    count(*)
    from customer c,
		 orders o
         where c.id = o.customer_id
         and c.c_name = '손흥민';

-- 1/5 오전 시작
-- 30. 가장 비싼 도서의 이름을 조회
select
	b_bookname
	from book
    where b_price = (select max(b_price) from book);

-- 31. 책을 구매한 이력이 있는 고객의 이름을 조회
select
	*
    from orders;

select
	c_name
    from customer
		where id in(1,2,3,4);

select customer_id from orders;

select
	c_name
    from customer
		where id
			in(select customer_id from orders);
-- 32. 도서의 가격(PRICE)과 판매가격(SALEPRICE)의 차이가 가장 많이 나는 주문 조회
select * from book;
select * from orders;
-- book, orders 조인해서 정가와 판매가 차이
select b.b_price-o.o_saleprice from book b, orders o where b.id = o.bookid;
select max(b.b_price-o.o_saleprice) from book b, orders o where b.id = o.bookid;
select * from book b, orders o where b.id = o.bookid and b.b_price-o.o_saleprice=6000;
select * from book b, orders o where b.id = o.bookid and b.b_price-o.o_saleprice= (select max(b.b_price-o.o_saleprice) from book b, orders o where b.id = o.bookid);
-- 33. 고객별 평균 구매 금액이 도서의 판매 평균 금액 보다 높은 고객의 이름 조회
-- 도서 판매 평균 금액
select avg(o_saleprice) from orders;
-- 고객별 평균 구맥 금액{group by)
select c.c_name, avg(o.o_saleprice) from orders o , customer c where c.id=o.customer_id group by c.c_name;
select c.c_name, avg(o.o_saleprice) from orders o , customer c where c.id=o.customer_id group by c.c_name having avg(o.o_saleprice) > (select c.c_name, avg(o.o_saleprice) from orders);

-- 34. 고객번호가 5인 고객의 주소를 대한민국 인천으로 변경

update
	customer
    set c_address = '대한민국 인천'
    where id = 5;

-- 35. 김씨 성을 가진 고객이 주문한 총 판매액 조회
select id from customer where c_name like '김%';
select sum(o_saleprice) from orders where customer_id=2 or customer_id=3;
select sum(o_saleprice) from orders where customer_id in(2,3);
select sum(o_saleprice) from orders where customer_id in(select id from customer where c_name like '김%');

-- alter: 테이블의 구조를 변경할 때 (컬럼이름 변경, 타입 변경, 제약조건 추가 등)
create table student(
	id bigint,
    s_name varchar(20),
    s_mobile int
);
-- 테이블의 구조 확인
desc student;
desc book;
-- 기존 컬럼에 제약조건 추가
alter table student add constraint primary key(id);
-- 기존 컬럼에 타입 변경
alter table student modify s_mobile varchar(30);
-- 컬럼 추가
alter table student add s_major varchar(30);
-- 컬럼 이름 변경
alter table student change s_mobile s_phone varchar(30);
-- 컬럼 삭제
alter table student drop s_major;
-- 1/5 오전 수업 끝

-- 1/5 오후 수업 시작
drop table if exists member_table;
create table member_table(
	id bigint auto_increment,
    member_email varchar(30) not null,
    member_name varchar(20) not null,
    member_password varchar(20) not null,
    constraint pk_member_id primary key(id)
);
desc member_table;

drop table if exists board_table;
create table board_table(
	id bigint auto_increment,
    board_title varchar(50) not null,
    board_writer varchar(30) not null,
    board_contents varchar(500),
    board_hits int default 0,
    board_created_at datetime default now(),
    board_ipdate_at datetime on update now(),
    board_file_attached int default 0,
    member_id bigint,
    category_id bigint,
    constraint pk_board_id primary key (id),
    constraint fk_board_member_id foreign key (member_id) references member_table(id) on delete cascade,
    constraint fk_board_category_id foreign key (category_id) references category_table(id) on delete set null
);
desc board_table;

drop table if exists comment_table;
create table comment_table(
	id bigint auto_increment,
    comment_writer varchar(30) not null,
    comment_contents varchar(200) not null,
    comment_created_at datetime default now(),
    board_id bigint,
    member_id bigint,
    constraint pk_comment_id primary key (id),
    constraint fk_comment_member_id foreign key (member_id) references member_table(id) on delete cascade,
    constraint fk_comment_board_id foreign key (board_id) references board_table(id) on delete cascade
);
desc comment_table;

drop table if exists board_file_table;
create table board_file_table(
	id bigint auto_increment,
    original_file_name varchar(100),
    stored_file_name varchar(100),
    board_id bigint,
    constraint pk_board_file_table primary key (id),
    constraint fk_board_file_board_id foreign key (board_id) references board_table(id) on delete cascade
);
desc board_file_table;

drop table if exists good_table;
create table good_table(
	id bigint auto_increment,
    comment_id bigint,
    member_id bigint,
    constraint pk_good_table_id primary key (id),
    constraint fk_good_table_comment_id foreign key (comment_id) references comment_table(id) on delete cascade,
    constraint fk_good_table_member_id foreign key (member_id) references member_table(id) on delete cascade
);
desc good_table;

drop table if exists category_table;
create table category_table(
	id bigint auto_increment,
    category_name varchar(20) not null,
    constraint pk_category_table_id primary key (id)
);
desc category_table;

-- 회원 기능
-- 1. 회원가입(임의의 회원3명 가입)
insert into member_table (member_email, member_name, member_password) values('aa@member.com', 'aaa', '1234');
insert into member_table (member_email, member_name, member_password) values('bb@member.com', 'bbb', '1234');
insert into member_table (member_email, member_name, member_password) values('cc@member.com', 'ccc', '1234');
-- 2. 이메일 중복체크
select member_email from member_table where member_email = '?';
-- 3. 로그인
select * from member_table where member_email = '?' and member_password = '?' ;
-- 4. 전체 회원 목록 조회
select * from member_table;
-- 5. 특정 회원만 조회
select * from member_table where member_email = '?';
select * from member_table where id = '?';
-- 6. 내정보 수정하기(6.1, 6.2에 해당하는 쿼리문작성)
-- 6.1 회원정보 수정화면 요청(회원정보 수정 페이지를 보여준다고 가정했을 때 필요한 쿼리)
select * from member_table where id = '?';
-- 6.2 회원정보 수정 처리(비밀번호를 변경한다는 상황)
update member_table set member_password = '?' where id=?;
-- 7. 회원 삭제 또는 탈퇴
delete from member_table where member_email = '?' and member_password = '?';
delete from member_table where id=?;

-- 1/8 오전 수업 시작
-- 게시글 카테고리
-- 게시판 카테고리는 자유게시판, 공지사항, 가입인사 세가지가 있음.
-- 카테고리 세가지 미리 저장
insert into category_table (category_name) values('자유게시판');
insert into category_table (category_name) values('공지사항');
insert into category_table (category_name) values('가입인사');
select * from category_table;
-- 게시판 기능
-- 1. 게시글 작성(파일첨부 x) 3개 이상
insert into board_table (board_title, board_writer, board_contents) values('aa', 'aa', 'aa');
insert into board_table (board_title, board_writer, board_contents) values('aaa', 'aa', 'aaa');
insert into board_table (board_title, board_writer, board_contents) values('aaaa', 'aa', 'aaaa');
-- 1. 게시글 작성(파일첨부 x) 3개 이상  선생님버전
insert into board_table (board_title, board_writer, board_contents, member_id, category_id)
				values('안녕하세요', 'aa@member.com', '야야야', 1, 1);
-- 1번 회원이 자유게시판 글 2개, 공지사항 글 1개 작성
insert into board_table (category_id, board_title, board_writer, board_contents) values(1, 'ss', 'aa', 'sss');
insert into board_table (category_id, board_title, board_writer, board_contents) values(1, 'dd', 'aaa', 'ddd');
insert into board_table (category_id, board_title, board_writer, board_contents) values(2, 'cc', 'aaa', 'cccc');
-- 2번 회원이 자유게시판 글 3개 작성
insert into board_table (category_id, board_title, board_writer, board_contents) values(1, 'a', 'bb', 'a');
insert into board_table (category_id, board_title, board_writer, board_contents) values(1, 's', 'bb', 's');
insert into board_table (category_id, board_title, board_writer, board_contents) values(1, 'd', 'bb', 'd');
-- 3번 회원이 가입인사 글 1개 작성
insert into board_table (category_id, board_title, board_writer, board_contents) values(3, 'v', 'ccc', 'v');
select * from board_table;

-- 1.1. 게시글 작성(파일첨부 o)
insert into board_table (board_title, board_writer, board_contents, board_file_attached)
					values('hh', 'tt', 'gg', 11);
-- 첨부된 파일정보를 board_file_table에 저장
-- 사용자가 첨부한 파일 이름: 한라산.jpg
insert into board_file_table(original_file_name, stored_file_name, board_id)
						values('한라산.jpg', '2234594384394_한라산',  12); -- 여기서 12는 게시글 번호(id)
-- 2번 회원이 파일있는 자유게시판 글 2개 작성
insert into board_table (category_id, board_title, board_writer, board_contents, board_file_attached)
					values(1, '?', 'bbb', '?', 22);
-- 2. 게시글 목록 조회
-- 2.1 전체글 목록 조회
select * from board_table;
select id, board_title, board_writer, board_hits, board_created_at from board_table;
-- 2.2 자유게시판 목록 조회
select * from board_table bt, category_table ct where bt.category_id = ct.id and ct.category_name = '자유게시판';
select * from board_table where category_id = 1;
-- 2.3 공지사항 목록 조회
select * from board_table bt, category_table ct where bt.category_id = ct.id and ct.category_name = '공지사항';
select * from board_table where category_id = 2;
-- 2.4 목록 조회시 카테고리 이름도 함께 나오게 조회
select * from board_table bt, category_table ct where bt.category_id = ct.id;
-- 3. 2번 게시글 조회 (조회수 처리 필요함)
update board_table set board_hits = board_hits +1 where id=2;
select * from board_table where id = 2;
-- 3.1. 파일 첨부된 게시글 조회 (게시글 내용과 파일을 함께)
update board_table set board_hits = board_hits +1 where id=12;
-- 게시글 내용만 가져옴
select * from board_table where id= 12;
-- 해당 게시글에 첨부된 파일 정보 가져옴
select * from board_file_table where board_id =12;
-- join
select * from board_table b, board_file_table bf where b.id = bf.board_id and b.id =12;
-- 4. 1번 회원이 자유게시판에 첫번째로 작성한 게시글의 제목, 내용 수정
select * from board_table where id= 1;
update board_table set board_title = 'mm', board_contents = '123' where id = 1;
select * from board_table;
-- 5. 2번 회원이 자유게시판에 첫번째로 작성한 게시글 삭제
delete from board_table where id= 9;
-- 7. 페이징 처리(한 페이지당 글 3개씩)
select * from board_table order by id desc;
select * from board_table order by id desc limit 0, 3; -- 17 16 15  -- 1페이지
select * from board_table order by id desc limit 3, 3; -- 14 13 12	-- 2페이지
select * from board_table order by id desc limit 6, 3; -- 7 6 4		-- 3페이지
-- 한 페이지당 글 5개씩
select * from board_table order by id desc limit 0, 5;  -- 1페이지
select * from board_table order by id desc limit 5, 5;  -- 2페이지
select * from board_table order by id desc limit 10, 5; -- 3페이지
-- 한페이지당 3개씩 출력하는 경우 전체 글 수가 20개라면 필요한 페이지 갯수는? 7개

-- 7.1. 첫번째 페이지
-- 7.2. 두번째 페이지
-- 7.3. 세번째 페이지
-- 8. 검색(글제목 기준)
-- 8.1 검색결과를 오래된 순으로 조회
select * from board_table order by  board_created_at desc;
-- 8.2 검색결과를 조회수 내림차순으로 조회
select * from board_table order by board_hits asc;
-- 8. 검색(글제목 기준)
select * from board_table where board_title like '%오늘%';
-- 8.1 검색결과를 오래된 순으로 조회
select * from board_table where board_title like '%오늘%' order by id asc;
-- 8.2 검색결과를 조회수 내림차순으로 조회
select * from board_table where board_title like '%오늘%' order by board_hits desc;
-- 8.3 검색결과 페이징 처리
select * from board_table where board_title like '%오늘%' order by board_hits desc limit 0, 3;

-- 1/8 오전수업 끝

*/
}
