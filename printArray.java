import java.util.Scanner;

public class printArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int a[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Traversing array using for-loop");
        for(int i=0;i<n;i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Traversing array using for-each loop");
        for (int x:a) {
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
