package sort;

public class qSortLomuto {

    public int partition(int[] array, int start, int end) {
        int left = start;
        for (int current = start; current < end; current++) {
            if (array[current] <= array[end]/*pivot*/) {
                // Обмен элементов
                int temp = array[left];
                array[left] = array[current];
                array[current] = temp;
                left++;
            }
        }
        // Обмен опорного элемента (array[end]) с элементом на позиции left
        int temp = array[left];
        array[left] = array[end];
        array[end] = temp;

        return left;
    }

    public void sort(int[] array, int start, int end) {
        if (start < end) {
            int pivot = partition(array, start, end);
            sort(array, start, pivot - 1); // Сортируем левую часть
            sort(array, pivot + 1, end);   // Сортируем правую часть
        }
    }

    public qSortLomuto(int[] array) {
        sort(array, 0, array.length - 1);
    }

    public static void main(String[] args) {
        int[] array = {9, 4, 1, 2, 5, 8, 2, 1};

        // Вызов сортировки
        new qSortLomuto(array);

        // Вывод отсортированного массива
        System.out.println("Отсортированный массив:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
