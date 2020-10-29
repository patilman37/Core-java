import java.util.Scanner;
class GreatNumber
{
     public static void main(String args[])
     { 
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a first number: ");
       int n1 = sc.nextInt();
       System.out.println("Enter a second number: ");
       int n2 = sc.nextInt();
       System.out.println("Enter a third number: ");
       int n3 = sc.nextInt();

       if(n1>n2 && n1>n3)
       {
         System.out.println("n1 is a greater number: " +n1);
       }
       else if(n2>n3 && n2>n1)
       {
         System.out.println("n2 is a greater number: " +n2);
       }
       else
       {
         System.out.println("n3 ia a greater number: " +n3);
       }
     }
}
         