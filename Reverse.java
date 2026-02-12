import java.util.*;


class java
{
    public String Reverse(String str)
    {
        String Reverse = "";
        for(int i = str.length()-1 ; i >= 0; i--)
        {
            Reverse = Reverse + str.charAt(i);
        }
        return Reverse;
    }
}
class Reverse
{

    public static void main(String[] A)
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sobj.nextLine();

        java jobj = new java();

        String sRet = jobj.Reverse(str);
        System.out.println("Reversed string: " + sRet);



    }
}