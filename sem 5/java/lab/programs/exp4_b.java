interface figArea {
	public void area(int l,int b);
}
interface figPeri{
	public void perimeter(int l,int b);
}
class rect implements figArea,figPeri{
	public void area(int l,int b) {
		System.out.println("area is "+l*b);
	}
	public void perimeter(int l, int b) {
		System.out.println("perimeter is "+ (2*(l+b)));
	}
}
public class exp4_b {

	public static void main(String[] args) {
		figArea a = new rect();
		a.area(5,4);
		figPeri b = new rect();
		b.perimeter(4, 3);
		rect r = new rect();
		r.area(2, 4);
		r.perimeter(3, 2);

	}

}
