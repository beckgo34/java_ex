package ex06_for;

public class Ex08_ForEx {
    public static void main(String[] args) {

        for(int i = 2; i <= 9; i++){
            System.out.println(i + "단");
            for(int j = 1; j <=9; j++){

                System.out.print(i + "*" + j + "=" + i*j);
                System.out.print("\t");
            }
            System.out.println("\n");
        }
    }
}
