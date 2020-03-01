package oop.hr;

public class BlueCollarFactory extends AbstractEmployeeFactory {

    @Override
    public Employee createEmployee(String name, int rate, int salary, String insurance) {
        return new BlueCollar(name, rate, insurance);
    }
}
