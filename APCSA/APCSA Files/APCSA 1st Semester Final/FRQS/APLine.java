package APCSAFinal.FRQS;
public class APLine {
    private double a;
    private double b;
    private double c;
    public APLine(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getSlope(){
        double y = -b/2*a;
        return y;
    }

    public boolean isOnLine(int x, int y){
        if(a*x + b*y + c == y)
            return true;
        return false;
    }
}