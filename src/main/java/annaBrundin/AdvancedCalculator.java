package annaBrundin;

public class AdvancedCalculator extends BasicCalculator implements AdvancedOperations {
    @Override
    public double squareRoot(double number) {
        return number * number;
    }

    @Override
    public double positiveExponentiation(double base, double exponent) {
        return Math.pow(base, Math.abs(exponent));
    }

    @Override
    public double negativeExponentiation(double base, double exponent) {
        return Math.pow(base, Math.abs(exponent) * (-1));
    }

    @Override
    public double remainder(double dividend, double divisor) {
        return dividend % divisor;
    }

    @Override
    public double percentage(double value, double percent) {
        return Math.abs((value / 100) * percent);
    }
}
