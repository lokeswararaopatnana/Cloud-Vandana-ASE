import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args) {
        // Create the array with values (1, 2, 3, 4, 5, 6, 7)
        Integer[] myArray = { 1, 2, 3, 4, 5, 6, 7 };

        // Convert the array to a List for shuffling
        List<Integer> list = Arrays.asList(myArray);

        // Shuffle the list
        Collections.shuffle(list);

        // Convert the shuffled List back to an array (if needed)
        Integer[] shuffledArray = list.toArray(new Integer[0]);

        // Print the shuffled array
        System.out.println(Arrays.toString(shuffledArray));
    }
}
