import com.company.Main;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


public class PrimeTest {

    @Test
    public void test1() {
        List<Integer> resultList = Main.getPrimes(1, 10);

        assertNotNull(resultList);
//        assertEquals(5, resultList.size());
//        assertEquals(1, resultList.get(0).intValue());
//        assertEquals(2, resultList.get(1).intValue());
//        assertEquals(3, resultList.get(2).intValue());
//        assertEquals(5, resultList.get(3).intValue());
//        assertEquals(7, resultList.get(4).intValue());

        //alternatywa dla tego co powyżej
        List<Integer> expectedList = Arrays.asList(1, 3, 5, 7);
        assertEquals(expectedList, resultList);
    }

    @Test
    public void test2() {
        List<Integer> expectedList = Arrays.asList(11,13,17,19);
        assertEquals(expectedList, Main.getPrimes(10,20));
    }
    @Test
    public void test3() {
        List<Integer> expectedList = Arrays.asList(23,29);
        assertEquals(expectedList, Main.getPrimes(20,30));
    }
    @Test
    public void test4() {
        List<Integer> expectedList = Arrays.asList(31,37);
        assertEquals(expectedList, Main.getPrimes(30,40));
    }
    @Test
    public void test5() {
        List<Integer> expectedList = Arrays.asList(41,43,47);
        assertEquals(expectedList, Main.getPrimes(40,50));
    }
}
