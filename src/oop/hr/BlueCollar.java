package oop.hr;

public class BlueCollar extends Employee {

    private int hours;
    private int rate;

    public BlueCollar() {
    }

    public BlueCollar(String name, int rate, String insurance) {
        super(name, insurance);
        this.rate = rate;
    }


    public int getHours() {
        return hours;
    }

    public int getRate() {
        return rate;
    }

    @Override
    public int getWage() {
        return getHours()*getRate();
    }

    public BlueCollar name(String name){
        super.name = name;
        return this;
    }

    public BlueCollar insurance(String insurance){
        super.insurance = insurance;
        return this;
    }

    public BlueCollar hours(int hours){
        this.hours = hours;
        return this;
    }

    public BlueCollar rate(int rate){
        this.rate = rate;
        return this;
    }
}
