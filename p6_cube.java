import java.util.Scanner;

class Cube
{
    float s,area,volume;
  Cube(){
      Scanner sc=new Scanner(System.in);
      System.out.println("ENTER /THE SIDES OF CUBE");
      s=sc.nextFloat();
  }
  void calculate()
  {
      area=6*s*s;
      volume=s*s*s;

  }
  void display()
  {
      System.out.println("THE SIDES OF CUBE IS "+s+"\nTHE AREA OF CUBE IS "+area+
              "\nTHE VOLUME OF THE CUBE IS "+volume);
  }

}
public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO CUBE CALCULATOR APPLICATION\n");
        System.out.println("ENTER THE NUMBER OF CUBES\n");
        int n=sc.nextInt();
        Cube []CUBE=new Cube[n];
        for(int i=0;i<n;i++)
        {
            CUBE[i]=new Cube();
            CUBE[i].calculate();
            CUBE[i].display();
        }
    }
}
