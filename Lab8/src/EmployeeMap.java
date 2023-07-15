import java.util.Map;
import java.util.TreeMap;

public class EmployeeMap
{
    private Map<Integer, Employee> map = new TreeMap<Integer, Employee>();
    public void add(Employee e)
    {
        map.put(e.getId(), e);
    }

    public Employee lookUp(int id)
    {
        return map.get(id);
    }

}
