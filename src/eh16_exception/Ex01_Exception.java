package eh16_exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Ex01_Exception {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("안녕");
        stringList.add("오늘은 수요일");
        try {
            System.out.println(10 / 0);
            for (int i = 0; i < stringList.size(); i++) {
                System.out.println("stringList = " + stringList.get(i));
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("인덱스 예외 발생");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다");
        }catch (Exception e){

        }
        System.out.println("프로그램 끝");
    }
}

