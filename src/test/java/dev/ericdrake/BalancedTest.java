package dev.ericdrake;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedTest {
    @Test
    public void testBalancedParenthesis_returnsFalseWhenProvidedAnUnbalancedString(){
        String evalString = "(((fasdfk)sdfaj)AS@#8)*(ssd)))))";
        assertFalse(Balanced.balancedParenthesis(evalString));
    }

    @Test
    public void testBalancedParenthesis_returnsTrueWhenProvidedBalancedString(){
        String evalString = "(())90121231()90fajslkj(())";
        assertTrue(Balanced.balancedParenthesis(evalString));
    }

    @Test
    public void testBalancedParenthesis_returnsTrueWhenProvidedAnEmptyString(){
        String evalString = "";
        assertTrue(Balanced.balancedParenthesis(evalString));
    }

    @Test
    public void testBalancedParenthesis_returnsTrueWhenProvidedAStringWithoutParenthesis(){
        String evalString = "dsfasdfjlaksjdflajsdlfkajsdlfj";
        assertTrue(Balanced.balancedParenthesis(evalString));
    }

    @Test
    public void testBalancedCurlyBraces_returnsFalseWhenProvidedAnUnbalancedString(){
        String evalString = "{{asfasda}}dfasfd{{}";
        assertFalse(Balanced.balancedCurlyBraces(evalString));
    }

    @Test
    public void testBalancedCurlyBraces_returnsTrueWhenProvidedBalancedString(){
        String evalString = "{balanced}";
        assertTrue(Balanced.balancedCurlyBraces(evalString));
    }

    @Test
    public void testBalancedCurlyBraces_returnsTrueWhenProvidedAnEmptyString(){
        String evalString = "";
        assertTrue(Balanced.balancedCurlyBraces(evalString));
    }

    @Test
    public void testBalancedCurlyBraces_returnsTrueWhenProvidedAStringWithoutCurlyBraces(){
        String evalString = "no-curly-braces(())()(([][][][][]";
        assertTrue(Balanced.balancedCurlyBraces(evalString));
    }

    @Test
    public void testBalancedSquareBracket_returnsFalseWhenProvidedAnUnbalancedString(){
        String evalString = "[[unbalanced]";
        assertFalse(Balanced.balancedSquareBrackets(evalString));
    }

    @Test
    public void testBalancedSquareBrackets_returnsTrueWhenProvidedBalancedString(){
        String evalString = "[balanced]";
        assertTrue(Balanced.balancedSquareBrackets(evalString));
    }

    @Test
    public void testBalancedSquareBrackets_returnsTrueWhenProvidedAnEmptyString(){
        String evalString = "";
        assertTrue(Balanced.balancedSquareBrackets(evalString));
    }

    @Test
    public void testBalancedSquareBrackets_returnsTrueWhenProvidedAStringWithoutSquareBrackets(){
        String evalString = "no-square-brackets{{}{)(()(}}<><>";
        assertTrue(Balanced.balancedSquareBrackets(evalString));
    }

    @Test
    public void testBalancedAngleBrackets_returnsFalseWhenProvidedAnUnbalancedString(){
        String evalString = "<<unbalanced>";
        assertFalse(Balanced.balancedAngleBrackets(evalString));
    }

    @Test
    public void testBalancedAngleBrackets_returnsTrueWhenProvidedBalancedString(){
        String evalString = "<balanced>";
        assertTrue(Balanced.balancedAngleBrackets(evalString));
    }

    @Test
    public void testBalancedAngleBrackets_returnsTrueWhenProvidedAnEmptyString(){
        String evalString = "";
        assertTrue(Balanced.balancedAngleBrackets(evalString));
    }

    @Test
    public void testBalancedAngleBrackets_returnsTrueWhenProvidedAStringWithoutSquareBrackets(){
        String evalString = "no-angle-brackets{{}{)(()(}}]]]]";
        assertTrue(Balanced.balancedAngleBrackets(evalString));
    }
}
