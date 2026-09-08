import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    private StringUtils utils = new StringUtils();


    @Test
    void testReverse() {

        String result = utils.reverse("Java");

        assertEquals("avaJ", result);
    }


    @Test
    void testPalindromeTrue() {

        assertTrue(utils.isPalindrome("madam"));
    }


    @Test
    void testPalindromeFalse() {

        assertFalse(utils.isPalindrome("hello"));
    }


    @Test
    void testAnotherPalindrome() {

        assertTrue(utils.isPalindrome("Level"));
    }
}