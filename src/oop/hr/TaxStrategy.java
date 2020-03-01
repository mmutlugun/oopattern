package oop.hr;

public interface TaxStrategy {
    public static final double stateTaxRate = 0.1;
    public static final double federalTaxRate = 0.2;

    int calculateAfterTax(int wage);
}
