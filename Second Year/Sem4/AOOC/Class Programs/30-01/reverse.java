import java.util.*;

class reverse{
	
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	System.out.println("Enter a size of an array : ");
	int n = scan.nextInt();

	int[] arr = new int[n];
	System.out.println("Enter the elements of array : ");
	for(int i = 0; i < n; i++){
	arr[i] = scan.nextInt(); 
	}
	
	System.out.print("The enetered elements are : [");
	for(int i = 0; i < n; i++){
	System.out.print(arr[i]);
	}
	System.out.println("]");
	}

}
