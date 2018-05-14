import com.company.Main;
import org.junit.Test;
import static org.junit.Assert.*;

public class Algorithm1Test {

    @Test
    public void test1(){
        assertEquals(13, Main.algorithm1(17));
    }

    @Test
    public void test2(){
        assertEquals(17, Main.algorithm1(7));
    }

    @Test
    public void test3(){
        assertEquals(19, Main.algorithm1(30));
    }
    @Test
    public void test4(){
        assertEquals(21, Main.algorithm1(19));
    }

    @Test
    public void test5(){
        assertEquals(8, Main.algorithm1(21));
    }
}
