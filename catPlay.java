public class catPlay {
    public static boolean isCatPlaying(boolean summer, int temperature){
    if (summer) {//this statement can also be written as if summer == true checks if it is summer time
        return temperature > 24 && temperature < 46; // the range is between 25 and 45
    }//return  false;
    else
        return temperature > 24 && temperature < 36; // temperature range is between 25 and 35
    }
   /* public static void main(String[] args) {
        System.out.println(isCatPlaying(true,30));
    }*/
}
