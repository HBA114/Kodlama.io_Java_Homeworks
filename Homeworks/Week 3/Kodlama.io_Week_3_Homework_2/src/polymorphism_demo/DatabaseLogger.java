package polymorphism_demo;

public class DatabaseLogger extends BaseLogger {
    public void log(String message) {
        // super.log(message);
        System.out.println("Logged to Database : " + message);
    }
}
