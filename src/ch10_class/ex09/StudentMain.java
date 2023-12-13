package ch10_class.ex09;

import java.util.Arrays;

public class StudentMain {
    public static void main(String[] args) {
        // 기본생성자로 Student 클래스의 객체를 만들고 setter를 이용하며 필드값 채우기

        // 모든 필드를 매개변수로 하는 생성자로 Student 클래스 객체 만들기

        // 각각의 객체에서 print 메서드 호출하여 필드값 출력
        Student student = new Student();
        student.setStudentName("이름1");
        student.setStudentNumber("202311111");
        student.setStudentMajor("컴퓨터공학과");
        student.setStudentMobile("010-1234-5678");

        student.print();

        System.out.println();
        Student student1 = new Student("이름2","20232222","경영학","010-9876-5432");

        student1.print();

        System.out.println("student = " + student);
        System.out.println("student1 = " + student1);
    }
}
