import java.io.*;

/**
 * Created by blockost on 27/04/17.
 */
public class FileHelper {

    public static BufferedReader readFile(String filepath) {
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new InputStreamReader(
                new FileInputStream(new File(filepath)), "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            System.err.format("Cannot read file \n");
        } catch (FileNotFoundException e) {
            System.err.format("File '%s' not found \n", filepath);
        }

        return reader;
    }
}
