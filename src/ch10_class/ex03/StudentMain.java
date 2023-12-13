package ch10_class.ex03;

public class StudentMain {

    public static void main(String[] args) {
      // 기본생성자로 객체 선언
        Student student1 = new Student();

        // 매개변수가 있는 생성자로 객체 선언
        Student student2 = new Student("이름1");

        // 매개변수가 2개 있는 생성자로 객체 선언
        Student student3 = new Student("이름1","컴퓨터공학과");

        //매개변수가 3개 있는 생성자로 객체 선언
        Student student4 = new Student("이름2","경영학","010-1234-5678");
    }
}
