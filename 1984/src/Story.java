import java.util.Scanner;

public class Story {
    
	String command = "";
	Scanner sc = new Scanner(System.in);

    private int story;
    private int traitorPoints;
    private int partyPoints;

    public void start() {
        story = 1;
        // Main game loop
        do {
            // 1
            while(story == 1) {
                // Introduction
                Game.slowPrint("Hello player, and welcome to the dystopian world of 1984!\n");
                Game.slowPrint("You slip into the life of Winston Smith, a 39-years old, haggard, frail, brooding and resigned man who doubts the slogans issued by the Party and it's iconic figure, Big Brother. The story takes place in Oceania, one of the three powerblocks in the world, but precicely in Airstrip 1, which is England at the time. By now, each and everyone is living under state surveillance. The state, called Ingsoc, is watching every move you make, every word you say and perhaps every thought you have...\n");		
                Game.slowPrint("How will you behave in this world?");
                Game.slowPrint("Will you be the good party member and act accordingly, or will you...resist?");
                Game.slowPrint("The outcome of this game is up to you.\n");
                Game.slowPrint("----------------------------------------");
                System.out.println("Press any key to continue.");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
            
                // First story            
                System.out.println("You stand at the bottom of the stairs to get in your apartment.");
                System.out.print("\n\n"); 
                System.out.println("(a): Despite your discomfort, you silently begin the climb to the 7th floor.");
                System.out.println("(b): You loudly rumble about the bad situation these days and the lack of electricity.\n");

                System.out.print("> ");
                String choice = sc.nextLine().toLowerCase();

                switch (choice) {
                    case "a": 
                        // 1a -> 2
                        story = 2;
                        partyPoints++;
                    break;

                    case "b":
                        // 1b -> 3
                        traitorPoints++;
                        story = 3;
                    break;
                }
            }
            while(story == 2) {
                Game.clrscr();
                System.out.println("After a while, several breaks and a lot of sweat, you step into your flat.");
                System.out.print("\n");
                System.out.println("In your apartment you feel thirsty. You take the bottle of Victory Gin, open it and fill your glass:");
                System.out.print("\n\n"); 
                System.out.println("(a): After one glass the spirits are awakened"); 
                System.out.println("(b): The day was hard and the sorrow was great. You fill and empty the glass several times."); 

                System.out.print("> ");
                String choice = sc.nextLine();
            
                switch (choice) {
                    case "a": 
                        story = 4;
                    break;

                    case "b": 
                        System.out.println("The alcohol makes you forget your caution.");
                        System.out.println("Swaying, you go to the living room, sit down at the table and take out the diary. (+TP)");
                        traitorPoints++;
                        story = 5;
                    break;
                }
            }
            while(story == 3) {   
                Game.clrscr();
                System.out.println("-----------------------------------------------------------");
                System.out.println("Your untypical, rebellious behavior is immediately noted...");
                System.out.println("Your current Traitor Points are: " + traitorPoints);
                System.out.println("Your current Party Points are: " + partyPoints);
                System.out.println("-----------------------------------------------------------");
                System.out.println("\n");
                System.out.println("In the moment you step into your flat, a noisy loud, croaking female voice pierces your ear and confronts you with your statements.");
                System.out.print("\n\n"); 
                System.out.println("\t(a): You apologize 1000 times and refer to the hard day and your old body and illness."); 
                System.out.println("\t     Swear that you be a good member of INGSOC, and you would love BIG BROTHER.");
                System.out.println("\t(b): Full annoyed about the situation and the lack of privacy you put out your shoe and throw it against the Telescreen,"); 
                System.out.println("\t     which shattered in 10000 pieces.\n");

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a": 
                        story = 1;
                    break;

                    case "b": 
                        story = 2;
                    break;
                }
            }   
            while(story == 4) {
                Game.clrscr();  
                System.out.println("You go back to the living room, sit down to the place in the alcove which is invisible for the telescreen and take the diary book.");     
                System.out.println("Write the diary when someone is knocking on the door ");
                System.out.print("\n\n"); 
                System.out.println("(a): You open the door without think about to hide the book. ");
                System.out.println("(b): Annoyed by the interruption, you sit still as a mouse. You heard steps away. \n");

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a": 
                        story = 1;
                    break;

                    case "b": 
                        story = 2;
                    break;
                }
            }
            
    command = sc.next();
    // End main game loop
    } while(!command.equals("exit") && traitorPoints == 10);
    } 
}

// // Story generator
// while(story == 0) {
//     Game.clrscr();       
//     System.out.println("<Story start>");
//     System.out.print("\n\n"); 
//     System.out.println("(a): ");
//     System.out.println("(b): \n");

//     System.out.print("> ");
//     String choice = sc.nextLine();

//     switch (choice) {
//         case "a": 
//             story = <nr>;
//         break;

//         case "b": 
//             story = <nr>;
//         break;
//     }
// }