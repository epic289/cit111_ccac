/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week6_methods;
import java.util.Scanner;
// imported scanner to allow for user input.
/**
 *
 * @author lexus.fitzpatrick
 */
public class LexiiFriendLevels {
    // decided that it was easier to make a prompt quiz method rather than jam everything into main.
    public static void main(String[] args){
        promptQuiz ();
        
    }// close main
     // prompt quiz is my initial start of my program.   
    public static void promptQuiz (){
    Scanner friendScanner = new Scanner(System.in);
        // scanner allows for user input.
        // this is where i prompt users to decide which quiz they would like to take.
        System.out.println("Which quiz would you like to take?");
        System.out.println("1 = Friend Quiz? ");
        System.out.println("2 = Best Friend Quiz?");
        System.out.println("3 = Forever Friend Quiz?");
        System.out.println("Enter the number of the quiz you would like to take.");
        int userChoice;
        userChoice = friendScanner.nextInt();
        // i set an int to help initiate my switch.
        // switch enables users to enter which number they want and will sned them to the desired quiz.
        switch(userChoice){
            case 1: 
                friendQuiz(friendScanner);
                break;
            case 2: 
                bestFriendQuiz(friendScanner);
                break;
            case 3:
                foreverFriendQuiz(friendScanner);
                break;
            default: 
                System.out.println("Not a valid entry.");
                System.out.println("*********************************");
                System.out.println("Refresh and try again.");
                
        }// close switch
    }// close promptQuiz
                
           // this is my friend quiz which prompts the user for this quiz.     
    public static void friendQuiz (Scanner friend){
        int counter = 0;
        // i set an int for a counter so each question can be answered and if the counter satisfies the if statement then they pass,
        //if not then they don't and are prompted.
        System.out.println("Welcome to the friend quiz! "
                + "Press enter to continue.");
        friend.nextLine();
        System.out.println("You will press 1 for yes. You will press 2 for no.");
        friend.nextLine();
        
        System.out.println("Do you like music?");
        if(friend.nextInt() == 2){
        
            counter++;
            // counter++ adds an additional number to the int counter when the if is satisfied.
        }// end if
        System.out.println("Do you like nature?");
        if(friend.nextInt() == 2){
        
            counter++;
        }// end if
        System.out.println("Do you like art?");
        if(friend.nextInt() == 2){
        
            counter++;
        }// end if    
        System.out.println("Do you like gossiping?");
        if(friend.nextInt() == 1){
        
            counter++;
        }// end if
        
        System.out.println("Do you like adventures?");
        if(friend.nextInt() == 2){
        
            counter++;
        }// end if
        System.out.println("Do you like drama?");
        if(friend.nextInt() == 1){
        
            counter++;
        }// end if
        if(counter >= 2){
            // this is the if that determines whether the user passed or not.
            System.out.println("I'm sorry, but we can't be friends.");
            quizExit("friend");
            System.out.println("Would you like to see why we can't be friends?");
                if(friend.nextInt() == 1){
                    friendAnswers(friend);
                }else{
                    quizExit("friend");
                }// close else if
        }else{
            System.out.println("Alright, we are now friends!"
                    + " Do you want to go to another quiz?");
            if(friend.nextInt() == 1){
                promptQuiz ();
                
            }else{
                quizExit("friend");
                
            }// close if /else
                
        }// close if/ else
    }// close friend Quiz

