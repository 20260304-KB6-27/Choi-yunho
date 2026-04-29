package lecture.lambda.section02;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.function.*;

public class Application {
    public static void main(String[] args) {

        /*
         * Runnable : 매개변수 X, 리턴값 X : run()
         * Consumer : 매개변수 O, 리턴값 X : accept()
         * Supplier : 매개변수 X, 리턴값 O : get()
         * Function : 매개변수 O, 리턴값 O : apply()
         * Operator : 매개변수 O, 리턴값 O : apply()    ** 매개변수와 Return 값이 동일
         * Predicate : 매개변수 O, 리턴값 O : test()    ** Boolean 값 리턴
         * */

        BinaryOperator<Integer> binaryOperator = (a, b) -> a + b;

        System.out.println(binaryOperator.apply(1, 5));

        // Runnable
        Runnable runnable = () -> System.out.println("runnable 실행");
        runnable.run();

        // Consumer
        Consumer<String> consumer = System.out::println;
        consumer.accept("안녕 Consumer");

        // Supplier
        Supplier<LocalDateTime> supplier = LocalDateTime::now;
        System.out.println(supplier.get());

        // Function <매개변수타입, 리턴타입>
        Function<String, Integer> function = Integer::parseInt;
        String str1 = "12345";
        System.out.println(function.apply(str1));

        // Predicate
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(5));

        // 스트림
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> evenNum = numbers.stream()
                .filter(isEven)
                .toList();

        // 정수 리스트에서 짝수만 추출
        System.out.println(evenNum);
    }
}
