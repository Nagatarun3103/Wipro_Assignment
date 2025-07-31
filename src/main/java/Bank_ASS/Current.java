package Bank_ASS;

public class Current extends Bank {
    boolean fixedDep;
    double curRate;

    public Current(String accNo, String custName, int custGender, String custJob, double curBal, double curRate, boolean fixedDep) {
        super(accNo, custName, custGender, custJob, curBal);
        this.curRate = curRate;
        this.fixedDep = fixedDep;
    }

    @Override
    public double calcBalance() {
        double balance = curBal + (curRate * curBal);
        if (fixedDep) {
            balance -= 150;  
        }
        return balance;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAccount Type: Current\nFixed Deposit: " + (fixedDep ? "Yes" : "No")
                + "\nCalculated Balance: RM" + calcBalance();
    }
}
