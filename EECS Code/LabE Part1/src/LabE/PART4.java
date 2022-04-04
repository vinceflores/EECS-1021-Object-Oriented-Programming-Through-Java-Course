package LabE;

import com.opencsv.CSVReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

import com.opencsv.CSVReader;


public class PART4 {
    public static void main(String[] args) throws IOException {
        try {
            final String filename = "Part2_CO2_DataLog_Modified_short.csv";
            FileReader fileReader = new FileReader(filename);
            CSVReader csvReader = new CSVReader(fileReader, ',');
            Random rand = new Random();
            // initializers
            int randNum = rand.nextInt(3,5);
            var runSum = 0.0;
            var rowCount = 0.0;
            String[] record;

            while ((record = csvReader.readNext()) != null) {
                System.out.println(record[randNum]);
                var myString = record[randNum];
                Double dString = Double.parseDouble(myString)+0.0;
                runSum = runSum + dString;

                rowCount = rowCount + 1.0;


            }//loop
            Double avg = runSum /rowCount;
            System.out.println("from column " + randNum );
            System.out.println("The average is " + String.format("%.2f", avg));

            csvReader.close();
            fileReader.close();

        }// try
        catch (Exception e){
            System.out.println("exception found ! ");

        }
    }// method
}// Class
