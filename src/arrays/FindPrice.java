package arrays;

public class FindPrice {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int min = Integer.MAX_VALUE;
        int maxProfit = 0;

        // Проходим по каждому элементу массива
        for (int i = 0; i < prices.length; i++) {
            // Если находим цену меньше текущего минимума, обновляем минимум
            if (prices[i] < min) {
                min = prices[i];
            }
            // Вычисляем возможную прибыль
            else if (prices[i] - min > maxProfit) {
                maxProfit = prices[i] - min;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        FindPrice solution = new FindPrice();

        // Пример массива цен
        int[] prices = {7, 1, 5, 3, 6, 4};

        // Вызов метода maxProfit и вывод результата
        int profit = solution.maxProfit(prices);
        System.out.println("Максимальная прибыль: " + profit);
    }
}
