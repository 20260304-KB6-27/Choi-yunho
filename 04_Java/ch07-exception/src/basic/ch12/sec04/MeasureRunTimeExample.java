package basic.ch12.sec04;

public class MeasureRunTimeExample {
    public static void main(String[] args) {
        long startTime = System.nanoTime();

        long sum = 0;
        for (int i = 0; i <= 1000000; i++) {
            sum += i;
        }

        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println(sum);
        System.out.println(duration + "ns");
    }
}
