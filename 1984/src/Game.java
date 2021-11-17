import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Game {
	private BufferedReader input;
	private PrintStream output;

	// Get-Methode
	public Game() {
		this.input = new BufferedReader(new InputStreamReader(System.in));
		this.output = System.out;
	}

	// Die run() Methode startet das Spiel
	// throws IOException bedeutet, dass ein Error auftritt, wenn z.B. keine Tastatur angeschlossen ist
	public void run() throws IOException {
		String command = "";

		// Das Spiel läuft, bis der user den Buchstaben "e" eingibt
		while(!command.equals("exit")) {
			// Eingabe
			this.output.print("> ");
			command = this.input.readLine();
			// Verarbeitung
			String outputString = "Kommando war " + command;
			// Ausgabe
			this.output.println(outputString);
			this.output.println();
		}
	}
}
	