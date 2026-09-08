package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class StringUtilsTest {

    StringUtils utils = new StringUtils();


    @Test
    void testReverseNormalString() {

        assertEquals(
                "avaJ",
                utils.reverse("Java")
        );
    }


    @Test
    void testReverseEmptyString() {

        assertEquals(
                "",
                utils.reverse("")
        );
    }


    @Test
    void testReverseSingleCharacter() {

        assertEquals(
                "A",
                utils.reverse("A")
        );
    }


    @Test
    void testPalindrome() {

        assertTrue(
                utils.isPalindrome("madam")
        );
    }


    @Test
    void testPalindromeWithUppercase() {

        assertTrue(
                utils.isPalindrome("Level")
        );
    }


    @Test
    void testNotPalindrome() {

        assertFalse(
                utils.isPalindrome("Java")
        );
    }


    @Test
    void testEmptyStringPalindrome() {

        assertTrue(
                utils.isPalindrome("")
        );
    }


    @Test
    void testSingleCharacterPalindrome() {

        assertTrue(
                utils.isPalindrome("A")
        );
    }
}