package JobAppTracker;
import java.util.Scanner;
import java.util.ArrayList;

public class JobAppTracker {
    static ArrayList<Applications> applications=new ArrayList<>();
    public static void main(String[] args){
        Scanner scanner=new Scanner (System.in);
        int option=0;
        Applications app =new Applications();
        while (option !=5){

        System.out.println("Menu: ");
        System.out.println("1) Add Application");
        System.out.println("2) Search - by company name or position");
        System.out.println("3) View All Applications");
        System.out.println("4) Update Status");
        System.out.println("5) Exit");
        option=scanner.nextInt();

       }
       
    }

}
