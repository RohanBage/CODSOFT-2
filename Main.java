import java.util.*;
public class Main {
    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
       int m,p,c;
        System.out.println("Enter the Marks(0-100):-");
        System.out.println("Maths:");
        m=sc.nextInt();
        System.out.println("Physics:");
        p=sc.nextInt();
        System.out.println("Chemistry:");
        c=sc.nextInt();
        int sum=m+p+c;
        System.out.println("sum:"+sum);

        int avg=(m+p+c)/3;
        System.out.println("Average Perentage is :"+avg);
       if(avg>=91)
       {
           System.out.println("Grade: A");
       }
       else if(avg>=81 && avg<=90)
       {
           System.out.println("Grade:B");
       }
       else if(avg>=71 && avg<=80)
       {
           System.out.println("Grade:C");
       }
       else if(avg>=61 && avg<=70)
       {
           System.out.println("Grade:D");
       }
       else if(avg>=33 && avg<=60)
       {
           System.out.println("Grade:PASS");
       }
       else
       {
           System.out.println("Grade:FAIL");
       }

    }
}