import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        String s1 = "hi";
        String s2 = ("hi");

        System.out.println(s1 == (s2));

        Thread.sleep(1000);
        System.out.println(123);

        for (int i = 10; i >= 0; i--) {
            Thread.sleep(200);
            System.out.println("До старта: " + i);
        }

        for (int i = 0; true; i++) {
            System.out.println(i);
        }
    }
}