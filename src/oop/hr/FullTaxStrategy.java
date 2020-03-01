package oop.hr;

public class FullTaxStrategy implements TaxStrategy {
    @Override
    public int calculateAfterTax(int wage) {
        return (int)(wage * (1-federalTaxRate-stateTaxRate));
    }
}