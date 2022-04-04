package LabE;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import  java.util.ArrayList;
import  java.util.List;
// Part 2

public class ReadCSVArrayList {
    public static void  main(String[] args)  throws IOException
    {

            try{
                var theAirQualityFile = new File("Part2_CO2_DataLog_Modified_short.csv");
                var fixedLengthList = Files.readAllLines(theAirQualityFile.toPath());
                var listOfString = new ArrayList<String>(fixedLengthList);

                int rowCounter = 0;
                int desiredCol = 3; // since its recorded
                int runSum = 0;
                int avg = 0;

                while(rowCounter< listOfString.size()){
                    var row =listOfString.get(rowCounter);
                    var stringArray = row.split(",");
                    var Col = stringArray[3];
                    var parse = Integer.parseInt(Col);

                    runSum = runSum + parse;
                    rowCounter++;

                }
                avg = runSum/rowCounter;

                System.out.println(avg);

            }
            catch(IOException ex){
                System.out.println("File reading exception");
        }

    }
}
