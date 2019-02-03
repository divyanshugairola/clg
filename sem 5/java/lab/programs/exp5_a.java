import java.util.Scanner;

class MyException extends Exception{
	
	String a;
	MyException(String b){
		
		a=b;
	}
	
	public String toString() {
		return("Exception:"+ a);
	}
}

public class exp5_a {

	public static void main(String[] args) {
		int bal,amt;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the balance:");
		bal=sc.nextInt();
		System.out.println("Enter the withdrawl amount:");
		amt=sc.nextInt();
		
		try {
			
			bal=bal-amt;
			if(bal<0)
				throw new MyException("Insufficient Balance");
			System.out.println("Remaining Balance"+ bal);
		}
		
		catch(MyException e) {
			
			System.out.println(e);
		}
		
	}

}



