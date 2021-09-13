import com.sun.jdi.VMMismatchException;

public class SecondsAndMinutesChallenge {

    private static final String INVALID_VALUE_MESSAGE="Invalid Value";//constant value so return on below            methiods doesn thave to have strin of "invliad value".

    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(500,59));
        System.out.println(getDurationString(-41));

    }

    private static String getDurationString(long minutes,long seconds){
        if((minutes < 0) || (seconds <0)||(seconds > 59) ){
            return INVALID_VALUE_MESSAGE;
        }
        long hours = minutes / 60;
        long remainingMinuttes = minutes %60;

        String hoursString = hours + "h";
        if(hours <10){
            hoursString ="0" + hoursString;
        }

        String minutesString = remainingMinuttes + "m";
        if(remainingMinuttes <10) {
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s";
        if(seconds <10) {
            secondsString = "0" + secondsString;
        }

        return hoursString + " " + minutesString + " " + secondsString+ " ";
    }

    private static String getDurationString(long seconds){

        if(seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }

        long minutes =  seconds /60;
        long remainingSeconds = seconds %60;

        //acceptble as well , but below it is put into one line
        //        String x  = getDurationString(minutes,seconds);
        //        return x;
        return getDurationString(minutes,remainingSeconds);



    }



}
