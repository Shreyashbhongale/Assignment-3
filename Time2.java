import java.util.Scanner;


public class Time2 {
    public static void main (String[] args) {

	Scanner sc = new Scanner(System.in);

	System.out.println("Enter 4 digit time = ");
	String s;
	int a = sc.nextInt();

	int v = a;
	int m = v % 100;
	
	v = v/100;
	if ( v > 12 && v <= 24) {
		s = "pm";
	} else {
		s = "am";
	} 
	int h = v/2;
	System.out.println( a + ">>>" + h + " : " + m + s);

}}
	
	