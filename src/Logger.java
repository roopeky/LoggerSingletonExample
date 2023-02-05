import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Logger {
    private static Logger instance;
    private PrintWriter writer;

    // Singleton konstruktori
    private Logger() {}

    public static synchronized Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // Setataan tiedosto
    public void setFile(String filename) throws FileNotFoundException {
        writer = new PrintWriter(filename);
    }

    // Loggataan/printataan tiedosto
    public void log(String message) {
        writer.println(message);
    }

    // Suljetaan tiedosto
    public void close() {
        writer.close();
    }
}