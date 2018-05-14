/*Sample Input
1 10
100 200
201 210
900 1000
Sample Output
1 10 20
100 200 125
201 210 89
900 1000 174
*/

import com.company.Main;
import org.junit.Test;
import static org.junit.Assert.*;

public class Algorithm2Test {

    @Test
    public void test1() {
        assertEquals(20, Main.algorithm2(1,10));
    }

    @Test
    public void test2() {
        assertEquals(125, Main.algorithm2(100,200));
    }

    @Test
    public void test3() {
        assertEquals(89, Main.algorithm2(201,210));
    }

    @Test
    public void test4() {
        assertEquals(174, Main.algorithm2(900,1000));
    }

    @Test
    public void test5() {
        assertEquals(16, Main.algorithm2(22,22));
    }

    //wykrywa czy w teście jest blad
    @Test
    public void test6() {
        assertEquals(0, Main.algorithm2(200,100));
    }
}
