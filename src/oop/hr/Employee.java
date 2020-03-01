package oop.hr;

import oop.finance.Payable;

public abstract class Employee implements Payable, Perks{
    String name;

    String insurance;

    public Employee(){

    }

    public Employee(String name, String healthInsurance){
        this.name = name;
        this.insurance = healthInsurance;
    }

    public abstract int getWage();

    @Override
    public String getHealthInsurance() {
        return insurance;
    }

    public String getHealthInsurance(String type) {
        return insurance;
    }
}
