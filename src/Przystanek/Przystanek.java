package Przystanek;

public class Przystanek {
    String godzina_przyjazdu;


    String nazwa_ulicy;

    int nr_lini;

    public Przystanek(String godzina_przyjazdu, String nazwa_ulicy, int nr_lini) {
        this.godzina_przyjazdu = godzina_przyjazdu;
        this.nazwa_ulicy = nazwa_ulicy;
        this.nr_lini = nr_lini;


    }

    @Override
    public String toString() {
        return "Przystanek{" +
                "godzina_przyjazdu='" + godzina_przyjazdu + '\'' +
                ", nazwa_ulicy='" + nazwa_ulicy + '\'' +
                ", nr_lini=" + nr_lini +
                '}';
    }
}
