import java.util.Scanner;

public class SimpleImperfectCalculator {
    public static void main (String[] args) {
        try (Scanner scanner = new Scanner (System.in)) {
            System.out.println("Pick a number");

            double num = scanner.nextDouble();
            System.out.println("Pick another number");

            double num2 = scanner.nextDouble();
            System.out.println("Pick an operation between + - * / ");
            String opt=scanner.next();

            double calculation=0;
            if(opt.equals("+")){
                calculation=(num+num2);
                System.out.println(calculation);
            }
            else if(opt.equals("-1")){
                calculation=(num-num2);
                System.out.println(calculation);
            }
             else if(opt.equals("*")){
                calculation=(num * num2);
                System.out.println(calculation);
            }
            else{
                 calculation=(num / num2);
                System.out.println(calculation);
            }
        }
    }
}