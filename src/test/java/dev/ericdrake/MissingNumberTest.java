package dev.ericdrake;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MissingNumberTest {
    @Test
    public void returnsMissingNumber(){
        int[] numberArray = new int[]{5, 10, 8, 7, 1, 3, 4, 9, 2};
        int missingNumber = MissingNumber.missingNumber(numberArray);
        assertEquals(6, missingNumber);
    }

    @Test
    public void returnsNoMissingNumber(){
        int[] numberArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int missingNumber = MissingNumber.missingNumber(numberArray);
        assertEquals(0, missingNumber);
    }
}
