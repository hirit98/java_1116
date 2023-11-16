public class Button { // 외부 클래스
    // 내부에 인터페이스를 만든다.
    public static interface ClickListener {
        // 추상 메서드
        void onClick();
    }

    // 다형성특성을 갖는 변수를 만든다.
    private ClickListener clickListener;
    // 객체를 주입하는 Setter 메서드를 생성
    public void setClickListener(ClickListener clickListener){
        // 나의 객체를 갖고온다.
        this.clickListener = clickListener;
    }

    public void click(){
        this.clickListener.onClick();
    }
}
