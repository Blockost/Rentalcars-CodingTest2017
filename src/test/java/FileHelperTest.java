import helpers.FileHelper;
import org.junit.Test;

import java.io.BufferedReader;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Created by blockost on 29/04/17.
 */
public class FileHelperTest {
    private BufferedReader reader;

    @Test
    public void testFileNotFound() {
        reader = FileHelper.readFile("blahblahtest.json");
        assertNull(reader);
    }

    @Test
    public void testFileFound() {
        reader = FileHelper.readFile("data/vehicles.json");
        assertNotNull(reader);
    }


}
