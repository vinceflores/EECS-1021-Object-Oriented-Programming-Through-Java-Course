package LabE;
import java.io.FileInputStream;
import java.io.IOException;

// Part 1
public class MyTextFileReader {

        public static void  main(String[] args)
                throws IOException
        {
            final String nameOfFile = "Part1TextFile.txt";
            int myData;

            var myFileObject = new FileInputStream(nameOfFile);
            while((myData = myFileObject.read()) != -1)
            {
                System.out.print((char) myData);
            }



            myFileObject.close();

        }



    }


