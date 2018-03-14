import be.reneald.sdi.TaxCalculator;
import be.reneald.sdi.calculations.AmericanTaxCalculation;
import be.reneald.sdi.calculations.TaxCalculation;
import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

public class TaxCalculatorTest {

    @Test
    public void calculateTaxes_shouldCallTaxCalculation() {
        TaxCalculation testCalculation = mock(AmericanTaxCalculation.class);
        when(testCalculation.calculateTaxes(100)).thenReturn(45.00);
        final TaxCalculator testCalculator = new TaxCalculator(testCalculation);

        double actualResult = testCalculator.calculateTaxes(100);

        Assertions.assertThat(actualResult).isEqualTo(45.00);
    }

}