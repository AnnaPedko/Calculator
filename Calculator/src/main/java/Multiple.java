/**
 * Created by Анютка on 15.03.2015.
 */
public class Multiple implements Actions
{
    @java.lang.Override
    public double doIt(double a, double b) {
        return a*b;
    }

    @java.lang.Override
    public String getSign() {
        return "*";
    }

    @Override
    public String getInfo() {
        return "operation \"*\" displays the product of two numbers";
}
}
