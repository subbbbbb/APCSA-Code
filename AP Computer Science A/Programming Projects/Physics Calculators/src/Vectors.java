import java.util.Scanner;

public class Vectors {

    public static void main(String[] args) {
        //for 90 degree
        Scanner bor = new Scanner(System.in);
        System.out.println("Is your problem at an angle? 'yes' or 'no'");
        String angleYesOrNo = bor.nextLine();
        if (angleYesOrNo.equals("no")) {
            System.out.println("What is your a value?");
            double a = bor.nextDouble();
            System.out.println("What is your b value?");
            double b = bor.nextDouble();
            System.out.println("Displacement: " + Math.sqrt((a * a) + (b * b)));

        }
        else {
            System.out.println("What is your a value?");
            double a = bor.nextDouble();
            System.out.println("What is your b value?");
            double b = bor.nextDouble();
            System.out.println("What is your angle?");
            double angle = bor.nextDouble();
            System.out.println("hi");

        }
    }
}
