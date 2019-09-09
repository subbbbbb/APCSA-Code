import java.util.Scanner;
public class SHM_Springs {
    public static void main(String[] args) {
        //for springs
        Scanner sub = new Scanner(System.in);
        System.out.println("What is your k value?");
        double kVal = sub.nextDouble();
        System.out.println("What is your mass?");
        double mass = sub.nextDouble();
        System.out.println((2*3.14159265*(kVal/mass)));

    }
}