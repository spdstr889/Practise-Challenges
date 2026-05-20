import java.util.Scanner; 
import java.util.ArrayList;
public class ExpenseTracker {
    //This is a global variable
    static double balance=0;
    static String [] expenseCategoriesNames={"[1] Grocerries", "[2] Rent", "[3] Subscriptions", "[4] Shopping", "[5] Bills", "[6] Others", "[7] Exit"};
    static double[] categoryTotals= new double[6];

    //This is the amount to be set by the user
    static void  cal(int option, String inputExpenseNames, ArrayList<String>expenseNames, double expenseAmount, ArrayList<Double>expenseAmountList){
        
            if (option==1){
                if (expenseAmount<=balance){
                    balance-=expenseAmount;
                    categoryTotals[0]+=expenseAmount; 
                }
                else{
                    System.out.println("Not enough funds remainng!");
                }              
            }

            else if (option==2){
                if (expenseAmount<=balance){
                    balance-=expenseAmount;
                    categoryTotals[1]+=expenseAmount; 
                }
                else{
                    System.out.println("Not enough funds remainng!");
                }
            }

            else if (option==3){
                if (expenseAmount<=balance){
                    balance-=expenseAmount;
                    categoryTotals[2]+=expenseAmount; 
                }
                else{
                    System.out.println("Not enough funds remainng!");
                }              
            }

            else if (option==4){
                if (expenseAmount<=balance){
                    balance-=expenseAmount;
                    categoryTotals[3]+=expenseAmount; 
                }
                else{
                    System.out.println("Not enough funds remainng!");
                }             
            }

            else if (option==5){
                if (expenseAmount<=balance){
                    balance-=expenseAmount;
                    categoryTotals[4]+=expenseAmount; 
                }
                else{
                    System.out.println("Not enough funds remainng!");
                } 
            }

            else if (option==6){
                if (expenseAmount<=balance){
                    balance-=expenseAmount;
                    categoryTotals[5]+=expenseAmount; 
                }
                else{
                    System.out.println("Not enough funds remainng!");
                }
            }
             
            expenseNames.add(inputExpenseNames);
            expenseAmountList.add(expenseAmount);
             
    }
    /* This prints stuff */
    static void printExpenses(int option, ArrayList<String> expenseNames, ArrayList<Double>expenseAmountList){
        for (int i=0; i<expenseNames.size(); i++){
            System.out.println(expenseNames.get(i)+": "+expenseAmountList.get(i));
        }
        System.out.println("The remaining balance is: " + balance);
    }
    
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter you initial budget: ");
        balance=scanner.nextDouble();
        int option=0;
        ArrayList<String> expenseNames=new ArrayList<>();
        String inputExpenseNames="";
        double expenseAmount=0;
         ArrayList<Double> expenseAmmounList=new ArrayList<>();

    
       while (option!=7){
        
        System.out.println("Please select a category number: ");
        for (int i=0; i<7; i++){
            System.out.println(expenseCategoriesNames[i]);
        }
        
        option=scanner.nextInt();

        if (option==7){
            System.out.println("Goodbye!");
            break;
        }

        //This is for prompting expense names and strong them
        System.out.println("Please write the name of the expense: ");
        inputExpenseNames=scanner.next();

        //This is for prompting expense amounts and strong them
         System.out.println("Please enter the amount for the expense: ");
        expenseAmount=scanner.nextDouble();  
        
        System.out.println();
        //This is for prompting Category names and strong them
        cal(option, inputExpenseNames, expenseNames, expenseAmount, expenseAmmounList);
        System.out.println();
        printExpenses(option, expenseNames, expenseAmmounList);

        System.out.println();
        System.out.println("Do you wanna add another expense?");

       }
       scanner.close();
    }
}
