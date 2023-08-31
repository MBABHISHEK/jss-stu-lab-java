import java.util.Scanner;

class Student{

    int roll;
    String name;
    int []marks;
    int sub, total;
    Scanner sc=new Scanner(System.in);

    Student(int n)
    {
        System.out.println("ENTER THE NAME");
        name=sc.nextLine();
        System.out.println("ENTER THE ROLL NUMBER");
        roll=sc.nextInt();
        marks =new int[n];
        sub=n;
        for(int i=0;i<n;i++)
        {
            System.out.println("ENTER MARKS OF SUBJECT"+i+1);
            marks[i]=sc.nextInt();
        }

    }

    void sum()
    {
        total=0;
        for(int i=0;i<sub;i++)
         total=total+marks[i];
        System.out.println("THE TOTAL MARKS IS"+total);
    }

    void display()
    {
        System.out.println("THE NAME IS "+name);
        System.out.println("THE ROLL NUMBER IS "+roll);
        for(int i=0;i<sub;i++)
            System.out.println("THE MARKS OF SUBJECT"+i+1+"IS"+marks[i]);
    }



        }
public class BankMain {
    public static void main(String[] args) {
        System.out.println("WELCOME TO MARKS CALCULATOR");
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF SUBJECTS");
        int N=sc.nextInt();
        System.out.println("ENTER THE NUMBER OF STUDENTS ");
        int N1=sc.nextInt();
        Student []s=new Student[N1];
        for(int i=0;i<N1;i++)
        {
            s[i]=new Student(N);
            s[i].sum();
        }
        int []sub=new int[N];
        for(int i=0;i<N;i++)
            sub[0]=0;

        int top=0;

        for(int i=0;i<N1;i++)
        {
            if(s[top].total<s[i].total)
                top=i;
        }
        for(int j=0;j<N;j++) {
            for (int i = 1; i < N1; i++) {
                if (s[sub[j]].marks[j]<s[i].marks[j])
                    sub[j]=i;

            }
        }

        for(int i=0;i<N;i++)
        {
            System.out.println("THE STUDEN WHO GOT HIGH MARKS IN SUBJECT "+i+1);
            s[sub[i]].display();
        }
        System.out.println("THE STUDEN WHO GOT HIGH MARKS IS");
         s[top].display();

    }
}
