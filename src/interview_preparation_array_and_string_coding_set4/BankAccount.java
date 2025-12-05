package interview_preparation_array_and_string_coding_set4;

import java.util.Scanner;

public class BankAccount
{


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
                    account.depositMoney();
                    break;
                case 2:
                    account.withdrawMoney();
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

    public void depositMoney()
    {
        System.out.println("Deposit Money");
    }

    public void withdrawMoney()
    {
        System.out.println("Withdraw Money");
    }

    public void checkBalance()
    {
        System.out.println("Check Balance");
    }


}
