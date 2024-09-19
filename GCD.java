import java.io.*;
import java.util.Scanner;
class GCD
{
    static int gcd(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        return gcd(b,a%b);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number1 value:");
        int number1=sc.nextInt();
        System.out.println("Enter number2 value:");
        int number2=sc.nextInt();
        int result=gcd(number1,number2);
        System.out.println("The Gcd of"+number1+"and"+number2+"is:"+result);
    }
}