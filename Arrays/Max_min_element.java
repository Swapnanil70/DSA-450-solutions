import java.util.Scanner;

public class Max_min_element {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :- ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements");
        int flag = 3;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int min = arr[0];

        for (int i = 0; i < n; i++) {

            if (n == 0) {
                flag = 0;
                break;
            }

            if (n == 1) {
                flag = 1;
                break;
            }

            if (n > 1) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                if (arr[i] < min) {
                    min = arr[i];
                }
            }
        }
        if (flag == 0)
            System.out.println("Array size is zero no Min or Max elements");

        if (flag == 1)
            System.out.println("The Max element is :- " + arr[0] + " no min element");

        else
            System.out.println("The Max elemment :- " + max + " The Min element :- " + min);
    }
}
