public class A5 {
    // 문제1 : 외부 클래스의 멤버 접근 제한 : 정적/인스턴스 비교
    // 인스턴스 필드와 메서드
    int filed1;
    void method1(){
        System.out.println("1");
    }
    // 정적 필드와 메서드
    static int filed2;
    static void method2(){
        System.out.println("2");
    }

    class B { // 인스턴스 멤버 클래스 : 인스턴스, 정적의 필드와 메서드 접근허용 (R / W)
        void method(){ // 메서드 호출
            // A5 인스턴스 필드와 메서드 O
            filed1 = 10;
            method1();
            // A5 정적 필드와 메서드 O
            filed2 = 20;
            method2();
        }
    }
    static class C { // 정적 멤버 클래스
        void method(){ // 메서드 호출
            // A5 인스턴스 필드와 메서드 X
            // static 정적(method area) 는 객체가 없어도 사용하기 때문에 객체가 생성되지
            // 않아도 사용 할 수 있는 상태에서 에러가 발생 할 수 있다.
            //filed1 = 10;
            //method1();
            // A5 정적 필드와 메서드 O
            filed2 = 20;
            method2();
        }
    }
}
