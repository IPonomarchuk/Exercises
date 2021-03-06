package tasks;

public class ArrayCheck {

    /*Есть интовый массив. Вернуть сумму его элементов.
    Если пустой вернуть 0. Если в ячейке число 13, не считать его и не считать ячейку которая идет сразу после этого.*/

    public static int sumOfArrayElements(int[] array) {

        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (i != 0) {
                if (array[i - 1] == 13) {
                    continue;
                }
            }
            if (array[i] == 13) {
                i++;
            } else {
                sum = sum + array[i];
            }
        }

        System.out.println(sum);
        return sum;
    }
}
