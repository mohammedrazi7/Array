import javax.management.MBeanRegistrationException;
import java.util.Scanner;

public class findIndex {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no.of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int a[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        int idx=-1;
        System.out.println("Enter the searching element: ");
        int key=sc.nextInt();
        for(int i=0;i<n;i++){
            if(key==a[i])
            {
                idx=i;
                break;
            }
        }
        if(idx==-1)
        {
            System.out.println("Element not found");
        }
        else
        {
            System.out.println("Element found at index: "+idx);
        }
    }
}
