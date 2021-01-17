public class decimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        int numb1 = (int) (firstNumber * 1000); // Performing type casting from double to integer to ease comparison
        int numb2 = (int) (secondNumber * 1000);
        if (numb1 == numb2)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        decimalComparator DC = new decimalComparator();
        System.out.println(DC.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(DC.areEqualByThreeDecimalPlaces(3.176, 3.175));
        System.out.println(DC.areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(DC.areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
}