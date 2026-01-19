import java.util.*;

public class SecongSmall {

    public static void bubble(int size, int[] arr){

        for(int i = 0; i < size; i++){
            for(int j = 0; j < size-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

    try {
        System.out.print("Enter the size of array : ");
        int size = scan.nextInt();

        int[] arr = new int[size];

        System.out.println("Take input of array : ");
        for(int i = 0 ; i < size; i++){
            arr[i] = scan.nextInt();
        }

        bubble(size, arr);

        System.out.print("Sorted array is : [ ");
        for(int nums : arr){
            System.out.print(nums+ " ");
        }
        System.out.println("]");

        System.out.println("Second smallest number is : "+arr[1]);
    }
    catch (InputMismatchException e){
        System.out.println("Take appropriate input");
    }

    }
}
