package oop.hr;

public class HRFacade {

    private final HRService service;

    public HRFacade(){
        this.service = HRService.getHRService();
    }

    public void hire(Employee employee){
        service.addEmployee(employee);
    }
}
