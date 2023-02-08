package dev.ericdrake;

public class Main {
    public static void main(String[] args) {
        int missingNumber = MissingNumber.missingNumber(new int[]{2, 1, 4, 3, 6, 5, 7, 10, 9});
        System.out.println(missingNumber);
    }
}