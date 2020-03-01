package oop.hr;

public class WhiteCollarFactory extends AbstractEmployeeFactory {

    @Override
    public Employee createEmployee(String name, int rate, int salary, String insurance) {
        return new WhiteCollar(name, salary);
    }
}
