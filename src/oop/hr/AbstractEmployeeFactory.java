package oop.hr;

public abstract class AbstractEmployeeFactory {
    public abstract Employee createEmployee(String name, int rate, int salary, String insurance);
}
