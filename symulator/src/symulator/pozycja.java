package symulator;

public class pozycja {
    protected double x;
    protected double y;
    String getPozycja()
    {
        return ("Aktualna pozycja: " + String.valueOf(x) + " " + String.valueOf(y));
    }
    void ZmianaPozycji(double deltaX, double deltaY)
    {
        x = x+deltaX;
        y = y +deltaY;
    }
}
