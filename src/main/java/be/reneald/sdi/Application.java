package be.reneald.sdi;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(Application.class);
        TaxCalculator taxCalculator = applicationContext.getBean(TaxCalculator.class);
        double myYearlyIncome = 23000;
        System.out.println("Your yearly income is " + taxCalculator.calculateTaxes(myYearlyIncome));
    }
}
