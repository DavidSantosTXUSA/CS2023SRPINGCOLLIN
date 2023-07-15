public class ObjectBinarySearcher
{
   public static int search(Object[] array, Object value)
   {
      int first;
      int last;
      int middle;
      int position;
      boolean found;

      first = 0;
      last = array.length - 1;
      position = -1;
      found = false;


      while (!found && first <=last)
      {

         middle = (first + last) / 2;
         if (((Comparable)array[middle]).compareTo(value) == 0)
         {

            found = true;
            position = middle;
         }
         else if (((Comparable)array[middle]).compareTo(value) > 0)
         {
            last = middle - 1;
         }
         else
         {
            first = middle + 1;
         }
      }

      return position;
   }
}