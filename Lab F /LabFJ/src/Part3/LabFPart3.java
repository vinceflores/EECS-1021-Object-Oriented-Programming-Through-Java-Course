package Part3;

import org.firmata4j.IODevice;
import org.firmata4j.Pin;
import org.firmata4j.firmata.FirmataDevice;
import java.io.IOException;
import java.util.Timer;


public class LabFPart3 {
    public static void main(String[] args) throws IOException {

        //var myPort = "/dev/cu.usbserial-0001";
        IODevice myGroveBoard = new FirmataDevice("/dev/cu.usbserial-0001");

        try{
            myGroveBoard.start();
            System.out.println("My board Started");
            myGroveBoard.ensureInitializationIsDone();
        }
        catch(Exception ex){
            System.out.println("Couldn't connect to board");
        }
        finally {
            var myLED = myGroveBoard.getPin(4);
            myLED.setMode(Pin.Mode.OUTPUT);
            Timer timer = new Timer();

            var task = new LEDTask(myLED);
            timer.schedule(task, 0 , 5000);
             var myLED2 = myGroveBoard.getPin(4);
            myLED2.setValue(0);

        }


    }
}

