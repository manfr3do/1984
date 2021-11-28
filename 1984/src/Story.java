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
    private boolean decisionC;

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
                System.out.println("When you take the book, immediately a noisy voice fills the room: â€žComrade! What do u have there in your hand â€œ? Shocked you sit straight.");
                System.out.print("\n\n"); 
                System.out.println("(a): Babbling something like you just make notes for your work. Ideas you have, for a good, trustful storyline.");
                System.out.println("(b): You drank to much Gin and no good answer comes into your mind. You shutter some words like it would be nothing and you donÂ´t know what it is and where it came from.");

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
                System.out.println("Winstons heart slips in pants, while the boy got big eyes, when he reads the words 'DOWN WITH BIG BROTHER'â€¦.");
                System.out.println("Knowing the meaning of the words, he starts to scream â€žTraitor! Traitor! He is a traitor! (+TP)");
                
                System.out.print("\n\n");    
                System.out.println("Fast you grab the neck of the boy, turn him around, that his eyes look at yours and");
                System.out.print("\n\n"); 
                System.out.println("(a): Explain him that the book is from your work. It is to learn about the ways traitors think and how you can unmask them.");
                System.out.print("\n"); 
                System.out.println("(b): While you think about a good lie to tell the boy, he makes out of your grab, run into the floor and keep screaming: â€œtraitor, traitor, the comrade is a traitor.â€� ");
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
                System.out.println("(b): You are tired because you had a nightmare last night and slept very bad. You canÂ´t stay concentrate and your thoughts are at lunch. You start writing very fast. This work must be done before lunch.");
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
                System.out.println("Just when you leave your cubicle a man stands in front of you. In his hand he has a piece of paper. You see the heading and realize that itÂ´s the article you wrote a few moments ago. 'Comrade!' He says, â€œwe have to talk about this article you wrote! There are some points that will not work!â€�");
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
                System.out.println("(b): Your face turns pale. You hold the manÂ´s shoulder and stammer out an apology. You had no idea who he was and of course you will fix the article right after lunch. Even if it will cost the whole night.");
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
                System.out.println("Syme`s eyebrows climb over the roof while his underlip reach the basement. He stammers something like you wouldnÂ´t have an idea how important this is and that you better take care what and to whom you say things like this. Then he stands up and fast goes his way. (+TP)");
                
                System.out.print("\n\n");    
                System.out.println("One moment later you realize what you have said, jump up and follow him to the corridor.");
                System.out.print("\n\n"); 
                System.out.println("(a): When you stand next to him you grab his arm, turn him around and say that it was just a bad joke. You explain him that itÂ´s very hard to do your job while all a few days the words switched but that you truly see the function of rewriting Newspeak and he makes a great job on it.");
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
                System.out.println("Pale he swears that he never will tell anyone what you said and runs away. You turn around and see it on the wall. The telescreen was â€œwatching and listeningâ€� to you. You were loud enough that your voice was clear and good to understand. (+TP)");
                
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
                System.out.println("(b): An old, drunk man asks loud for another drink, but the barkeeper just said: â€œNo money, no drink!â€� You buy two drinks and sit down at the table of the old.");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a":
                    	 decisionB = true;
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
                    System.out.println("You paid seven drinks for the old but he doesnÂ´t say anything interesting. You leave the bar and walk along the street that looks very familiar to you. (+TP)");
                }else if(decisionB) {
                	System.out.println("irritated and suspicious the men look at you and your overall. Then they tell you that they don´t know about a time before and you shall go away. (+TP)");
                }else {
                    System.out.println("Outside you go along a street that looks very familiar to you. (+PP)");  
                }
                                
                System.out.print("\n\n");    
                System.out.println("Next to you is the little shop where you once bought the diary book. Indecisively you stand in front of the door. Then you decide to go in. Inside the fulfilled shop you meet the owner Mr Charrington.");
                
                System.out.print("\n\n"); 
                System.out.println("(a): You find a little paperweight from glass and a coral inside. It´s a beautiful thing. You buy it for more then the old wants for it.");
                System.out.print("\n"); 
                System.out.println("(b): You look around but here is nothing you are interested in. After a short talk to the owner, you turn around a leave the shop. ");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a":
                    	decisionA = true;
                        story = 18;

                    break;

                    case "b": 
                        ending = 7;
                        isGameOver = true;
                    break;
                }
                break;
            }
            while(story == 18) {
                Game.clrscr(); 
                System.out.println("The conversation to Mr Charrington is very interesting. He knows a lot, even the rhyme of the bells of St. Clements. The he shows you a room upstairs which looks comfortable and with no telescreen in it. Happy you leave the shop. You saw a lot of beautiful things.");                           
                System.out.print("\n\n");    
                System.out.println("A figure in blue overalls was coming down the pavement, not ten metres away. "
                		+ "It was the girl from the Fiction Department, the girl with dark hair. "
                		+ "The light was failing, but there was no difficulty in recognizing her."
                		+ " She looked him straight in the face, then walked quickly on as though she had not seen him. She must have followed him here.\n");
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("Maybe she is an agent of the Thought Police, or simply an amateur spy actuated by officiousness, hardly mattered. It was enough that she was watching him. Probably she had seen him go into the pub as well. Then the spasm passed, leaving a dull ache behind. For several seconds wondering vaguely what to do, then turned round and began to retrace his steps.\n");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("As he turned it occurred to him that the girl had only passed him three minutes ago and that by running he could probably catch up with her. He could keep on her track till they were in some quiet place, and then smash her skull in with a cobblestone. The piece of glass in his pocket would be heavy enough for the job.\n"
                		+ "\n\nFor a few seconds you are too paralysed to move. Maybe you should smash her skull with the piece of glass in a blind alley, or should he walk further? ");
                
                System.out.print("\n\n"); 
                System.out.println("(a): smash");
                System.out.print("\n"); 
                System.out.println("(b): walk");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a":
                        story = 19;
                    break;

                    case "b": 
                        story = 20;
                    break;
                }
            }
            while(story == 19) {
                Game.clrscr(); 
                System.out.println("You smashed her skull in the blind alley, and have to run away. "
                		+ "You run a few blocks and hide in a dark alley. Your heart races, has anyone seen him? "
                		+ "When the thought police find the woman, it's over.\n");
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("You has wait a bit, maybe you should walk home.\n");
                                                
                System.out.print("\n\n");    
                System.out.println("While you go home, the dead women was found by the thought police... "
                		+ "they found a piece of glass near the dead body, and asked people in the area if they had seen anything. "
                		+ "They also question Mr. Charrington, who recognizes the piece of glass and puts them on your trail.\n");
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("You had to decide, should you try to leave the city or should you wait and see what happens. \n");
                
                System.out.print("\n\n"); 
                System.out.println("(a): leave");
                System.out.print("\n"); 
                System.out.println("(b): wait");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a":
                        ending = 8;
                        isGameOver = true;
                    break;

                    case "b": 
                        ending = 9;
                        isGameOver = true;
                    break;
                }
                break;
            }
            while(story == 20) {
                Game.clrscr(); 
                System.out.println("Winston walks further, you turned to the right and walked heavily away, not noticing for the moment that you going in the wrong direction."
                		+ " At any rate, one question was settled. There was no doubting any longer that the girl was spying on you. "
                		+ "You thought also of hurrying to the Community Centre and staying there till the place closed, so as to establish a partial alibi for the evening. "
                		+ "But that too was impossible. A deadly lassitude had taken hold of you. All you wanted was to get home quickly and then sit down and be quiet.");
                                
                System.out.print("\n\n");    
                System.out.println("You´re home again, you went into the kitchen and swallow nearly a teacupful of Victory Gin.\n"
                		+ "You went to the table and took the diary out of the drawer, but you did not open it, you only stare at the cover of the book and trying without success to shut the voice out if his consciousness.\n");
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println( "It was the middle of the morning, and you had left the cubicle to go to the lavatory. "
                		+ "A solitary figure was coming towards him from the other end of the long, brightly-lit corridor.\n");
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("It was the girl with dark hair. Four days had gone past since the evening when you had run into her outside the junk-shop. "
                		+ "As she came nearer you saw that her right arm was in a sling, not noticeable at a distance because it was of the same colour as her overalls.\n");
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("Probably she had crushed her hand while swinging round one of the big kaleidoscopes on which the plots of novels were ‘roughed in’. "
                		+ "It was a common accident in the Fiction Department. They were perhaps four metres apart when the girl stumbled and fell almost flat on her face."
                		+ " A sharp cry of pain was wrung out of her. She must have fallen right on the injured arm.\n");
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("In front of you is an enemy who was trying to kill you on the other side she also was a human creature, "
                		+ "in pain and perhaps with a broken bone.\n"
                		+ "\n\nWould you help her up or go further? ");
                
                System.out.print("\n\n"); 
                System.out.println("(a): help her");
                System.out.print("\n"); 
                System.out.println("(b): ignore her and walk away");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a":
                        decisionA = true;
                        story = 21;
                    break;

                    case "b": 
                    	decisionB = true;
                        story = 21;
                    break;
                }
            }
            while(story == 21) {
                Game.clrscr(); 
                if(decisionA) {
                    System.out.println("‘You haven’t broken anything?’\n"
                    		+ "‘No, I’m all right. It hurt for a moment, that’s all.’\n"
                    		+ " She held out her free hand to you, and you helped her up. She had regained some of her colour, and appeared very much better. ‘It’s nothing,’\n"
                    		+ "she repeated shortly.\n"
                    		+ "‘I only gave my wrist a bit of a bang. Thanks, comrade!’\n"
                    		+ "And with that she walked on in the direction in which she had been going, as briskly as though it had really been nothing. "
                    		+ "In the two or three seconds while you was helping her up, the girl had slipped something into your hand. She gives you a fragment of paper.\n");
                } else {
                    System.out.println("The dark haired girls lies on the ground, her face contorts in pain.\n");
                    System.out.println("\nPress Enter to continue");
                    System.out.print("> ");
                    command = sc.nextLine();
                    Game.clrscr();
                    System.out.println("you walk down the brightly-lit corridor as if nothing had happened. you go back to your to your cubical. "
                    		+ "There ist a fragment of paper on your tabel.\n");
                }
                System.out.println("You sit down at your desk and unfold the paper. On it was written, in a large unformed handwriting: "
                		+ "I LOVE YOU. For the rest of the morning it was very difficult to work for you.");
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("You´re home again after work, and in your bed in the darkness, where you were safe, even from the telescreen so long as you kept silent. "
                		+ "Only in this moment you was able to think continuously. It was a physical problem that had to be solved: "
                		+ "how to get in touch with the girl and arrange a meeting. You decide to speak with her in the canteen.");
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("A few days later the girl is sitting alone at a table in the canteen. You try to get over. Perhaps three meters away, a voice behind you called, 'Smith'. It was Wilsher.");
                
                System.out.print("\n\n");    
                System.out.println("Do you react or do you go to the table?");
                
                System.out.print("\n\n"); 
                System.out.println("(a): you decide to react");
                System.out.print("\n"); 
                System.out.println("(b): 'Not now!' You think by yourself and walk to the table");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a":
                        decisionA = true;
                        story = 22;
                    break;

                    case "b": 
                    	decisionB = true;
                        story = 22;
                    break;
                }
            }
            while(story == 22) {
                Game.clrscr(); 
            if(decisionA) {
                System.out.println("You sit down with Wilsher, you two talk.");
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("The next day, you try to get to the canteen early to sit at her table");
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("She is there and you sit down at her table. "
                		+ "In a low murmur you begin speaking. Neither of you looked up; "
                		+ "steadily they spooned the watery stuff into their mouths, and between spoonfuls exchanged the few necessary words in low expressionless voices.");
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("‘What time do you leave work?’\n"
                		+ " ‘Eighteen-thirty.’ ‘Where can we meet?’ ‘Victory Square, near the monument.’\n"
                		+ "‘It’s full of telescreens.’\n"
                		+ " ‘It doesn’t matter if there’s a crowd.’\n"
                		+ " ‘Any signal?’\n"
                		+ " ‘No. Don’t come up to me until you see me among a lot of people. And don’t look at me. Just keep somewhere near me.’\n"
                		+ "‘What time?’\n"
                		+ "‘Nineteen hours.’\n"
                		+ "‘All right.’\n");
             }else { 
                System.out.println("You sit down at the table with the girl"); 
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("In a low murmur you begin speaking. Neither of them looked up; "
                		+ "steadily they spooned the watery stuff into their mouths, "
                		+ "and between spoonfuls exchanged the few necessary words in low expressionless voices.");
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("‘What time do you leave work?’\n"
                		+ "‘Eighteen-thirty.’\n"
                		+ "‘Where can we meet?’\n"
                		+ "‘Victory Square, near the monument.’\n"
                		+ "‘It’s full of telescreens.’\n"
                		+ "‘It doesn’t matter if there’s a crowd.’\n"
                		+ "‘Any signal?’\n"
                		+ "‘No. Don’t come up to me until you see me among a lot of people. And don’t look at me. Just keep somewhere near me.’\n"
                		+ "‘What time?’\n"
                		+ "‘Nineteen hours.’\n"
                		+ "‘All right.’\n");
            }
                System.out.print("\n\n");    
                System.out.println("You met at the Victory square, you both speaking in the same expressionless voice as before. ….\n"
                		+ "‘Can you hear me?’\n"
                		+ "‘Yes.’\n"
                		+ "‘Can you get Sunday afternoon off?’\n"
                		+ "‘Yes.’\n"
                		+ "‘Then listen carefully. You’ll have to remember this. Go to Paddington Station——’\n"
                		+ "‘Yes.’\n"
                		+ "‘You turn left, then right, then left again. And the gate’s got no top bar.’\n"
                		+ "‘Yes. What time?’\n"
                		+ "‘About fifteen. You may have to wait. I’ll get there by another way. Are you sure you remember everything?’\n"
                		+ "‘Yes.’\n"
                		+ "‘Then get away from me as quick as you can.’\n");
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("You arrange to meet in the forest.");
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("The way into the forest is difficult and surrounded by many dangers. Patrols of thought police controlled the railroad climb.");
                System.out.print("\n\n"); 
                System.out.println("When you get off the train, you run into a patrol of thought police, you are eyed skeptically. "
                		+ "You are asked where you want to go. you start sweating and have to come up with a spontaneous excuse. ");
                
                System.out.print("\n\n"); 
                System.out.println("(a): the weather is good and you want to build up your fitness so that you are ready when the enemy attacks. ");
                System.out.print("\n"); 
                System.out.println("(b): i am on my way for a walk so that i can gather new strength to do my work in the ministry of truth well.");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a":
                        story = 23;
                    break;

                    case "b": 
                    	decisionA = true;
                        story = 25;
                    break;
                }
            }
            
            while(story == 23) {
                Game.clrscr(); 
                System.out.println("the patrole lets you go. you move on towards the meeting point. "
                		+ "Arrived at the meeting point, you wait 20 minutes, the girl does not show up. you think about what you could do.");
                                
                            
                System.out.print("\n\n"); 
                System.out.println("(a): you could look around ");
                System.out.print("\n"); 
                System.out.println("(b): you keep waiting");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a":
                        story = 24;
                    break;

                    case "b": 
                    	decisionB = true;
                        story = 25;
                    break;
                }
            }
            while(story == 24) {
                Game.clrscr(); 
                System.out.println("You look around, while looking around you find a blood stain on the floor. "
                		+ "you panic. What if the blood is the girl's, maybe they got her....?");                              
                          
                System.out.print("\n\n"); 
                System.out.println("(a): Out of panic you run away ");
                System.out.print("\n"); 
                System.out.println("(b): You hide");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a":
                        ending = 10;
                        isGameOver = true;
                    break;

                    case "b": 
                    	ending = 11;
                        isGameOver = true;
                    break;
                }
                break;
            }
            while(story == 25) {
                Game.clrscr(); 
            if(decisionB) {    
                System.out.println("After a few minutes of waiting, the gils shows up and you disappear together in the forrest.");
            }else {
            	System.out.println("The tought police let you go, you go to the meeting point and wait a bit, the girl shows up and you disappear together in the forest.");
            }
            System.out.println("After the first meeting in the forest, you find to each other and slide straight into an illicit relationship."); 
            System.out.println("\nPress Enter to continue");
            System.out.print("> ");
            command = sc.nextLine();
            Game.clrscr();
            System.out.println("Her name is Julia. After a few dates in the forest you realize that you can not always meet here, you are looking for a new shelter.");          
                System.out.print("\n\n"); 
                System.out.println("Mr.Charrington comes to your mind. you could rent the small room above his store.");          
                System.out.print("\n\n"); 
                
                System.out.println("(a): Rent Room ");
                System.out.print("\n"); 
                System.out.println("(b): Further in Forest Meeting");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a":
                    	decisionA =true;
                        story = 26;
                    break;

                    case "b":
                    	decisionB = true;
                        story = 26;
                    break;
                }
            }
            while(story == 26) {
            	Game.clrscr();
            if(decisionA) {             	 
                System.out.println("It was a shabby little room, but it is enough for you tow and it is safe.");                                
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("Through the room you can meet 6 - 7 times a month and live out your love you get to know each "
                		+ "other well and at some point you both realize that you want more than just to work against the party through love, "
                		+ "you want to join the rebellion against the party. The question is how to do that.");
            } else {
            	Game.clrscr(); 
                System.out.println("You meet again in the forest. On the way into the forest, you had the feeling that you were being followed, but you couldn't see anyone. "
                		+ "Julian had the same feeling. "
                		+ "You decide that this meeting point is too risky and rent the room above Mr. Charrington's store.");                                
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("It was a shabby little room, but it is enough for you tow and it is safe.");
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("Through the room you can meet 6 - 7 times a month and live out your love you get to know each other well "
                		+ "and at some point you both realize that you want more than just to work against the party through love, you want to join the rebellion against the party. "
                		+ "The question is how to do that.");
            }
                System.out.print("\n\n"); 
                System.out.print("you don't even know if the brotherhood really exists ...."); 
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("The only person you can think of who could make a connection is O'brein. You don't even really know him.");
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("It had happend at last. The expected message had come. All your life, "
                		+ "it seemed to him, he had been waiting for his happen. He was walking down the long corridor at the Ministry and he was almost at the spot where Julia had slipped"
                		+ " the note into his hand when he became aware that someone larger than himself was walking just behind him. "
                		+ "The person, whoever it was, gave a small cough, evidently as a prelude to speaking. "
                		+ "You stopped abruptly and turned. It was O’Brien.");
                System.out.print("\n\n"); 
                System.out.print("O'Brien was part of the inner party, he approaches you about your work and asks if you are interested in the new dictionary edition of newspeak and whether you want to pick them up at his house."); 
                System.out.print("\n\n"); 
                
                System.out.println("(a): You become suspicious and decline with thanks.  ");
                System.out.print("\n"); 
                System.out.println("(b): you take the chance ");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a":
                        story = 27;
                    break;

                    case "b": 
                    	decisionB = true;
                        story = 28;
                    break;
                }
            }
            while(story == 27) {
                Game.clrscr(); 
                System.out.println("You walk further down the corridor and O'brein looks behind you, you walk further and stand in front of a T-crossing ");
                                
                System.out.print("\n\n");    
                System.out.println("The old man is drunk and babbles little useful. You are not sure what to do with him.");
                
                System.out.print("\n\n"); 
                System.out.println("(a): Your feeling is better at the right way");
                System.out.print("\n"); 
                System.out.println("(b): take the left way");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a":
                    	 ending = 12;
                         isGameOver = true;
                     break;

                     case "b": 
                     	ending = 13;
                        isGameOver = true;
                     break;
                 }
                 break;
            }
            while(story == 28) {
                Game.clrscr(); 
                System.out.println("O'Brien writes you, his address. you thank him and go on.");
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("After much deliberation, you and Julia decide to go to O'Brien and ask him about the brotherhood.");                
                System.out.print("\n\n");    
                System.out.println("The room they were Standing in was long-shaped and softly lit. The telescreen was dimmed to a low murmur; "
                		+ "the richness of the dark-blue carpet gave one the impression of treading on velvet. "
                		+ "At the far end of the room O’Brien was sitting at a table under a green-shaded lamp, with a mass of papers on either side of him.");
                System.out.print("\n\n");    
                System.out.println("With his characteristic gesture O’Brien resettled his spectacles on his nose.");
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("‘Shall I say it, or will you?’ he said.\n"
                		+ "‘I will say it,’ said Winston promptly.\n"
                		+ "‘That thing is really turned off?’\n"
                		+ "‘Yes, everything is turned off. We are alone.’\n"
                		+ "‘We have come here because——’");
                
                System.out.print("\n\n"); 
                System.out.println("(a): we wanted to pick up the dictionary ");
                System.out.print("\n"); 
                System.out.println("(b): We believe that there is some kind of conspiracy, "
                		+ "some kind of secret organization working against the Party, and that you are involved in it. ");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a":                        
                        story = 29;
                    break;

                    case "b": 
                        story = 30;
                    break;
                }
            }
            while(story == 29) {
                Game.clrscr(); 
                System.out.println("You got scared and don't dare to ask what you wanted. O'Brien looks at you a bit questioningly, but gives you the dictionary.");
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("O'Brien looks at you pithily and asks again more intensely 'is that all, or do you want to ask something else?' ");                
                                
                System.out.print("\n\n"); 
                System.out.println("(a): I have another question ");
                System.out.print("\n"); 
                System.out.println("(b): no that's all ");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a":
                        decisionA = true;
                        story = 30;
                    break;

                    case "b": 
                    	decisionB = true;
                        story = 30;
                    break;
                }
            }
            while(story == 30) {    
            	Game.clrscr();
            if(decisionA) { 
                System.out.println("We want to join it and work for it. We are enemies of the Party. We disbelieve in the principles of INGSOC. We are thought criminals. "
                		+ "We are also adulterers. I tell you this because we want to put ourselves at your mercy. "
                		+ "If you want us to incriminate ourselves in any other way, we are ready.’");
            } else if(decisionB) {
            	System.out.println("you say thank you and leave the house.");            
                System.out.println("\nPress Enter to continue");                
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("After a few days, you sit at home and wonder why O'Brien asked so explicitly if you have any other questions."); 
                System.out.println("\nPress Enter to continue");                
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("Maybe he was getting at something else. There is no other possibility, O'Brien must have meant the brotherhood."
                		+ " You decide to go to O'Brien again and ask him about the brotherhood.");  
                System.out.println("\nPress Enter to continue");                
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("You ask O'Brien about the Brotherhood."); 
                System.out.println("\nPress Enter to continue");                
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("We want to join it and work for it. We are enemies of the Party. We disbelieve in the principles of INGSOC. "
                		+ "We are thought criminals. We are also adulterers. I tell you this because we want to put ourselves at your mercy. "
                		+ "If you want us to incriminate ourselves in any other way, we are ready.’"); 
            } else {
            	System.out.println("You ask O'Brien about the Brotherhood");            
                System.out.println("\nPress Enter to continue");                
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("We want to join it and work for it. We are enemies of the Party. "
                		+ "We disbelieve in the principles of INGSOC. We are thought criminals. We are also adulterers."
                		+ "I tell you this because we want to put ourselves at your mercy. If you want us to incriminate ourselves in any other way, we are ready.’"); 
            }
            	System.out.println("O'Brien looks calm and sits down. In a longer conversation, he tells you about the whole rebellion. "
            			+ "It really exists, and you are now a part of it!");            
            	System.out.println("\nPress Enter to continue");                
            	System.out.print("> ");
            	command = sc.nextLine();
            	Game.clrscr();
            	System.out.println("You will even receive Goldstein's book within the next few weeks. A person will give it to you in public in a briefcase, just wait for the sign."); 
            	System.out.println("\nPress Enter to continue");                
            	System.out.print("> ");
            	command = sc.nextLine();
            	Game.clrscr();
            	System.out.println("After you get the briefcase, just like O'Brien said you would, you arrange to meet Julia in the little room through Mr. Charrington's store."); 
            	
            	System.out.print("\n\n"); 
                System.out.println("It is time to read the book. Goldstein's book");
            	
            	System.out.print("\n\n"); 
                System.out.println("(a): Read the book. ");
                System.out.print("\n"); 
                System.out.println("(b): Don´t read the book ");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a":                       
                        story = 33;
                    break;

                    case "b":                     	
                        story = 31;
                    break;
                }
            }
            while(story == 31) {
                Game.clrscr(); 
                System.out.println("Are you sure about this? that makes you a traitor. There will be no going back. "
                		+ "But actually, it's too late anyway, you own the book, and no one will believe you didn't want to read it.");                            
                                
                System.out.print("\n\n"); 
                System.out.println("(a): Read the book ");
                System.out.print("\n"); 
                System.out.println("(b): Put the book back in the bag  ");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a":
                    	decisionA = true;
                        story = 33;
                    break;

                    case "b": 
                        story = 32;
                    break;
                }
            }
            while(story == 32) {
                Game.clrscr(); 
                System.out.println("AYou decide not to, maybe everything I'm doing here is wrong. You look over at Julia. You think for a moment.");                            
                              
                System.out.print("\n\n"); 
                System.out.println("(a): Should I stay  ");
                System.out.print("\n"); 
                System.out.println("(b): Just go home like nothing ever happened ");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a":
                    	decisionB = true;
                        story = 33;
                    break;

                    case "b": 
                        ending = 14;
                        isGameOver = true;
                    break;
                }
            }
            while(story == 33) {    
            	Game.clrscr();
            if(decisionA) {
            	System.out.println("You and Julia read the book, while you read the book you both fall asleep one after the other.");
            } else if(decisionB) {
            	 System.out.print("You look over at Julia for a while and then fall asleep."); 
            } else {
            	System.out.println("You and Julia read the book, while you read the book you both fall asleep one after the other.");
            }
                Game.clrscr(); 
                System.out.println("When you woke up with the sensation of having slept for a long time, "
                		+ "but a glance at the old-fashioned clock told him that it was only twenty-thirty. You lay dozing for a while.");                            
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("When Julia wakes up, you talk about that again. You didn't quite read it, Julia even fell asleep before."); 
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("While Julia and you are talking, you came to the point that you're the dead."); 
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("‘We are the dead,’ you say.\n"
                		+ "‘We are the dead,’ echoed Julia dutifully.\n"); 
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("‘You are the dead,’ say an iron voice behind you.\n"
                		+ "They sprang apart. Your entrails seemed to have turned into ice. ‘You are the dead,’ repeat the iron voice.\n"); 
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("‘It is behind the picture,’ breathes Julia.\n"
                		+ "‘It is behind the picture,’ says the voice. ‘Remain exactly \n"
                		+ "where you are. Make no movement until you are ordered.’\n");  
                
                System.out.print("\n\n"); 
                System.out.println("They have discovered you and Julia. the question is what happens next. The chance of getting out of this alive is gone anyway.\n"
                		+ "The thought of escape hangs in your mind.\n"
                		+ "But they'll probably catch you anyway.\n");
                System.out.print("\n\n"); 
                System.out.println("(a): Try to escape ");
                System.out.print("\n"); 
                System.out.println("(b): Follow the telescreen's instructions");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a":                    	
                        story = 34;
                    break;

                    case "b": 
                        story = 36;
                    break;
                }
            }
            while(story == 34) {
                Game.clrscr(); 
                System.out.println("In a short jerk you jump up from the floor and run to the window, tear it open and climb onto the roof.");
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("In a moment of reflection, you ask yourself whether you want to go up on the roof or try it on the ground...");                
                                
                System.out.print("\n\n"); 
                System.out.println("(a): You try to climb to the roof ");
                System.out.print("\n"); 
                System.out.println("(b):How you should climb to the roof? It´s better to climb down ");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a":
                        story = 35;
                    break;

                    case "b": 
                    	decisionB = true;
                        story = 36;
                    break;
                }
            }
            while(story == 35) {
                Game.clrscr(); 
                System.out.println("You climb towards the roof ridge, the higher you get the more you see that the whole house is turned upside down.");
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("You have reached the roof ridge and have to decide whether to go left or right. "
                		+ "You can continue to walk on the roofs of the houses on either side.");                
                                
                System.out.print("\n\n"); 
                System.out.println("(a): Right");
                System.out.print("\n"); 
                System.out.println("(b): Left");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a":
                    	ending = 15;
                        isGameOver = true;                        
                    break;

                    case "b": 
                    	ending = 16;
                        isGameOver = true;
                    break;
                }
                break;
            }
            while(story == 36) {
            	Game.clrscr();
            if(decisionB) {                
                System.out.println("you climb from the roof into the courtyard.\n"
                		+ "Through the back door of Mr. Charrington's shop, a horde of black-uniformed men rush in and surround you.\n");
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("You are grabbed and hit in the face with a club, you black out and pass out.");                
            } else {
            	System.out.println("‘The house is surrounded,’ says the voice.");
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("‘You may as well say good-bye,’ says the voice.");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("The room is full of men in black uniforms with iron shod boots on their feet and truncheons in their hands,");
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("It turns out that Mr. Charrington is a member of the Thought Police and has \n"
                		+ "been spying on you all along.\n");
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("you kneel on the floor.... Fear-stricken, you feel only a thud on the back of your head.");
            }
                System.out.print("\n\n");
                System.out.print("\n\n");
                System.out.println("\nyou don't know where you are.  You're probably in the \n"
                		+ "the Ministry of Love, but there is no way to be\n"
                		+ "you are in a windowless cell with high ceilings and walls of glittering white porcelain. \n"
                		+ "Concealed lamps illuminated cold light, and a low, steady humming \n"
                		+ "noise, which he assumed had something to do with the \n"
                		+ "Air supply had to do with.\n"
                		+ "");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("A bench or shelf just wide enough to sit on ran along the wall,\n"
                		+ "interrupted only by the door, and at the end, opposite the door.\n"
                		+ "a toilet bowl with no wooden seat. there were also\n"
                		+ "four screens, one in each wall.\n"); 
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("Time passes, and you sit in your cell day in and day out or day in and day out? "
                		+ "In this cell you have no sense of time, you no longer know when it's day and night, people come and go"); 
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("When people are taken out of the cell, they often talk about Room 101.\n"
                		+ "no one really talks about this room, but everyone is afraid of it.\n"); 
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("After a few days or weeks, who knows, the time has come for the guards to stand outside your cell and take you to Room 101."); 
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("You roll down a long corridor until you arrive at Room 101."); 
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("Perhaps you have repressed it, but you are slowly becoming aware of what is waiting for you in Room 101."); 
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("In Room 101, you meet O'Brien, who greets you with an expressive face."); 
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("The last thing you remember is pain when You wake up. Your whole body hurts."
                		+ " You don’t know how long you are arrested now and how often O´Brien had tortured you."); 
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("You lost the half of your teeth, your hair became thin and if you had to guess, you would say your weight is just around 40 Kg. "
                		+ "Then the door opens again. A panic grows inside of you. Hands grab you roughly and pull you to your feet. Being pushed, you stagger along a corridor."); 
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("You get hold in front of a door. The door number 101. You know what is inside waiting for you. Tears running down your face. "
                		+ "You are being pushed in, put on a chair and shackles around arms, body and legs. Then O´Brien stand next to you and asks you how much two plus two is."); 
                
                System.out.print("\n\n");
                System.out.println("(a): You say that it is four. How could it be otherwise?");
                System.out.print("\n"); 
                System.out.println("(b): In fear of torture you scream out that it is five.");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a":
                        story = 37;
                    break;

                    case "b":
                        story = 38;
                    break;
                }
            }
            while(story == 37) {
                Game.clrscr(); 
                System.out.println("Winston... Why?\n"
                		+ "I don't want to hurt you.\n");
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("O'Brien goes to the table and comes back with a pair of tongs."); 
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("he gleefully puts the tong on your fingernail and pulls it out"); 
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("Winston.... tell me how much is two plus two?"); 
                                
                System.out.print("\n\n"); 
                System.out.println("(a): Four");
                System.out.print("\n"); 
                System.out.println("(b): Five");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a":
                    	decisionA = true;
                        story = 39;
                    break;

                    case "b": 
                    	decisionB = true;
                        story = 39;
                    break;
                }
            }
            while(story == 38) {
                Game.clrscr(); 
                System.out.println("Okay, that's right.... but do you mean what you say, or do you just say it?");
               
                System.out.print("\n\n"); 
                System.out.println("(a): You mean what you say ");
                System.out.print("\n"); 
                System.out.println("(b): You just say it ");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a":
                        story = 39;
                    break;

                    case "b":
                    	decisionC = true;
                        story = 39;
                    break;
                }
            }
            while(story == 39) {
                Game.clrscr(); 
            if(decisionA) {
            	 System.out.println("This is not what O’Brien wanted to hear");
                 System.out.println("\nPress Enter to continue");
                 System.out.print("> ");
                 command = sc.nextLine();
                 Game.clrscr();
                 System.out.println("With a dirty smile, he puts the tong on your teeth and breaks them out."); 
            } else if(decisionB) {        	
                System.out.println("That sounds better Winston");
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("We are slowly getting closer.");
            } else if(decisionC) { 
            	System.out.println("O’Brien hits him with a powerful blow to the nose."); 
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("A loud crack surfs through the room and you notice warm blood dripping down your chin."); 
            } else {
            	System.out.println("Well, well Winston....\n"
            			+ "you are starting to sound like a party member\n");
            }
            	System.out.print("\n\n"); 
            	System.out.println("How long have we been playing this game Winston, days, weeks, months?");
            	System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("Sometimes I feel like I'm making progress with you, but you must convince me.");
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("Do you love the party, Winston?");
                            
                System.out.print("\n\n"); 
                System.out.println("(a): Yes, the party is what we need and what I love");
                System.out.print("\n"); 
                System.out.println("(b): No, I don't love the party.... the party must be destroying");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a":
                    story = 40;
                    break;

                    case "b":
                        story = 41;
                    break;
                }
            }
            while(story == 40) {
                Game.clrscr(); 
                System.out.println("this is what we like to hear");
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("it goes ahead");
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("Would you die for the party Winston?");
               
                System.out.print("\n\n"); 
                System.out.println("(a): Yes... I would die for the Party...");
                System.out.print("\n"); 
                System.out.println("(b): .... no...no I wouldn't");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a":
                    	decisionA = true;
                        story = 42;
                    break;

                    case "b":
                    	ending = 17;
                    	isGameOver = true;
                    break;
                }
                break;
            }
            while(story == 41) {
                Game.clrscr(); 
                System.out.println("O'Brien grabs a scalpel");
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("Did you know that you can easily peel a person's skin off without them dying?"); 
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("O'Brien cuts a corner in the skin of your thigh with the scalpel and slowly pulls a flap of your skin out of your leg."); 
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("Maybe now Winston, do you love the party?"); 
               
                System.out.print("\n\n"); 
                System.out.println("(a): ...Yyyes Yeeeees... I...i love the party...");
                System.out.print("\n"); 
                System.out.println("(b): I don't think so, not even if I try...");
                System.out.print("\n\n"); 

                System.out.print("> ");
                String choice = sc.nextLine();

                switch (choice) {
                    case "a":
                        story = 42;
                    break;

                    case "b":
                    	ending = 18;
                        isGameOver = true;;
                    break;
                }
            }
            while(story == 42) {
                Game.clrscr();
            if(decisionA) {            	            
                System.out.println("I think we got it Winston");
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("You sound like a real party member to me."); 
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("I think you are ready to work for the party again."); 
             } else {  
            	System.out.println("Good to hear you love the party Winston"); 
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("I knew I could count on you"); 
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("Maybe you are ready");
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("ready for reintegration into your new job for the party");
             }
            
                System.out.print("\n\n"); 
                System.out.print("They gave you a new job."); 
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("Still at the Ministry of Truth, but in a different department.");  
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("You had been appointed to a sub-committee of a sub-committee which had \n"
                		+ "sprouted from one of the innumerable committees dealing \n"
                		+ "with minor difficulties that arose in the compilation of the \n"
                		+ "Eleventh Edition of the Newspeak Dictionary."); 
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("They didn't kill you, they just.... healed you. \n"
                		+ "You were only sick before, you couldn't help it.\n"
                		+ "But that's over now.");  
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("You finally understood the meaning behind the party.");  
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("You walking down the white-tiled corridor, with \n"
                		+ "the  feeling  of  walking  in  sunlight,  and  an  armed  guard  at \n"
                		+ "your back. ");  
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("The long-hoped-for bullet is entering your brain.\n"
                		+ "you gazes up at the enormous face. Forty years it had tak-\n"
                		+ "en you to learn what kind of smile was hidden beneath the \n"
                		+ "dark  moustache.");  
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("O  cruel,  needless  misunderstanding!  O \n"
                		+ "stubborn, self-willed exile from the loving breast!\n"
                		+ "Two gin-scented tears trickled down the sides of your nose. But it was all right, everything was all right, the struggle was finished. \n"
                		+ "you has won the victory over himself. You loves Big Brother");  
                System.out.println("\nPress Enter to continue");
                System.out.print("> ");
                command = sc.nextLine();
                Game.clrscr();
                System.out.println("YOU LOST THE GAME!!!");            
                                             
               
            }
            
    /* 		
      		System.out.println("\nPress Enter to continue");
            System.out.print("> ");
            command = sc.nextLine();
            Game.clrscr();
            System.out.println("füge den neuen text ein");        
    */      
            
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
    if(ending == 8) {
        Endings.gameOverEight();
    }
    if(ending == 9) {
        Endings.gameOverNine();
    }
    if(ending == 10) {
        Endings.gameOverTen();
    }
    if(ending == 11) {
        Endings.gameOverEleven();
    }
    if(ending == 12) {
        Endings.gameOverTwelf();
    }
    if(ending == 13) {
        Endings.gameOverThirteen();
    }
    if(ending == 14) {
        Endings.gameOverFourteen();
    }
    if(ending == 15) {
        Endings.gameOverFifteen();
    }
    if(ending == 16) {
        Endings.gameOverSixteen();
    }
    if(ending == 17) {
        Endings.gameOverSeventeen();
        }
    if(ending == 18) {
        Endings.gameOverEightteen();
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