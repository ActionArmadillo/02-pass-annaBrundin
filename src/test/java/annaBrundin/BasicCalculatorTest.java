package annaBrundin;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class BasicCalculatorTest {
    BasicCalculator bc = new BasicCalculator();
    Random random = new Random();
    int MAX = 100;
    int MIN = -100;

    @Test
    public void addition(){
        double value1 = random.nextInt();
        double value2 = random.nextInt();
        double result = value1 + value2;

        assertEquals(result, bc.addition(value1, value2), 0);
    }
    @Test
    public void additionZeroValue1(){
        double value1 = 0.0;
        double value2 = random.nextInt();
        double result = value1 + value2;

        assertEquals(result, bc.addition(value1, value2), 0);
    }
    @Test
    public void additionZeroValue2(){
        double value1 = random.nextInt();
        double value2 = 0.0;
        double result = value1 + value2;

        assertEquals(result, bc.addition(value1, value2), 0);
    }
    @Test
    public void additionNegative(){
        for(int i = 0; i < 25; i++) {
            double value1 = random.nextInt(MAX - MIN) + MIN;
            double value2 = random.nextInt(MAX - MIN) + MIN;

            if (value1 > 0) {
                value1 *= -1;
            }

            double result = value1 + value2;
            System.out.println("Value#1 " + value1 + ". Value#2 " + value2 + ". Result " + result);

            assertEquals(result, bc.addition(value1, value2), 0);
        }
    }
    @Test
    public void additionPositive(){
        for(int i = 0; i < 25; i++) {
            double value1 = random.nextInt(MAX - MIN) + MIN;
            double value2 = random.nextInt(MAX - MIN) + MIN;

            if (value1 < 0) {
                value1 *= -1;
            }
            if (value2 < 0) {
                value2 *= -1;
            }

            double result = value1 + value2;
            System.out.println("Value#1 " + value1 + ". Value#2 " + value2 + ". Result " + result);

            assertEquals(result, bc.addition(value1, value2), 0);
        }
    }

    @Test
    public void subtraction(){
        for(int i = 0; i < 25; i++) {
            double value1 = random.nextInt(MAX - MIN) + MIN;
            double value2 = random.nextInt(MAX - MIN) + MIN;
            double result = value1 - value2;
            System.out.println("Value#1 " + value1 + ". Value#2 " + value2 + ". Result " + result);

            assertEquals(result, bc.subtraction(value1, value2), 0);
        }
    }
    @Test
    public void subtractionZeroValue1(){
        for(int i = 0; i < 25; i++) {
            double value1 = 0.0;
            double value2 = random.nextInt(MAX - MIN) + MIN;
            double result = value1 - value2;
            System.out.println("Value#1 " + value1 + ". Value#2 " + value2 + ". Result " + result);

            assertEquals(value2 * (-1), bc.subtraction(value1, value2), 0);
        }
    }
    @Test
    public void subtractionZeroValue2(){
        for(int i = 0; i < 25; i++) {
            double value1 = random.nextInt(MAX - MIN) + MIN;
            double value2 = 0.0;
            double result = value1 - value2;
            System.out.println("Value#1 " + value1 + ". Value#2 " + value2 + ". Result " + result);

            assertEquals(value1, bc.subtraction(value1, value2), 0);
        }
    }
    @Test
    public void subtractionNegative(){
        for(int i = 0; i < 25; i++) {
            double value1 = random.nextInt(MAX - MIN) + MIN;
            double value2 = random.nextInt(MAX - MIN) + MIN;

            if (value1 > 0) {
                value1 *= -1;
            }

            double result = value1 - value2;
            System.out.println("Value#1 " + value1 + ". Value#2 " + value2 + ". Result " + result);

            assertEquals(result, bc.subtraction(value1, value2), 0);
        }
    }
    @Test
    public void subtractionPositive(){
        for(int i = 0; i < 25; i++) {
            double value1 = random.nextInt(MAX - MIN) + MIN;
            double value2 = random.nextInt(MAX - MIN) + MIN;

            if (value1 < 0) {
                value1 *= -1;
            }
            if (value2 < 0) {
                value2 *= -1;
            }

            double result = value1 - value2;
            System.out.println("Value#1 " + value1 + ". Value#2 " + value2 + ". Result " + result);

            assertEquals(result, bc.subtraction(value1, value2), 0);
        }
    }

    @Test
    public void multiplication(){
        for (int i = 0; i < 25; i++) {
            double value1 = random.nextInt(MAX - MIN) + MIN;
            double value2 = random.nextInt(MAX - MIN) + MIN;
            double result = value1 * value2;

            System.out.println("Value#1 " + value1 + ". Value#2 " + value2 + ". Result " + result);

            assertEquals(result, bc.multiplication(value1, value2), 0);
        }
    }
    @Test
    public void multiplicationZeroValue1(){
        for(int i = 0; i < 25; i++) {
            double value1 = 0.0;
            double value2 = random.nextInt(MAX - MIN) + MIN;
            double result = value1 * value2;
            System.out.println("Value#1 " + value1 + ". Value#2 " + value2 + ". Result " + result);

            assertEquals(0, bc.multiplication(value1, value2), 0);
        }
    }
    @Test
    public void multiplicationZeroValue2(){
        for(int i = 0; i < 25; i++) {
            double value1 = random.nextInt(MAX - MIN) + MIN;
            double value2 = 0.0;
            double result = value1 * value2;
            System.out.println("Value#1 " + value1 + ". Value#2 " + value2 + ". Result " + result);

            assertEquals(0, bc.multiplication(value1, value2), 0);
        }
    }
    @Test
    public void multiplicationNegative(){
        for(int i = 0; i < 25; i++) {
            double value1 = random.nextInt(MAX - MIN) + MIN;
            double value2 = random.nextInt(MAX - MIN) + MIN;

            if (value1 > 0) {
                value1 *= -1;
            }

            double result = value1 * value2;
            System.out.println("Value#1 " + value1 + ". Value#2 " + value2 + ". Result " + result);

            assertEquals(result, bc.multiplication(value1, value2), 0);
        }
    }
    @Test
    public void multiplicationPositive(){
        for(int i = 0; i < 25; i++) {
            double value1 = random.nextInt(MAX - MIN) + MIN;
            double value2 = random.nextInt(MAX - MIN) + MIN;

            if (value1 < 0) {
                value1 *= -1;
            }
            if (value2 < 0) {
                value2 *= -1;
            }

            double result = value1 * value2;
            System.out.println("Value#1 " + value1 + ". Value#2 " + value2 + ". Result " + result);

            assertEquals(result, bc.multiplication(value1, value2), 0);
        }
    }

    @Test
    public void division(){
        for (int i = 0; i < 25; i++) {
            double value1 = random.nextInt(MAX - MIN) + MIN;
            double value2 = random.nextInt(MAX - MIN) + MIN;
            double result = value1 / value2;

            System.out.println("Value#1 " + value1 + ". Value#2 " + value2 + ". Result " + result);

            assertEquals(result, bc.division(value1, value2), 0);
        }
    }
    @Test
    public void divisionZeroValue1(){
        for(int i = 0; i < 25; i++) {
            double value1 = 0.0;
            double value2 = random.nextInt(MAX - MIN) + MIN;
            if(value2 == 0.0){
                value2 += 11.0;
            }
            double result = value1 / value2;
            System.out.println("Value#1 " + value1 + ". Value#2 " + value2 + ". Result " + result);

            assertEquals(0, bc.division(value1, value2), 0);
        }
    }
    @Test
    public void divisionZeroValue2(){
        for(int i = 0; i < 25; i++) {
            double value1 = random.nextInt(MAX - MIN) + MIN;
            if(value1 < 0){
                value1 *= -1;
            }

            double value2 = 0.0;
            double result = Double.POSITIVE_INFINITY;
            System.out.println("Value#1 " + value1 + ". Value#2 " + value2 + ". Result " + result);

            assertEquals(result, bc.division(value1, value2), 0);

        }
    }
    @Test
    public void divisionNegative(){
        for(int i = 0; i < 25; i++) {
            double value1 = random.nextInt(MAX - MIN) + MIN;
            double value2 = random.nextInt(MAX - MIN) + MIN;

            if (value1 > 0) {
                value1 *= -1;
            }

            double result = value1 / value2;
            System.out.println("Value#1 " + value1 + ". Value#2 " + value2 + ". Result " + result);

            assertEquals(result, bc.division(value1, value2), 0);
        }
    }
    @Test
    public void divisionPositive(){
        for(int i = 0; i < 25; i++) {
            double value1 = random.nextInt(MAX - MIN) + MIN;
            double value2 = random.nextInt(MAX - MIN) + MIN;

            if (value1 < 0) {
                value1 *= -1;
            }
            if (value2 < 0) {
                value2 *= -1;
            }

            double result = value1 / value2;
            System.out.println("Value#1 " + value1 + ". Value#2 " + value2 + ". Result " + result);

            assertEquals(result, bc.division(value1, value2), 0);
        }
    }

}