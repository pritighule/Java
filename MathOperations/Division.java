import java.util.*;
import java.util.Scanner;

class Division
{
public static void main(String[] args) 
{
    Scanner sc =new Scanner(System.in); 
    int ivalue1,ivalue2;
    int ians=0;
    System.out.println("Enter the value of 1:");
    ivalue1=sc.nextInt();

    System.out.println("Enter the value of 2:");
    ivalue2=sc.nextInt();

    int res=div(ivalue1,ivalue2);
    System.out.println(res);

}
public static int div(int ivalue1,int ivalue2)
        {
           
            int ians=ivalue1/ivalue2; 
            return ians;
        }

}