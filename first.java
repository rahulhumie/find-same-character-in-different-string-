import java.util.HashSet;

public class first {

    public static void main(String[] args) {
        first solution = new first();
        System.out.println(solution.numJewelsInStones("aA", "aaAAbbbb"));  // Sample usage
    }

    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewelsSet = new HashSet<>();

        // Populate the jewelsSet with characters from 'jewels'
        for (char jewel : jewels.toCharArray()) {
            jewelsSet.add(jewel);
        }

        int score = 0;

        // Iterate through the characters of 'stones'
        for (char stone : stones.toCharArray()) {
            // Check if the character is in the 'jewelsSet'
            if (jewelsSet.contains(stone)) {
                score++;
            }
        }

        return score;
    }
}
