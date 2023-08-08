package ThreeWeeks.practice;

public interface 이항연산 { // 이항연산이라는 추상적인 클래스는 더하기,곱하기 등등의 여러 매써드를 합칠 수 있게 하는 기능을 가진다.

    public int 계산해(int x, int y); // 여기서 계산해는 매개변수를 받는 '메시지'만을 전달해주는 것을 선언하는 것이다.

    // 이항연산 클래스는 추상 클래스로서, 그 자체로는 객체를 생성할 수 없지만 다른 클래스가 상속할 수 있습니다.
    // 이 클래스는 계산해라는 추상 메소드를 가지며, 이 메소드는 상속받는 클래스에서 반드시 구현해야 합니다.
}


final class 더하기 implements 이항연산 {

    @Override // @Override는 아빠 클래스를 가져와서 더하기라는 클래스로 재정의한 거라는 뜻임. (추상클래스는 반드시 상속으로 계산을 정의한다)
    public int 계산해(int x, int y) { // IS-A 관계이다
        return x + y;
    }

}


final class 곱하기 implements 이항연산 {

    @Override
    public int 계산해(int x, int y) { // IS-A 관계이다
        return x * y;
    }
}
