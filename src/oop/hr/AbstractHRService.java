package oop.hr;

import oop.finance.Payable;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractHRService {
    List<Employee> employeeList = new ArrayList<Employee>();

    public void addEmployee(Employee emp){
        employeeList.add(emp);
    }

    public List<Payable> getPayables(){
        List<Payable> payables = new ArrayList<Payable>();
        for (Employee e: employeeList) {
            payables.add(e);
        }
        return payables;
    }

    abstract Employee createEmployee(String type, String name, int rate, int salary, String insurance);
}
