
import java.security.interfaces.ECPublicKey;
import javax.lang.model.util.ElementScanner14;
import jdk.jshell.spi.ExecutionControl;

public class TimeCalc {
    public static void main(String[] args) {
        int currentHours = Integer.parseInt(args[0].substring(0, 2));
        int currentMinutes = Integer.parseInt(args[0].substring(3, 5));
        int minutesToAdd = Integer.parseInt(args[1]);
        
        //Calculating the new time divided into hours and minutes
        int totalMinutes = currentHours * 60 + currentMinutes + minutesToAdd;
        int newHours = (totalMinutes / 60) % 24;
        int newMinutes = totalMinutes % 60;
        String finalHours, finalminutes;

        // Checking whether minutes or hours are a single number to display in the requested format
        if (newHours < 10)
            finalHours = "0" + Integer.toString(newHours);
        else
            finalHours = Integer.toString(newHours); 
            
        if (newMinutes < 10)
            finalminutes = "0" + Integer.toString(newMinutes);
        else
            finalminutes = Integer.toString(newMinutes); 

        // Printing tthe new time
        System.out.println(finalHours + ":" + finalminutes); 


    }
}
