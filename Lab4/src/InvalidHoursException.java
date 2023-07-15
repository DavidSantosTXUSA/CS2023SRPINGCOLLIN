public class InvalidHoursException extends Exception
{
    double hours;

    public InvalidHoursException(double h)
    {
        hours = h;
    }

    public String toString()
    {
        return "Invalid number of employee working hours ";
    }
}