    // the best friend quiz and friend forever quiz follow the same pattern as the friend quiz, just different questions.
    public static void bestFriendQuiz (Scanner friend){
        int counter = 0;
        System.out.println("Welcome to the best friend Quiz! Press enter to continue!");
        friend.nextLine();
        friend.nextLine();
        
        System.out.println("Do you like reptiles?");
        if(friend.nextInt() == 2){
            counter++;
        }// close if
        System.out.println("Do you like stuffed animals?");
        if(friend.nextInt() == 2){
            counter++;
        }// close if
        System.out.println("Do you like Rap music?");
        if(friend.nextInt() == 1){
            counter++;
        }// close if
        System.out.println("Are you crazy?");
        if(friend.nextInt () == 2){
            counter++;
        }// close if
        System.out.println("Is Nextflix your life?");
        if(friend.nextInt() == 2){
            counter++;
        }// close if
        System.out.println("Do you like Metal Music?");
        if(friend.nextInt() == 2){
            counter++;
        }// close if
        System.out.println("Do you like video games?");
        if(friend.nextInt() == 2){
            counter++;
        }// close if
        System.out.println("Do you like breakfast foods?");
        if(friend.nextInt() == 2){
            counter++;
        }// close if
        System.out.println("Do you like helping people?");
        if(friend.nextInt() == 2){
            counter++;
        }// close if
        System.out.println("Is food your number one love?");
        if(friend.nextInt() == 2){
            counter++;
        }// close if
        System.out.println("Do you love shopping?");
        if(friend.nextInt() == 2){
            counter++;
        }// close if
        if(counter >= 5){
            System.out.println("Maybe it's best that we are just friends!");
            System.out.println("Would you like to see why we are just friends?");
            if(friend.nextInt() == 1){
                bestFriendAnswers(friend);
            }else{
                quizExit("best friend");
            }// close else if
        }else{
            System.out.println("Hey new best friend!! Would you like to try your"
                    + " luck with the next quiz?");
            if(friend.nextInt() == 1){
            promptQuiz();
            }else{
                quizExit("Best Friend");
            }// close else if 
        }// close else if
    }// close bestFriendQuiz
            
            
                
                    
    public static void foreverFriendQuiz (Scanner friend) {
        int counter = 0;
        System.out.println("Welcome to the forever friend Quiz. Press ENTER to "
                + " continue.");
        friend.nextLine();
        friend.nextLine();
        
        System.out.println("Are you sarcastic?");
        if(friend.nextInt() == 2){
            counter++;
        }// close if
        System.out.println("Are you addicted to candy?");
        if(friend.nextInt() == 1){
            counter++;
        }// close if
        System.out.println("Are you clingy?");
        if(friend.nextInt() == 1){
            counter++;
        }// close if
        System.out.println("Do you enjoy thrift shopping?");
        if(friend.nextInt() == 2){
            counter++;
        }// close if
        System.out.println("Are you an optimist?");
        if(friend.nextInt() == 2){
            counter++;
        }// close if
        
        System.out.println("Do you chew with your mouth open?");
        if(friend.nextInt() == 1){
            counter++;
        }// close if
        System.out.println("Do you listen well?");
        if(friend.nextInt() == 2){
            counter++;
        }// close if
        System.out.println("Can you tolerate a spontaneous friend?");
        if(friend.nextInt() == 2){
            counter++;
        }// close if
        System.out.println("Do you enjoy tennis?");
        if(friend.nextInt() == 2){
            counter++;
        }// close if
        System.out.println("Are you into going to concerts?");
        if(friend.nextInt() == 2){
            counter++;
        }// close if
        System.out.println("Are you a couch potato?");
        if(friend.nextInt() == 1){
            counter++;
        }// close if
        System.out.println("Are you good at prioritizing?");
        if(friend.nextInt() == 2){
            counter++;
        }// close if
        System.out.println("Do you think that you passed?");
        if(friend.nextInt() == 2){
            counter++;
        }// close if
        System.out.println("Are you a morning person?");
        if(friend.nextInt() == 2){
            counter++;
        }// close if
        if(counter >= 7){
            System.out.println("Well you got to the last quiz. I guess we are"
                    + " just best friends.");
            System.out.println("Press enter to exit.");
            friend.nextLine();
            friend.nextLine();
                quizExit("friend forever");
                
        }else{
            System.out.println("Alright, so we are officially friends forever!");
            System.out.println("Press enter for a surprise.");
            friend.nextLine();
            friend.nextLine();
            System.out.println("You're an amazing human being!");
            quizExit("friend forever");
        }// close last if/else
            
    }// close foreverFriendQuiz
    public static void quizExit (String thanks){
        System.out.println("Thank you for taking the " + thanks + " quiz!");
    }// close quizExit
            
