package tdd;

class Dollar extends Money {
    Dollar(int amount, String currency) {
        super(amount, currency);
    }

    public Money times(int multiplier) {
        return Money.dollar(this.amount * multiplier);
    }

    public String currency() {
        return this.currency;
    }
}