package oop.finance;

public class FinanceService {

    public void pay(Worker worker){
        System.out.println("Bank transfer to worker, amount: "+worker.getMonthlyPayment());
    }

    public void pay(Payable worker){
        System.out.println("Bank transfer to worker, amount: "+worker.getWage());
    }
}
