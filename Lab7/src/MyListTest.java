public class MyListTest
{
    public static void main(String[] args) {
        MyList<Integer> list1 = new MyList<>();
        list1.add(5);
        list1.add(10);
        list1.add(15);

        System.out.println("Largest element in Integer List: " + list1.largest());
        System.out.println("Smallest element in Integer List: " + list1.smallest());

        MyList<Double> list2 = new MyList<>();
        list2.add(5.55);
        list2.add(10.10);
        list2.add(15.15);

        System.out.println("Largest element in Double List: " + list2.largest());
        System.out.println("Smallest element in Double List: " + list2.smallest());
    }
}
