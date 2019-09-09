// variety of recursion questions we saw in class

public class inClass3_28 {
    public static boolean isValid(int x, int y) {
        return x >= 0 && y > -0;
    }

    public static void methodB(int num) {
        if (num < 12) {
            methodB(num + 3);
            System.out.println(num + "  ");
        }
    }

    public static boolean somethingDifferent(boolean p, boolean q) {
        return (p || q) && !(p && q); //1st case is ok, second case is not, so it comes as true
    }

    public static void main(String[] args) {
        //System.out.println(isValid(4, 2));
        System.out.println(somethingDifferent(false, true));
    }
}
