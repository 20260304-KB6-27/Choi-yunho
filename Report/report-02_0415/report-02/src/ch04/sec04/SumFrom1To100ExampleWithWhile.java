package ch04.sec04;

public class SumFrom1To100ExampleWithWhile {
    public static void main(String[] args) {
        int num = 1;
        int result = 0;

        while (num < 101) {
            result += num;
            num++;
        }

        System.out.println("1~100 합 : " + result);
    }
}
