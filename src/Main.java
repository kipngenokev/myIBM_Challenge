import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int n = 37; // Example value
        List<Integer> positions = getOneBits(n);

        // Output the results
        System.out.println("Number of bits in binary representation: " + positions.size());
        System.out.println("Positions of 1 bits (in ascending order): " + positions);
    }

    public static List<Integer> getOneBits(int n) {
        List<Integer> positions = new ArrayList<>();
        int index = 1;

        while (n > 0) {
            // Check if the rightmost bit is 1
            if ((n & 1) == 1) {
                positions.add(index);
            }
            // Shift the number to the right
            n >>= 1;
            index++;
        }

        // Reverse the list to get positions in ascending order
        Collections.reverse(positions);

        return positions;
    }
}
