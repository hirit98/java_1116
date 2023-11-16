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

        // ----------------------------------------------
        // 로컬 클래스
        A4 a2 = new A4();
        a2.UseB(3);

        // 내부 클래스지만 private 접근 제한 사용중
        PermitExample permit = new PermitExample();
        permit.getInClass();

        // --------------------------------------------------------------
        // 중첩 내부 클래스를 활용한 인터페이스 객체 주입 방법

        //Button 객체를 생성
        Button btnOk = new Button();
        class OkListener implements Button.ClickListener{

            @Override
            public void onClick() {
                System.out.println("OK 버튼을 클릭했습니다.");
            }
        }
        btnOk.setClickListener(new OkListener()); // OK 버튼을 클릭하는 객체를 주입해서 만든다.

        btnOk.click(); // 메서드를 호출해서 확인한다.
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

// 멤버 클래스 접근 제한자(private)
// 내부 클래스 private 적용해서 외부 클래스 메서드를 통해서 클래스 접근 할 수 있게 만든다.

class PermitExample{
    // public > default > protected > private
    private class Inclass{ // 내부 클래스를 통해서 접근 가능
        public Inclass print(){
            System.out.println("접근을 private 로 제한");
            return null;
        }
    }

    // 외부 클래스에 public 활용해 method를 만들어서 Inclass.print()메서드 접근
    public Inclass getInClass() { // return 값 => Inclass
        return new Inclass().print();
    }
}
