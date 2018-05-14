import com.company.Frequency;
import org.junit.Test;
import static org.junit.Assert.*;

public class FrequencyTest {
    @Test
    public void test1() {
        String given = "When riding your bicycle backwards down a one-way street, if the";
        String expected = "e 6";
        assertEquals(expected, Frequency.getMaxFrequencies(given));
    }
    @Test
    public void test2() {
        String given = "wheel falls of a canoe, how many ball bearings does it take to fill";
        String expected = "al 7";
        assertEquals(expected, Frequency.getMaxFrequencies(given));
    }
    @Test
    public void test3() {
        String given = "up a water buffalo?";
        String expected = "a 3";
        assertEquals(expected, Frequency.getMaxFrequencies(given));
    }
    @Test
    public void test4() {
        String given = "Hello Howard.";
        String expected = "Hlo 2";
        assertEquals(expected, Frequency.getMaxFrequencies(given));
    }
}
