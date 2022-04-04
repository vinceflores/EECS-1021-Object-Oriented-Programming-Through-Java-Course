package LABC;



public class Main {
    public static void main(String[] args) {

        MathVector theFilled = MathVector.filled(3, 1);
        MathVector theRandom = MathVector.random(3, 1, 3);
        MathVector theAddition = theFilled.add(theRandom);
        var theStringConvert = theAddition.toString();
        System.out.println("This is the converted integer array to a string " + theStringConvert);

        String d = "1,2,3";
        MathVector toParse = MathVector.parse(d);
        var theMag = (int) toParse.magnitude();
        int theIthElement = toParse.at(1);

        System.out.println("This is the parsed string d" + toParse + " and the magnitude \n" + theMag + " and the 3rd element " + theIthElement);
    }
}