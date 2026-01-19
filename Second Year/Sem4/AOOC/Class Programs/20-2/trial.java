import java.util.*;

public class trial{

    public static void merged(int[] arr1, int[] arr2, int[] c){
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < 4 && j < 3){
            if(arr1[i] < arr2[j]){
                c[k] = arr1[i];
                i++;
                k++;
            }
            else{
                c[k] = arr2[j];
                j++;
                k++;                
            }
        }

        if(arr1.length > arr2.length){
            while(i < 4){
            c[k] = arr1[i];
            i++;
            k++;
        }
        }else{
            while(j<3){
            c[k] = arr2[j];
            j++;
            k++;
        }
        }
        

        




    }

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of arr1 : ");
        int a = scan.nextInt();
        int[] arr1 = new int[a];

        System.out.println("Enter the size of arr2 : ");
        int b = scan.nextInt();
        int[] arr2 = new int[b];

        int total = a+b;
        int[] c = new int[total];

        System.out.println("Enter elements for array 1 : ");
        for(int i = 0 ; i < 4; i++){
            arr1[i] = scan.nextInt();
        }

        System.out.println("Enter elements for array 2 : ");
        for(int j = 0; j < 3; j++){
            arr2[j] = scan.nextInt();
        }

        merged(arr1, arr2, c);

        System.out.print("Sorted array is : [ ");
        for(int i = 0; i < total ; i++){
            System.out.print(c[i]+" ");
        }
        System.out.println("]");
    }
}