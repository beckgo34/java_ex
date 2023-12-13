package memo;

public class Array {
    /**
     * 배열(Array)
     *  * 동일한 타입의 데이터를 여러 개 사용하는 경우에 활용
     *  * 배열의 크기를 가지고 있으며, 해당 크기만큼의 데이터를 가지고 있음.
     *      -정수형 배열의 크기가 5라면 5개의 서로 다른 정수를 가지고 있는 공간이 존재
     *  * 각각의 데이터에 접근하려면 index(인덱스)를 사용하여 접근
     *      1. 배열 선언 및 활용
     *          a. 배열의 타입, 이름, 크기를 지정한 후 값은 이후에 저장
     *
     *              // 정수 값을 담는 크기가 3인 numbers1 이라는 이름의 배열 선언
     *              int[] numbers1 = new int[3];
     *              //numbers1에 값을 담기
     *              numbers1[0] = 10;
     *              numbers2[1] = 20;
     *              numbers3[2] = 30;
     *              //2번 인덱스에 들어있는 값을 출력
     *              System.out.println(number1[2]); //30
     *
     *              //String을 담는 크기가 5인 strings1 이라는 으름의 배열 선언
     *              Stirng[] strings1 = new String[5];
     *              Strings1[0] = "안녕";
     *
     *          b. 배열을 선언하면서 값도 같이
     *
     *              int[] numbers2 = {1, 2, 3, 4};
     *              numbers2[3] = 10;
     *              String strings2 = {"aa", "bb", "cc", "dd", "ee"};
     *
     *          c. 배열의 타입, 이름만 미리 선언하고 나중에 배열객체로 만드는 방법
     *
     *              int[] numbers3 = null;
     *              // 여기서는 numbers3는 배열이 아닌상태
     *              numbers3 = new int[10];
     *              // 여기서부터 진짜 배열로 활용가능
     *
     *              int[] numbers4 = null;
     *              int size = 100;
     *              // 배열의 크기 지정하는 부분에 정수형 변수도 사용 가능
     *              numbers4 = new int[size];
     */
   
}
