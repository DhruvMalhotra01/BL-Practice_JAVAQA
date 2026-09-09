package StringUtils;

import java.beans.Transient;

public class TestCheck {
    @Test
    public void check(String s){
        check c = new check();
        boolean r = c.isPalindrome(s);
        assertEqual(true,r);
    }
    
}
