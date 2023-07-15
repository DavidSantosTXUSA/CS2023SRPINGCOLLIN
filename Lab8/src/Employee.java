public class Employee
{
    private String name;
    private int id;
    public Employee(String n, int i)
    {
        name = n;
        id = i;
    }

    public String getName()
    {
        return name;
    }

    public int getId()
    {
        return id;
    }

    public String toString()
    {
        return "Name: " + name + "\nID: " + id;
    }
}
