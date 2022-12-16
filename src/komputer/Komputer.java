package komputer;

/**
 * @author denysyermiichuk
 * @version 1.0
 * Klasa abstrakcyjna reprezentująca komputer
 */

public abstract class Komputer {

    /**
     * @param procesor rodzaj procesora
     * @param kartaGraficzna karta graficzna(model)
     * @param ram ilość ramu wyrażana w gb
     * @param dysk pojemność dysku wyrażana w gb
     * @param typDysku rodzaj dysku (SSD/HDD)
     */
    private String procesor;
    private String kartaGraficzna;
    private int ram;
    private int dysk;
    private String typDysku;

    public Komputer(String procesor, String kartaGraficzna, int ram, int dysk, String typDysku) {
        this.procesor = procesor;
        this.kartaGraficzna = kartaGraficzna;
        this.ram = ram;
        this.dysk = dysk;
        this.typDysku = typDysku;
    }

    public String getProcesor() {
        return procesor;
    }

    public String getKartaGraficzna() {
        return kartaGraficzna;
    }

    public int getRam() {
        return ram;
    }

    public int getDysk() {
        return dysk;
    }

    public String getTypDysku() {
        return typDysku;
    }

    /**
     * @return zwraca opic danego komputera
     */
    public abstract String getOpis();
}
