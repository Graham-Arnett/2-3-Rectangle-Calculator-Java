package rectangle;
import java.util.Scanner;

public class RectCalc {

	public static void main(String[] args) {
		
		//here we will make a rectangle calculator
		//as we know, a rectangle has four sides, and has two pairs of equal sides, unless you count squares as rectangles in which those are all equal
		Scanner scanner = new Scanner(System.in);
		String choice;
		do {
		System.out.print("Enter an integer: ");
		int length = scanner.nextInt();
		
		System.out.print("Enter another: ");
		int width = scanner.nextInt();
		
		int area = length * width;
		int perimeter = (length * 2) + (width * 2);
		
		System.out.println("The rectangle has an area of: " + area);
		System.out.println("The rectangle has a perimeter of: " + perimeter);
		
		System.out.print("Would you like to go again? (y/n): ");
		choice = scanner.next();
		}while(choice.equalsIgnoreCase("y"));

	}

}
