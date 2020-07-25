
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ler.next();
        System.out.println("INICIO DA THREAD MAIN ***");
        Thread t1 = new Thread(new MinhaRunnable(), "thread 1");
        Thread t2 = new Thread(new MinhaRunnable(), "\t\tthread 2");
        t1.start();
        t2.start();
    }
}
