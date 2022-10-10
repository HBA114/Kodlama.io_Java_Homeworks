package polymorphism_demo;

public class Main {
    public static void main(String[] args) {
        BaseLogger[] loggers = new BaseLogger[] { new DatabaseLogger(), new FileLogger(), new MailLogger(), new ConsoleLogger() };

        for (BaseLogger logger : loggers) {
            logger.log("LogMessage");
        }
        System.out.println("");
        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}
