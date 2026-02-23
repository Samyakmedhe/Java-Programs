

import java.util.*;


class SummationN
{
    public int SummationNumber(int iNo1)
    {
        int iSum = 0 ;
        for(int i = 1 ; i <= iNo1; i++)
        {
            iSum = iSum + i;
        }

        return iSum;
    }
}
class NaturalNumber
{
    public static void main(String A [])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter number : ");
        int iNo = sobj.nextInt();

        SummationN Nobj = new SummationN();

        int iRet = Nobj.SummationNumber(iNo);
        System.out.println("Summation of Natural number : "+iRet);

    }
}