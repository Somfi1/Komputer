package komputer;

/**
 * @author denysyermiichuk
 * @version 1.0
 * Klasa abstrakcyjna reprezentująca komputer stacjonarny
 */

public class PC extends Komputer{

    private String obudowa;
    private String plytaGlowna;

    public PC(String procesor, String kartaGraficzna, int ram, int dysk, String typDysku, String obudowa, String plytaGlowna) {
        super(procesor, kartaGraficzna, ram, dysk, typDysku);
        this.obudowa = obudowa;
        this.plytaGlowna = plytaGlowna;
    }

    public String getOpis(){
        return String.format("Komputer stacjonarny w obudowie %s o procesorze %s, z płytą główną " + "%s i kartą graficzną %s", obudowa, getProcesor(), plytaGlowna, getKartaGraficzna());

    }

    public void zagrajWcs(){
        System.out.println("Uwaga zaczynam grać bójcie się");
    }

}
