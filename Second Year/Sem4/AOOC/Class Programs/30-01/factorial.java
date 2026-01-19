import java.util.*;

class factorial{
	public static int fact(int n){
	
	if(n == 0){
	return 1;
	}
	else{
	return n*fact(n-1);
	}
	}
	
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	System.out.println("Enter the number : ");
	int n = scan.nextInt();

	System.out.println("The factorial of number is : "+fact(n));
	}
}
