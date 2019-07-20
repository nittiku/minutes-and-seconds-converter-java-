public class SecondsMinutes {
    public static void main(String[] args) {
        getDurationString(0,0);
    }
    public static void getDurationString(int minutes, int seconds){
        if((minutes >= 0) && ((seconds >=0) && (seconds <=59))){

                int hrs = minutes/60;
                double x = (double)minutes/60;
                int mins = (int)  ((x % hrs)*60);
                System.out.println(hrs +"h "+ mins + "m " + seconds + "s " );

        }
        else
            System.out.println("Invalid value");
    }
}

