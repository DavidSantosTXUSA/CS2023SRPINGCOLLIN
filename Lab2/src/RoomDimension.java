public class RoomDimension implements Comparable{
   private double length;
   private double width;
   public RoomDimension(double len, double w)
   {
      length = len;
      width = w;
   }

   public RoomDimension(RoomDimension room)
   {
      length = room.length;
      width = room.width;
   }
   public double getArea()
   {
      return length*width;
   }

   public Object clone()
   {
      return new RoomDimension(this);
   }

   public int hashCode()
   {
      int result = 17;
      result = result * 37 + Double.toString(length).hashCode();
      result = result * 37 + Double.toString(width).hashCode();
      return result;
   }
   public String toString()
   {
      return "Length (ft): " + length
              +"\nWidth (ft): " + width;
   }

   @Override
   public int compareTo(Object o) {
      RoomDimension r = (RoomDimension) o;
      if(r.equals(this))
      {
         return 0;
      }else if (this.getArea() > r.getArea())
      {
         return 1;
      }else if(this.getArea() < r.getArea())
      {
         return -1;
      }else if(this.getArea() == r.getArea())
      {
         return 0;
      }
      return -1;
   }

   public boolean equals(RoomDimension room)
   {
      if(room.width == this.width && room.length == this.length)
      {
         return true;
      }else
      {
         return false;
      }
   }

   protected void finalize() throws Throwable
   {
      super.finalize();
      System.out.println("RoomDimension Object has been destroyed");
   }

}