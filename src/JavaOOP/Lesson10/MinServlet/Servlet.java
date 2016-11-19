package JavaOOP.Lesson10.MinServlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Anatoliy on 09.11.2016.
 */
public interface Servlet {
    void execute(BufferedReader reader, PrintWriter writer) throws IOException;
}
