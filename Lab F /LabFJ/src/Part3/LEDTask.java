wpackage Part3;

import org.firmata4j.Pin;
import java.io.IOException;
import java.util.TimerTask;

public class LEDTask extends TimerTask {
    private final Pin myPin;

    LEDTask(Pin pin){
        this.myPin = pin;
    }
    @Override
    public void run(){
    //final int t = 1;
    //final int f = 0;
    var pinVal = myPin.getValue();
    System.out.println("value: " + pinVal);
            if (pinVal == 1) {
                System.out.println("Light OFF");
                try {
                    myPin.setValue(0);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            else{
                System.out.println("Light ON");
                try {
                    myPin.setValue(1);
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

    }
}
