public class GroceryCounter {
    private int counter;
    private int overflowCount;

    public GroceryCounter() {
        this.counter = 0;
        this.overflowCount = 0;
    }

    private void increment(int amount) {
        this.counter += amount;
        while (this.counter > 9999) {
            this.counter -= 10000;
            this.overflowCount++;
        }
    }

    public void tens() {
        increment(1000);
    }

    public void ones() {
        increment(100);
    }

    public void tenths() {
        increment(10);
    }

    public void hundreths() {
        increment(1);
    }

    public String total() {
        int dollars = counter / 100;
        int cents = counter % 100;
        return String.format("$%d.%02d", dollars, cents);
    }

    public int overflows() {
        return overflowCount;
    }

    public void clear() {
        this.counter = 0;
        this.overflowCount = 0;
    }
}
