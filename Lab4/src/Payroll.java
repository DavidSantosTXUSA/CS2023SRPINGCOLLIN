public class Payroll
{
    private String name;
    private int idNumber;
    private double payRate;
    private double hoursWorked;
    public Payroll(String n, int i)
    {
        try{
            if(n.length() == 0) {
                throw new InvalidNameException(n);
            }else {
                name = n;
            }
        }catch(InvalidNameException ex)
        {
            System.out.println(ex.toString());
        }
        try
        {
            if(i <= 0)
            {
                throw new InvalidIDException(i);
            }else
            {
                idNumber = i;
            }

        }catch(InvalidIDException ex)
        {
            System.out.println(ex.toString());
        }
    }
    public void setName(String n)
    {
        try{
            if(n.length() == 0) {
                throw new InvalidNameException(n);
            }else {
                name = n;
            }
        }catch(InvalidNameException ex)
        {
            System.out.println(ex.toString());
        }
    }
    public void setIdNumber(int i)
    {
        try
        {
            if(i <= 0)
            {
                throw new InvalidIDException(i);
            }else
            {
                idNumber = i;
            }

        }catch(InvalidIDException ex)
        {
            System.out.println(ex.toString());
        }
    }
    public void setPayRate(double p)
    {
        try
        {
            if(p < 0 || p > 25)
            {
                throw new InvalidHourlyRateException(p);
            }
            else
            {
                payRate = p;
            }
        }
        catch(InvalidHourlyRateException ex)
        {
            System.out.println(ex.toString());
        }
    }

    public void setHoursWorked(double h) {
        try {
            if (h < 0 || h > 84) {
                throw new InvalidHoursException(h);
            } else {
                hoursWorked = h;
            }
        } catch (InvalidHoursException ex) {
            System.out.println(ex.toString());
        }
    }
    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }
    public double getGrossPay()
    {
        return hoursWorked * payRate;
    }
}