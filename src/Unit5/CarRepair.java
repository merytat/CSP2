package Unit5;

public class CarRepair {
    private int mechanicNum;
    private int bayNum;

    public CarRepair(int m, int b)
    {
        mechanicNum = m;
        bayNum = b;
    }

    public int getMechanicNum()
    { return mechanicNum; }

    public int getBayNum()
    { return bayNum; }

    public void setBayNum(int newB){
        bayNum = newB;
    }

// There may be other constructors, and methods not shown.

}
