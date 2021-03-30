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
    public void positiveExponentiation() {

        double base = random.nextInt(MAX / 10 - MIN / 10) + MIN / 10;
        double exponent = random.nextInt(MAX / 10 - MIN / 10) + MIN / 10;
        double value = base;

        if (exponent < 0) {
            exponent *= -1;
        }

        for (int j = 1; j <= exponent; j++) {
            System.out.println("Value: " + value);
            value *= base;
            System.out.println("Value after pow = " + value);
        }

        System.out.println("Base " + base + ". Exponent: " + exponent + ". Result: " + value);
        assertEquals(value, ac.positiveExponentiation(base, exponent), 0);

    }

    @Test
    public void remainder() {
    }

    @Test
    public void percentage() {
    }

    @Test
    public void absoluteValueOf() {
    }
}