package symulator;

public class sprzeglo extends komponent{
    protected boolean stanSprzegla;
    public sprzeglo(String model, String producent) {
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
    void wcisnij()
    {
        stanSprzegla = true;

    }
    void zwolnij()
    {
        stanSprzegla = false;

    }

}
