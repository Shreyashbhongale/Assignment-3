import java.util.Scanner;


public class Arm {
    public static void main (String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter 3 digit no = ");

	int a = sc.nextInt();
	
	int u;
	int t;
	int h;
	int f;

	u = a % 10;
	t = a / 10;
	h = t % 10;
	f = a / 100;

	int b = ((f*f*f) + (h*h*h) + (u*u*u));

	if (b == a) {
		System.out.println("This is armstrong no ");
	} else {
		System.out.println("This is not armstrong no");
	}

}
}	