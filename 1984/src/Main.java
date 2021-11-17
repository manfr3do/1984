import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //Winston
		Character character = new Character();
		Character.WinstonSmith WinstonSmith = character.new WinstonSmith();
				WinstonSmith.setName("Smith");
				WinstonSmith.setVorName("Winston");
				WinstonSmith.setAlter(39);
				WinstonSmith.setKranktheiten("healty");
				WinstonSmith.setHealthPoints(100);
				WinstonSmith.setTraitorPoints(0);
				WinstonSmith.setPartyPoints(0);

        // Introduction
		System.out.println("Hello player, and welcome to the dystopian world of 1984!\n");
		System.out.println("You slip into the life of Winston Smith, a 39-years old, haggard, frail, brooding and resigned man who doubts the slogans issued by the Party and it's iconic figure, Big Brother. The story takes place in Oceania, one of the three powerblocks in the world, but precicely in Airstrip 1, which is England at the time. By now, each and everyone is living under state surveillance. The state, called Ingsoc, is watching every move you make, every word you say and perhaps every thought you have...\n");		
		System.out.println("How will you behave in this world?");
		System.out.println("Will you be the good party member and act accordingly, or will you...resist?");
		System.out.println("The outcome of this game is up to you.\n");
		System.out.println("----------------------------------------");
		System.out.println("Press \"s\" to start the game or type \"exit\" to quit the game\n");

        Game game = new Game();
        game.run();
    }
}
