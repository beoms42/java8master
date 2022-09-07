import java.util.function.Function;

public class YoungIn {

    public static void main(String[] args) {

        //---------------------------------1-1------------------------
        //함수형 인터페이스
//        RunSomething runSomething = new RunSomething() {
//            @Override
//            public void doIt() {
//                System.out.println("hi");
//            }
//        };

        //람다식
//        RunSomething runSomething = () -> {
//            System.out.println("hello");
//        };
//
//        runSomething.doIt();
        //---------------------------------1-1------------------------


        Function<Integer, Integer> plus10 = (i) -> {
            return i + 10;
        };

        Function<Integer, Integer> multifly2 = (i) -> {
            return i * 2;
        };

        plus10.compose(multifly2);
    }
}
