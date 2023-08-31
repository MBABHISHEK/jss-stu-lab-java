/** JAVA program to display bank details
 Name of the program: _10Bank.java
 */

import java.util.*;

abstract class Bank {
    char bankType;
    double amount, interest;
    boolean platinumCard;
    boolean offerCreditCard;
    double termDeposit = 0;
    int term = 0;

    abstract void getRoi();

    abstract void display();

        void deposit() {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the type of bank\n'n' - Nationalised Bank \n'i' - International Bank ");
            bankType = sc.next().charAt(0);
            if (bankType == 'n' || bankType == 'i') {
                System.out.print("Enter the amount to be deposited in the bank: ");
                termDeposit = sc.nextDouble();
                System.out.print("Enter the term for which amount has been deposited (in years): ");
                term = sc.nextInt();
                getRoi();
            } else
                System.out.println("Invalid Bank type!");
        }
    }


class BankDetails extends Bank {
    Scanner sc = new Scanner(System.in);

    void getRoi() {
        if (bankType == 'n') {
            platinumCard = false;
            if (term >= 3)
                interest = 0.07 * termDeposit;

        } else {
            platinumCard = true;
            if (term >= 3)
                interest = 0.08 * termDeposit;
        }
    }


    void display() {
        String bank;
        if (bankType == 'n')
            bank = "Nationalised Bank";
        else if (bankType == 'i')
            bank = "International Bank";
        else
            bank = "Invalid Bank type";

        System.out.println("Type of Bank                 :" +bank);
        System.out.println("Interest                     :" +interest);
        System.out.println("THE AMOUNT TO BE DEPOSITED   :"+termDeposit);
        System.out.println("THE TERM IN (years)          :"+term);
        if(platinumCard)
        System.out.println("Eligible for platinum card   :"+"YES");
        else
            System.out.println("Eligible for platinum card   :"+"NO");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of banks: ");
        int n = sc.nextInt();
        BankDetails[] bank = new BankDetails[n];

        for (int i = 0; i < n; i++) {
            bank[i] = new BankDetails();
            System.out.println("Enter the details of Bank " + (i + 1) + ": ");
            bank[i].deposit();
        }
        Bank [] c=bank;

        for (int i = 0; i < n; i++) {
            System.out.println("Details of Bank " + (i + 1) + ": ");
            c[i].display();
        }


    }

}
