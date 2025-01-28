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
     * TODO: Complete this function, countWays(), to return the number of ways to make change
     *  for any given total with any given set of coins.
     */
    public static long countWays(int target, int[] coins) {
        Arrays.sort(coins);
        // create adjacency list for each way/path for to make each target
        ArrayList<Integer> ways = new ArrayList<Integer>();
        if(target < 0){
            return 0;
        }
        return 0;
    }
    public static long findways(ArrayList<Integer> ways, int target, int[] coins){
        // if the target is 0, then there is only one way to make change
        if(target == 1 && coins[0] == 1){
            return 1;
        }
        // if the target is less than 0, then there is no way to make change

        return 0;
    }
}
