
import java.util.*;



class Recursion 
{
    int i = 1 ;
    public void Display(int iNo)
    {
        if(i <= iNo)
        {
            System.out.print(iNo+"\t");
            Display(iNo-1);     
        }
    }
}
class recursion2
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number to print N to 1 using Recursion : ");
        int iNo = sobj.nextInt();

        Recursion robj = new Recursion();
        robj.Display(iNo);
    }
}