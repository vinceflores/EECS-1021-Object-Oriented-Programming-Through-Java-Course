package Part2;
import org.firmata4j.IODevice;
import org.firmata4j.Pin;
 import org.firmata4j.firmata.FirmataDevice;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
public class LabFPart2 {

        public static void main(String[] args) throws IOException{
            var myPort = "/dev/cu.usbserial-0001";
            IODevice myGroveBoard = new FirmataDevice(myPort);
            try{
                myGroveBoard.start();
                System.out.println("My board Started");
                myGroveBoard.ensureInitializationIsDone();
            }
            catch(Exception ex){
                System.out.println("Couldn't connect to board");
            }

            finally {
                var myButton = myGroveBoard.getPin(6);
                myButton.setMode(Pin.Mode.INPUT);

                Timer timer = new Timer();
                var task = new ButtonTask(myButton);
                timer.schedule(task, 0, 1000);

            }//finally

            System.out.println("Board stopped");
        }// method

}// class
