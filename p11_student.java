import java.util.Scanner;

class Student{

    int rollnumber  ;

     void readNumber()
     {
         System.out.println("ENTER THE ROLL NUMBER");
         Scanner sc= new Scanner(System.in);
         rollnumber=sc.nextInt();
     }
     void printNumber()
     {
         System.out.println("THE ROLL NUMBER IS "+rollnumber);
     }
}

abstract class Test extends Student{

     int marks1,marks2;
    void testMarks()
    {
        System.out.println("ENTER THE TEST MARKS 1");
        Scanner sc=new Scanner(System.in);
        marks1=sc.nextInt();
        System.out.println("ENTER THE TEST MARKS 2");
        marks2 =sc.nextInt();
    }
    void displaytestmarks()
    {
        System.out.println("THE TEST 1 MARKS IS"+marks1);
        System.out.println( "TEST 2 MARKS IS"+marks2);
    }
 abstract void display();
}

interface Sports{
    void readweigth();
    void sum();
}

class Results extends Test implements Sports
{
    int sportsWeightage;
   public void readweigth()
    {
        System.out.println("ENTER THE SPORTS WEIGHT");
        Scanner sc= new Scanner(System.in);
        sportsWeightage=sc.nextInt();

    }
   public void sum()
    {
        int sum=sportsWeightage+marks1+marks2;
        System.out.println("THE RESULT IS "+sum);
    }

    Results()
    {
        readNumber();
        testMarks();
        readweigth();
    }

    public void display() {
        printNumber();
        displaytestmarks();
        sum();
    }
}


public class Main {
    public static void main(String[] args) {

        System.out.println("ENTER THE NUMBER OF STUDENTS");
        Scanner sc= new Scanner(System.in);
        int N=sc.nextInt();
        Results []r=new Results[N];
        for(int i=0;i<N;i++)
             r[i]=new Results();

         for(int i=0;i<N;i++)
             r[i].display();

    }
}
