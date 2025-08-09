package assignment;

import java.util.Scanner;



class Worker {
    protected String name;
    protected double salaryRate;

    public Worker(String name, double salaryRate) {
        this.name = name;
        this.salaryRate = salaryRate;
    }

    public double pay(int hours) {
        return 0.0;
    }

    public void displayPay(int hours) {
        System.out.println("Worker: " + name);
        System.out.println("Pay for " + hours + " hours: ₹" + pay(hours));
    }
}

class DailyWorker extends Worker {
    public DailyWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double pay(int hours) {
        return hours * salaryRate;
    }
}

class SalariedWorker extends Worker {
    public SalariedWorker(String name, double salaryRate) {
        super(name, salaryRate);
    }

    @Override
    public double pay(int hours) {
        return 40 * salaryRate;
    }
}
