import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

public class Testnow6 {
    @Test
    public void test_JUnit() {
        System.out.println("This is the testcase in this class");
        String str1="Not to match";
        assertEquals("This is the testcase in this class", str1);
    }
}