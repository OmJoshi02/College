import java.util.*;

class greater{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	System.out.println("Enter three numbers : ");
	System.out.println("Enter first number at position A : ");
	int a = scan.nextInt();

	System.out.println("Enter Second number at position B : ");
	int b = scan.nextInt();

	System.out.println("Enter third number at position C : ");
	int c = scan.nextInt();

	int large = a;

	if(b > a && b > c){
	large = b;
	System.out.println("Large value is at B");
	}

	else if(c > a && c > b){
	large = c;
	System.out.println("Large value is at C");
	}

	else{
	System.out.println("Large value is at A");
	}
	}
}
