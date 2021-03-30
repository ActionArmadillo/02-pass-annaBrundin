package annaBrundin;

public class AdvancedCalculator extends BasicCalculator implements AdvancedOperations {
    @Override
    public double squareRoot(double number) {
        return number * number;
    }

    @Override
    public double exponentiation(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double remainder(double dividend, double divisor) {
        return dividend % divisor;
    }

    @Override
    public double percentage(double value, double percent) {
        return (value * (percent / 100));
    }

    @Override
    public int absoluteValueOf(int n) {
        return Math.abs(n);
    }
}
