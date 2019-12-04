import java.util.HashSet;

/**
 * Exercise2
 */
public class Exercise2 {

    public static void main(String[] args) {
        int[] arrayOne = {2, 1, 3, 5, 3, 2};
        int[] arrayTwo = {2, 4, 3, 5, 1};
        int[] arrayThree = {2, 1, 1, 5, 3, 2};
        System.out.println("The answer is: " + getFirstPositionRepeated(arrayOne));
        System.out.println("The answer is: " + getFirstPositionRepeated(arrayTwo));
        System.out.println("The answer is: " + getFirstPositionRepeated(arrayThree));
    }

    private static int getFirstPositionRepeated(int[] array) {
        int result = -1;
        HashSet<Integer> set = new HashSet<>();
        for (int number : array) {
            if (!set.add(number)) {
                result = set.size() - 1;
                break;
            }
        }
        return result;
    }
}