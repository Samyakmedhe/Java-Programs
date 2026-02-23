
import java.util.*;

class Recursion 
{
    int i = 1 ;
    public void Display(int iNo)
    {
        if(i <= iNo)
        {
            System.out.println(i+"\t");
            i++;
            Display(iNo);     
        }
    }
}
class recursion1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number to print 1 to N using Recursion : ");
        int iNo = sobj.nextInt();

        Recursion robj = new Recursion();
        robj.Display(iNo);
    }
}