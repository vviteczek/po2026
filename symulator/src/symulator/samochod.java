package symulator;

public class samochod{
    silnik silnik;
    skrzynia_biegow skrzynia;
    String producent;
    String model;
    String maxObroty;
    public samochod(String producent, String model , String maxObroty)
    {
        this.producent = producent;
        this.model = model;
        this.maxObroty = maxObroty;
    }
    String getProducent()
    {
        return producent;
    }
    String getModel()
    {
        return model;
    }
    void wloncz()
    {
        silnik.uruchom();
    }
    void wyloncz()
    {
        skrzynia.aktualny_bieg = 0;
        silnik.zatrzymaj();
    }


}
