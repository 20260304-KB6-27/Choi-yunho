package basic.ch00.exam01;

public class PersonExample {
    public static void main(String[] args) {

        // 행동할 수 있는 사람
        Behavior behaviorPerson; // = new Behavior();
        behaviorPerson = /*(Behavior)*/ new Student(); // 업캐스팅 시 자동 형 변환
        behaviorPerson = new Worker(); // 교체

        // 인터페이스의 static 메소드는 객체 접근이 아닌 직접 접근으로 구현
        Behavior.born();
        behaviorPerson.eat();
        behaviorPerson.live();
        behaviorPerson.die();

    }
}
