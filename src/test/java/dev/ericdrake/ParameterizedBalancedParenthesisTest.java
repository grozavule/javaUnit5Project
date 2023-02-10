package dev.ericdrake;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParameterizedBalancedParenthesisTest {
    private String input;
    private Boolean expectedResult;

    public ParameterizedBalancedParenthesisTest(String input, Boolean expectedResult){
        this.input = input;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> createTestParameters() {
        //HashMap<String, Boolean> parameters = new HashMap<>();
        Object[][] parameters = new Object[][]{
                {"(((fasdfk)sdfaj)AS@#8)*(ssd)))))", false},
                {"(())90121231()90fajslkj(())", true},
                {"", true},
                {"dsfasdfjlaksjdflajsdlfkajsdlfj", true},
                {"{{asfasda}}dfasfd{{}", false},
                {"{balanced}", true},
                {"no-curly-braces(())()[][][][][]", true},
                {"[[unbalanced]", false},
                {"[balanced]", true},
                {"no-square-brackets{{}})(()}}{{<><>", true},
                {"<<unbalanced>", false},
                {"<balanced>", true},
                {"no-angle-brackets{}}{)(()(){{}}]]]][[[[", true}
        };
        return Arrays.asList(parameters);
    }

    @Test
    public void testBalancedParenthesisAndBrackets(){
        assertEquals(expectedResult, Balanced.balancedParenthesisAndBrackets(input));
    }
}
