import java.util.ArrayList;
import java.util.Comparator;

public class Heap<T> {
    private final ArrayList<T> heap;
    private final Comparator<T> comparator;

    public Heap(Comparator<T> comparator) {
        this.heap = new ArrayList<>();
        this.comparator = comparator;
    }

    public void add(T element) {
        heap.add(element);
        int index = heap.size() - 1;
        while (index > 0) {
            int parentIndex = (index - 1) / 2;
            if (comparator.compare(heap.get(parentIndex), heap.get(index)) > 0) {
                swap(parentIndex, index);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    public T remove() {
        if (heap.isEmpty()) {
            return null;
        }
        T root = heap.get(0);
        T last = heap.remove(heap.size() - 1);
        if (!heap.isEmpty()) {
            heap.set(0, last);
            int index = 0;
            while (index < heap.size()) {
                int leftChildIndex = index * 2 + 1;
                int rightChildIndex = index * 2 + 2;
                int smallerChildIndex = index;
                if (leftChildIndex < heap.size() && comparator.compare(heap.get(leftChildIndex), heap.get(smallerChildIndex)) < 0) {
                    smallerChildIndex = leftChildIndex;
                }
                if (rightChildIndex < heap.size() && comparator.compare(heap.get(rightChildIndex), heap.get(smallerChildIndex)) < 0) {
                    smallerChildIndex = rightChildIndex;
                }
                if (smallerChildIndex == index) {
                    break;
                }
                swap(index, smallerChildIndex);
                index = smallerChildIndex;
            }
        }
        return root;
    }

    private void swap(int i, int j) {
        T temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    public ArrayList<T> getHeap() {
        return heap;
    }

    public Comparator<T> getComparator() {
        return comparator;
    }
}