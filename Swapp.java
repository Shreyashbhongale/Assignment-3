import java.util.Scanner;

public class Swapp {
    public static void main (String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Entre 4 Digit No. = ");
	int n = sc.nextInt();
	int x = (n / 100)  + (n % 100)*100;
	System.out.println("Swap 2nd half No. = " + x);

}}