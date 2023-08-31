import java.util.Scanner;

class EMPLOYEE
{
    String ID;
    String name;
    String dname;
    float bpay,grosspay,netpay;

    Scanner sc=new Scanner(System.in);

    EMPLOYEE ()
    {
        System.out.println("ENTER THE EMPOLYE ID");
        ID=sc.nextLine();
        System.out.println("ENTER THE EMPLOYEE NAME");
        name=sc.nextLine();
        System.out.println("ENTER THE DEPARTMENT NAME");
        dname=sc.nextLine();
        System.out.println("ENTER THE BASIC PAY");
        bpay=sc.nextFloat();
    }

    void calculate()
    {
        System.out.println("ENTER THE DR AND HRA");
        float DA=sc.nextFloat();
        float HR=sc.nextFloat();
        grosspay=bpay*(1+DA+HR);
        if(grosspay<=200000.0)
            netpay=grosspay;
        else if(200000.0 < grosspay&&grosspay<=300000.0)
            netpay=grosspay*(0.9f);
        else if(300000.0<grosspay&&grosspay<=500000.0)
            netpay=grosspay*(1-0.15f);
        else
        {
            float tax=grosspay*0.3f;
            tax*=0.02f;
            netpay=grosspay-tax;
        }
    }

    void dispaly()
    {
        System.out.println("THE EMPOLYE ID       :"+ID);
        System.out.println("THE EMPLOYEE NAME    :"+name);
        System.out.println("THE DEPARTMENT NAME  :"+dname);
        System.out.println("THE BASIC PAY        :"+ bpay);
        System.out.println("THE GROSSPAY IS      :"+grosspay);
        System.out.println("THE NET PAY IS       :"+netpay);
    }

}





public class Empoloyee {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER EMPOLYE");
        int N=sc.nextInt();
        EMPLOYEE []a = new EMPLOYEE[N];
        for(int i=0;i<N;i++)
        {
            a[i]=new EMPLOYEE();
        }

            for(int i=0;i<N;i++) {
                a[i].calculate();
                a[i].dispaly();
            }
    }
}
