import java.util.Scanner;
import java.util.*;

public class Multilpication 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the 1st no:");
        int ivalue1 =sc.nextInt();

        System.out.println("enter the 2ed value");
        int ivalue2 =sc.nextInt();

        int ires= mul(ivalue1,ivalue2);
        System.out.println("multiplication is:"+ires);

        
    }

    public static int mul(int ivalue1, int ivalue2)
        {
                int ians=ivalue1*ivalue2;
                return ians;
        }
}
