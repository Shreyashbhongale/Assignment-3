import java.util.Scanner;

public class Days {
    public static void main (String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Entre the days = ");
	int d = sc.nextInt();

	int y = d/365;
	d = d % 365;

	int m = d/30;
	d = d % 30;

	int w = d/7;
	d = d % 7;

	System.out.println( y + "years" + ":" + m + "Months" + ":" + w + "weeks" + ":" + d + "days" );
	

}}