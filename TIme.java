import java.util.Scanner;

public class Time {
    public static void main (String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("put the time in miliseconds = ");
	long m = sc.nextLong();


	long h = m/(1000*60*60);
	long mi =( m %  (1000*60*60)) /(1000*60);
	long s = (( m % (1000*60*60)) % (1000*60)) / 1000;

	System.out.println("Time = " + h + ":" + mi + ":" + s );

}}