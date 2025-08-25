//importing the "java.io" package for the InputStreamReader and BufferedReader classes
import java.io.*;
public class Ch5_119_7 {
    public static void main(String[] args) throws IOException {
        //declaring and initialising the required varibles for the conversion
        int seconds, minutes, hours, temp;
        //creating a new InputStreamReader object to streamiline the input bit pattern
        InputStreamReader isr = new InputStreamReader(System.in);
        //creating a new BufferedReader object to temporarily store the input data
        BufferedReader buff = new BufferedReader(isr);
        //user input prompt
        System.out.println("Please enter a value in seconds");
        //accepting the values in seconds from the user and assigning it to the "seconds" variable
        seconds = Integer.parseInt(buff.readLine());
        //converting the seconds to hours
        hours = seconds/3600;
        //assinging the remainder to "temp"
        temp = seconds % 3600;
        //converting the reaminder to minutes
        minutes = temp/60;
        //assingning the second remainder(seconds value) to "seconds"
        seconds = temp%60;
        //printing the calculated values
        System.out.println(hours + "hour(s)\n" + minutes + "minute(s)\n" + seconds + "second(s)");
    }
}