import java.util.Scanner;

class Merge
{
    int [] a,b,c;
    int n1,n2,n3;

    void read()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ELEMENTS IN ARRAY A");
        n1=sc.nextInt();
        a=new int[n1];
        System.out.println("ENTER THE ELEMENTS OF THE  ARRAY A");
        for(int i=0;i<n1;i++)
          a[i]=sc.nextInt();

        System.out.println("ENTER THE NUMBER OF ELEMENTS IN ARRAY B");
        n2=sc.nextInt();
        b=new int[n2];
        System.out.println("ENTER THE ELEMENTS OF THE  ARRAY B");
        for(int i=0;i<n2;i++)
            b[i]=sc.nextInt();
    }

    void merge()
    {
        int i=0,j=0;
       int [] r=new int[n1+n2];
       int k=0;
        while(i<n1&&j<n2)
           if(a[i] < b[j])
               r[k++] = a[i++];
           else if(a[i]==b[j]) {
               r[k++] = a[i++];
               j++;
           }
        else
               r[k++] = b[j++];


           while(i<n1)
               r[k++]=a[i++];
           while (j<n2)
               r[k++]=b[j++];

           n3=k;
           c=new int[n3];
           for(int m=0;m<k;m++)
           c[m]=r[m];


       }

    void display()
    {
        System.out.println("THE ELEMENTS OF THE  ARRAY A ARE");
        for(int i=0;i<n1;i++)
            System.out.print(a[i]+" ");
        System.out.println("\nTHE ELEMENTS OF THE  ARRAY B ARE");
        for(int i=0;i<n2;i++)
            System.out.println(b[i]+" ");
        System.out.println("\nTHE ELEMENTS OF THE  ARRAY C ARE");
        for(int i=0;i<n3;i++)
            System.out.print(c[i]+" ");

    }


}


public class ArrayMergeMain {
    public static void main(String[] args) {
        System.out.println("WELCOME TO MERGE APPLICATION");
        Merge m=new Merge();
        m.read();
        m.merge();
        m.display();
    }
}
