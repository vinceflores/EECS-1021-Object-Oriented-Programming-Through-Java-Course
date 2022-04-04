import java.util.Random;
import java.util.Scanner;

public class Part1 {

  public static void main(String[] args){

    var theRandom   = new Random();
    var objectScanned  = new Scanner(System.in);

        int rand = theRandom.nextInt(20);
        int counter = 0;
        while(true){

            System.out.println("Enter a Guess: ");
            var input = objectScanned.nextInt();

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
