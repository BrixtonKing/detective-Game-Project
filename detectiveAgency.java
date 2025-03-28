import java.util.ArrayList;
import java.util.Scanner;

public class detectiveAgency{
    // instance variables
    private ArrayList<Suspect> suspects = new ArrayList<>();
    private ArrayList<Person> people = new ArrayList<>();
    private int suspectNumber;
    private Player player;
    
    public detectiveAgency(int suspectNumber, Player player){
        // basic set up for what will be our arraylist of random suspects
        this.player = player;
        this.suspectNumber = suspectNumber;
        Suspect temp = null;
        // int temp1 = (int)Math.random()*5+1;
        int temp1 = 3;

        // hard coded victims
        Person v1 = new Victim("Mickey Mice",56,"5'0",true,150,"It was about 11:30pm and I was eating my cheese in my bedroom, facing the wall. I heard the door opened downstair, and the TV got stolen!","I just finished wrapping up the divorce with Minney mice and my TV got stolen, I am soooo sad");
        Person v2 = new Victim("Mark", 20, "6' 3", true, 180, "I was at my Sunday Computer Science 101 Class, but while I was gone my home was broken into! When I came back someone had stolen my cat named Kitty", "I miss my cat so bad so much... please help me get Kitty back");
        Person v3 = new Victim("Aang", 15, "4' 10", true, 100, "I was walking my dog and this tall man in a mask ran up to me and grabbed the leash from my hands and ran away.", "I am really sad I miss my dog Appa... please help me get him back");
        Person v4 = new Victim();
        Person v5 = new Victim();

        // hard coded suspects
        Person s1 = new Suspect("Minney Mice", 50, "4'6", false, 120, "I spent the whole evening arguing with my divorce lawyer about paperwork. I barely had the energy to get home, let alone go out stealing.", true, "Look, I may be mad at Mickey, but I’d rather never see him again than waste my time stealing his junk.");
        Person s2 = new Suspect("Cecil", 63, "5' 7", true, 150, "I was at my job at Chick-fil-a working when you said the crime happened", true, "I love cats, but I would never see one. I would be so sad if anyone took them from me. Also my Alibi is great");
        Person s3 = new Suspect("Zuko", 25, "6' 5", true, 160, "I was at the gym working out with Azula", true, "Why would I want to steal a little kids dog? That is very dumb");
        Person s4 = new Suspect();
        Person s5 = new Suspect();
        
        // chat gpt list of random suspects
        Person[][] fakeCriminals = new Person[5][6];

       // First row / scenario 1 (Mickey/Minney Mice)
    fakeCriminals[0][0] = new Suspect("Goofy Goof", 55, "6'3", true, 200, 
    "I was trying to fix my TV, but I got so frustrated I just went to sleep early. I don’t even know what happened that night.", 
    false, "Gawrsh, I ain't no thief! I can barely work my own remote, let alone steal someone else’s TV!");
    fakeCriminals[0][1] = new Suspect("Donald Duck", 50, "5'0", true, 160, 
    "I spent the night dealing with my nephews breaking stuff again. I was too busy cleaning up to be anywhere else.", 
    false, "Ugh, I got my own problems, why would I wanna steal Mickey’s TV? It’s probably covered in cheese stains!");
    fakeCriminals[0][2] = new Suspect("Pete Paws", 60, "6'4", true, 300, 
    "I was at my shop doing inventory. I lock up real tight at night, and I ain't got time to be sneakin' around.", 
    false, "C’mon, do I look like someone who needs to steal? I got a business to run, and I don’t even like watchin’ TV!");
    fakeCriminals[0][3] = new Suspect("Clarabelle Cow", 52, "5'8", false, 180, 
    "I was baking cookies all night and trying a new recipe. I must've lost track of time, but I never left my house.", 
    false, "Oh dear, I wouldn’t dream of stealing! Besides, I was too busy perfecting my double chocolate chip cookies!");
    fakeCriminals[0][4] = new Suspect("Horace Horsecollar", 54, "6'0", true, 220, 
    "I went on a long night ride to clear my head. I didn’t talk to anyone, but I wasn’t near Mickey’s house.", 
    false, "A crime? Oh no, not me! I just wanted some peace and quiet away from all the city noise.");
    fakeCriminals[0][5] = new Suspect("Daisy Duck", 48, "5'3", false, 140, 
    "I was supposed to go to a spa, but I stayed home and caught up on my reading instead. Nobody saw me, but I never left.", 
    false, "Stealing? Please! I have much better things to do than worry about Mickey’s TV drama.");

       // Second row / scenario 2 (Mark's Cat Theft Case)
       fakeCriminals[1][0] = new Suspect("Nolan Grayson", 45, "6'2", true, 210, 
       "I was in my backyard, yelling at my lawnmower for breaking down again. I got so frustrated, I just went inside and watched infomercials.", 
       false, "Stealing a cat? Pfft. I can barely keep my own house in order, let alone go sneaking into someone else’s.");  
       fakeCriminals[1][1] = new Suspect("Rudolph 'Rudy' Connors", 30, "5'9", true, 170, 
       "I was building a highly efficient automated coffee maker. The calculations required my full attention—far too complex for cat-related distractions.", 
       false, "A crime? Statistically, it is far more likely that Mark misplaced his cat than I stole it. Have you checked behind the fridge?");     
       fakeCriminals[1][2] = new Suspect("Rex Sloan", 28, "5'11", true, 185, 
       "I was at the bar trying to impress some girl with my magic tricks. They didn’t work. Neither did my pickup lines.", 
       false, "Dude, I’m way too busy with my *own* problems to go around snatching cats. Besides, cats don’t even like me!");      
       fakeCriminals[1][3] = new Suspect("Kate Cha", 26, "5'6", false, 140, 
       "I was binge-watching a cooking show and attempting to recreate their soufflé. It did not go well. I was cleaning batter off the ceiling all night.", 
       false, "Stealing? No way! The only crime I committed was against that poor soufflé.");       
       fakeCriminals[1][4] = new Suspect("Donald Ferguson", 50, "5'10", true, 190, 
       "I was stuck on hold with customer service for *three hours*. By the time I got a human, I was too exhausted to commit any crimes.", 
       false, "If I *had* stolen the cat, I would’ve at least filed the proper paperwork first. But I didn’t. So here we are.");
       fakeCriminals[1][5] = new Suspect("Amber Bennett", 20, "5'5", false, 130, 
       "I was at the bookstore, minding my business and judging people’s taste in novels.", 
       false, "Mark seriously thinks I’d steal his cat? Wow. I didn’t realize our friendship was *that* fragile.");

        
        // Third row / scenario 3 ()
        fakeCriminals[2][0] = new Suspect("Iroh", 65, "5'8", true, 180, 
    "I was at my tea shop, brewing a new blend that I completely lost track of time. The tea turned out amazing, but I never left my shop.", 
    false, "Steal a dog? Oh no, that would disrupt its inner peace. Also, I barely have time to handle my tea leaves, let alone a dog!");
fakeCriminals[2][1] = new Suspect("Mai", 22, "5'5", false, 130, 
    "I was reorganizing my knife collection. It’s a delicate process, and I need absolute focus. No time for dog-related activities.", 
    false, "Why would I steal a dog? They’re too loud, too messy, and way too much work. No thanks.");
fakeCriminals[2][2] = new Suspect("Sokka", 20, "6'0", true, 170, 
    "I was attempting to cook a special stew using a ‘secret ingredient’… which turned out to be a bad idea. I was sick all night.", 
    false, "A crime? Look, the only crime here is how bad my cooking turned out. Trust me, I wasn’t stealing anything.");
fakeCriminals[2][3] = new Suspect("Ty Lee", 21, "5'6", false, 125, 
    "I was teaching a late-night acrobatics class at the gym. Plenty of people saw me there, flipping around!", 
    false, "Steal a dog? That’s, like, super bad karma! I’d rather teach it how to do cartwheels.");
fakeCriminals[2][4] = new Suspect("Azula", 23, "5'7", false, 140, 
    "I was practicing my public speaking skills in front of the mirror for hours. A great leader must be prepared at all times.", 
    false, "Stealing a dog? Please. If I wanted it, I wouldn’t have to steal it—I’d simply command it to follow me.");
fakeCriminals[2][5] = new Suspect("Bumi", 75, "5'7", true, 200, 
    "I spent the night designing a new obstacle course in my palace. It involves lots of rocks, sliding, and probably a lawsuit.", 
    false, "Stealing a dog? Pfft! If I wanted one, I’d just challenge it to a game of ‘Who Can Dig the Biggest Hole’ and win it fair and square!");

        // Fourth row / scenario 4 ()
        fakeCriminals[3][0] = new Suspect();
        fakeCriminals[3][1] = new Suspect();
        fakeCriminals[3][2] = new Suspect();
        fakeCriminals[3][3] = new Suspect();
        fakeCriminals[3][4] = new Suspect();
        fakeCriminals[3][5] = new Suspect();
        
        // Fifth row / scenario 5 ()
        fakeCriminals[4][0] = new Suspect();
        fakeCriminals[4][1] = new Suspect();
        fakeCriminals[4][2] = new Suspect();
        fakeCriminals[4][3] = new Suspect();
        fakeCriminals[4][4] = new Suspect();
        fakeCriminals[4][5] = new Suspect();

    for(int i = 0; i<fakeCriminals[0].length; i++){System.out.print(fakeCriminals[0][i] + " ");}
        // the victim has to be the last thing
        if(temp1 == 1){
            for(int i = 0; i < fakeCriminals[0].length; i++){
                people.add(fakeCriminals[temp1-1][i]);
                suspects.add((Suspect)fakeCriminals[temp1-1][i]);
            }
            int randomIndex = (int)(Math.random()*people.size());
            people.add(randomIndex, s1); 
            suspects.add(randomIndex, (Suspect)s1);
            people.add(v1); 
        }
        if(temp1 == 2){
            for(int i = 0; i < fakeCriminals[0].length; i++){
                people.add(fakeCriminals[temp1-1][i]);
                suspects.add((Suspect)fakeCriminals[temp1-1][i]);
            }
            int randomIndex = (int)(Math.random()*people.size());
            people.add(randomIndex, s2); 
            suspects.add(randomIndex, (Suspect)s2);
            people.add(v2);  
        }
        if(temp1 == 3){
            for(int i = 0; i < fakeCriminals[0].length; i++){
                people.add(fakeCriminals[temp1-1][i]);
                suspects.add((Suspect)fakeCriminals[temp1-1][i]);
            }
            int randomIndex = (int)(Math.random()*people.size());
            people.add(randomIndex, s3); 
            suspects.add(randomIndex, (Suspect)s3);
            people.add(v3); 
            
        }
        if(temp1 == 4){
            for(int i = 0; i < fakeCriminals[0].length; i++){
                people.add(fakeCriminals[temp1-1][i]);
                suspects.add((Suspect)fakeCriminals[temp1-1][i]);
            }
            int randomIndex = (int)(Math.random()*people.size());
            people.add(randomIndex, s1); 
            suspects.add(randomIndex, (Suspect)s1);
            people.add(v1); 
        }
        if(temp1 == 5){
            for(int i = 0; i < fakeCriminals[0].length; i++){
                people.add(fakeCriminals[temp1-1][i]);
                suspects.add((Suspect)fakeCriminals[temp1-1][i]);
            }
            int randomIndex = (int)(Math.random()*people.size());
            people.add(randomIndex, s1); 
            suspects.add(randomIndex, (Suspect)s1);
            people.add(v1); 
        }

        //for(int i = 0; i < suspectNumber; i++){
        //}
        // change to make it so its the real victim
        //people.add(new Victim());
    }

    // getters
    public ArrayList<Suspect> getSuspects(){
        return suspects;
    }
   
    public ArrayList<Person> getPeopleList(){
        return people;
    }
    
    // call this when the player wants to investigate someone
    public void selectInvestigate(){
        // temp variables, doesnt matter
        int j = 1;
        Scanner fellInLuv = new Scanner(System.in);
        System.out.println("\n" + people);

        System.out.println("Who would you like the investigate:");
        // useable no matter the length of the suspect length 
        for(int i = 0; i < suspectNumber; i++){
            System.out.println("Suspect #" + j + ", Name: " + suspects.get(i).getName());
            j++;
        }
        System.out.println("The Victim (option #"+ j + "), Name: " + people.get(people.size()-1).getName());
        String userInput = fellInLuv.nextLine();
        int selected = Tools.validatedInput(userInput, suspectNumber+1);
        if(people.get(selected-1) instanceof Suspect){
            player.investigateSuspect((Suspect)people.get(selected-1));
        }
        else{
            player.investigateVictim((Victim)people.get(selected-1));
        }
    }
}