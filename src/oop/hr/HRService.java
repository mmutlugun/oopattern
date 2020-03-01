package oop.hr;

public class HRService extends AbstractHRService{
    private static HRService service = null;
    static int i=0;

    private String name;
    static {
        service = new HRService();
        System.out.println("HRService is created");
    }

    private HRService(){
        name = "My HR Service ";
        System.out.println(name+" is created");
    }

    public static HRService getHRService(){
        return service;
    }

    public String getName() {
        return name;
    }

    public Employee createEmployee(String type, String name, int rate, int salary, String insurance){
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
