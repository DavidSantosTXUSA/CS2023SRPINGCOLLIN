public class RoomCarpet implements Comparable{
    private RoomDimension size;
    private double carpetCost;
    public RoomCarpet(RoomDimension dim, double cost)
    {
        size = dim;
        carpetCost = cost;
    }
    public RoomCarpet(RoomCarpet obj)
    {
        size = obj.size;
        carpetCost = obj.carpetCost;
    }

    public RoomDimension getSize()
    {
        return size;
    }

    protected void finalize() throws Throwable
    {
        super.finalize();
        System.out.println("RoomCarpet Object has been destroyed");
    }

    public Object clone()
    {
        return new RoomCarpet(this);
    }

    public double getTotalCost()
    {
        return size.getArea()*carpetCost;
    }
    public int hashCode()
    {
        int result = 17;
        result = result * 37 + Double.toString(carpetCost).hashCode();
        result = result * 37 + size.toString().hashCode();
        return result;
    }

    public int compareTo(Object obj)
    {
        RoomCarpet room = (RoomCarpet) obj;
        if(carpetCost == room.carpetCost)
        {
            return 0;
        }else if(carpetCost > room.carpetCost)
        {
            return 1;
        }else {
            return -1;
        }
    }

    public boolean equals(RoomCarpet room)
    {
        if(carpetCost == room.carpetCost)
        {
            return true;
        }else {
            return false;
        }
    }

    public String toString()
    {
        return "Total cost: " + getTotalCost()
                +"\nCarpet Cost: " + carpetCost
                +"\nRoom dimensions: " + size;
    }


}
