package tdd;

class Dollar extends Money {
    Dollar(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier) {
        return new Money(this.amount * multiplier, currency);
    }

    public String currency() {
        return this.currency;
    }
}