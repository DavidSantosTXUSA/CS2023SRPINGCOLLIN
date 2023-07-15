import java.util.Comparator;
import java.util.Random;

public class HeapDemo {
    public static void main(String[] args) {
        Comparator<Integer> naturalOrder = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        Heap<Integer> heap = new Heap<>(naturalOrder);
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int num = random.nextInt(100);
            //.out.println("Adding " + num + " to heap");
            heap.add(num);
        }

        System.out.println();
        System.out.println(heap.getHeap());

        System.out.println();
        while (!heap.getHeap().isEmpty()) {
            System.out.print(heap.remove() + " ");
        }
    }
}