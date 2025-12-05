package interview_preparation_oops_and_core_java_coding_set4;

import java.util.Scanner;

public class BankAccount
{

    static double accountBalance=0;
    static void main()
    {
        BankAccount account=new BankAccount();

        while(true) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter 1 to deposit money, Enter 2 to withdraw money, Enter 3 for checking balance, Enter 0 to exit");
            int option = 0;
            while(true) {
                try {
                    option = sc.nextInt();
                    if(option==0 || option==1 || option==2 || option==3)
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("Only these options are allowed");
                        System.out.println("Enter 1 to deposit money, Enter 2 to withdraw money, Enter 3 for checking balance, Enter 0 to exit");
                    }
                } catch (Exception e) {
                    System.out.println("Only numbers are allowed, please renter");
                    System.out.println("Enter 1 to deposit money, Enter 2 to withdraw money, Enter 3 for checking balance, Enter 0 to exit");
                    sc.next();
                }
            }

            switch (option) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.println("Enter the amount you want to deposit");
                    double deposit_amount=sc.nextDouble();
                    account.depositMoney(deposit_amount);
                    break;
                case 2:
                    System.out.println("Enter the amount you want to withdraw");
                    double withdrawl_amount=sc.nextDouble();
                    account.withdrawMoney(withdrawl_amount);
                    break;
                case 3:
                    account.checkBalance();
                    break;
                default:
                    System.out.println("Allowed options are only 1, 2 or 3 and 0");
            }
            System.out.println();
        }
    }

    public void depositMoney(double amount)
    {
        accountBalance=accountBalance+amount;
        System.out.println("Account balance is "+accountBalance);
    }

    public void withdrawMoney(double amount)
    {
        if(accountBalance<amount)
        {
            System.out.println("Withdrawal amount is less than account balance");
            System.out.println("Account balance is " + accountBalance);
            System.out.println("Amount you are trying to withdraw is " + amount);
        }
        else {
            accountBalance = accountBalance - amount;
            System.out.println("Account balance is " + accountBalance);
        }
    }

    public void checkBalance()
    {
        System.out.println("Account balance is "+accountBalance);
    }


}
