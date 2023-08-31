import java.awt.*;
import java.util.Scanner;

 class ACCOUNT
{
    String name;
    String accnum;
    String type;
    int balance;
    Scanner sc=new Scanner(System.in);


    ACCOUNT()
    {
        System.out.println("ENTER THE NAME ");
        name=sc.nextLine();
        System.out.println("ENTER ACCOUNT NUMBER");
        accnum=sc.nextLine();
        System.out.println("ENTER THE ACCOUNT TYPE");
        type=sc.nextLine();
        System.out.println("ENTER THE AMOUNT TO DEPOSITED\n");
        balance=sc.nextInt();
    }

     void display()
     {
         System.out.println("THE NAME IS"+name);
         System.out.println("THE ACCOUNT NUMBER IS"+accnum);
         System.out.println("THE ACCOUNT TYPE IS "+type);
         System.out.println("THE BALANCE IS "+balance);
     }

     void deposit()
     {
         System.out.println("ENTER THE AMOUNT TO BE DEPOSITED");
         int balance= sc.nextInt();
         this.balance=this.balance+balance;
     }
     void withdraw()
     {
         System.out.println("ENTER THE AMOUNT TO BE WITHDRAW");
         int balance =sc.nextInt();
         if(balance>this.balance)
         {
             System.out.println("SORRY YOUR BALANCE IS LESS THAN WITHDRAW AMOUNT");

         }
         else
         {
             this.balance=this.balance-balance;
             System.out.println("THE AMOUNT WITHDRAW IS "+balance+"THE BALANCE AMOUNT IS "+this.balance);
         }

     }





}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("WEL COME TO BANK PROGRAM\n ENTER THE NUMBER OF CUSTO" +
                "MERS\n");
        int n = sc.nextInt();
        ACCOUNT[] a = new ACCOUNT[n];
        for (int i = 0; i < n; i++) {
            System.out.println("ENTER THE DETAILS");
            a[i] = new ACCOUNT();
        }
        int k = 0;
        for (; ; ) {
            System.out.println("ENTER THE CHOICE \n1DISPALY\n2DEPOSIT\n3WITHDRAW\n" + "0TOEXIT");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    k = search(a, n);
                    if (k != -1) {
                        a[k].display();
                    }
                    break;
                case 2:
                    k = search(a, n);
                    if(k!=-1)
                    {
                        a[k].deposit();
                    }
                    break;
                case 3:
                    k=search(a,n);
                    if(k!=-1)
                    {
                        a[k].withdraw();
                    }
                default:
                    System.out.println("THE PROGRAM TERMINATED");
                    System.exit(0);



            }


        }

    }

        static int  search(ACCOUNT[] s,int n1)
        {
            Scanner sc=new Scanner(System.in);
            int i;
            System.out.println("ENTER THE ACCOUNT NUMBER");
            String a=sc.nextLine();
            for(i=0;i<n1;i++) {
                if (s[i].accnum.equals(a)) {
                    s[i]. display();
                    return i;
                }

            }

            System.out.println("THE ACCOUNT NOT FOUND\n");
            return -1;
        }

}
