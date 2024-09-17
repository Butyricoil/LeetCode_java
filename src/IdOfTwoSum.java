import java.util.ArrayList;
import java.util.List;

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
