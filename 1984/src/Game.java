import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Game {
	public static void clrscr(){
		try {
			if (System.getProperty("os.name").contains("Windows"))
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			else
				Runtime.getRuntime().exec("clear");
		} catch (IOException | InterruptedException ex) {}
	}
	String command = "";
	Scanner sc = new Scanner(System.in);
			
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
	public void start() {

	}
	
}
	