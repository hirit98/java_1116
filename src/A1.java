public class A1 { // 인스턴스 멤버 클래스
    int filed;
    B filed2;
    class B { // 내부 클래스
        B() { // 내부 클래스 생성자

        }
        // 인스턴스 메서드
        void method() {
            System.out.println("methodB()실행");
        }
    }

    // 외부 클래스 생성자
    A1() {
        B b = new B();
        b.method();
    }

    // method를 호출한다.
    public void methodA(){
        B b = new B();
        b.method();
    }
}
