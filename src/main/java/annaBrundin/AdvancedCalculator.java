package annaBrundin;

public class AdvancedCalculator extends BasicCalculator implements AdvancedOperations {
    @Override
    public double squareRoot(double number) {
        return number * number;
    }

    @Override
    public double positiveExponentiation(double base, double exponent) {
        if(exponent < 0){
            exponent *= -1;
        }
        return Math.pow(base, exponent);
    }

    @Override
    public double negativeExponentiation(double base, double exponent) {
        if(exponent > 0){
            exponent *= -1;
        }
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
}
