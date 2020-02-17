package tdd;

abstract class Money {
    protected int amount;

    public static Money dollar(int amount) {
        return new Dollar(amount);
    }

    public static Money franc(int amount) {
        return new Franc(amount);
    }

    public abstract Money times(int multiplier);

    public boolean equals(Object object) {
        Money money = (Money) object;
        // 자바 객체 용어보다는 재정 분야에 맞는 용어를 사용하고 싶지만 통화 개념을 도입하기 전이다.
        return amount == money.amount && getClass().equals(money.getClass());
    }
}