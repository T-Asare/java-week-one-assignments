public class leapYear {
    public static boolean isLeapYear(int year) {
        if (year > 0 && year <10000) // setting permissible input limits
            return ((year % 400) == 0) || (year % 100 == 0) && (year % 4 == 0);//checks requirements for what a leap year should be so either divisible by 400 or divisible by both 100 and 4
        return false;
    }

   public static void main(String[] args) { //commented out for purposes of assignment requirements. Please uncomment if you dont have main class
        /* leapYear king = new leapYear(); */ // this section will be needed if we decide to request user input in which case we will need to import scanner util and use it to accept user input
        System.out.println(isLeapYear(2000));
    }
}