import java.util.Scanner;

class Mythread extends Thread {
	Mythread() {
		super("child thread");
		System.out.println(this.getName() + " started");
		start();
	}

	public void run() {

		for (int i = 1; i <= 5; i++) {
			try {
				System.out.println(i + "child thread");
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println("Thread interrupted");
			}
		}
	}
}

public class exp6_a {

	public static void main(String[] args) {
		// TODO code application logic here

		Mythread t1 = new Mythread();

		try {
			for (int j = 1; j <= 5; j++)
				System.out.println("Main thread");
			Thread.sleep(1000);
			t1.run();

		} catch (InterruptedException e) {
			System.out.println("Exception caught");
		}
	}

}
