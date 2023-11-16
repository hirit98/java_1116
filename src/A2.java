// 정적 멤버 클래스 : 내부 클래스 static:
public class A2 { // 외부 클래스

    // 정적 멤버 클래스 : 내부 클래스로 만듦
    static class B2{} // 외부 클래스를 사용하지 않아도 가능

    // 인스턴스 필드 값으로 B 객체 대입 할 수 있다
    B2 filed = new B2(); // 인스턴스 멤버를 이용한 객체생성

    // 정적 필드 값으로 B 객체 대입 할 수 있다.
    static B2 filed2 = new B2();

    // 생성자를 활용 할 수 있다.
    A2(){
        // 내부 클래스 객체를 생성해서 만듦.
        B2 b = new B2();
    }
    // 정적 메서드 : B는 A가 없어도 사용하기 때문에 가능
    static void method2(){
        B2 b = new B2();
    }
}
