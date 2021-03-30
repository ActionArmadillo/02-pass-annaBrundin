package annaBrundin;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class AdvancedCalculatorTest {
    AdvancedCalculator ac = new AdvancedCalculator();
    Random random = new Random();
    int MAX = 100;
    int MIN = -100;

    @Test
    public void squareRoot() {
        for (int i = 0; i < 25; i++) {
            double number = random.nextInt(MAX - MIN) + MIN;
            System.out.println(number + ", " + number * number);
            assertEquals(number * number, ac.squareRoot(number), 0);
        }
    }

    @Test
    public void squareRootZeroValue() {
        for (int i = 0; i < 25; i++) {
            double number = 0.0;
            System.out.println(number + ", " + number * number);
            assertEquals(0, ac.squareRoot(number), 0);
        }
    }

    @Test
    public void squareNegative() {
        for (int i = 0; i < 25; i++) {
            double number = random.nextInt(MAX - MIN) + MIN;
            if (number > 0) {
                number *= -1;
            }
            System.out.println(number + ", " + number * number);
            assertTrue(String.valueOf(ac.squareRoot(number) > 0), true);
        }
    }

    @Test
    public void squarePositive() {
        for (int i = 0; i < 25; i++) {
            double number = random.nextInt(MAX - MIN) + MIN;
            if (number < 0) {
                number *= -1;
            }
            System.out.println(number + ", " + number * number);
            assertTrue(String.valueOf(ac.squareRoot(number) > 0), true);
        }
    }

    @Test
    public void positiveExponentiationZeroBase() {
        double base = 0.0;
        double exponent = random.nextInt(MAX / 10 - MIN / 10) + MIN / 10;
        while(exponent == 0.0){
            exponent = random.nextInt(MAX / 10 - MIN / 10) + MIN / 10;
        }

        System.out.println("Base " + base + ". Exponent: " + exponent);
        assertEquals(0, ac.positiveExponentiation(base, exponent), 0);
    }

    @Test
    public void positiveExponentiationZeroExponent() {
        double base = random.nextInt(MAX / 10 - MIN / 10) + MIN / 10;
        int exponent = 0;

        System.out.println("Base " + base + ". Exponent: " + exponent);
        assertEquals(1, ac.positiveExponentiation(base, exponent), 0);
    }

    @Test
    public void positiveExponentiationNegativeExponent() {
        double base = random.nextInt(MAX / 10 - MIN / 10) + MIN / 10;
        MAX = 0;
        int exponent = random.nextInt(MAX - MIN / 10) + MIN / 10;
        double value = base;

        for (int j = 1; j < (exponent * (-1)); j++) {
            System.out.println("Value: " + value + ". Exponent: " + exponent);
            value *= base;
            System.out.println("Value after pow = " + value);
        }

        System.out.println("Base " + base + ". Exponent: " + exponent + ". Result: " + value);
        assertEquals(value, ac.positiveExponentiation(base, exponent), 0);
    }

    @Test
    public void negativeExponentiation() {
        double base = random.nextInt(MAX / 10 - MIN / 10) + MIN / 10;
        double exponent = random.nextInt(MAX / 10 - MIN / 10) + MIN / 10;
        double value = base;

        while(exponent == 0){
            exponent = random.nextInt(MAX / 10 - MIN / 10) + MIN / 10;
        }
        if (exponent > 0) {
            exponent *= -1;
        }

        for (int j = 1; j < (exponent * (-1)); j++) {
            System.out.println("Value: " + value + ". Exponent: " + exponent);
            value *= base;
            System.out.println("Value after pow = " + value);
        }

        System.out.println("Base " + base + ". Exponent: " + exponent + ". Result: " + 1 / value);
        assertEquals(1 / value, ac.negativeExponentiation(base, exponent), 0.0001);
    }

    @Test
    public void negativeExponentiationZeroBase() {
        double base = 0.0;
        double exponent = Math.abs(random.nextInt(MAX - MIN) + MIN)+1;

        double result = Double.POSITIVE_INFINITY;

        System.out.println("Base " + base + ". Exponent: " + exponent);
        assertEquals(result, ac.negativeExponentiation(base, exponent), 0);
    }

    @Test
    public void negativeExponentiationZeroExponent() {
        double base = random.nextInt(MAX / 10 - MIN / 10) + MIN / 10;
        int exponent = 0;

        System.out.println("Base " + base + ". Exponent: " + exponent);
        assertEquals(1, ac.negativeExponentiation(base, exponent), 0);
    }

    @Test
    public void negativeExponentiationPositiveExponent() {
        double base = random.nextInt(MAX - MIN) + MIN;
        int exponent = Math.abs(random.nextInt(MAX / 10 - MIN / 10) + MIN / 10) + 1;
        double value = base;

        if (exponent < 0) {
            exponent *= -1;
        }

        for (int j = 1; j < exponent; j++) {
            System.out.println("Value: " + value + ". Exponent: " + exponent);
            value *= base;
            System.out.println("Value after pow = " + value);
        }

        System.out.println("Base " + base + ". Exponent: " + exponent + ". Result: " + 1 / value);
        assertEquals(1 / value, ac.negativeExponentiation(base, exponent), 0.0001);
    }

    @Test
    public void remainder() {
        for (int i = 0; i < 25; i++) {
            MIN = 0;
            double dividend = random.nextInt(MAX - MIN) + MIN;
            double divisor = Math.abs(random.nextInt(MAX / 10 - MIN / 10) + MIN / 10)*(Math.random() +1);

            double result = dividend % divisor;
            System.out.println("dividend " + dividend + ". divisor " + divisor + ". Result " + result);

            assertEquals(result, ac.remainder(dividend, divisor), 0);
        }
    }

    @Test
    public void remainderDoubleValue() {
        for (int i = 0; i < 25; i++) {

            double dividend = (MIN + Math.random() * (MAX - MIN)) * 5.5;
            double divisor = (MIN + Math.random() * (MAX - MIN)) / 5.5;

            if (divisor == 0.0) {
                divisor = (MIN + Math.random() * (MAX - MIN)) / 5.5;
            }
            System.out.println("dividend " + dividend + ". divisor " + divisor);

            double result = dividend % divisor;
            System.out.println("dividend " + dividend + ". divisor " + divisor + ". Result " + result);

            assertEquals(result, ac.remainder(dividend, divisor), 0);
        }
    }

    @Test
    public void remainderZeroDividend() {
        for (int i = 0; i < 25; i++) {

            double dividend = 0.0;
            double divisor =  Math.abs(MIN + Math.random() * (MAX - MIN)) + 1;

            System.out.println("dividend " + dividend + ". divisor " + divisor);

            assertEquals(0.0, ac.remainder(dividend, divisor), 0);
        }
    }


    @Test
    public void remainderZeroDivisor() {
        for (int i = 0; i < 25; i++) {

            double dividend = MIN + Math.random() * (MAX - MIN);
            double divisor = 0.0;

            System.out.println("dividend " + dividend + ". divisor " + divisor);

            double result = Double.NaN;
            assertEquals(result, ac.remainder(dividend, divisor), 0);
        }
    }

    @Test
    public void remainderNegativeDivisor() {
        for (int i = 0; i < 25; i++) {
            MIN = 0;
            int dividend = random.nextInt(MAX - MIN) + MIN;
            int divisor = random.nextInt(MAX / 10 - MIN / 10) + MIN / 10;

            if (divisor == 1 || divisor == -1 || divisor == 0) {
                divisor = random.nextInt(MAX / 10 - MIN / 10) + MIN / 10;
            }
            if (divisor > 0) {
                divisor *= -1;
            }

            System.out.println("dividend " + dividend + ". divisor " + divisor);
            System.out.println(ac.remainder(dividend, divisor));


            assertFalse("The remainder is positive", ac.remainder(dividend, divisor) < 0);
        }
    }

    @Test
    public void remainderNegativeDividend() {
        for (int i = 0; i < 25; i++) {
            MIN = 0;
            int dividend = dividendNotWrong();
            int divisor = random.nextInt(MAX / 10 - MIN / 10) + MIN / 10;
            //boolean positiveDivisor = false;
            while (divisor < 2) {
                divisor = random.nextInt(MAX / 10 - MIN / 10) + MIN / 10;
            }

            System.out.println("dividend " + dividend + ". divisor " + divisor);
            System.out.println(ac.remainder(dividend, divisor));

            assertTrue("The remainder is positive",
                    ac.remainder(dividend, divisor) < 0.0 || ac.remainder(dividend, divisor) == -0.0);
        }
    }

    int dividendNotWrong() {
        int dividend = random.nextInt(MAX - MIN) + MIN;
        if (dividend == 1 || dividend == -1 || dividend == 0) {
            return dividendNotWrong();
        } else {
            return Math.abs(dividend) * (-1);
        }

    }

    @Test
    public void remainderPositive() {
        for (int i = 0; i < 25; i++) {
            MIN = 0;
            int dividend = random.nextInt(MAX - MIN) + MIN;
            int divisor = random.nextInt(MAX / 10 - MIN / 10) + MIN / 10;

            if (dividend <= 1) {
                dividend = random.nextInt(MAX - MIN) + MIN;
            }
            if (divisor <= 1) {
                divisor = (random.nextInt(MAX / 10 - MIN / 10) + MIN / 10) + 5;
            }

            System.out.println("dividend " + dividend + ". divisor " + divisor);
            System.out.println(ac.remainder(dividend, divisor));


            assertTrue("The remainder is negative", ac.remainder(dividend, divisor) >= 0);
        }
    }

    @Test
    public void percentage() {
        for (int i = 0; i < 25; i++) {
            double value = MIN + Math.random() * (MAX - MIN);
            double percentage = (MIN + Math.random() * (MAX - MIN));
            double expectedResult = Math.abs((value / 100) * percentage);
            assertEquals(expectedResult, ac.percentage(value, percentage), 0.005);
        }
    }

    @Test
    public void percentageZeroValue() {
        for (int i = 0; i < 25; i++) {
            double value = 0.0;
            MIN = 0;
            double percentage = (MIN + Math.random() * (MAX - MIN));
            //double expectedResult = Double.POSITIVE_INFINITY;

            System.out.println(ac.percentage(value, percentage));

            assertEquals(0.0, ac.percentage(value, percentage), 0.0);
        }
    }

    @Test
    public void percentageZeroPercentage() {
        for (int i = 0; i < 25; i++) {
            MIN = 0;
            double value = (MIN + Math.random() * (MAX - MIN));
            double percentage = 0.0;
            System.out.println(ac.percentage(value, percentage));
            assertEquals(0.0, ac.percentage(value, percentage), 0.0);
        }
    }

    @Test
    public void percentageNegativeValue() {
        for (int i = 0; i < 25; i++) {
            double percentage = (MIN + Math.random() * (MAX - MIN));
            MAX = 0;
            double value = (MIN + Math.random() * (MAX - MIN));

            double expectedResult = Math.abs((percentage / value) * 100.0);
            System.out.println(ac.percentage(value, percentage));
            assertTrue("Negative value", ac.percentage(value, percentage) >= 0.0);
        }
    }
    @Test
    public void percentageNegativePercent() {
        for (int i = 0; i < 25; i++) {

            double value = (MIN + Math.random() * (MAX - MIN));
            MAX = 0;
            double percentage = (MIN + Math.random() * (MAX - MIN));

            double expectedResult = Math.abs((percentage / value) * 100.0);
            System.out.println(ac.percentage(value, percentage));
            assertTrue("Negative value", ac.percentage(value, percentage) >= 0.0);
        }
    }
    @Test
    public void percentagePositive() {
        for (int i = 0; i < 25; i++) {
            MIN = 0;
            double value = (MIN + Math.random() * (MAX - MIN));
            double percentage = (MIN + Math.random() * (MAX - MIN));

            System.out.println(ac.percentage(value, percentage));
            assertTrue("Negative value", ac.percentage(value, percentage) >= 0.0);
        }
    }

    @Test
    public void absoluteValueOf() {
    }
}