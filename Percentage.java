import java.util.*;
class Percentage
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Please enter markscfor subjects\n1.Maths\n2.Oop\n3.Spa\n4.Bee\n5.Dbms");
       int Maths=sc.nextInt();
       int Oop=sc.nextInt();  
       int Spa=sc.nextInt();
       int Bee=sc.nextInt();
       int Dbms=sc.nextInt();
       int outofforms=500;
       double Percentage;
       int totalMarks;
       totalMarks=Maths+Oop+Spa+Bee+Dbms;
       System.out,println("Total sum of marks obtain" +totalMarks);
       Percentage=(totalMarks*100)/outofMarks;
       System.out.println("Total percentage " + Percentage+ "%");
    }
}
       