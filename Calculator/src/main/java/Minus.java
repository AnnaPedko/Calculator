

public class Minus implements Actions {



    @Override
    public double doIt(double a,double b) {
        return a-b;
    }

    @Override
    public String getSign() {
        return "-";
    }

    @Override
    public String getInfo() {
        return "operation \"-\" displays the difference between the two numbers ";
    }
}
