import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("WELCOME TO VOTE MACHINE\n");
        System.out.println("ENTER NUMBER OF CANDIDATES");
        int n=sc.nextInt();
        int [] can=new int[n];
        for(int i=0;i<n;i++)
            can[i]=0;
        int spoil=0;
        for(;;) {
            System.out.println("ENTER THE CHOICE\n 1.TOVOTE\n2.TOCOUNT\n3.TOTERMINATE");
            int ch= sc.nextInt();
            switch (ch)
            {
                case 1:
                    for(;;) {
                        System.out.println("ENTER THE CHOICE TO VOTE");
                        for (int i = 1; i <= n; i++)
                            System.out.println(i +" FORCANDIDATE " + i);
                        int v = sc.nextInt();
                        for (int i = 0; i < n; i++) {
                            if (v-1 == i) {
                                can[i] = can[i] + 1;
                                break;
                            }
                        }
                        if (v < 1 || v > n)
                            spoil = spoil + 1;
                        System.out.println("ENTER 999 TO STOP VOTING");
                        int s= sc.nextInt();
                        if(s==999)
                            break;
                    }
                    break;

                case 2:
                    System.out.println("THE RESULT IS ");
                    for(int i=0;i<n;i++)
                        System.out.println("THE CANDIDATE "+(i+1)+" GOT "+can[i]+" VOTES");

                    System.out.println("THE NUMBER OF SPOILT VOTES ARE "+spoil);
                        break;
                case 3:
                    System.out.println("THE MACHINE IS OFF THANK YOU");
                    System.exit(0);

                    default:
                    System.out.println("ENTER THE CORRECT CHOICE\n");
                    break;
            }
        }

    }
}
