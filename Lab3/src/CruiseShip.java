import java.util.Currency;

public class CruiseShip extends Ship
{
    private int passengers;
    public CruiseShip(String n, String y, int p)
    {
        super(n,y);
        passengers = p;
    }

    public void setPassengers(int p)
    {
        passengers = p;
    }

    public int getPassengers()
    {
        return passengers;
    }

    public String toString()
    {
        return "Ship name: " + super.getName() + "\nMaximum passengers: " + passengers;
    }
}
