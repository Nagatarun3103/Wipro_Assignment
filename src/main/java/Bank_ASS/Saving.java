package Bank_ASS;

public class Saving extends Bank {
    double savRate;

    public Saving(String accNo, String custName, int custGender, String custJob, double curBal, double savRate) {
        super(accNo, custName, custGender, custJob, curBal);
        this.savRate = savRate;
    }

    @Override
    public double calcBalance() {
        return curBal + (savRate * curBal);
    }

    @Override
    public String toString() {
        return super.toString() + "\nAccount Type: Saving\nCalculated Balance: RM" + calcBalance();
    }
}
