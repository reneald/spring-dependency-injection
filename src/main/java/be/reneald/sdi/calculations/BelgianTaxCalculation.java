package be.reneald.sdi.calculations;

import org.springframework.context.annotation.Primary;

import javax.inject.Named;

@Named
@Primary
public class BelgianTaxCalculation implements TaxCalculation {
    private static final double TAX_RATE = 0.45;

    @Override
    public double calculateTaxes(double yearlyIncome) {

        return yearlyIncome * TAX_RATE;
    }
}
