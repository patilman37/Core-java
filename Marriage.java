import java.util.Scanner;
class Marriage
{
    public static void main(String args[])
    { 
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a gender: ");
       String s1 = sc.next();
       System.out.println("Enter a age: ");
       int age = sc.nextInt();
       //System.out.println("Enter a number: ");
       //int n1 = sc.nextInt();


       if(age>=20)
       {
         System.out.println("Eligible");
       }
       else
       {
         System.out.println("Not Eligible");
       }
    }
}       