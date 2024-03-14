import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortTest {
    @Test
    public void testBubbleSort(){
        int[] array = {3,5,6,1,5,2,4};
        int[] exp ={1,2,3,4,5,6};
        Strategy bubbleSort = new BubbleSort();
        bubbleSort.sort(array);
        assertArrayEquals(array, exp);
    }

    @Test
    public void testCocktailSort(){
        int[] array = {3,5,6,1,5,2,4};
        int[] exp ={1,2,3,4,5,6};
        Strategy cocktailSort = new CocktailSort();
        cocktailSort.sort(array);
        assertArrayEquals(array, exp);
    }

    @Test
    public void testHeapSort(){
        int[] array = {3,5,6,1,5,2,4};
        int[] exp ={1,2,3,4,5,6};
        Strategy heapSort = new HeapSort();
        heapSort.sort(array);
        assertArrayEquals(array, exp);
    }

    @Test
    public void testInsertionSort(){
        int[] array = {3,5,6,1,5,2,4};
        int[] exp ={1,2,3,4,5,6};
        Strategy insertSort = new InsertionSort();
        insertSort.sort(array);
        assertArrayEquals(array, exp);
    }

    @Test
    public void testSelectionSort(){
        int[] array = {3,5,6,1,5,2,4};
        int[] exp ={1,2,3,4,5,6};
        Strategy selectionSort = new SelectionSort();
        selectionSort.sort(array);
        assertArrayEquals(array, exp);
    }
}