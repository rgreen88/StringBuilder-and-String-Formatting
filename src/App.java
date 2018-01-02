//StringBuilder and String Formatting

public class App {

	public static void main(String[] args) {

		String info = "";
		
		//adding additional string content in a string variable... considered inefficient. Use StringBuilder instead.
		info += "My name is Ryne. ";
		info += "I play Diablo 3 on hardcore. ";
		info += "My character is a wizard named Akina. \n";
		info += "recreating strings is a waste of memory";
		
		System.out.println(info);
		
		//more efficient and saves memory since you aren't recreating string variable into memory
		StringBuilder sb = new StringBuilder("");
		
		sb.append("\nMy name is Ryne.");//can chain append
		sb.append(" ").append("Akina is my character.").append(" This is more effecient using a StringBuilder that recreating Strings as indicated above.");
		System.out.println(sb);
		
		//StringBuffer in a thread-safe version of StringBuilder.  StringBuilder is better suited for multi-threading
		//StringBuffer is older and String builder is newer.  StringBuilder is not thread-safe, but it is more light-weight
		//StringBuffer and StringBuilder are essentially the same otherwise.
		
		
		////Formatting Practices////////////////////// <--regard tabs, new lines, etc...
		System.out.println("Here is some new text with a tab.\t This is a tab. \nThis is a new line.");
		System.out.println("More text with no formatting, but it will go to new line because println was used instead of print.");
		
		//printf example
		System.out.printf("Total cost %d; quantity is %d", 5, 120);
		//%d formatting character number with number parameter in order of input. %d means number of characters wide. %10d leaves 10 blank spaces then uses argument.
		System.out.printf("\n\nThis example explains number formating like above using a number between a percentage sign and d to demonstrate character indentations using the number 10."
				+ "\nTotal cost %10d; quantity is %10d", 5, 120); //can left align using negative number (-10) %-10d for example.
		
		//loop demonstrating format of string line
		for (int i = 0; i <= 20; i++){
			System.out.printf("%2d: some text here\n", i); //indicated a width of 2 to keep text aligned from single digits to double digits
		}
		
		System.out.print("\n"); //new line using print (println and \n gives 2 new lines of course
		
		//same loop with left alignment
		for (int i = 0; i <= 20; i++){
			System.out.printf("%-2d: some text here\n", i); //left aligned with new line format
		}
		
		//new line sysout println
		System.out.println("");
		
		//same loop with left alignment with field formatting added (%s)
		for (int i = 0; i <= 20; i++){
			System.out.printf("%-2d: %s\n", i, "here is some text again in a different format order."); //field formatting added
		}
		
		//floating point formatter
		System.out.printf("Total value: %.2f\n", 5.687); //.2 indicated number of decimal places rounding up by default
		System.out.printf("Total value: %.3f\n", 5.6879); //3 decimal places auto rounding accordingly (up)
		System.out.printf("Total value: %.3f\n", 315.5544); //3 decimal places auto rounding accordingly (down)
		System.out.printf("Total value: %6.1f\n", 315.5544); //3 decimal places auto rounding accordingly (up)
		System.out.printf("Total value: %-1.1f\n", 315.5544); //3 decimal places auto rounding accordingly (up) left align

	}

}
