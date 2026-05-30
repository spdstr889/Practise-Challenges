import java.util.Scanner;
import java.util.ArrayList;

public class ExpenseTracker {
    // This is a global variable
    static double balance = 0;
    static double total = 0;
    static String[] expenseCategoriesNames = { "1) Grocerries", "2) Rent", "3) Subscriptions", "4) Shopping",
            "5) Bills", "6) Others", "7) Return to Main Menu" };
    static double[] categoryTotals = new double[7];

    // This is the amount to be set by the user
    static void cal(int option, String inputExpenseNames, ArrayList<String> expenseNames, double expenseAmount,
            ArrayList<Double> expenseAmountList) {
        // Logic for finding the leftover balance and checking if their's sufficient
        // funds available or not
        if (expenseAmount <= balance) {
            balance -= expenseAmount;
            categoryTotals[option - 1] += expenseAmount;
        } else {
            System.out.println("Not enough funds remainng!");
        }
        // Calculates the total expenses
        total += expenseAmount;
        expenseNames.add(inputExpenseNames);
        expenseAmountList.add(expenseAmount);

    }

    /* This prints stuff */
    static void printExpenses(int option, ArrayList<String> expenseNames, ArrayList<Double> expenseAmountList) {
        // Prints the expense names with their relative expense amounts
        for (int i = 0; i < expenseNames.size(); i++) {
            System.out.println(expenseNames.get(i) + ": " + expenseAmountList.get(i));
        }
        // Prints the total expenses
        System.out.println("The total expense is: " + total);
        System.out.println();
    }

    static void addExpense(Scanner scanner, ArrayList<String> expenseNames,
            ArrayList<Double> expenseAmountList) {

        int option = 0;
        int addAnother = 1;
        double expenseAmounts = 0;
        String inputExpenseNames = "";

        while (addAnother != 2) {
            System.out.println("Please select a number: ");
            for (int i = 0; i < 7; i++) {
                System.out.println(expenseCategoriesNames[i]);
            }
            option = scanner.nextInt();
            if (option == 7) {
                break;
            }
            scanner.nextLine();
            // This is for prompting expense names and strong them
            System.out.println("Please write the name of the expense: ");
            inputExpenseNames = scanner.nextLine();

            // This is for prompting expense amounts and strong them
            System.out.println("Please enter the amount for the expense: ");
            expenseAmounts = scanner.nextDouble();

            cal(option, inputExpenseNames, expenseNames, expenseAmounts, expenseAmountList);
            System.out.println();
            // This is for prompting Category names and strong them

            System.out.println("Your expenses have been successfully added!");
            System.out.println();

            System.out.println("Do you wanna add another expense?");
            System.out.println("1) Yes");
            System.out.println("2) No");

            addAnother = scanner.nextInt();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option = 0;

        System.out.println("Please enter you initial budget: ");
        ArrayList<String> expenseNames = new ArrayList<>();
        ArrayList<Double> expenseAmountList = new ArrayList<>();
        // Grabs the initial budget from the user
        balance = scanner.nextDouble();

        while (option != 4) {
            System.out.println("Main menu: ");
            System.out.println("Please select a number: ");
            System.out.println("1) Add expense");
            System.out.println("2) View All Expenses");
            System.out.println("3) View Remaining Budget");
            System.out.println("4) Exit");

            option = scanner.nextInt();

            if (option == 1)
                addExpense(scanner, expenseNames, expenseAmountList);
            else if (option == 2)
                printExpenses(option, expenseNames, expenseAmountList);
            else if (option == 3)
                System.out.println("The remaining balance is: " + balance);
            else if (option == 4) {
                System.out.println("Goodbye!");
                break;
            }
            System.out.println();
        }
        scanner.close();
    }
}
