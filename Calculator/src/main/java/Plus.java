/**



* Created by User on 14.03.2015.
        */
public class Plus implements Actions {
    public double doIt(double a,double b) {
        return a+b;
    }

    public String getSign() {


        return "+";
    }

    @Override
    public String getInfo() {
        return "operation \"+\" displays the sum of two numbers";
    }
}



