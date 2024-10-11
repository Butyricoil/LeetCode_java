public class qSortHaore {

    public int partition(int[] array, int left, int right) {
        int pivot = array[(left + right) / 2];
        while (left <= right) {
            while (array[left] < pivot) {
                left++;
            }
            while (array[right] > pivot) {
                right--;
            }
            if (left <= right) {
                int temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
        return left;
    }

    public void sort(int[] array, int left, int right) {
        if (left < right) {
            int pivot = partition(array, left, right);
            sort(array, left, pivot - 1);
            sort(array, pivot, right);
        }
    }

    public qSortHaore(int[] array) {
        sort(array, 0, array.length - 1);
    }

    public static void main(String[] args) {
        int[] array = {9, 4, 1, 2, 5, 8, 2, 1};

        // Вызов сортировки
        new qSortHaore(array);


        // Вывод отсортированного массива
        System.out.println("Отсортированный массив:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
