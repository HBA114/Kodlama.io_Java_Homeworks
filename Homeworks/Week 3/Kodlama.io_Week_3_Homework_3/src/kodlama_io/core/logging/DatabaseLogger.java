package kodlama_io.core.logging;

public class DatabaseLogger implements ILogger {

    @Override
    public void log(String message) {
        System.out.println("Logged to Database : " + message);
    }
    
}
