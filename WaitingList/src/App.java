import com.nhnacademy.java.waitinglist.*;

public class App {
    public static void main(String[] args) {
        WaitingList list = new WaitingList();
        CustomerFactory factory = new CustomerFactory(list);

        Desk desk1 = new Desk("Desk 1: ", 2000, list);
        Desk desk2 = new Desk("Desk 2: ", 2000, list);

        Thread factoryThread = new Thread(factory);
        Thread thread1 = new Thread(desk1);
        Thread thread2 = new Thread(desk2);

        thread1.start();
        factoryThread.start();
        thread2.start();
    }
}
