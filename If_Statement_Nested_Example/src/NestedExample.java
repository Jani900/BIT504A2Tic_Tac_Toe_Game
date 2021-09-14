import java.util.Scanner;
public class NestedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		/*int age, height,weight;
		System.out.println("Enter your age: ");
		age = scanner.nextInt();
		System.out.println("Enter your weight");
		weight = scanner.nextInt();
		
		if (weight > 200) {
			System.out.println("Your too fat");}
		
		else if(age >= 10) {
			
			System.out.println("Enter your height(cm): ");
			height = scanner.nextInt();
			
			if(height < 150) {
				System.out.println("You are too short sorry...");
				
			
			
			
			}
			else if(height > 200) {
				System.out.println("You are too tall sorry...");
			} 
			else {
				System.out.println("Enjoy your ride!");
			
			}
			
		} else {
			System.out.print("Sorry, you must be 10 or older to ride the roller coaster");
		
		}*/
		
		
		int   num1, num2, num3;
		System.out.println("Enter your number: ");
		num1 = scanner.nextInt();
		System.out.println("Enter your number: ");
		num2 = scanner.nextInt();
		System.out.println("Enter your number: ");
		num3 = scanner.nextInt();
		
		if (num1 > num2 && num1 > num3) 
		System.out.println(num1 + "is your highest number"); 
		   else if (num2 > num1 && num2 > num3) {
			   System.out.println(num2 + "is your highest number");
		   }
		
		else {
			System.out.println(num3 + " is your highest number");
		}
		
	}
}

	


