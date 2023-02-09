package dev.ericdrake;

public class Main {
    public static void main(String[] args) {
        int missingNumber = MissingNumber.missingNumber(new int[]{2, 1, 4, 3, 6, 5, 7, 10, 9});
        System.out.println(missingNumber);

        String evalString = "((this is some text) more text)(even more text))";
        System.out.println(Balanced.balancedParenthesis(evalString));

        String evalString2 = "<a<b>c>d(e(f)g)h{i{j}k}l[m[n]o]p";
        System.out.println(Balanced.balancedParenthesisAndBrackets(evalString2));

        String[] evalArray = new String[]{"what", "are", "you", "doing"};
        System.out.println(Recursion.recursiveSearch("booger", evalArray, 0));
    }
}