import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathOperationsTest {
    @Test
    void shouldAddingTwoValues() {
        //given
        double value1 = 2.5;
        double value2 = 2.2;
        //when
        double add = MathOperations.add(value1, value2);
        //then
        Assertions.assertEquals(4.7, add);
    }

    @Test
    void shouldSubstractionTwoValues() {
        //given
        double value1 = 5.5;
        double value2 = 2.1;
        //when
        double substract = MathOperations.substract(value1, value2);
        //then
        Assertions.assertEquals(3.4, substract);
    }

    @Test
    void shouldMultiplicationTwoValues() {
        //given
        double value1 = 3;
        double value2 = 2;
        //when
        double multiply = MathOperations.multiply(value1, value2);
        //then
        Assertions.assertEquals(6, multiply);
    }

    @Test
    void shouldDivisionTwoValues() {
        //given
        double value1 = 10;
        double value2 = 5;
        //when
        double divide = MathOperations.divide(value1, value2);
        //then
        Assertions.assertEquals(2, divide);
    }

}