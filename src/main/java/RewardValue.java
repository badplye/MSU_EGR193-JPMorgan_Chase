public class RewardValue {
    private double cashValue;
    private double milesValue;
    public static final double CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.milesValue = cashValue / CONVERSION_RATE;
        this.cashValue = cashValue;
    }
    public RewardValue(int milesValue){
        this.milesValue = milesValue;
        this.cashValue = milesValue * CONVERSION_RATE;
    }

    public int getCashValue() {
        return (int) Math.round(cashValue);
    }

    public int getMilesValue() {
        return (int) Math.round(milesValue);
    }

}
