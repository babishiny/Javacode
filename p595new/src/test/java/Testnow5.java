import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

public class Testnow5 {
    @Test
    public void test_JUnit() {
        System.out.println("This is the updated test case");
        String str1="This is the testcase in this class";
        assertEquals("This is the updated test case", str1);
    }
}