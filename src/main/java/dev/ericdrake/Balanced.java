package dev.ericdrake;

public class Balanced {
    public static boolean balancedParenthesis(String evalString){
        return balancedChars(evalString, '(', ')');
    }

    public static boolean balancedCurlyBraces(String evalString){
        return balancedChars(evalString, '{', '}');
    }

    public static boolean balanacedSquareBrackets(String evalString){
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
