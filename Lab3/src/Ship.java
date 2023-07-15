public class Ship
{
    private String name;
    private String yearBuilt;
    public Ship()
    {
        name = "";
        yearBuilt = "";
    }

    public Ship(String n, String y)
    {
        name = n;
        yearBuilt = y;
    }

    public void setName(String n)
    {
        name = n;
    }

    public void setYearBuilt(String y)
    {
        yearBuilt = y;
    }

    public String getName()
    {
        return name;
    }

    public String getYearBuilt()
    {
        return yearBuilt;
    }

    public String toString()
    {
        return "Ship name : " + name + "\nYear built: " + yearBuilt;
    }


}