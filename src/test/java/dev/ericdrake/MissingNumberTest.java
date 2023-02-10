package dev.ericdrake;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MissingNumberTest {
    @Test
    public void returnsMissingNumber(){
        long[] numberArray = new long[]{5, 10, 8, 7, 1, 3, 4, 9, 2};
        long missingNumber = MissingNumber.missingNumber(numberArray);
        assertEquals(6, missingNumber);
    }

    @Test
    public void returnsNoMissingNumber(){
        long[] numberArray = new long[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        long missingNumber = MissingNumber.missingNumber(numberArray);
        assertEquals(0, missingNumber);
    }

    @Test(timeout = 100)
    public void testMissingNumberPerformance(){
        long[] numberArray = new long[9999999];
        for(int i = 0; i < numberArray.length;i++){
            if((i + 1) == 654321){
                continue;
            } else {
                numberArray[i] = i + 1;
            }
        }
        long missingNumber = MissingNumber.missingNumber(numberArray);
        assertEquals(654321, missingNumber);
    }
}
