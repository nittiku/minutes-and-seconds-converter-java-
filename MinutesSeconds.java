public class MinutesSeconds {
    public static void getDurationString(int minutes,int seconds){
        if(minutes >= 0 && (seconds >= 0 && seconds <=59)){
            if(minutes == 0 && seconds == 0){
                System.out.println("0h 0m 0s");
            }
            else if((minutes > 0) && (seconds == 0)){
                if((minutes % 60) == 0){
                    int hrs = minutes/60;
                    System.out.println(hrs+"h 0m 0s");
                }
                else{
                    int hrs = minutes/60;

                    double check =(double) minutes/60;
                    double mins2 = (check*100);
                    int mins3 = (int) (mins2);
                    int mins4 = mins3 % 100;
                    double mins5 = Math.round(mins4* 0.6);
                    int mins6 = (int) mins5;

                    System.out.println(hrs+"h "+mins6+"m 0s ");
                }
            }
            else if(minutes ==0 && seconds > 0){
                System.out.println("0h 0m "+ seconds+"s ");

            }

            else if((minutes > 0) && (seconds > 0)){
                if((minutes % 60) == 0){
                    int hrs = minutes/60;
                    System.out.println(hrs+"h 0m "+seconds + "s ");

                }
                else{

                    int hrs = minutes/60;
                    double check =(double) minutes/60;
                    double mins2 = (check*100);
                    int mins3 = (int) (mins2);
                    int mins4 = mins3 % 100;
                    double mins5 = Math.round(mins4* 0.6);
                    int mins6 = (int) mins5;


                    //System.out.println("The value of mins4 " + mins4 +" The value of mins5 " + mins5);


                    System.out.println(hrs+"h "+ mins6 + "m "+ seconds+"s ");
                }
            }

        }
        else{
            System.out.println("Invalid Value");

        }
    }
}
