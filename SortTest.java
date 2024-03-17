import java.util.Arrays;

class SortTest {

    public void testBubbleSort(){
        int[] array = {5,4,3,2,1};
        SortContext bubble = new SortContext(new BubbleSort());
        bubble.execSort(array);
        System.out.println("Posortowana tablica: "+ Arrays.toString(array));

        int[] arrayb2 = {2,4,5,1,3};
        bubble.execSort(arrayb2);
        System.out.println("Posortowana tablica: "+ Arrays.toString(arrayb2));

        int[] arrayb3 = {1,2,3,4,5};
        bubble.execSort(arrayb3);
        System.out.println("Posortowana tablica: "+ Arrays.toString(arrayb3));
        System.out.println();

    }

    public void testCocktailSort(){
        int[] arrayc1 = {5,4,3,2,1};
        SortContext cocktail = new SortContext(new CocktailSort());
        cocktail.execSort(arrayc1);
        System.out.println("Posortowana tablica: "+ Arrays.toString(arrayc1));

        int[] arrayc2 = {2,4,5,1,3};
        cocktail.execSort(arrayc2);
        System.out.println("Posortowana tablica: "+ Arrays.toString(arrayc2));

        int[] arrayc3 = {1,2,3,4,5};
        cocktail.execSort(arrayc3);
        System.out.println("Posortowana tablica: "+ Arrays.toString(arrayc3));
        System.out.println();
    }

    public void testHeapSort(){
        int[] arrayh1 = {3,2,5,4,1};
        SortContext heap = new SortContext(new HeapSort());
        heap.execSort(arrayh1);
        System.out.println("Posortowana tablica: "+ Arrays.toString(arrayh1));

        int[] arrayh2 = {5,8,9,10,12,3,2,1,4,6,5,22};
        heap.execSort(arrayh2);
        System.out.println("Posortowana tablica: "+ Arrays.toString(arrayh2));
        System.out.println();

    }

    public void testInsertionSort(){
        int[] arrayi1 = {5,4,3,2,1};
        SortContext insert = new SortContext(new InsertionSort());
        insert.execSort(arrayi1);
        System.out.println("Posortowana tablica: "+ Arrays.toString(arrayi1));

        int[] arrayi2 = {4,2,3,1,5};
        insert.execSort(arrayi2);
        System.out.println("Posortowana tablica: "+ Arrays.toString(arrayi2));

        int[] arrayi3 = {1,2,3,4,5};
        insert.execSort(arrayi3);
        System.out.println("Posortowana tablica: "+ Arrays.toString(arrayi3));
        System.out.println();

    }

    public void testSelectionSort(){
        int[] arrays1 = {5,4,3,2,1};
        SortContext selection = new SortContext(new SelectionSort());
        selection.execSort(arrays1);
        System.out.println("Posortowana tablica: "+ Arrays.toString(arrays1));

        int[] arrays2 = {4,2,3,1,5};
        selection.execSort(arrays2);
        System.out.println("Posortowana tablica: "+ Arrays.toString(arrays2));

        int[] arrays3 = {1,2,3,4,5};
        selection.execSort(arrays3);
        System.out.println("Posortowana tablica: "+ Arrays.toString(arrays3));

    }
}