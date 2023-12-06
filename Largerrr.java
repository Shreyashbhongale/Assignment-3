import java.util.Scanner;

public class Largerrr {
    public static void main (String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Entre 3 Nos =");
	int a = sc.nextInt();
	int b = sc.nextInt();
	int c = sc.nextInt();

	int l = (a > b ? a : b);
	l = (l > c ? l : c);
	
	System.out.println("large no =" + l);

}}