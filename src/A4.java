public class A4 {
    // 지역 클래스 : 생성서 또는 메서드 안에 내부 클래스를 생성.

    A4() { // A4 라는 생성자를 생성
        class B{ // 내부 클래스
            B() { // B 생성자 생성
                System.out.println("B-생성자 실행");
            }
            void method1() {
                System.out.println("B-method1()");
            }
        }
        B b = new B();
        b.method1();
    }

    void UseB(int arg) { // 메서드 내부 클래스 작성해서 호출하는 방법
        int val = 2;
        class B{
            B() { // 내부 클래스의 생성자도 생성가능
                System.out.println("B-생성자 실행");
            }
            void method1() {
                System.out.println("B-method1()");
                System.out.println(val);
                System.out.println(arg);

                //val = 3;
                //val = 2;
            }
        }

        // 외부 클래스 메소드 안에서 B 라는 내부 클래스를 생성하고 호출한다.
        B b = new B();
        b.method1();
    }
}
