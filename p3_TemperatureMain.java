import java.sql.SQLOutput;
import java.util.Scanner;

class Temperature
{
   String city;
   float [] temp;
   Scanner sc =new Scanner(System.in);
   float max,min;

   void read()
   {
       System.out.println("ENTER THE CITY NAME\n");
       city=sc.nextLine();
       System.out.println("ENTER THE TEMPERATURE OF THE CITIES\n");
       temp=new float[6];


       for(int i=0;i<6;i++)
           temp[i]=sc.nextFloat();
   }

   void calculate()
   {
       int i;
       max=temp[0];
       min=temp[0];
       for(i=1;i<6;i++)
       {
          if(max<temp[i])
              max=temp[i];
          if(min>temp[i])
              min=temp[i];
       }


   }



}
public class TemperatureMain{
    public static void main(String[] args) {

        float []maxt= new float[5];
        float []mint= new float[5];

        Temperature [] T=new Temperature[5];
        for(int i=0;i<5;i++)
        {
            T[i]=new Temperature();
            T[i].read();
            T[i].calculate();
            maxt[i]=T[i].max;
            mint[i]=T[i].min;

        }
    int l=0,h=0;
        for(int i=1;i<5;i++)
        {
          if(maxt[i]>maxt[h])
            h=i;
          if(mint[i]<mint[l])
              l=i;
        }

        System.out.println("CITY\tHIGH\nLOW\n");
        for(int i=0;i<5;i++)
        {
            System.out.println(T[i].city+"\t"+T[i].max+"\t"+T[i].min);
        }

        System.out.println("THE HIGH TEMPERATURE IS"+maxt[h]+"FORM THE CITY"+T[h].city+"\n" +
                "THE LOWEST TEMPERATURE IS "+mint[l]+"FORM THE CITY "+T[l].city);



    }
}
