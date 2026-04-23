package basic.ch12.sec05;

import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {
        String data1 = "홍길동&이수홍,박연수";
        String data2 = "홍길동/이수홍/박연수";

        System.out.println("--- split() 결과 ---");
        String[] names = data1.split("&|,");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.println();

        System.out.println("--- StringTokenizer 결과 ---");
        StringTokenizer st = new StringTokenizer(data2, "/");

        while (st.hasMoreTokens()) {
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
