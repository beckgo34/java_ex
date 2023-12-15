package ch11_classes.ex01;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository {
    // 모든 학생정보를 관리하는 저장소 역할의 리스트
    // 저장, 수정, 삭제 등의 처리는 Repository에서만 이루어지도록 하기 위해 private
    // 값을 계속 유지하기 위해 static
    private static List<StudentDTO> studentDTOList = new ArrayList<>();
    public void method1(){
        System.out.println("StudentRepository.method1");
    }
    public void method2(String str1){
        System.out.println("str1 = " + str1);
    }

    public boolean method3(StudentDTO studentDTO){
//        if (studentDTO.getId() == null){
//            System.out.println("일났음");
//        }
        System.out.println("studentDTO = " + studentDTO);
//        boolean result = studentDTOList.add(studentDTO);
//        return result;
        return studentDTOList.add(studentDTO);

    }
}
