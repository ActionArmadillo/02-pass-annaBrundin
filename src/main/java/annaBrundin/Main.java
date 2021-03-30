package annaBrundin;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------------\n- Basic calculations -\n-----------------------");
        basicCalculations(16, 3);
        System.out.println("-------------------------\n- Advanced calculations -\n-------------------------");
        advancedCalculations();
    }

    public static void basicCalculations(int value1, int value2){
        BasicCalculator bc = new BasicCalculator();

        /* addition */
        System.out.println("SUM (+) of " + value1 + " and " + value2 + " = " + bc.addition(value1, value2));
        /* division */
        System.out.println("DIFFERENCE (-) of " + value1 + " and " + value2 + " = " + bc.subtraction(value1, value2));
        /* multiplication */
        System.out.println("PRODUCT (*) of " + value1 + " and " + value2 + " = " + bc.multiplication(value1, value2));
        /* division */
        System.out.println("DIVIDEND (÷) of " + value1 + " by " + value2 + " = " + bc.division(value1, value2));
    }

    public static void advancedCalculations(){
        AdvancedCalculator ac = new AdvancedCalculator();

        /* squareRoot */
        int value = 15;
        System.out.println("SQUARE ROOT of " + value + " = " + ac.squareRoot(value));

        /* exponentiation */
        int base = 10;
        int exponent = 3;
        System.out.println("EXPONENTIATION: " + base + " to the power of " + exponent + " = " + ac.exponentiation(base, exponent));

        /* remainder */
        int dividend = 200;
        int divisor = 11;
        System.out.println("REMAINDER: " + dividend + " % " + divisor + " = " + ac.remainder(dividend, divisor));

        /* percentage */
        int percentage = 10;
        value = 538;
        System.out.println("PERCENTAGE: " + percentage + "% of " + value + " = " + ac.percentage(value, percentage));

        /* absoluteValueOf */
        int n = -12;
        System.out.println("ABSOLUTE VALUE of " + n + ":\n|n| = " + ac.absoluteValueOf(n));
    }
}
