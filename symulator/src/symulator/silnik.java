package symulator;

public class silnik extends komponent{
    protected int max_obroty;
    protected int obroty;
    protected boolean stan;
    public silnik(String model, String producent) {
        super(model, producent);
    }
    String getProducent()
    {
        return producent;
    }
    String getModel()
    {
        return model;
    }
    int uruchom()
    {
        int startowe = 1500;
        obroty = startowe;
        return obroty;
    }
    int zatrzymaj()
    {
        obroty = 0;
        return obroty;
    }
}
