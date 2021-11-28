import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	String command = "";
		Scanner sc = new Scanner(System.in);
		// string.trim().toLowerCase()
		// ***WORKING START CODE
		Game game = new Game();
		Story story = new Story();
		do {
			Game.clrscr();
			System.out.print("\033[32m");
			System.out.println("Type \"start\" to start the game or \"exit\" to quit the game\n");
			System.out.print("> ");
			
			command = sc.nextLine();
			
		} while(!command.equals("start") && !command.equals("exit"));
		if(command.equals("start")) {
			Game.clrscr();
			story.start();
		}
		if(command.equals("exit")) {
			System.exit(0);
		}
		// ***WORKING START CODE
		

					
		
		

		



		
        
		sc.close();
    }
}
