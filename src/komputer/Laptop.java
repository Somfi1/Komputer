package komputer;

/**
 * @author denysyermiichuk
 * @version 1.0
 * Klasa abstrakcyjna reprezentująca laptop
 */
public class Laptop extends Komputer{

    private String marka;
    private String rozmiarEkranu;

    /**
     * @param marka producent komputera
     * @param rozmiarEkranu Rozmiar ekranu
     * @param procesor rodzaj procesora
     * @param kartaGraficzna karta graficzna(model)
     * @param ram ilość ramu wyrażana w gb
     * @param dysk pojemność dysku wyrażana w gb
     * @param typDysku rodzaj dysku (SSD/HDD)
     */
    public Laptop(String marka, String rozmiarEkranu, String procesor, String kartaGraficzna, int ram, int dysk, String typDysku) {
        super(procesor, kartaGraficzna, ram, dysk, typDysku);
        this.marka = marka;
        this.rozmiarEkranu = rozmiarEkranu;
    }


    public String getOpis(){
        return String.format("Laptop firmy %s o rozmiarze ekranu %s, i procesorze %s", marka, rozmiarEkranu, getProcesor());
    }
}
