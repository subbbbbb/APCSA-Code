import java.util.Scanner;

public class Momentum {
    public static void main(String[] args) {
        //for springs
        Scanner mom = new Scanner(System.in);
        System.out.println("What is your mass value?");
        double mass = mom.nextDouble();
        System.out.println("What is your velocity?");
        double v = mom.nextDouble();
        System.out.println(mass * v);
    }
}
