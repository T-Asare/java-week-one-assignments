public class minuteToDaysYears {
    public static void main(String[] args) {
    }
    public static void printYearsAndDays(long minutes){
        long days = minutes/1440;
        long years = minutes/ 525_600;
        if (minutes>0)
            System.out.println(minutes +" min = " + years + " y and "+ days+ "d");
        else
            System.out.println("invalid entry");
    }
}

