
import java.util.Scanner;
/**
 * Created by User on 14.03.2015.
 */
public class Main {

static public void main(String[]args){
        Calculator calc = new Calculator(new Actions[]{ new Plus(), new Minus(),new Divide(),new Multiple()});
        String sign="";
        Scanner in = new Scanner(System.in);
        while(!(sign.equals("exit"))){

         System.out.println("Input sign if you want do operation or \"help\" or \"exit\""+"\n");
         try {
             sign = in.next();
             if (sign.equals("help")) {
                 System.out.println(calc.help());}
             else if (sign.equals("exit")) {
                     System.out.println("You want exit");
                     break;
                 }
             else {
                 System.out.println("Input first number");
                 Double first = Double.parseDouble(in.next());
                 System.out.println("Input second number");
                 Double second = Double.parseDouble(in.next());
                 System.out.println(calc.getResult(sign, first, second));}

         }
                  catch( NumberFormatException e ){System.out.println("Date is incorrect. Please try again!");}
                  catch( CheckSignException e){System.out.println("Sign is incorrect,please try gain!");}
    }

}}



