import com.company.Decoder;
import org.junit.Test;

import static org.junit.Assert.*;

public class DecoderTest {
    @Test
    public void test1() {
        String expected = "*CDC is the trademark of the Control Data Corporation.";
        String given = "1JKJ'pz'{ol'{yhklthyr'vm'{ol'Jvu{yvs'Kh{h'Jvywvyh{pvu5";
        assertEquals(expected, Decoder.decode(given));
    }

    @Test
    public void test2() {
        String expected = "*IBM is a trademark of the International Business Machine Corporation.";
        String given = "1PIT'pz'h'{yhklthyr'vm'{ol'Pu{lyuh{pvuhs'I|zpulzz'Thjopul'Jvywvyh{pvu5";
        assertEquals(expected, Decoder.decode(given));
    }

    @Test
    public void test3() {
        String expected = "*DEC is the trademark of the Digital Equipment Corporation.";
        String given = "1KLJ'pz'{ol'{yhklthyr'vm'{ol'Kpnp{hs'Lx|pwtlu{'Jvywvyh{pvu5";
        assertEquals(expected, Decoder.decode(given));
    }

    @Test
    public void test4() {
        String expected = "*CDC is the trademark of the Control Data Corporation.";
        String given = "1JKJ'pz'{ol'{yhklthyr'vm'{ol'Jvu{yvs'Kh{h'Jvywvyh{pvu5";
        assertEquals(expected, Decoder.decodeAlternative(given));
    }

    @Test
    public void test5() {
        String expected = "*IBM is a trademark of the International Business Machine Corporation.";
        String given = "1PIT'pz'h'{yhklthyr'vm'{ol'Pu{lyuh{pvuhs'I|zpulzz'Thjopul'Jvywvyh{pvu5";
        assertEquals(expected, Decoder.decodeAlternative(given));
    }

    @Test
    public void test6() {
        String expected = "*DEC is the trademark of the Digital Equipment Corporation.";
        String given = "1KLJ'pz'{ol'{yhklthyr'vm'{ol'Kpnp{hs'Lx|pwtlu{'Jvywvyh{pvu5";
        assertEquals(expected, Decoder.decodeAlternative(given));
    }
}