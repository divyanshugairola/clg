class class1{
		 class1() {
			System.out.println("in class 1");
		}
		
	}
class class2 extends class1{
		 class2() {
			System.out.println("in class 2");
		}
	}
class class3 extends class2{
		 class3() {
			System.out.println("in class 3");
		}
	}
class class4 extends class1{
	public class4() {
		System.out.println("in class 4");
	}
	
}

public class exp_3_b {
	
	public static void main(String[] args) {
		System.out.println("single level");
		class2 ob2 = new class2();
		System.out.println("\nmulti level");
		class3 ob3 = new class3();
		System.out.println("\nhierarchical");
		class4 ob4 = new class4();
		class2 ob1 = new class2();

		
	}

}
