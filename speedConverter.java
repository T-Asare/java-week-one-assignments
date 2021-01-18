public class speedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        long mph = (long) (kilometersPerHour/1.609344);
        if (kilometersPerHour<0)
            return -1;
        else
            return mph;
            }
    public static void printConversion (double kilometersPerHour){
        double mph = kilometersPerHour/1.609344;
        long rounded= Math.round(mph);
        if (kilometersPerHour<0)
            System.out.println("Invalid Value");
        else
            System.out.println(kilometersPerHour +"km/h =" +rounded+"mi/h");
    }
/*
    public static void main(String[] args) {
        printConversion(2362);
    }*/
}

