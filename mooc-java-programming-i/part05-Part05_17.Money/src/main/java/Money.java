public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        int sum = this.cents + addition.cents();
        int sum2 = addition.euros() + this.euros;
        Money newMoney = new Money(sum2, sum);

        return newMoney;
    }

    public Money minus(Money decreaser) {
        int euros = this.euros - decreaser.euros();
        int cents = this.cents - decreaser.cents();

        if (cents < 0) {
            cents = cents + 100;
            euros = euros - 1;
        }

        if (euros < 0) {
            return new Money(0, 0);
        }

        return new Money(euros, cents);
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public boolean lessThan(Money compared) {
        Money compare = (Money) compared;
        if (this.euros < compare.euros) {
            return true;
        } else if (this.euros > 0 && compare.euros < 0) {
            return false;
        } else if (this.euros == compared.euros() && this.cents < compare.cents) {
            return true;
        }
        return false;

    }
}
