package be.reneald.sdi.calculations;

import javax.inject.Named;

@Named("AmericanTaxCalculationBean")
public class AmericanTaxCalculation implements TaxCalculation {
    private static final double LUMP_SUM = 950;
    private static final double TAX_RATE = 0.18;

    @Override
    public double calculateTaxes(double yearlyIncome) {

        return yearlyIncome * TAX_RATE + LUMP_SUM;
    }
}
