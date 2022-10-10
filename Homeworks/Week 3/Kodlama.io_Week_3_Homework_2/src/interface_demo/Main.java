package interface_demo;

public class Main {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.eat();
        worker.work();
        worker.pay();

        OutsourceWorker outsourceWorker = new OutsourceWorker();
        outsourceWorker.work();

        Robot robot = new Robot();
        robot.work();
        robot.maintenance();
    }
}
