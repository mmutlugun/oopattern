package oop.finance;

public abstract class PayableDecorator implements Payable {
    private final Payable empToBeDecorated;

    public PayableDecorator(Payable empToBeDecorated){
        this.empToBeDecorated = empToBeDecorated;
    }

    @Override
    public int getWage(){
        return empToBeDecorated.getWage();
    }
}
