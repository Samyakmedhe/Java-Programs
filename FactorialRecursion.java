
import java.util.*;



class Recursion 
{
    public int Factorial(int iNo)
    {
        if( iNo == 0 || iNo == 1)
        {
            return 1;
        }
        else
        {
            return iNo * Factorial(iNo - 1);
        }
    }
}
class FactorialRecursion
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number : ");
        int iNo = sobj.nextInt();

        Recursion robj = new Recursion();
        int iRet = robj.Factorial(iNo);
        System.out.println("Factorial of " + iNo + " is: " + iRet);
    }
}