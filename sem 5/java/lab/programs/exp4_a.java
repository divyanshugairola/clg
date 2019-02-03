
abstract class figure {
	double a1, a2;

	figure(double dim1, double dim2) {
		a1 = dim1;
		a2 = dim2;
	}

	abstract void area();
}

class rectangle extends figure {

	rectangle(double dim1, double dim2) {
		super(dim1, dim2);
		System.out.println("inside rectangle");
	}

	void area() {
		System.out.println("Area is "+a1 * a2);
	}
}

class triangle extends figure {

	triangle(double dim1, double dim2) {
		super(dim1, dim2);
		System.out.println("inside triangle");
	}

	void area() {
		System.out.println("Area is "+a1 * a2 * 0.5);
	}
}

public class exp4_a {

	public static void main(String[] args) {
		figure f;
		f=new rectangle(1, 2);
		f.area();
		f=new triangle(3, 4);
		f.area();
		

	}

}
