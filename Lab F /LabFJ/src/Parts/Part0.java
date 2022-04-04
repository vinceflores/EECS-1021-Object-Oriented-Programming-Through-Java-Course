package Parts;



import org.firmata4j.firmata.*;
import org.firmata4j.IODevice;

import java.io.IOException;

public class Part0 {


    public static void main(String[] args) throws IOException {
        String myPort = "/dev/cu.usbserial-0001";


        IODevice myGroveBoard = new FirmataDevice(myPort);
        try{
            myGroveBoard.start();
            System.out.println("My board Started");
            myGroveBoard.ensureInitializationIsDone();
            myGroveBoard.stop();
            System.out.println("Board stopped");
        }
        catch(Exception ex){
            System.out.println("Couldn't connect to board");
        }

    }


}
