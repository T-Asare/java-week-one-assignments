public class teenChecker {
    public static boolean hasTeen(int num1, int num2, int num3) {
        if ((num1 > 12 && num1 < 20) || (num2 > 12 && num2 < 20) || (num3 > 12 && num3 < 20))// setting definitions of what teen numbers are, the or statement ensures that if at least one of these is true for a teen number , program returns true
            return (true);//checks requirements for all three numbers
        return false;
    }

   /* public static void main(String[] args) { //commented out for purposes of assignment requirements. Please uncomment if you dont have main class
        System.out.println(hasTeen(21, 25, 2000));
    }*/
}