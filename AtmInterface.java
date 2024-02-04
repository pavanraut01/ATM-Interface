import java.util.Scanner;
public class AtmInterface
{
    public static void main(String args[])
    {
        int balance = 10000, withdraw, deposit;
        Scanner sc = new Scanner(System.in);
        int pin=9191;
        System.out.println("Please enter your pin : ");
        int pass=sc.nextInt();
        int i=1;
        if(pass!=pin)
        {
            while(true)
            {
                i++;
                System.out.println("Wrong pin Number!");
                System.out.println("Please Re-enter your pin (Max. Attempts :- 3) : ");
                pass=sc.nextInt();
                if(pass==pin)
                {
                    break;
                }
                if(i==3){
                    System.out.println("You have exceeded your trials ! Retry After some time !");
                    System.exit(0);
                }
            }
        }
        if(pass==pin)
        {
            System.out.println("--Welcome to ATM Services--");
            while(true)
            {
                System.out.println("Enter 1  Check your Balance amount");
                System.out.println("Enter 2  Withdraw money");
                System.out.println("Enter 3  Deposit money");
                System.out.println("Enter 4  QUIT");
                System.out.print("Choose what you option: ");
                int choice = sc.nextInt();
                switch(choice)
                {
                    case 1:
                        System.out.println("Your Balance is : "+balance);
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("Enter amount you want to Withdraw : ");
                        withdraw=sc.nextInt();
                        if(withdraw>balance||balance==0)
                        {
                            System.out.printf("You have insufficient balance!\n");
                            break;
                        }
                        System.out.println("Hope you collected your amount!");
                        balance=balance-withdraw;
                        System.out.println("");
                        break;
                    case 3:
                        System.out.print("Enter money to be deposited: ");
                        deposit = sc.nextInt();
                        balance = balance + deposit;
                        System.out.println("Your Money has been successfully deposited");
                        System.out.println(" ");
                        break;

                    case 4:
                        System.out.println("Thank you for using ATM");
                        System.exit(0);
                }
            }
        }
    }
}
