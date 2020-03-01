package oop.hr;

public class EmployeeFactoryProvider {
    public static AbstractEmployeeFactory getFactory(String type){
        if(type == null){
            return null;
        }
        if (type.equalsIgnoreCase("White")){
            return new WhiteCollarFactory();
        }
        if (type.equalsIgnoreCase("Blue")){
            return new BlueCollarFactory();
        }
        return null;
    }
}
