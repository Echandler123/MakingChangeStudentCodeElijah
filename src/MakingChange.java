import java.util.ArrayList;
import java.util.Arrays;

/**
 * The class Making Change solves a classic problem:
 * given a set of coins, how many ways can you make change for a target amount?
 *
 * @author Zach Blick
 * @author Elijah Chandler
 */

public class MakingChange {
    /**

     */
    public static long countWays(int target, int[] coins) {
        Arrays.sort(coins);
        // Create a 2D array to store the number of ways to make change for each target
        long[][] ways = new long[target + 1][coins.length];
        // Initialize the ways array
        for (int i = 0; i < coins.length; i++) {
                ways[0][i] = 1;
        }
        return count(target, coins, ways, 0);
    }
    public static long count(int target, int[] coins, long[][] ways, int index) {
        // If the target is 0, then there is only one way to make change
        if(target == 0) {
            return 1;
        }
        // If the target is less than 0, then there is no way to make change
        if(target < 0 || index >= coins.length) {
            return 0;
        }
        // If there are no coins, then there is no way to make change
        if(coins.length == 0) {
            return 0;
        }
        // If the number of ways to make change for the target and index has been found return it
        if(ways[target][index] != 0) {
            return ways[target][index];
        }
        // Count the number of ways to make change for the target using the current coin
        long includeCurrent = count(target - coins[index], coins, ways, index);
        // Count the number of ways to make change for the target without using the current coin
        long excludeCurrent = count(target, coins, ways, index + 1);
        ways[target][index] =  includeCurrent + excludeCurrent;
        return ways[target][index];
    }
}
