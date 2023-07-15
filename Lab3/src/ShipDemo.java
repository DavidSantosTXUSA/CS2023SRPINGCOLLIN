public class ShipDemo
{
    public static void main(String args[])
    {
        Ship array[] = new Ship[10];
        array[0] = new CruiseShip("Rest A Shore","1999",5000);
        array[1] = new Ship("Overboard","2008");
        array[2] = new CargoShip("Coral","2015",10000);
        array[3] = new CruiseShip("Neptune","1995",2000);
        array[4] =  new CruiseShip("Titanic II","2018",15000);
        array[5] = new Ship("Avalon","2016");
        array[6] = new Ship("Fortuna","1992");
        array[7] = new CargoShip("Pearl","2002",7500);
        array[8] = new CargoShip("Liberty","2003",17000);
        array[9] = new Ship("Sapphire","2006");
        for(int i = 0; i < 10; i ++)
        {
            System.out.println(array[i]);
            System.out.println();
        }
    }
}
