public class Employee {
    //attributes of an employee, all private for security reasons
    private String name;
    private int idNumber;
    private String department;
    private String position;

    //overloaded constructors
    public Employee(String n, int id, String d, String p)
    {
        name = n;
        idNumber = id;
        department = d;
        position = p;
    }
    public Employee(String n, int id)
    {
        name = n;
        idNumber = id;
        department = "";
        position = "";
    }

    //default constructor
    public Employee()
    {
        name = "";
        idNumber = 0;
        department = "";
        position = "";
    }
    //getter methods
    public String getName()
    {
        return name;
    }
    public int getIdNumber()
    {
        return idNumber;
    }
    public String getDepartment()
    {
        return department;
    }
    public String getPosition()
    {
        return position;
    }

    //setter methods
    public void setName(String n)
    {
        name = n;
    }
    public void setIdNumber(int id)
    {
       idNumber = id;
    }
    public void setDepartment(String d)
    {
        department = d;
    }
    public void setPosition(String p)
    {
        position = p;
    }

    //to string method to display the data
    public String toString()
    {
        String output = "Name: " + name + "\nID Number: " + idNumber + "\nDepartment: "
                + department + "\nPosition: " + position + "\n";
        return output;
    }
}
