package oop.hr;

public class NoStateTaxStrategy implements TaxStrategy {

    @Override
    public int calculateAfterTax(int wage) {
        return (int)(wage * (1-federalTaxRate));
    }
}
