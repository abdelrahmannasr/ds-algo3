public class SelectionSort {

    public void sort(int[] array) {
        for (var i = 0; i < array.length; i++) {
           var minIndex = getMinIndex(array, i);
           swap(array, minIndex, i);
        }
    }

    private int getMinIndex(int[] array, int index) {
        for (var j = index; j < array.length; j++)
            if (array[j] < array[index])
                index = j;
       return index;
    }

    private void swap(int[] array, int index1, int index2) {
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
