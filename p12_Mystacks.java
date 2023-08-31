package Stacks;
import java.util.Scanner;
import java.lang.Exception;

class stackFull extends Exception{

    stackFull(String msg)
    {
        super(msg);
    }

}
class stackEmpty extends Exception{

    stackEmpty(String msg)
    {
        super(msg);
        System.out.println("THE STACK IS EMPTY");
    }
}


public class Mystacks{

    public int []stack;
   public int size,top;
    public Mystacks()

    {
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("ENTER THE SIZE OF OF STACKS");
        size= sc.nextInt();
        stack=new int[size];
        top=-1;
    }
    public void pop()throws stackEmpty{
        if(top==-1)
            throw new stackEmpty("THE STACK IS EMPTY");
         System.out.println("THE ELEMENT DELETED IS "+stack[top--]);
    }
   public void push()throws stackFull
   {
        if(top==size-1)
            throw new stackFull("THE STACK IS FULL");

        System.out.println("enter the element to be pushed");
        Scanner sc=new Scanner(System.in);
        stack[++top]=sc.nextInt();
    }
    public void display()throws stackEmpty
    {
        if(top==-1)
            throw new stackEmpty("THE STACK IS EMPTY");
        System.out.println("the elements of stack are");
        for(int i=top;i>=0;i--)
            System.out.println(stack[i]);
    }

}
