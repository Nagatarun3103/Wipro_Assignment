package Bank_ASS;

public abstract class Bank {
    String accNo;
    String custName;
    int custGender;  
    String custJob;
    double curBal;

    public Bank(String accNo, String custName, int custGender, String custJob, double curBal) {
        this.accNo = accNo;
        this.custName = custName;
        this.custGender = custGender;
        this.custJob = custJob;
        this.curBal = curBal;
    }

    public String getGender() {
        return (custGender == 1) ? "Male" : "Female";
    }

    public String toString() {
        return "Account No: " + accNo + "\nName: " + custName + "\nGender: " + getGender() +
                "\nJob: " + custJob + "\nCurrent Balance: RM" + curBal;
    }

    public abstract double calcBalance();
}
