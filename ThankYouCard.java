import java.util.Scanner;
class ThankYouCard {
	private void PrintThankYou() {
		Scanner input = new Scanner(System.in);
		System.out.println("Thank You Card Generator");
		System.out.println("TEMPLATE: Thank you very much for the [gift] [name]!I really liked it!");
		System.out.println("Enter the item you received as a gift:");
		String gift = input.nextLine();
		System.out.println("Enter the name of the person you received the gift from:");
		String name = input.nextLine();
		String instructions = ("Copy and paste the output below CTRL-Shift-V");
		System.out.println("Thank you very much for the " + gift + " " + name + "! I really liked it!");
	}
	public static void main(String[] args) {
		ThankYouCard printProgram = new ThankYouCard();
		printProgram.PrintThankYou();
	}
}
