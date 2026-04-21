package lecture.exam02;

public class PostExample {
    public static void main(String[] args) {
        // 정적 중첩 객체는 외부 객체 먼저 생성할 필요 X
        PostResponse.Author author = new PostResponse.Author("자바왕", "javaking@java.com");
    }


    // 빌더 패턴 ****

}
