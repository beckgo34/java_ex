package ex06_for;

public class Ex02_ForEx {
    public static void main(String[] args) {
        //1 ~ 10 까지 순서대로 출력

        // 2 4 6 8 10 출력

        // 5 4 3 2 1 출력

        for(int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        for(int i = 1; i <= 10; i++){
            if(i %2 ==0) {
                System.out.println(i);
            }

            }
        for(int i = 2; i<=10; i+=2){
            System.out.println(i);
        }
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
    }
}
