package package_Java;
import java.util.InputMismatchException;
import java.util.Scanner;
class NotValueException extends Exception{
	public NotValueException(String s) {
		super(s);
	}
}
public class Main{
	public static void main(String[]args) {
		
	Scanner scan=new Scanner(System.in);
	System.out.print("Enter the name: ");
	String name=scan.nextLine();
	System.out.print("Enter the age: ");
	int age=scan.nextInt();
	try {
		if(name.equals("vaishu")) {
			throw new NotValueException("same name");
		}
		else {
			System.out.println("not same");
		}
		if(age>18) {
			throw new NotValueException("eligible to vote");
		}
		else {
			System.out.println("not eligible to vote");
		}
	}
	catch(InputMismatchException e) {
		System.out.println("inputmis match error");
	}
	catch(NotValueException e) {
		System.out.println(e);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	scan.close();
	}
}



output:
Enter the name: venkatesh
Enter the age: 30
not same
package_Java.NotValueException: eligible to vote
