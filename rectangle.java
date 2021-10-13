import java.util.Scanner;
public class rectangle
{
    public static void main(String args[])
    {
        int len,bre,area,peri;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        len=sc.nextInt();
        System.out.println("enter breath");
        bre=sc.nextInt();
        area=len*bre;
        peri=2*(len+bre);
        System.out.println("area of rectangle is:"+area);
        System.out.println("perimeter of rectange is;"+peri);
    }
}