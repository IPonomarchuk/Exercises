import tasks.ArrayCheck;
import tasks.Palindrome;
import tasks.Pie;

public class Main {

    public static void main(String[] args) {

        Palindrome.isPalindrome("Madam, I’m Adam");

        int[] array = {1, 0, 5, 13, 100, 3};
        ArrayCheck.sumOfArrayElements(array);

        Pie.biggestPieceOfPie();

    }
}
