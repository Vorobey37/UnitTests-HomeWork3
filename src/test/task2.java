import org.example.task.Number;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class task2 {

    @Test
    void testNumberInInterval(){

        Number number = new Number();
        assertTrue(number.numberInInterval(26));
        assertTrue(number.numberInInterval(50));
        assertTrue(number.numberInInterval(99));
        assertFalse(number.numberInInterval(25));
        assertFalse(number.numberInInterval(100));
        assertFalse(number.numberInInterval(-100));
        assertFalse(number.numberInInterval(200));
    }

}
