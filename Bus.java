import java.util.Scanner;

public class Bus {
    public static void main (String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Entre the no of passanger = ");
	int p = sc.nextInt();

	int x = 50*( p/50);
	
	System.out.println("people travelling = " + x);

	}}