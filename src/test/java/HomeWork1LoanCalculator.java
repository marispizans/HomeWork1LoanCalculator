import org.junit.jupiter.api.Test;

public class HomeWork1LoanCalculator {

    @Test
    public void HomeWork1LoanCalculator () {
        float a = 30; // Years//
        float b = 1000; // Loan //
        double c = b / a; // Payment in a year //
        double d = c * 10; //Payment in 10 years
        double e = d * 1.1; // Payment in first 10 years with interest 10%//
        System.out.println("Payment in first 10 years: " +e);
        double f = d * 1.08; // Payment in second 10 years with interest 8%//
        System.out.println("Payment in second 10 years: " +f);
        double g = d * 1.06; // Payment in third 10 years with interest 6%//
        System.out.println("Payment in third 10 years: " +g);
        double h = e + f + g; //Total payment in 30 years//
        System.out.println("Total payment in 30 years: " +h);

    }


    }

