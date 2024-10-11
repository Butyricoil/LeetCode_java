package sort;

public class mergeSort {


    // Метод для слияния двух отсортированных частей массива
    public static void merge(int[] array, int left, int middle, int right) {
        // Размеры временных массивов
        int size1 = middle - left + 1;
        int size2 = right - middle;

        // Временные массивы для хранения данных
        int[] leftArray = new int[size1];
        int[] rightArray = new int[size2];

        // Копируем данные во временные массивы
        for (int i = 0; i < size1; i++) {
            leftArray[i] = array[left + i];
        }
        for (int j = 0; j < size2; j++) {
            rightArray[j] = array[middle + j + 1];
        }

        // Индексы для слияния
        int i = 0, j = 0;
        int k = left;

        // Слияние временных массивов в основной массив
        while (i < size1 && j < size2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Копируем оставшиеся элементы, если они есть
        while (i < size1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < size2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Основной метод сортировки слиянием
    public static void sort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            // Сортируем левую и правую части
            sort(array, left, middle);
            sort(array, middle + 1, right);

            // Сливаем отсортированные части
            merge(array, left, middle, right);
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7};

        System.out.println("Исходный массив:");
        for (int i : array) {
            System.out.print(i + " ");
        }

        // Вызов сортировки
        sort(array, 0, array.length - 1);

        System.out.println("\nОтсортированный массив:");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
    }