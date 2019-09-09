import java.util.Scanner;

public class SHM_Pendulums {
    public static void main(String[] args) {
        //for pendulums
        Scanner hi = new Scanner(System.in);
        System.out.println("What is your L value?");
        double lVal = hi.nextDouble();

        System.out.println((2 * 3.14159265 * (lVal / 9.8)));
    }
}
