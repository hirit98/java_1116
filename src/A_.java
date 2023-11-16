public class A_ {
    public static void main(String[] args) {

        // 외부 객체 선언
        A1 a = new A1();
        a.filed = 10;
        // 내부 객체 선언
        A1.B b = a.new B();
        // 외부 클래스 메서드를 활용한 -> B 클래스 method 호출
        a.methodA(); // B 클래스 메서드를 호출
        b.method(); // B라는 클래스의 자체 메서드 호출

        // ----------------------------------------------
        // 정적 멤버 클래스
        A2.B2 b_ = new A2.B2(); // A 객체를 생성하지 않아도 B 객체를 사용 가능

        // A 객체를 생성하지 않아도 B 객체를 생성가능
        A3.B3 b2 = new A3.B3();
        b2.methodB(); // 독립적이라서 직접 객체를 생성하고 메서드를 호출 할 수 있다.

        // PrintOut 외부 클래스 안에 Out 내부 클래스를 직접적으로 호출한다.
        String str = "정적 내부 클래스 테스트";
        // 외부 객체를 선언하고 인스턴스를 활용해서 메서드를 호출
        PrintOut.Out print = new PrintOut.Out();
        print.println(str); // 내부 클래스 메서드를 직접적으로 호출 할 수 있다.
    }
}

class PrintOut{ // 외부 클래스
    // 정적 내부 클래스 선언
    static class Out{
        // 메서드를 활용해서 만들기
        void println(String str) { // str 매개변수를 받아서 출력한다.
            System.out.println(str);
        }
    }
}
