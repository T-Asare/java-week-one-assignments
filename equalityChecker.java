public class equalityChecker {
    public static void printEqual(int firstNum, int secondNum, int thirdNum) {
        if (firstNum < 0 || secondNum < 0 || thirdNum < 0)
            System.out.println("Invalid Value");
        else if (firstNum == secondNum && secondNum == thirdNum)
            System.out.println("All Numbers are equal");
        else if (firstNum != secondNum)
            System.out.println("All Number are different");
        else
            System.out.println("Neither all are equal or different");
    }

}
