package oop.hr;

public class EmployeeFactory {
    public Employee getEmployee(String type, String name, int rate, int salary, String insurance){
        if(type == null){
            return null;
        }
        if (type.equalsIgnoreCase("White")){
            return new WhiteCollar(name, salary);
        }
        if (type.equalsIgnoreCase("Blue")){
            return new BlueCollar(name, rate, insurance);
        }
        return null;
    }
}