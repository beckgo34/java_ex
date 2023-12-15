package ch11_classes.ex01;

import java.util.List;

public class StudentService {
    StudentRepository studentRepository = new StudentRepository();

    public void method1() {
        System.out.println("StudentService.method1");
        //Repository의 method1을 호출
        studentRepository.method1();
    }

    public void method2() {
        System.out.println("StudentService.method2");
        String str1 = "집에 가고 싶다";
        studentRepository.method2(str1);
    }

    /**
     * StudentDTO 객체를 생성하고
     * Repository의 method3로 DTO객체를 전달함.
     */
    public void method3() {
        System.out.println("StudentService.method3");
        StudentDTO studentDTO = new StudentDTO("학생1","20231111","경영학","010-1111-1111");
        studentRepository.method3(studentDTO);
//        boolean result = studentRepository.method3(studentDTO);
//        System.out.println("result = " + result);
//        if(result == true){
//            System.out.println("학생등록 성공");
//        }else {
//            System.out.println("학생등록 실패");
//        }



    }

    /**
     * Repository로 부터 List를 리턴 받아 for문으로 출력
     */
    public void method4(){
        List<StudentDTO> studentDTOList = studentRepository.method4();
        for (StudentDTO studentDTO : studentDTOList){
            System.out.println("studentDTO = " + studentDTO);
        }
    }

}
