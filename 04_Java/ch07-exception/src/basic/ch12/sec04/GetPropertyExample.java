package ch12.sec04;

import java.util.Properties;
import java.util.Set;

public class GetPropertyExample {
    public static void main(String[] args) {

        // 1. 개별 속성 정보 추출
        String osName = System.getProperty("os.name");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");

        System.out.println("========= [ 주요 시스템 정보 ] =========");
        System.out.println("1. 운영체제 명      : " + osName);
        System.out.println("2. 로그인 사용자    : " + userName);
        System.out.println("3. 홈 디렉토리      : " + userHome);
        System.out.println();

        // 2. 시스템 속성 정보 전체 출력
        System.out.println("========= [ 전체 시스템 속성 ] =========");
        System.out.println(String.format("%-30s | %s", "Key", "Value"));
        System.out.println("--------------------------------------------------");

        Properties props = System.getProperties();
        Set<Object> keys = props.keySet();

        for (Object key : keys) {
            String strKey = (String) key;
            String value = System.getProperty(strKey);
            System.out.printf("%-30s : %s\n", strKey, value);
        }
    }
}