package polymorphism_demo;

public class MailLogger extends BaseLogger {
    public void log(String message) {
        // super.log(message);
        System.out.println("Logged with Mail : " + message);
    }
}
