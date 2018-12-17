import java.util.*;

class stack {
	
	int [] arr = new int[10];
	int stack_top=-1;
	Scanner scn = new Scanner(System.in);
	public void pop() {
		stack_top--;

	}
	public void push(int a) {
		stack_top++;
		arr[stack_top]=a;

	}
	public void top() {
		System.out.println("top is at "+ this.stack_top);

	}
	public void display() {
		System.out.println("elements in stack");
		for(int i=stack_top;i>=0;i--) {
			System.out.print(this.arr[i]+" ");
		}

	}
}
class stackuse extends stack {
	 
	public void display() {
		super.display();
	}
	
	
	public void pop() {
		super.pop();

	}
	public void push(int a) {
		super.push(a);

	}
	public void top() {
		super.top();

	}
	
}

public class exp_3_a{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		stackArray(scn);
		
	}
	private static void stackArray(Scanner scn) {
		stackuse s1=new stackuse();
		s1.push(2);
		s1.push(3);
		s1.push(4);
		s1.display();
		s1.pop();
		s1.pop();
		s1.display();

	}
	


}

