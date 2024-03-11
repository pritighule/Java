
import java.util.Scanner;
public class addition 
{
    public static void main(String[] args) 
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st no:");
        int ivalue1=sc.nextInt();

        System.out.println("Enter 2ed no:");
        int ivalue2=sc.nextInt();

        int ires=addition(ivalue1,ivalue2);
        System.out.println("Addition is:"+ires);
    }



    public static int addition(int ino1,int ino2)
    {
        int ians=ino1+ino2;
        return ians;
    }
}
