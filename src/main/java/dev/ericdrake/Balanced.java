package dev.ericdrake;

public class Balanced {
    public static boolean balancedParenthesis(String evalString){
        return balancedChars(evalString, '(', ')');
    }

    public static boolean balancedCurlyBraces(String evalString){
        return balancedChars(evalString, '{', '}');
    }

    public static boolean balancedSquareBrackets(String evalString){
        return balancedChars(evalString, '[', ']');
    }

    public static boolean balancedAngleBrackets(String evalString){
        return balancedChars(evalString, '<', '>');
    }

    public static boolean balancedParenthesisAndBrackets(String evalString){
        int openingParenthesisCount = 0;
        int closingParenthesisCount = 0;
        int openingCurlyCount = 0;
        int closingCurlyCount = 0;
        int openingSquareCount = 0;
        int closingSquareCount = 0;
        int openingAngleCount = 0;
        int closingAngleCount = 0;

        for(int i = 0; i < evalString.length(); i++){
            if(evalString.charAt(i) == '('){
                openingParenthesisCount++;
            } else if(evalString.charAt(i) == ')'){
                closingParenthesisCount++;
            } else if(evalString.charAt(i) == '{'){
                openingCurlyCount++;
            } else if(evalString.charAt(i) == '}'){
                closingCurlyCount++;
            } else if(evalString.charAt(i) == '['){
                openingSquareCount++;
            } else if(evalString.charAt(i) == ']'){
                closingSquareCount++;
            } else if(evalString.charAt(i) == '<'){
                openingAngleCount++;
            } else if(evalString.charAt(i) == '>'){
                closingAngleCount++;
            }
        }
        System.out.println("New Test");
        System.out.println("Opening Parenthesis: " + openingParenthesisCount);
        System.out.println("Closing Parenthesis: " + closingParenthesisCount);
        System.out.println("Opening Curly: " + openingCurlyCount);
        System.out.println("Closing Curly: " + closingCurlyCount);
        System.out.println("Opening Square: " + openingSquareCount);
        System.out.println("Closing Square: " + closingSquareCount);
        System.out.println("Opening Angle: " + openingAngleCount);
        System.out.println("Closing Angle: " + closingAngleCount);
        System.out.println("");
        return (openingParenthesisCount == closingParenthesisCount) && (openingCurlyCount == closingCurlyCount)
                && (openingSquareCount == closingSquareCount) && (openingAngleCount == closingAngleCount);
    }

    private static boolean balancedChars(String evalString, char openingChar, char closingChar){
        int openingCount = 0;
        int closingCount = 0;
        for(int i = 0; i < evalString.length(); i++){
            if(evalString.charAt(i) == openingChar){
                openingCount++;
            } else if(evalString.charAt(i) == closingChar){
                closingCount++;
            }
        }
        if(openingCount == closingCount){
            return true;
        } else {
            return false;
        }
    }
}
