import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] ReturnId(ArrayList<Integer> seq, int target) {
        for (int i = 0; i < seq.size(); i++)
            for (int j = i + 1; j < seq.size(); j++)
                if (seq.get(i) + seq.get(j) == target)
                    return new int[]{i, j};
        return new int[]{}; // No solution found
    }
}



