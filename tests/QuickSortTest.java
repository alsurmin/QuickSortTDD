import org.junit.jupiter.api.Test;

class QuickSortTest {

    @Test
    void quickSort() {
        int[] source = {2, 10, 1, 4, 3, 7, 22};
        int leftBorder = 0;
        int rightBorder = source.length-1;
        QuickSort quickSort = new QuickSort();
        quickSort.sort(source, leftBorder, rightBorder);
        for (int i = 0; i < source.length; i++) {
            System.out.print(source[i] + (i==source.length-1 ? "" : ", "));
        }
    }

}