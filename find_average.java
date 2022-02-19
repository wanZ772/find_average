// coded by wanz

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner get_data = new Scanner(System.in);
		
		int length = 0;
		int data = 0;
		
		while (true)  {
		    length++;
		    System.out.print("Enter number: ");
		    double number = get_data.nextInt();
		    System.out.print("Your average is: " + String.format("%.2f", ((data + number) / length)));
		    System.out.print("\n\nEnter number: ");
		    data += number;
		    if (number < 0) {
		        break;
		    }
		    
		}
		
	}
}
