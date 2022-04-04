import java.util.Random;
import java.util.Scanner;

public class Part2 {





        public static void main(String[] args){

            var theRandom   = new Random();
            var guesser = new Random();

            int rand = theRandom.nextInt(40);

            int counter = 0;
            while(true){

                System.out.println("Enter a Guess: ");
                var input = guesser.nextInt(0, 40);
                System.out.println("is it"+input +"?\n");

                if(input == rand){
                    System.out.println("Correct Took  " + counter);
                    break;
                }
                else if(input> rand){
                    System.out.println("Guess is greater than the answer \n");
                }
                else if(input< rand){
                    System.out.println("Guess is less than the answer \n");
                }
                counter = counter + 1;
            }
        }




}
