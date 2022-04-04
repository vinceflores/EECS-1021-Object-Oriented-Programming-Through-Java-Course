import java.util.Random;

public class Part2Boosted {

    public static void main(String[] args){

        var theRandom   = new Random();// object
        var guesser = new Random();     // object
        int rand = theRandom.nextInt(40); // number to guess
        int Upper = 40;
        int Lower = 0;
        int counter = 0;                    // counter
        while(true){

            System.out.println("Enter a Guess: ");
            var input = guesser.nextInt(Lower, Upper);
            System.out.println("is it"+input +"?\n");

            if(input == rand){
                System.out.println("Correct Took  " + counter);
                break;
            }
            else if(input> rand){
                System.out.println("Guess is greater than the answer \n");
                Upper = input;
            }
            else if(input< rand){
                System.out.println("Guess is less than the answer \n");
                Lower = input;
            }
            counter = counter + 1;
        }
    }



}