         // users have the options in their quizzes if they fail to see the proper answers.   
    public static void friendAnswers(Scanner friend){
        System.out.println("Here is why we can't be friends. Press Enter to continue. "
                + " Press enter after each answer.");
        friend.nextLine();
        friend.nextLine();
        System.out.println("I absolutely adore music. I'm sorry if you don't.");
        friend.nextLine();
        // friend.nextLine allows users to read what's given and then press enter for the next answer.
        System.out.println("Nature is so melodic to me. It puts me on cloud nine.");
        friend.nextLine();
        System.out.println("I believe that everything is art. Appreciation for"
                + " art is important to me.");
        friend.nextLine();
        System.out.println("I think gossiping is a waste of time. Life is too"
                + " short to be negative");
        friend.nextLine();
        System.out.println("Life is such a thrill. Enjoy it with adventures!");
        friend.nextLine();
        System.out.println("Save the drama for your mama.");
        friend.nextLine();
        System.out.println("That is all folks! Thank you for seeing why we can't"
                + " be friends!");
        System.out.println("Press 1 if you would like to choose a different quiz.");
        if(friend.nextInt() == 1){
            promptQuiz();
        }else{
            quizExit("friend");
        }// close if else
    }// close friendanswers    
                    
    
    public static void bestFriendAnswers(Scanner friend){
        System.out.println("Here is why we can't be best friends. Press Enter to continue. "
                + " Press enter after each answer."); 
        friend.nextLine();
        friend.nextLine();
        System.out.println("I adore reptiles. They are cute little babies!");
        friend.nextLine();
        System.out.println("I have a huge collection of stuffed animals. You"
                + " are deprived without stuffed animals.");
        friend.nextLine();
        System.out.println("I don't hate rap, but I much rather listen to indie/"
                + " metal rock. ");
        friend.nextLine();
        System.out.println("Life is no fun if you're not crazy!");
        friend.nextLine();
        System.out.println("Netflix is love, netflix is life.");
        friend.nextLine();
        System.out.println("Metal music is my favorite music. There's no better"
                + " feeling than just raging at a rock concert.");
        friend.nextLine();
        System.out.println("I've been a gamer since I was about 7. I adore them.");
        friend.nextLine();
        System.out.println("The only thing better than warm pancakes with syrup is"
                + " nothing!");
        friend.nextLine();
        System.out.println("There's something special about being selfless.");
        friend.nextLine();
        System.out.println("Food should be your only love silly!");
        friend.nextLine();
        System.out.println("Shopping is my therapy!");
        friend.nextLine();
        System.out.println("Sorry that we can't be best friends. You can press 1"
                + " if you would like to try the friend or forever friend quiz.");
        if(friend.nextInt() == 1){
            promptQuiz();
        }else{
            quizExit("best friend");
        }// close if else
    }// close best friend answers
    
    public static void friendForeverAnswers(Scanner friend){
        System.out.println("This is why we can be just best friends");
        System.out.println("Press enter to continue and after every answer.");
        friend.nextLine();
        friend.nextLine();
        System.out.println("Sarcasm is my fluent language.");
        friend.nextInt();
        System.out.println("Candy is good, but CAKES are better!");
        friend.nextInt();
        System.out.println("I need to have breathing room, so being clingy is a"
                + " huge no for me.");
        friend.nextInt();
        System.out.println("Why spend money full price when thrift stores are"
                + " still here!?");
        friend.nextInt();
        System.out.println("Life is too short to be negative.");
        friend.nextInt();
        System.out.println("I would love to hear that you enjoy your food"
                + " without hearing you chomp it.");
        friend.nextInt();
        System.out.println("I talk, A LOT, so I need someone to listen.");
        friend.nextInt();
        System.out.println("There are times I just want to run around, times "
                + " I may just want to make a random noise, and you just have"
                + " to be okay with that!");
        friend.nextInt();
        System.out.println("Tennis isn't for everyone, but it's for me!");
        friend.nextInt();
        System.out.println("Concerts are my happy place, hopefully you will"
                + " be able find your happy place.");
        friend.nextInt();
        System.out.println("I believe you should have a happy balance between"
                + " being a couch potato and being active.");
        friend.nextInt();
        System.out.println("I am a busy person, but I still make time for my"
                + " friends, I would expect you to do the same!");
        friend.nextInt();
        System.out.println("If you didn't think you passed then I'm sorry,"
                + " but you have to be confident in yourself.");
        friend.nextInt();
        System.out.println("I like to wake up and enjoy my day until the day"
                + " is over. Early bird catches the worm.");
        friend.nextInt();
        System.out.println("Now you know why we can maybe just be best friends.");
        quizExit("forever friend");
    }// close friend forever answers
        
        
        
        
        
        
}// close class
                
                
            
