import java.util.Scanner;

class bankAccount
{
    Double balance;

    public bankAccount(double initialBalance)
    {
        this.balance = initialBalance;
    }

    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) 
        {
            balance -= amount;
            return true;
        } 
        else 
        {
            System.out.println("Insufficient funds.");
            return false;
        }
    }
}

public class Task3 
{
    private bankAccount userAccount;
    public Task3(bankAccount userAccount) 
    {
        this.userAccount = userAccount;
    }

    public void atmInterfaceMenu()
    {
        System.out.println("\nPress 1 for Deposit");
        System.out.println("Press 2 for withdraw");
        System.out.println("Press 3 for checking your account balance");
        System.out.println("Press 4 to exit from menu\n");
    }

    public void userInput()
    {
        int choice;
        Scanner sc = new Scanner(System.in);
        do{
        atmInterfaceMenu();
        System.out.println("Enter your choice: ");
        choice = sc.nextInt();

        switch(choice) 
        {
            case 1:
            // Deposit
            System.out.print("Enter an amount you want to deposit: ");
            double amtDeposit = sc.nextDouble();

            if(amtDeposit > 0)
            {
                userAccount.deposit(amtDeposit);
                System.out.println("Deposit successful. Your new balance is: "+userAccount.getBalance());
            }
            else 
            {
                System.out.println("Invalid deposit amount.");
            }
            break;

            case 2:
            // Withdraw
            System.out.println("Enter an amount you want to withdraw: ");
            double amtWithdraw = sc.nextDouble();

            if (amtWithdraw > 0) 
            {
                if (userAccount.withdraw(amtWithdraw)) 
                {
                    System.out.println("Withdrawal successful. Your new balance is: "+userAccount.getBalance());
                }
            } 
            else 
            {
                System.out.println("Invalid withdrawal amount. Please enter a positive value.");
            }
            break;

            case 3:
            // Check account balance
            System.out.println("Current Balance: "+userAccount.getBalance());
            break;

            case 4:
            System.out.println("Exited from the menu.");

            default:
            {
                System.out.println("Invalid choice");
            }

        }    
        } while(choice != 4);

    }

    public static void main(String[] args) 
    {
        System.out.println("\n*****Welcome*****\n");
        bankAccount userAccount = new bankAccount(1000); 
        Task3 atm = new Task3(userAccount);
        atm.userInput();
    }
}
