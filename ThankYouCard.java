import java.util.Scanner;
class ThankYouCard {
	private void PrintThankYou() {
		Scanner input = new Scanner(System.in);
		System.out.println("THANK YOU CARD GENERATOR 1.1.3");
		System.out.println("CHOICES:\nThank you very much for the [gift] [name]! I really liked it! (1)\nThanks [name] for the [gift]! (2)\nAmazing gift. Thank you [name]! (3)");
		System.out.println("Enter the item you received as a gift:");
		String gift = input.nextLine();
		System.out.println("Enter the name of the person you received the gift from:");
		String name = input.nextLine();
		String instructions = "Copy and paste the output below CTRL-Shift-V";
		System.out.println("Look at the choices. Enter the number you want.");
		int choice = input.nextInt();

		switch(choice)  {

		case 1:
		System.out.println(instructions);
		System.out.println("Thank you very much for the " + gift + " " + name + "! I really liked it!");
		break;

		case 2:
		System.out.println(instructions);
		System.out.println("Thanks " + name + " for the " + gift + "!");
		break;

		case 3:
		System.out.println(instructions);
		System.out.println("Amazing gift! Thank you " + name + "!");
		break;

		default:
		System.out.println("You did not enter a valid choice.");
		break;
		}
	}
	public static void main(String[] args) {
		ThankYouCard printProgram = new ThankYouCard();
		printProgram.PrintThankYou();
	}
}
