import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by blockost on 29/04/17.
 */
public class SIPPHelperTest {

    @Test
    public void testSIPP() {
        assertEquals("Special", SIPPHelper.toString('X', 0));
        assertEquals("SUV", SIPPHelper.toString('F', 1));
    }
}
