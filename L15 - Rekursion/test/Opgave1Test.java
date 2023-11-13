import opgaver.Opgave1.Calculator;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
public class Opgave1Test {
    @org.junit.jupiter.api.Test
    void summering_test_even() {

        //ARRANGE
        Calculator calculator = new Calculator();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        //ACT
        int actualSum = calculator.sum(numbers);
        int expectedSum = 10;

        //ASSERT
        assertEquals(10, actualSum);
    }
    @org.junit.jupiter.api.Test
    void summering_test_uneven() {
        Calculator calculator = new Calculator();
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        int actualSum = calculator.sum(numbers);
        int expectedSum = 6;

        assertEquals(6, actualSum);
    }
}
