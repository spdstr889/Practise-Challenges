import java.util.Scanner;
public class ATM {
    static double balance=10;

    static void checkBalance(){
        System.out.println("Your current account Balance is $" + balance);

    }
    static void deposit(double amount){
        balance+=amount;
        System.out.println("Your latest account balance is $ "+ balance);

    }
    static void withdraw(double amount, Scanner scanner){
        double newBalance=0;
        while ((newBalance!= balance)){
            if (balance>=amount){
            balance-=amount;
        }
        else{
            System.out.println("That action could not be completed due to insuffecient funds.");
            System.out.println("Please enter the correct amount you'd like like to withdraw or cancel");
            System.out.println("Your latest account balance is $ "+ balance);
            if (scanner.next().equals("cancel")){
            break;
            }
            amount = scanner.nextDouble();
        }
        
        newBalance=balance;
        System.out.println("Your latest account balance is $ "+ balance);
        }
        
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.println("What would you like to do today: ");
        System.out.println("1) Check your Balance");
        System.out.println("2) Make a Deposit");
        System.out.println("3) Make a Withdarawl");
        System.out.println("4) Exit");

        String choice=scanner.next();

        while(!choice.equals("4")){
             
        if(choice.equals("1")){
            checkBalance();
        }
        else if(choice.equals("2")){
            System.out.println("How much would you like to deposit: ");
            deposit(scanner.nextDouble());
        }
        else if(choice.equals("3")){
            System.out.println("How much would you like to withdraw today: ");
            withdraw(scanner.nextDouble(), scanner);
        }
        else{
            break;
        }
        System.out.println("What would you like to do next: ");
        choice=scanner.next();
        
    }
    System.out.println("See you agian!");
    scanner.close();
}
}
