
public class ParttC {

    private static MathVector array1;

    public static void main(int[] Test1) {
        MathVector array1 = new MathVector();
        // create a array using filled() and random()

        var Array1 = array1.filled(4, 1);
        // Using the magnitude() find the magnitude of the resulting array
        var mag = Array1.magnitude();
        int dmg = (int) mag;
        var atElement = Array1.at(dmg);
        var Array2 = Array1.random(4, atElement);

        /**
         * random() creates a vector that has a crtain size and consists of random elements
         * filled() creates a new math vector that is in a specified size and while the elements are the same.
         *
         */
        // using the add() method add the arrays
        // Using the magnitude() find the magnitude of the resulting array

        var addedArray = Array1.add(Array2);
        // use the toString() method to convert the resulting array to a string
        var theArrayString = addedArray.toString();
        // Then parse the string
        var theParsedString = MathVector.parse(theArrayString);


        return  theArrayString;
    }

}
