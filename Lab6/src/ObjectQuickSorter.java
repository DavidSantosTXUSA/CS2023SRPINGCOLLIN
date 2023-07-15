

public class ObjectQuickSorter
{


    public static void quickSort(Comparable array[])
    {
        doQuickSort(array, 0, array.length - 1);
    }



    private static void doQuickSort(Comparable array[], int start, int end)
    {
        int pivotPoint;

        if (start < end)
        {
            pivotPoint = partition(array, start, end);

            doQuickSort(array, start, pivotPoint - 1);


            doQuickSort(array, pivotPoint + 1, end);
        }
    }



    private static int partition(Comparable array[], int start, int end)
    {
        int pivotValue;
        int endOfLeftList;
        int mid;


        mid = (start + end) / 2;


        swap(array, start, mid);


        pivotValue = start;

        endOfLeftList = start;


        for (int scan = start + 1; scan <= end; scan++)
        {
            if (array[scan].compareTo(array[pivotValue]) <0)
            {
                endOfLeftList++;
                swap(array, endOfLeftList, scan);
            }
        }


        swap(array, start, endOfLeftList);

        return endOfLeftList;
    }



    private static void swap(Object[] array, int a, int b)
    {
        Object temp;

        temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}