import java.io.*;

public class BubbleSort implements Strategy{
    @Override
    public void sort(int[] array){
        int n = array.length;

        int i, j, temp;
        boolean swapp;
        for (i = 0; i < n - 1; i++) {
            swapp = false;
            for (j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapp = true;
                }
            }
            if (!swapp)
                break;
        }
    }
}
