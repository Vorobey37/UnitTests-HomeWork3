import org.example.task.Number;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class task1 {

@Test
    void testOddNumberReturnTrue(){

        Number number = new Number();
        assertTrue(number.evenOddNumber(-2));
        assertTrue(number.evenOddNumber(0));
        assertTrue(number.evenOddNumber(2));
        assertFalse(number.evenOddNumber(-1));
        assertFalse(number.evenOddNumber(1));
        assertTrue(number.evenOddNumber(98));
        assertFalse(number.evenOddNumber(-99));

    }


}
