package ch11.sec03.exam03;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo", null, "200"};


        for (int i = 0; i <= array.length; i++) {
            try {
                int value = Integer.parseInt(array[i]);
                System.out.println("array [" + i + "] : " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("배열을 벗어 남 : " + e.getMessage());
            } catch (NullPointerException e) {
                System.out.println("Null 값 입력됨 : " + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("숫자로 변환하지 못하는 값 입력됨 : " + e.getMessage());
            }
        }
    }
}
