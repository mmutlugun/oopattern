package oop.hr;

import oop.finance.Worker;

public class EmployeeToWorkerAdapter implements Worker{
    Employee employee;

    public EmployeeToWorkerAdapter(Employee employee){
        this.employee = employee;
    }

    @Override
    public int getMonthlyPayment() {
        return employee.getWage();
    }
}
