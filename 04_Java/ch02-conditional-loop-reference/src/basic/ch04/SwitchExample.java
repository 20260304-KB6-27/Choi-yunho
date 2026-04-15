package basic.ch04;

public class SwitchExample {
    public static void main(String[] args) {

        // Switch문
        // 특정 case 별로 코드를 분기하고 싶을 때 사용

        char grade = 'A';
        // char     ->  ' '
        // String   ->  " "

//        switch (grade) {
//            case 'A':
//            case 'a':
//                System.out.println("Your Grade : A");
//                break;
//            case 'B':
//                System.out.println("Your Grade : B");
//            default:
//                System.out.println("Default");
//        }

        // 개선된 Switch문
        // 화살표 문법
        // break
        // 값 반환
        switch (grade) {
            case 'A', 'a' -> System.out.println("Your Grade : A");
            case 'B' -> System.out.println("Your Grade : B");
            default -> System.out.println("Default");
        }

        String result = switch (grade) {
            case 'A', 'a' -> {
                System.out.println("실행됨");
                yield "Your Grade : A";
            }
            case 'B' -> "Your Grade : B";
            default -> "Default";
        };

        System.out.println(result);
    }
}
