package symulator;

public class skrzynia_biegow extends komponent{
    protected int aktualny_bieg;
    protected int ilosc_biegow;
    sprzeglo sprzeglo;
    public skrzynia_biegow(String model, String producent) {
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
    void zwieksz_bieg()
    {
        if(aktualny_bieg < ilosc_biegow && sprzeglo.stanSprzegla)
        {
            aktualny_bieg++;
        }

    }
    void zmniejsz_bieg()
    {
        if(aktualny_bieg>0 && sprzeglo.stanSprzegla)
        {
            aktualny_bieg--;
        }
    }
}
