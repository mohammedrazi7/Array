import java.util.Scanner;
class Demo
{
    public int add(int a,int b)
    {
        return a+b;
    }
    public int add(int a,int b,int c)
    {
        return a+b+c;
    }
    public int add(int a,int b,int c,int d)
    {
        return a+b+c+d;
    }
}
public class overload {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Demo d = new Demo();
        System.out.println(d.add(5,7));
        System.out.println(d.add(5,7,8));
        System.out.println(d.add(1,3,5,7));

    }
}
