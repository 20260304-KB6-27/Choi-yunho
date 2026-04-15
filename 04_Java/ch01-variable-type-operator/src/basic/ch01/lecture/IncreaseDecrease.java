package basic.ch01.lecture;

public class IncreaseDecrease {
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        // 증감 연산자 예제
        // x = x + 1
//        x++;    // 후위 증가: x = 11
//        ++x;    // 전위 증가: x = 12
        System.out.println("x=" + x++);    // 10 출력
        System.out.println("x=" + x);      // 11 출력

        // -128 ~ 127
        byte bnum = 127;

        // overflow
        // 자료형별 값의 최대 범위를 벗어나는 경우
        // sign bit를 반전시켜 최소값으로 순환시킴
        System.out.println("bnum = " + bnum++);
        System.out.println("bnum = " + bnum);

//        y--;    // 후위 감소: y = 9
//        --y;    // 전위 감소: y = 8
//        System.out.println("y=" + y);    // 8 출력
//
//        // 증감 연산자의 전위/후위 차이
//        z = x++;    // 후위: 대입 후 증가
//        System.out.println("z=" + z);    // 12 출력
//        System.out.println("x=" + x);    // 13 출력
//
//        z = ++x;    // 전위: 증가 후 대입
//        System.out.println("z=" + z);    // 14 출력
//        System.out.println("x=" + x);    // 14 출력
    }
}

