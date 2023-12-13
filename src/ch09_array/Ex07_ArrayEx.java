package ch09_array;

public class Ex07_ArrayEx {

    public static void main(String[] args) {
        /**
         * 배열 오름차순 정렬
         */
        int[] num = {3, 2, 1, 5, 4};
        int sort = 0;

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    sort = num[i];
                    num[i] = num[j];
                    num[j] = sort;
                }
            }
            System.out.print(num[i] + " , ");
        }
    }
}


