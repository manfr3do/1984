import java.io.IOException;
import java.util.concurrent.TimeUnit;

// The game class has several features for the game
public class Game {
	// Clear the terminal console
	public static void clrscr(){
		try {
			if (System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			else
				Runtime.getRuntime().exec("clear");
		} catch (IOException | InterruptedException ex) {}
	}
	
	// Output text in a slow fashion
	public static void slowPrint(String output) {
		for (int i = 0; i<output.length(); i++) {
		  char c = output.charAt(i);
		  System.out.print(c);
		  try {
			TimeUnit.MILLISECONDS.sleep(0);
		  }
		  catch (Exception e) {
	
		  }
		}
	  }

	  // Output text in a fast fashion
	  public static void fastPrint(String output) {
		for (int i = 0; i<output.length(); i++) {
		  char c = output.charAt(i);
		  System.out.print(c);
		  try {
			TimeUnit.MILLISECONDS.sleep(0);
		  }
		  catch (Exception e) {
	
		  }
		}
	  }
}
	