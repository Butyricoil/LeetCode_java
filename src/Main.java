/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
        Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]


Constraints:

        2 <= nums.length <= 104
        -109 <= nums[i] <= 109
        -109 <= target <= 109
Only one valid answer exists.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите последовательность чисел через пробел:");
        List<Integer> seq = new Sequence().processInput(scanner.nextLine());
        System.out.println("Введите целевое число:");
        int target = scanner.nextInt();

        ReturnIdOfSum.ReturnId((ArrayList<Integer>) seq, target);
    }
}

class ReturnIdOfSum {
    public static void ReturnId(ArrayList<Integer> seq, int target) {

        for (int i = 0; i < seq.size(); i++) {
            for (int j = i + 1; j < seq.size(); j++) {
                if (seq.get(i) + seq.get(j) == target) {
                    System.out.println("[" + i + ", " + j + "]");
                    return;
                }
            }
        }
    }
}


class Sequence {
    public List<Integer> processInput(String input) {
        if (input == null || input.trim().isEmpty()) {
            return new ArrayList<>();
        }

        String[] inputArray = input.split(" ");
        List<Integer> result = new ArrayList<>();

        for (String s : inputArray) {
            result.add(Integer.parseInt(s));
        }
        return result;
    }
}
