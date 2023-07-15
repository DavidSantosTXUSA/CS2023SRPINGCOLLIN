public class InvalidIDException extends Exception
{
    int id;
    InvalidIDException(int i)
    {
        id = i;
    }

    public String toString()
    {
        return "Invalid Employee ID ";
    }

}
