package memo;

public class Database {
    /**
     * 02.Database
     *
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
     *
     *
     */
}
