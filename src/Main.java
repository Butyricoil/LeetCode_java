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
