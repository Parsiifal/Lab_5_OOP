package functions;

public class FunctionPoint
{
    private double x;
    private double y;

    public FunctionPoint()
    {
        x = 0;
        y = 0;
    }

    public FunctionPoint(double X, double Y)
    {
        x = X;
        y = Y;
    }

    public FunctionPoint(FunctionPoint point)
    {
        x = point.x;
        y = point.y;
    }

    public double GetX()
    {
        return x;
    }

    public double GetY()
    {
        return y;
    }

    public void SetX(double X)
    {
        x = X;
    }

    public void SetY(double Y)
    {
        y = Y;
    }

    @Override
    public String toString()
    {
		return "(" + x + "; " + y + ")";
    }

    @Override
    public boolean equals(Object o)
    {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        FunctionPoint obj = (FunctionPoint) o;
        return Double.compare(obj.x, x) == 0 && Double.compare(obj.y, y) == 0;
    }

    @Override
    public int hashCode()
    {
        int result = Double.hashCode(x);
        result = 31 * result + Double.hashCode(y);
        return result;
    }

    @Override
    public Object clone()
    {
        try
        {
            return super.clone();
        }
        catch (CloneNotSupportedException e)
        {
            throw new RuntimeException(e);
        }
    }
}