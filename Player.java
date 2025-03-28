import java.util.Scanner;

public class Player extends Person{
    // player is the detective from the sheet

    // instance variables
    private boolean validInput;

    public Player(){
        super();
    }
    public Player(String name, int age, String height, boolean isMale, double weight){
        super(name,  age,  height,  isMale,  weight);
    }

    public void investigateSuspect(Suspect x){
        // the next 5 lines get the input from user selection and validates it (continued to be reused)
        System.out.println("\nsmth intresting about investgating or smth like that");
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("What would you like to do\n1. Hear their alibi\n2. Get physical details\n3. chit-chat with them\n4. finish investigation");
        String userInput = scanner1.nextLine();
        int selected = Tools.validatedInput(userInput, 4);

        // "investigation loop", c is short for continue
        boolean c = true;
        while(c == true){
            switch(selected){
                case 1:
                    System.out.println(x.hearAlibi());
                    break;
                case 2:
                    System.out.println(x.description());
                    break;
                case 3:
                    System.out.println(x.talk());
                    break;
                case 4:
                    System.out.println("smth about it being over");
                    c = false;
                    
            }
            
            if(selected!=4){         
                // bad phrasing   
                System.out.println("What would you like to do\n1. Hear their story\n2. Get physical details\n3. talk with them\n4. finish investigation of current suspect");
                userInput = scanner1.nextLine();
                selected = Tools.validatedInput(userInput, 4);
            }
        }
        }

        public void investigateVictim(Victim x){
            System.out.println("\nsmth intresting about investgating or smth like that");
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("What would you like to do\n1. Hear their story\n2. Get physical details\n3. talk with them\n4. finish investigation of current suspect");
            String userInput = scanner1.nextLine();
            int selected = Tools.validatedInput(userInput, 4);

            // "investigation loop", c is short for continue
            boolean c = true;
            while(c == true){
                switch(selected){
                    case 1:
                        System.out.println(x.hearStory());
                        break;
                    // im not sure if we need/want to be able to get suspect discription
                    // if you read this talk to me about the case 2 here and we can decide togeher
                    case 2:
                        System.out.println(x.description());
                        break;
                    case 3:
                        System.out.println(x.talk());
                        break;
                    case 4:
                        System.out.println("smth about it being over");
                        c = false;
                        
                }
            
            if(selected!=4){         
                // bad phrasing   
                System.out.println("\nWhat would you like to do\n1. Hear their story\n2. Get physical details\n3. talk with them\n4. finish investigation of current suspect");
                userInput = scanner1.nextLine();
                selected = Tools.validatedInput(userInput, 4);
            }
        }
        }

        public boolean accuse(Suspect x){
            if(x.getIsCriminal()){
                return false;
            }
            else
                return true;
        }

        
        
    }
