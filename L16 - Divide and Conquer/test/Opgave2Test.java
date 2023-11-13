import opgaver.Opgave2.Counter;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Opgave2Test {
    @Test
    void count_zero_1() {
        //ARRANGE
        List<Integer> numbers = new ArrayList<>(List.of(0, 2, 9, 0, 10, 3, 5));

        //ACT
        int actualCount = Counter.count(numbers);
        int expectedCount = 2;

        //ASSERT
        assertEquals(2, actualCount);

    }
}
