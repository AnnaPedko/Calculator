public class Calculator

{
    Actions[] act = new Actions[4];

    Calculator(Actions[] act) {
        this.act = act;

    }


    public double getResult(String sign, double a, double b)throws CheckSignException {
        for (Actions anAct : act) {
            if (sign.equals(anAct.getSign()))
                return anAct.doIt(a, b);
            }
        throw new CheckSignException("Enter valid date");
        }

    public String help ()
    {
        String info="";
        for (Actions el:act){
        info+=el.getInfo()+"\n";}
        return info;
    }
}
