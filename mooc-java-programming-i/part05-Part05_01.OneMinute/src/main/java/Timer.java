public class Timer {

    public ClockHand hundreds;
    public ClockHand seconds;

    public Timer() {
        this.hundreds = new ClockHand(100);
        this.seconds = new ClockHand(60);

    }

    public String toString() {
        return seconds + ":" + hundreds;

    }
    
    public void advance() {
        this.hundreds.advance();
       if (this.hundreds.value() == 0) {
            this.seconds.advance();
    }

}}
