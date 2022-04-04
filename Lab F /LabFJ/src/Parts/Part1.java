package Parts;

import org.firmata4j.Pin;
import org.firmata4j.firmata.*;
import org.firmata4j.IODevice;
import java.io.IOException;


public class Part1 {
    public static void main(String[] args) throws IOException {
    String myPort ="/dev/cu.usbserial-0001";
            IODevice myGroveBoard = new FirmataDevice(myPort);

    try{
        myGroveBoard.start();
        System.out.println("Board started");
        myGroveBoard.ensureInitializationIsDone();
    } catch (Exception ex){
        System.out.println("Cannot connect to the board");
    }

    finally {
        var myLED = myGroveBoard.getPin(4);
        myLED.setMode(Pin.Mode.OUTPUT);
        for(int i = 0; i<6;i++){
        myLED.setValue(1);
        try {
            Thread.sleep(2000);
            System.out.println("light ON");
        } catch (Exception ex) {
            System.out.println("sleep error");
        }
            myLED.setValue(0);
        try {
            Thread.sleep(2000);
            System.out.println("light Off");
        } catch (Exception ex) {
            System.out.println("sleep error");
        }

        }//loop
    }// finaly
        myGroveBoard.stop();
        System.out.println("Board stopped");
    }//method
}// class
