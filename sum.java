import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int a[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            sum+=a[i];
        }
        System.out.println("The sum elements of the array: "+sum);
    }
}
