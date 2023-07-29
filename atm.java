import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    { 
        int b = 12000, w, d;
        int pin=1234;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your pin number: ");
        int p=sc.nextInt();
        int j=1;
        if(p!=pin)
        {
            while(1==1)
            {
                j++;
            System.out.println("Invalid pin number!");
     System.out.println("Re-enter pin (5 attempts allowed) : ");
            p=sc.nextInt();
            if(p==pin)
            {
                break;
            }
            if(j==5){
             
                System.out.println("5 attempts done. Please try again later!");
            System.exit(0);
            }
            }
        }
        if(p==pin)
        {
            System.out.println("Please choose one of the following");  
            while(1==1)
            {
                System.out.println("Press 5 to check your balance");
                System.out.println("Press 6 to deposit money");
                System.out.println("Press 7 to withdraw money");
                System.out.println("Press 8 to QUIT");
                System.out.print("Your choice? ");
                int choice = sc.nextInt();
                switch(choice)
                {
                    case 5:
                    System.out.println("Your Balance is : "+b);
                    System.out.println("");
                    break;
                    case 7:
                    System.out.println("Enter amount you want to withdraw : ");
                    w=sc.nextInt();
                   
                    if(w>b||b==0)
                    {
                        System.out.printf("Not enough balance!\\n");
                        break;
                    }
                    System.out.println("Amount withdrawn!");
                    b=b-w;
                    System.out.println("");
                    break;
case 6:
                    System.out.print("Enter money to be deposited: ");
                    d = sc.nextInt();
                    b= b + d;
                    System.out.println("Money deposited");
                    System.out.println(" ");
                    break;

                    case 8:
                    System.out.println("Thank you!");
                    System.exit(0);
                }
            }
       }
    }
}
