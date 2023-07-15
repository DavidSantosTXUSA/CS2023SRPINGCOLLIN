import java.util.ArrayList;
public class MyList<T extends Number> {
    private ArrayList<T> list;
    public MyList() {
        list = new ArrayList<>();
    }
    public void add(T item) {
        list.add(item);
    }
    public T largest()
    {
        if(list.size() > 0)//checking if list is empty , if its empty we return null
        {
            int max = 0;
            for(int i = 1 ; i < list.size(); i++)//loops through array and finds largest value
            {
                if(list.get(i).doubleValue() > list.get(max).doubleValue())
                    max = i;
            }
            return list.get(max);
        }else
        {
            return null;
        }

    }
    public T smallest()
    {
        if(list.size() > 0)//checking if list is empty , if its empty we return null
        {
            int min = 0;
            for(int i = 1; i<list.size(); i++)//loops through array and finds smallest value
            {
                if(list.get(i).doubleValue() < list.get(min).doubleValue())
                    min = i;
            }
            return list.get(min);
        }else
        {
            return null;
        }

    }
}