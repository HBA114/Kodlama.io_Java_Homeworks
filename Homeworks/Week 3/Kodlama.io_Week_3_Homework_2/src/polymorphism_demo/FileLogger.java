package polymorphism_demo;

public class FileLogger extends BaseLogger{
    public void log(String message) {
        // super.log(message);
        System.out.println("Logged to File : " + message);
    }
}
