
import java.util.*;



class Numbers  
{
    public int FibonacciNumber(int iNo)
    {
        if( iNo == 0 )
        {
            return 0;
        }
        else if(iNo == 1)
        {
            return 1;
        }
        else
        {
            int i = 0, a = 0 , b  = 1 , c = 0   ;
            for(i = 2 ; i <= iNo ;i++)
            {
                c = a + b;
                a = b ;
                b = c ;
            }
            return c;
            
        }
    }
}
class Fibonacci
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number : ");
        int iNo = sobj.nextInt();

        Numbers robj = new Numbers();
        int iRet = robj.FibonacciNumber(iNo);
        System.out.println("the "+iNo+"th Fibonacci number is "+ iRet);
    }
}