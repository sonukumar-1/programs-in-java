import java.util.Scanner;

class Add
{
    public static void main(String[] args)
    {
        int a,b,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a ");
        a=sc.nextInt();
        System.out.println("enter the value of b");
        b=sc.nextInt();
        sum=a+b;
        System.out.println("Addition is="+sum);
        if (sum>100 && sum<150)
        {
            System.out.println("welcone");
            
            
        }
        else if (sum<100)
        {
            System.out.println("how are you");
        }
        else
        {
            System.out.println("by***by***by***by**by");
        }
    }
}