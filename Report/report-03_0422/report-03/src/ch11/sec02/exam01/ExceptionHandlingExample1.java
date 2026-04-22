package ch11.sec02.exam01;

public class ExceptionHandlingExample1 {
    public static void printLength(String data) {
        try {
            int result = data.length();
            System.out.println("문자 수 " + result);
        } catch (NullPointerException e) {
            System.out.println("[ 예외 발생 ] 메세지 : " + e.getMessage());

            System.out.println("--- 스택 추적  ---\n");
            e.printStackTrace();
            System.out.println("--- 스택 추적 종료 ---\n");
        }
    }

    public static void main(String[] args) {
        System.out.println("[ 프로그램 시작 ]\n");
        printLength("ThisIsJava");
        printLength(null);
        System.out.println("\n[ 프로그램 종료 ]");
    }
}

/* 해당 초기 코드의 문제점
* - printLength에 null 값이 들어오게 될 때의 대비가 없음
* -> null이 입력되면 JVM에서는 자동으로 exception 발생
* -> 마지막 [ 프로그램 종료 ] 부분은 출력하지 못하게 됨
* */