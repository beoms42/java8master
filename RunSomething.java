
@FunctionalInterface
public interface RunSomething {

    // 추상 메서드가 하나만 있으면 함수형 인터페이스
    abstract void doIt();

    //static + public을 생략 가능
    static void printName() {
        System.out.println("youignIn");
    }

    default  void printAge() {
        System.out.println("25");
    }

}
