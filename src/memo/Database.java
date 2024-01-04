package memo;

public class Database {
    /**
     * 02.Database
     *  1. 데이터베이스 배경지식
     *      a. DBMS(DataBase Management System)
     *          1. 종류: oracle, mysql, mariaDB, firebase, mongoDB...
     *      b. 목적
     *          1. CRUD
     *              C(Create):데이터 저장
     *              R(Read):데이터 조회
     *              U(Update):데이터 수정
     *              D(Delete):데이터 삭제
     *      c. SQL(Stuctured Query language)
     *          1.DBMS를 사용하는 문법
     *          2.구조화된 질의어
     *          3.사람->DBMS에게 sql문법으로 질문하고 그에 대한 결과를 받음
     *      d.SQL 문법 분류
     *          1.DDL(Data Definition Language, 데이터 정의어)
     *              1. 데이터베이스, 사용자, 테이블, 뷰 등을 생성, 수정, 삭제할 때 사용하는 문법
     *              2. create, alter, drop
     *          2.DML(Data manipulation Language, 데이터 조작어)
     *              1. 테이블에 데이터를 CRUD 할 때 사용하는 문법
     *              2. insert(C), select(R), update(U), delete(D)
     *          3.DCL(Data Control language, 데이터 제어어)
     *              1. 사용자 권한관리, 트랙잭션관리에 사용하는 문법
     *              2. grant, revoke, commit, rollback
     *       e. 테이블(table)
     *              1. 데이터가 저정되는 공간
     *              2. 저장될 데이터를 컬럼(column, 열)으로 구분하여 저장
     *              3. 학생정보를 저장해야 하는 테이블이라면
     *                  1. 관리번호(id), 학번(studentNumber), 이름<studentName), 전화번호(studentMobile), 학과(studentMajor) 등의 정보
     *                     id                studentNumber       studentName           studentMobile        studentMajor
     *
     *
     *  2. 계정
     *  a. 데이터베이스는 계정이 있고, 계정에 따라 사용할 수 있는 권한을 분리시킴
     *  b. 모든 권한을 가진 계정은 관리자(root)
     *  c. 관리자는 계정을 생성하고 삭제하는 등 모든 권한을 가짐
     *  d. 계정생성
     *         create user [계정이름] identified by [비밀번호];
     *         grant [권한종료] privileges on [db이름] to [계정이름];
     *
     *      2. database(table space)
     *          a. 데이터가 저장되는 공간인 테이블(table)이 모여있는 공간
     *          b. mysql은 반드시 데이터베이스를 연갈한 뒤 그 데이터 베이스 안에서 테이블을 만들고 데이터를 저장해야함
     *          c. database 생성
     *              create database [db이름];
     *
     *          d. 계정으로 접속 후 database 사용
     *              use [db이름];
     *      4. 테이블 정의 문법
     *          a. 테이블 생성
     *                  create table [테이블이름](
     *                      [컬럼명1] 타입,
     *                      [컬럼명2] 타입,
     *                      [컬럼명3] 타입,
     *                  );
     *           b. 타입
     *              1. int: 정수(자바의 int와 매칭)
     *              2. bigint: 정수(자바의 long과 매칭)
     *              3. varchar: 문자열 (자바의 String과 매칭)
     *                  1. varchar는 정의할 때 크기도 함께 지정함.
     *                  2. 5글자가 들어가는 컬럼이라면: varchar(5)
     *              4. date: 날짜형
     *      5. 제약조건(Constraints)
     *          a. 테이블에 데이터를 저장할 때의 규칙을 지정하는것
     *          b. 종류
     *              1. primary key(pk, 기본키, 주키)
     *                  1. 보통 테이블당 하나의 pk를 가짐.
     *                  2. 반드시 값이 입력되어야 하고,같은 값을 입력할 수 없음.
     *              2. foreign key(fk, 보조키, 외래키)
     *                  1. 참조관계를 지정할 때 사용 (부모테이불, 자식테이블)
     *                  2. 자식테이블은 부모테이블의 pk 컬럼을 참조하는 컬럼을 가짐.
     *                  3. 부모 pk 컬럼에 없는 값이 자식 컬럼에 저장되지 않도록 함.
     *                  4. 특징
     *                      a. 부모테이블이 먼저 만들어져야 자식테이블도 만들 수 있음(부모 없는 자식 없다)
     *                      b. cascade 속석을 따로 지정하지 않으면 부모테이블만 삭제 불가
     *              3. not null
     *                  1. 해당 컬럼에 값을 꼭 입력해야 함
     *              4. unique
     *                  1. 해당 컬럼에 같은 값을 입력하려고 하면 저장되지 않음.
     *              5. default
     *                  1. 기본으로 입력되는 값을 지정할 수 있음
     *
     *           c. 문법
     *              create table [테이블이름](
     *                  [컬럼이름1] [타입] 제약조건 종류(fk 제외한 나머지 종류가 올 수 있음),
     *                  [컬럼이름2] [타입] primary key,
     *                  [컬럼이름3] [타입] unique,
     *                  [컬럼이름4] [타입] not null,
     *                  [컬럼이름5] [타입] unique not null, -- 2개를 동시에 주는 것도 가능
     *                  -- kf
     *                  constraint [제약조건이름(마음대로 지정)] foreing key (fk로 지정할 컬럼이름)
     *                              references [부모테이블이름](참조할컬럼이름)
     *              );
     *
     *      3. 연습
     *          a. 계정이름:user_user_2
     *          b. db이름:db_ex
     *          c. 위 정보로 계정을 만들고 db에 대한 접근권한을 주고 mysql에서 해당계정을 접속해보기
     *
     */
}
