import com.company.Main;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromTest {

    @Test
    public void test1() {
        assertNotNull(Main.isPalindrom("KAJAK"));
        assertTrue(Main.isPalindrom("KAJAK"));
    }

    @Test
    public void test2() {
        assertNotNull(Main.isPalindrom("KAJAKI"));
        assertFalse(Main.isPalindrom("KAJAKI"));
    }

    @Test
    public void test3() {
        assertNotNull(Main.isPalindrom("RADAR"));
        assertTrue(Main.isPalindrom("RADAR"));
    }

    @Test
    public void test4() {
        assertNotNull(Main.isPalindrom("ANNA"));
        assertTrue(Main.isPalindrom("ANNA"));
    }

    @Test
    public void test5() {
        assertNotNull(Main.isPalindrom("OKO"));
        assertTrue(Main.isPalindrom("OKO"));
    }

    @Test
    public void test6() {
        assertNotNull(Main.isPalindrom("SPAGHETTI"));
        assertFalse(Main.isPalindrom("SPAGHETTI"));
    }

    @Test
    public void test7() {
        assertNotNull(Main.isPalindrom("KAJOK"));
        assertFalse(Main.isPalindrom("KAJOK"));
    }
}
