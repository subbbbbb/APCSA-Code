package FinalProject;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class JavaSubset {
    public static void main(String[] args) {
        /* Multi Line
        Comment */
        // declaring variables
        int a;
        double b;
        boolean c;

        // initializing variables
        a = 4;
        b = 5.5;
        c = false;

        // assignment operator
        double x = 5.5;
        // also + , - , / , % , *
        x+=2; // is x = x + 2; -- this is an increment operator, oppsite is decrement operator

        // printing
        System.out.println("Hello");
        System.out.print("Hello - One line");

        // escape sequences
        System.out.println("\n \" "); // '\' is the escape character, the whole thing is an escape sequence
        System.out.println("adf\naaasdf");   
        System.out.println("\\"); // the first '\' is the escape character
        
        // relational operators < > <= >= == !
        System.out.println(4<5);
        System.out.println(4!=4);

        // logical operators ! && ||
        boolean ya = true;
        boolean ay = false;
        System.out.println(!ya); // negates the value to the opposite
        System.out.println(ya && ay); // both of them have to be true
        System.out.println(ya || ay); // one of them has to be true - short circuiting
        System.out.println(ya || ay && ya); // PEMDAS is left to right, System.out.println(ya || (ay && ya));
        
        // casting
        int num = (int)5.5; // just hacks off the decimal stuff
        double low = (double)5/6;
        System.out.println(low);

        // Strings
        String s = "hello";
        String s1 = "bye";
        String end = s + s1; // concatenation with + being the concat symbol
        end += "farewell";
        System.out.println(end);

        // arrays
        int[] arry = new int[10];
        arry[0] = 5;
        System.out.println(arry[0]); // this returns the specified value
        System.out.println(arry.length);
            // or make it easier
        int[] arr = {4,5,1,2,3,5,5};
        System.out.println(arr.length);

        // 2d arrays
        int[][] twoD = new int[4][5]; // [rows][columns]
        /*
            0 0 0 0 0
            0 0 0 0 0
            0 0 0 0 0
            0 0 0 0 0
        */
        int[][] twoDD = {{4,3,1},{5,4,6},{1,2,3}};
        System.out.println(twoD.length); // this prints out the number of rows (left right)
        System.out.println(twoD[0].length); // this prints out the number of columns (up down)

        // arraylists
        List l = new ArrayList();
        l.add("s");
        l.add("e");
        l.add("x");
        System.out.println(l.size());
        l.remove("e");
        l.set(0,"n");
        System.out.println(l);
        List<Integer> arrL = new ArrayList<Integer>(); // an arraylist is-a list, but a list isn't necessarily an arraylist

        // math class
        System.out.println(Math.max(4,78));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.abs(-29));
        System.out.println(Math.PI);

        // control statements
        boolean xx = true, yy = false;
        if(xx){
            System.out.println("if it is true, then this gets printed out");
        }
        

    }
}