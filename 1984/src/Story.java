import java.util.Scanner;

public class Story {
    
	String command = "";
	Scanner sc = new Scanner(System.in);

    private int story;
    private int traitorPoints;
    private int partyPoints;
    private boolean isGameOver = false;
    private int ending;
    private boolean decisionA;
    private boolean decisionB;

    public void start() {
        // Main game loop
        do {
            story = 1;
            // 1
            while(story == 1) {
                // Introduction
                Game.fastPrint("Hello player, and welcome to the dystopian world of 1984!\n\n");
                Game.fastPrint("You slip into the life of Winston Smith, a 39-years old, haggard, frail, brooding and resigned man who doubts the slogans issued by the Party and it's iconic figure, Big Brother.\n");
                Game.fastPrint("The story takes place in Oceania, one of the three powerblocks in the world, but precicely in Airstrip 1, which is England at the time.\n\n");
                Game.fastPrint("By now, each and everyone is living under state surveillance.\n");
                Game.fastPrint("The state, called Ingsoc, is watching every move you make, every word you say and perhaps every thought you have...\n\n");		
                Game.fastPrint("How will you behave in this world?\n");
                Game.fastPrint("Will you be the good party member and act accordingly, or will you...resist?\n\n");
                Game.fastPrint("The outcome of this game is up to you.\n");
                Game.fastPrint("----------------------------------------\n");
                System.out.println("Press any key to continue.");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
            
                // First story            
                Game.fastPrint("You stand at the bottom of the stairs to get in your apartment.");
                System.out.print("\n\n"); 
                Game.slowPrint("(a): Despite your discomfort, you silently begin the climb to the 7th floor.");
                System.out.print("\n");
                Game.slowPrint("(b): You loudly rumble about the bad situation these days and the lack of electricity.");
                System.out.print("\n");

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
                Game.fastPrint("After a while, several breaks and a lot of sweat, you step into your flat.");
                System.out.print("\n\n"); 
                Game.slowPrint("In your apartment you feel thirsty. You take the bottle of Victory Gin, open it and fill your glass:");
                System.out.print("\n\n"); 
                Game.slowPrint("(a): After one glass the spirits are awakened");
                System.out.print("\n");
                Game.slowPrint("(b): The day was hard and the sorrow was great. You fill and empty the glass several times.");
                System.out.print("\n");

                System.out.print("> ");
                String choice = sc.nextLine().toLowerCase();
            
                switch (choice) {
                    case "a": 
                        story = 4;
                    break;

                    case "b": 
                        traitorPoints++;
                        story = 5;
                    break;
                }
            }
            while(story == 3) {   
                Game.clrscr();
                System.out.println("-----------------------------------------------------------");
                Game.fastPrint("Your untypical, rebellious behavior is immediately noted...");
                System.out.print("\n");
                System.out.println("-----------------------------------------------------------");
                Game.fastPrint("In the moment you step into your flat, a noisy loud, croaking female voice pierces your ear and confronts you with your statements.");
                System.out.print("\n\n"); 
                Game.slowPrint("(a): You apologize 1000 times and refer to the hard day and your old body and illness.");
                Game.slowPrint("Swear that you be a good member of INGSOC, and you would love BIG BROTHER.");
                System.out.print("\n");
                Game.slowPrint("(b): Full annoyed about the situation and the lack of privacy you put out your shoe and throw it against the Telescreen,"); 
                Game.slowPrint("which shattered in 10000 pieces.");
                System.out.print("\n");

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a": 
                        story = 4;
                    break;

                    case "b": 
                        story = 6;
                    break;
                }
            }   
            while(story == 4) {
                Game.clrscr();  
                Game.fastPrint("You go back to the living room, sit down to the place in the alcove which is invisible for the telescreen and take the diary book.");
                System.out.print("\n\n");    
                Game.slowPrint("You are writing a diary entry when suddenly someone is knocking on the door...");
                System.out.print("\n\n"); 
                Game.slowPrint("(a): You open the door without thinking about hiding the book.");
                System.out.print("\n"); 
                Game.slowPrint("(b): Annoyed by the interruption, you sit still as a mouse. After a minute you hear someone step away.");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a": 
                        decisionA = true;
                        story = 8;
                    break;

                    case "b": 
                        story = 7;
                    break;
                }
            }
            while(story == 5) {
                Game.clrscr();    
                System.out.println("The alcohol makes you forget your caution.");
                System.out.println("Swaying, you go to the living room, sit down at the table and take out the diary. (+TP)");   
                System.out.println("When you take the book, immediately a noisy voice fills the room: „Comrade! What do u have there in your hand “? Shocked you sit straight.");
                System.out.print("\n\n"); 
                System.out.println("(a): Babbling something like you just make notes for your work. Ideas you have, for a good, trustful storyline.");
                System.out.println("(b): You drank to much Gin and no good answer comes into your mind. You shutter some words like it would be nothing and you don´t know what it is and where it came from.");

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a": 
                        story = 4;
                    break;

                    case "b": 
                        story = 6;
                    break;
                }
            }
            while(story == 4) {
                Game.clrscr();  
                Game.fastPrint("You go back to the living room, sit down to the place in the alcove which is invisible for the telescreen and take the diary book.");
                System.out.print("\n\n");    
                Game.slowPrint("You are writing a diary entry when suddenly someone is knocking on the door...");
                System.out.print("\n\n"); 
                Game.slowPrint("(a): You open the door without thinking about hiding the book.");
                System.out.print("\n"); 
                Game.slowPrint("(b): Annoyed by the interruption, you sit still as a mouse. After a minute you hear someone step away.");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a":
                        decisionA = true; 
                        story = 8;
                    break;

                    case "b": 
                        story = 7;
                    break;
                }
            }
            while(story == 6) {
                Game.clrscr();    
                System.out.println("In full panic you try to think about your options...");
                System.out.print("\n\n"); 
                System.out.println("(a): You put on your shoes and run out of the flat, down the stairs and on the street.");
                System.out.println("(b): You sit down at your chair after taking the gin from the kitchen. 'All is lost', you think and wait for them.");

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a": 
                        ending = 1;
                        isGameOver = true;
                    break;

                    case "b": 
                        ending = 2;
                        isGameOver = true;
                    break;
                }
                break;                
            }
            while(story == 7) {
                Game.clrscr();  
                System.out.println("After 10 minutes it knocks again.");
                System.out.println("Angry you walk to the door and open it.");
                System.out.println("Mrs Parson and her children stand in front of the door.");
                System.out.println("Mrs Parson and her children stand in front of the door.");
                System.out.println("Immediately the littles run into your flat, while shooting at you with toy guns.");
                System.out.println("They always play little spies who discover traitors.");
                System.out.println("They reach the table where the book was left open.");
                System.out.println("Winstons heart slips in pants, while the boy got big eyes, when he reads the words 'DOWN WITH BIG BROTHER'….");
                System.out.println("Knowing the meaning of the words, he starts to scream „Traitor! Traitor! He is a traitor! (+TP)");
                
                System.out.print("\n\n");    
                System.out.println("Fast you grab the neck of the boy, turn him around, that his eyes look at yours and");
                System.out.print("\n\n"); 
                System.out.println("(a): Explain him that the book is from your work. It is to learn about the ways traitors think and how you can unmask them.");
                System.out.print("\n"); 
                System.out.println("(b): While you think about a good lie to tell the boy, he makes out of your grab, run into the floor and keep screaming: “traitor, traitor, the comrade is a traitor.” ");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a": 
                        story = 8;
                    break;

                    case "b": 
                        ending = 3;
                        isGameOver = true;
                    break;
                }
                break; 
            }
            while(story == 8) {
                Game.clrscr();
                if(decisionA) {
                    System.out.println("Mrs Parson stands in front of you and asks for your help. You agree, happy that she had not notice the diary. You follow her in her flat. Something must be repaired, the kitchen sink or something else. Of course. To live in these old houses from the 1930 means to fix something very often. Because of your own experience to repair things on your own flat, you got skills and finish the work very fast. After a short talk to Mrs Parsons terrible children, you leave the apartment and go back in your own. (+ PP).");
                }  else {
                    System.out.println("He feels that he has discovered a real spy.");
                    System.out.println("With a smile of admiration, he looks in your face.");
                    System.out.println("He opens his mouth to ask you 1000 questions how it would be to be a spy, how many traitors you had unmask and many more. But his mother stopped him.");
                    System.out.println("She asks you for your help to repair her kitchen sink.");
                    System.out.println("You agree and go with her in her flat.");
                    System.out.println("After work you take the way back to your apartment. (+PP)");
                } 

                    
                
                System.out.print("\n\n");    
                System.out.println("The next day. You are at work in the Ministry of Truth. You must correct a part of an article in which BIG BROTHER said that Eurasia would leave South India and attack North Africa. But it happened the other way around");
                System.out.print("\n\n"); 
                System.out.println("(a): A warm feeling comes around you. You enjoy writing on tasks like this. It needs a good, realistic story but not to far away from the truth, that all would trust it.");
                System.out.print("\n"); 
                System.out.println("(b): You are tired because you had a nightmare last night and slept very bad. You can´t stay concentrate and your thoughts are at lunch. You start writing very fast. This work must be done before lunch.");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a": 
                        story = 11;
                    break;

                    case "b": 
                        story = 9;
                    break;
                }
            } 
            while(story == 9) {
                Game.clrscr();  
                System.out.println("When finished the work you skim the new article.");
                System.out.println("There are a few little mistakes, which you just can make out, if you have read the original article.");
                System.out.println("You think by yourself that it would be good enough, put it into the pneumatic tube and go ahead at work.");
                System.out.println("Then it rings for lunch. You go to the cafeteria. (+TP)");       
                
                System.out.print("\n\n");    
                System.out.println("Just when you leave your cubicle a man stands in front of you. In his hand he has a piece of paper. You see the heading and realize that it´s the article you wrote a few moments ago. 'Comrade!' He says, “we have to talk about this article you wrote! There are some points that will not work!”");
                System.out.print("\n\n"); 
                System.out.println("(a): You curse yourself and your laziness. Nervous you say that you will fix it immediately after lunch and promise to take more care next time.");
                System.out.print("\n"); 
                System.out.println("(b): Angry and tired you say that it would be good enough for all the sheep out there. Nobody would ever notice that this version was rewrite. And above all what the man thinks, who he is to decide, if his work was good or not.");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a": 
                        story = 11;
                    break;

                    case "b": 
                        story = 10;
                    break;
                }
            } 
            while(story == 10) {
                Game.clrscr();  
                System.out.println("The man seems very surprised. With wide eyes he replies that he is from the management of the correction department. He asks you what the hell you think, who you are and turns around ready to leave. (+TP)");     
                
                System.out.print("\n\n");    
                System.out.println("You feel cold and empty. Your hands begin to sweat and your legs feel like rubber.");
                System.out.print("\n\n"); 
                System.out.println("(a): You feel a painful stitch in the abdomen but take the paper from the man, mumble an apology and say you will fix it after lunch.");
                System.out.print("\n"); 
                System.out.println("(b): Your face turns pale. You hold the man´s shoulder and stammer out an apology. You had no idea who he was and of course you will fix the article right after lunch. Even if it will cost the whole night.");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a": 
                        decisionA = true;
                        story = 11;
                    break;

                    case "b": 
                        decisionB = true;
                        story = 11;
                    break;
                }
            }
            while(story == 11) {
                Game.clrscr(); 
                if(decisionA) {
                    System.out.println("You put the damn article on your desk, very angry that you must continue at this task and walk in the cafeteria. (+TP)");
                } else {
                    System.out.println("You go to the canteen with the feeling that you have just managed to get your head out of the noose. (+PP)");
                }
                
                System.out.print("\n\n");    
                System.out.println("At the canteen you meet with Syme. He talks about the eleventh edition of Newspeak. He asks you if you have an idea how he could rewrite or exchange some words.");
                System.out.print("\n\n"); 
                System.out.println("(a): In thoughts and exhausted from your work you say that all the time a new edition is truly bullshit and not necessary. It is always very terrible to remember which words are part of the new edition.");
                System.out.print("\n"); 
                System.out.println("(b): Happy about your finished work and that there is someone you can talk to and help you agree. ");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a": 
                        story = 12;
                    break;

                    case "b": 
                        decisionB = true;
                        story = 14;
                    break;
                }
            }
            while(story == 12) {
                Game.clrscr(); 
                System.out.println("Syme`s eyebrows climb over the roof while his underlip reach the basement. He stammers something like you wouldn´t have an idea how important this is and that you better take care what and to whom you say things like this. Then he stands up and fast goes his way. (+TP)");
                
                System.out.print("\n\n");    
                System.out.println("One moment later you realize what you have said, jump up and follow him to the corridor.");
                System.out.print("\n\n"); 
                System.out.println("(a): When you stand next to him you grab his arm, turn him around and say that it was just a bad joke. You explain him that it´s very hard to do your job while all a few days the words switched but that you truly see the function of rewriting Newspeak and he makes a great job on it.");
                System.out.print("\n"); 
                System.out.println("(b): Two metres behind him you jump on his back and push him on the wall. You whistle in his ear that you can proof he is guilty in thoughtcrime, and you would if he ever tells anyone what you have said. You start to scream that you give a damn on the 11th edition of Newspeak, the party and BIG BROTHER. And if he talks to anyone you would not be the only who get vaporized.");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a": 
                        story = 14;
                    break;

                    case "b": 
                        story = 13;
                    break;
                }
            }
            while(story == 13) {
                Game.clrscr(); 
                System.out.println("Pale he swears that he never will tell anyone what you said and runs away. You turn around and see it on the wall. The telescreen was “watching and listening” to you. You were loud enough that your voice was clear and good to understand. (+TP)");
                
                System.out.print("\n\n");    
                System.out.println("Just a few seconds later you find yourself surrounded by several dark dressed men. You have no illusions about what they want and who they are.");

                System.out.print("\n\n"); 
                System.out.println("(a): You decide not now, not like this! You take a run-up, push one aside and run.");
                System.out.print("\n"); 
                System.out.println("(b): You know now it is the end. Your lack of control will cost you your neck this time. You raise your arms and surrender. ");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a":
                        ending = 4;
                        isGameOver = true;
                    break;

                    case "b": 
                        ending = 5;
                        isGameOver = true;
                    break;
                }
            break;
            }
            while(story == 14) {
                Game.clrscr(); 
                if(decisionB) {
                    System.out.println("Until Comrade Parson comes to your table you make up new words. When he arrives, you change the subject of the conversation. (+PP)");
                } else {
                    System.out.println("It seems that you just hurt Syme, when you told him his work is useless and bullshit. But now he calms. He pats you on the shoulders, smiles and says that he was shocked about your words but never thought that it was your real opinion. Then he goes his way. (+PP)");
                }
                
                System.out.print("\n\n");    
                System.out.println("During a walk you hear a loud explosion some blogs away. A bomb dropped. You are afraid. Was it the last or will others follow? Should you run or should you take cover?");
                System.out.print("\n\n"); 
                System.out.println("(a): Better let this street behind you! You run around the next corner.");
                System.out.print("\n"); 
                System.out.println("(b): Often other bombs follow and the first was blogs away. You better stay here laying on the ground.");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a":
                        ending = 6;
                        isGameOver = true;
                    break;

                    case "b": 
                        story = 15;
                    break;
                }
            break;
            }
            while(story == 15) {
                Game.clrscr(); 
                System.out.println("Another bomb drops. It missed you but destroys a group of houses two hundred metres up the street. You still lie on the ground for 5 minutes more. Then you decide to make out of the area. (+PP)");
                                
                System.out.print("\n\n");    
                System.out.println("You pass another corner and stand in front of a bar for proles. You step in. Maybe you can find out something about the time before Big Brother here.");
                
                System.out.print("\n\n"); 
                System.out.println("(a): A pack of proles are talking about the lottery at the counter. You go next to them and ask if they remember the time before INGSOC.");
                System.out.print("\n"); 
                System.out.println("(b): An old, drunk man asks loud for another drink, but the barkeeper just said: “No money, no drink!” You buy two drinks and sit down at the table of the old.");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a":
                        story = 17;
                    break;

                    case "b": 
                        story = 16;
                    break;
                }
            }
            while(story == 16) {
                Game.clrscr(); 
                System.out.println("The old man is happy about the drink. You ask about the time when he was young. (+TP)");
                                
                System.out.print("\n\n");    
                System.out.println("The old man is drunk and babbles little useful. You are not sure what to do with him.");
                
                System.out.print("\n\n"); 
                System.out.println("(a): Hopeful that he will bring out some interesting stuff you buy one drink after another.");
                System.out.print("\n"); 
                System.out.println("(b): Annoyed by his nonsense you stand up and leave the bar.");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a":
                        decisionA = true;
                        story = 17;
                    break;

                    case "b": 
                        story = 17;
                    break;
                }
            }
            while(story == 17) {
                Game.clrscr(); 
                if(decisionA) {
                    System.out.println("You paid seven drinks for the old but he doesn´t say anything interesting. You leave the bar and walk along the street that looks very familiar to you. (+TP)");
                } else {
                    System.out.println("Outside you go along a street that looks very familiar to you. (+PP)");  
                }
                                
                System.out.print("\n\n");    
                System.out.println("Next to you is the little shop where you once bought the diary book. Indecisively you stand in front of the door. Then you decide to go in. Inside the fulfilled shop you meet the owner Mr Charrington.");
                
                System.out.print("\n\n"); 
                System.out.println("(a): Next to you is the little shop where you once bought the diary book. Indecisively you stand in front of the door. Then you decide to go in. Inside the fulfilled shop you meet the owner Mr Charrington.");
                System.out.print("\n"); 
                System.out.println("(b): You look around but here is nothing you are interested in. After a short talk to the owner, you turn around a leave the shop. ");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a":
                        // Story zu Fynn

                    break;

                    case "b": 
                        ending = 7;
                        isGameOver = true;
                    break;
                }
            }
    //command = sc.next();
    // End main game loop
    } while(!command.equals("exit") && traitorPoints == 10 || isGameOver == false);
    if(ending == 1) {
        Endings.gameOverOne();
    }
    if(ending == 2) {
        Endings.gameOverTwo();
    }
    if(ending == 3) {
        Endings.gameOverThree();
    }
    if(ending == 4) {
        Endings.gameOverFour();
    }
    if(ending == 5) {
        Endings.gameOverFive();
    }
    if(ending == 6) {
        Endings.gameOverSix();
    }
    if(ending == 7) {
        Endings.gameOverSeven();
    }
    } // End start()
} // End class

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