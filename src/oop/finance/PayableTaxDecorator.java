package oop.finance;

import oop.hr.TaxStrategy;

public class PayableTaxDecorator extends PayableDecorator {

    public static final double taxRate = 0.2;

    public PayableTaxDecorator(Payable emp){
        super(emp);
    }

    @Override
    public int getWage(){
        int wage = super.getWage();
        return calculateAfterTaxWage(wage);
    }

    private int calculateAfterTaxWage2(int wage){
        return (int) (wage * (1-taxRate));
    }

    //FOR STRATEGY PATTERN

    public PayableTaxDecorator(Payable emp, TaxStrategy taxStrategy){
        super(emp);
        this.taxStrategy = taxStrategy;
    }

    public TaxStrategy taxStrategy;

    //Rename for Strategy test
    private int calculateAfterTaxWage(int wage){
        return taxStrategy.calculateAfterTax(wage);
    }
}
