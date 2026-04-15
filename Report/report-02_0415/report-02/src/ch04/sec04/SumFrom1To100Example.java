package ch04.sec04;

public class SumFrom1To100Example {
    public static void main(String[] args) {
        int result = 0;

        for (int i = 1; i < 101; i++) {
            result += i;
        }

        System.out.println("1~100 합 : " + result);
    }
}
