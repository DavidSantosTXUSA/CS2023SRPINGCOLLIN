public class InvalidHourlyRateException extends Exception
{
    double rate;
    public InvalidHourlyRateException(double r)
    {
        rate = r;
    }
    public String toString(){
        return "Invalid employee working hourly rate ";
    }
}
