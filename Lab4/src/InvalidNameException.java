public class InvalidNameException extends Exception
{
    String name;
    public InvalidNameException(String n)
    {
        name = n;
    }

    public String toString()
    {
        return "Invalid Employee Name ";
    }
}
