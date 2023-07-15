public class BinarySearchTest {
    public static void main(String args[]) {
        String[] s = new String[5];
        s[0] = new String("Dubious");
        s[1] = new String("Chicanery");
        s[2] = new String("Bombastic");
        s[3] = new String("Acrimony");
        s[4] = new String("Ebullient");
        System.out.println("List pre sorted: ");
        ObjectBinarySearcher o = new ObjectBinarySearcher();
        for(int i = 0; i < s.length; i++)
        {
            System.out.println(s[i]);
        }
        System.out.println();


        System.out.println("List after quick sort: ");
        ObjectQuickSorter run = new ObjectQuickSorter();
        run.quickSort(s);
        for(int i = 0; i < s.length; i++)
        {
            System.out.println(s[i]);
        }
        System.out.println("Searching for Acrimony: ");
        System.out.println("Found at index: " + o.search(s, "Acrimony" ));
        System.out.println("Searching for Bombastic: ");
        System.out.println("Found at index: " +o.search(s, "Bombastic" ));
        System.out.println("Searching for Chicanery: ");
        System.out.println("Found at index: " +o.search(s, "Chicanery" ));
        System.out.println("Searching for Dubious: ");
        System.out.println("Found at index: " +o.search(s, "Dubious" ));
        System.out.println("Searching for Ebullient: ");
        System.out.println("Found at index: " +o.search(s, "Ebullient" ));
        System.out.println("Searching for word wheel: " );
        System.out.println("not found :" + o.search(s, "wheel" ));
    }
}