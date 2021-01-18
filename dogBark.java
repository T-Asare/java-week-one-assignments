public class dogBark {
    public static boolean shouldWakeUp(boolean barking, int timeOfTheDay){
       if( timeOfTheDay>=0 && timeOfTheDay<24)
            if (barking) //this statement can also be written as if barking == true checks if it is summer time
                return timeOfTheDay <=8 || timeOfTheDay >= 22; // the range is for times before 8AM and times after 10PM
            //return  false;
            else
             return false;
        else
            return false;

    }
   /* public static void main(String[] args) {
        System.out.println(shouldWakeUp(true,13));
    }*/
}
