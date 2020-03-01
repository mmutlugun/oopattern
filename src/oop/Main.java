package oop;

import oop.finance.FinanceService;
import oop.finance.Payable;
import oop.finance.PayableTaxDecorator;
import oop.hr.*;

public class Main {


    public static final void main(String[] args){
        HRService service = HRService.getHRService();

        //FACTORY PATTERN
        Employee emp = new EmployeeFactory().getEmployee("white", "Mehmet", 0, 100, "");
        service.addEmployee(emp);

        //FACTORY METHOD
        Employee emp2 = HRService.getHRService().createEmployee("blue", "Ahmet", 60, 0, "United");

        Employee emp9 = new WhiteCollarFactory().createEmployee("Suleyman", 0, 200, "" );

        //Abstract Factory Example
        Employee emp3 = EmployeeFactoryProvider.getFactory("white").createEmployee("Hasan", 0, 200, "");

        //BUILDER
        Employee emp4 = new WhiteCollar.WhiteCollarBuilder()
                .name("Osman")
                .salary(300)
                .address("Abc")
                .build();

        //FLUENT
        Employee emp5 = new BlueCollar()
                .name("Ali")
                .insurance("Bluecross")
                .rate(50)
                .hours(100);

        Employee emp0  = new BlueCollar("Ali", 10, "Kaiser");

        //ADAPTER
        FinanceService finance = new FinanceService();
        finance.pay(new EmployeeToWorkerAdapter(emp5));

        //DECORATOR
        Payable decoratedEmployee = new PayableTaxDecorator(emp5);
        finance.pay(decoratedEmployee);

        //STRATEGY
        Payable decoratedEmployee2 = new PayableTaxDecorator(emp5, new FullTaxStrategy());
        finance.pay(decoratedEmployee2);

    }
}
