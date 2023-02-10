package dev.ericdrake;

import java.util.Arrays;

public class MissingNumber {
    public static long missingNumber(long[] numbers){
        Arrays.sort(numbers);
        long previousNumber = numbers[0];
        //System.out.println(Arrays.toString(numbers));
        for(int i = 1; i < numbers.length; i++){
            //System.out.println("Number: " + numbers[i]);
            //System.out.println("Previous Number: " + previousNumber);
            if(numbers[i] != previousNumber + 1){
                return previousNumber + 1;
            }
            previousNumber = numbers[i];
        }
        return 0;
    }
}
