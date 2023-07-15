import java.util.ArrayList;

public class CarpetCalculatorApp {
    public static void main(String args[]) throws Throwable {
        RoomDimension Room1 = new RoomDimension(12, 10);
        RoomCarpet R1 = new RoomCarpet(Room1,8);//room 1
        RoomDimension Room2 = new RoomDimension(100, 115);
        RoomCarpet R2 = new RoomCarpet(Room2,12);//room 2
        RoomDimension Room3 = new RoomDimension(200, 250);
        RoomCarpet R3 = new RoomCarpet(Room3,4.5);// room 3

        ArrayList<RoomCarpet> rooms = new ArrayList<RoomCarpet>();
        rooms.add(R1);
        rooms.add(R2);
        rooms.add(R3);

        System.out.println("Testing toString method");
        for(int i = 0; i < rooms.size(); i++)
        {
            System.out.println("Room " + (i+1));
            System.out.println(rooms.get(i));
            System.out.println("Area (Ft): " + rooms.get(i).getSize().getArea());
            System.out.println("Hashcode: " + rooms.get(i).hashCode());
            System.out.println();
        }

        System.out.println("Testing equals method, A room that is 12x10 the same as Room 1?");
        RoomCarpet R4 = new RoomCarpet(Room1,8); //Equal of R1
        System.out.println(R4.equals(R1));//should print true

        System.out.println("Testing compareto method, A room that has a carpet cost of 13 vs a room that has a carpet cost of 12");
        RoomCarpet R5 = new RoomCarpet(Room2,13);
        System.out.println(R5.compareTo(R2));//should return 1 since our cost is greater

        System.out.println("The above outputs should be true and 1");

        System.out.println("Testing Clone() method: Following output should be same as room 1");
        RoomCarpet R6 = (RoomCarpet) R1.clone();

        System.out.println(R6);
        System.out.println("Testing finalize() method");
        System.gc();
        R6.finalize();
    }
}
