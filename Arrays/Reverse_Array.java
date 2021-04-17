import java.util.*;
// coded by Swapnanil Goswami
class Reverse_Array{

    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of Array = ");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();

        }

        int start = 0;
        int end = n-1;

        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println("The reversed Arrayis :-");

        for(int i = 0; i < n; i++){
            System.out.println(arr[i]);
        }
    }
}
