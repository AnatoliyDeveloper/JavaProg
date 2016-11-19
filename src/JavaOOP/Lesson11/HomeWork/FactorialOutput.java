package JavaOOP.Lesson11.HomeWork;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.math.BigInteger;
import java.nio.charset.Charset;

/**
 * Created by Anatoliy on 11.11.2016.
 */
public class FactorialOutput {

    private final int fileName;

    public FactorialOutput(int fileName) {
        this.fileName = fileName;
    }

    public void outputFactorial(BigInteger factorial) {
        Writer writer = null;
        try {
            writer = new OutputStreamWriter(new FileOutputStream("files/factorial/factorial_" + fileName + ".txt"),
                    Charset.defaultCharset());
            writer.write(String.valueOf(factorial));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
