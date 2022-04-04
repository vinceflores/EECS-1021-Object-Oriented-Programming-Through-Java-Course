package LabE;
import java.io.FileReader;
import java.util.Arrays;
import java.io.IOException;
import com.opencsv.CSVReader;


// Part 3
public class WaterProcessor {
    public static void main(String[] args)
            throws IOException
    {
      //  String fileName = "single_co2_data_feb17";
        int row = 1;
        int rowCounter = 0;

        try
        {
            FileReader readMyFile = new FileReader("single_co2_data_feb17.csv");

            CSVReader csvReader = new CSVReader(readMyFile, ',');

            String[] data;
        while((data = csvReader.readNext()) != null)
            {
                System.out.print(Arrays.toString(data));
            }
        csvReader.close();;
        readMyFile.close();

        }
        catch(Exception ex){
            System.out.println("Exception!");

    }


    }


}
