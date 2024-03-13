public class CocktailSort implements Strategy{
    @Override
    public void sort(int[] array) {
        boolean swapp = true;
        int start = 0;
        int end = array.length;

        while (swapp == true)
        {
            swapp = false;

            for (int i = start; i < end - 1; ++i)
            {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapp = true;
                }
            }

            if (swapp == false)
                break;

            swapp = false;

            end = end - 1;

            for (int i = end - 1; i >= start; i--)
            {
                if (array[i] > array[i + 1])
                {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapp = true;
                }
            }

            start = start + 1;
        }
    }
}
