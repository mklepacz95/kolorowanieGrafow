import java.util.ArrayList;
import java.util.List;

public class Wierzcholek {

    private String nazwa;
    Integer kolor = null;
    private List<Wierzcholek> wierzcholkiSasiednie;
    private Integer stopienNasycenia;

    public Wierzcholek(String nazwa) {
        this.nazwa = nazwa;
        this.wierzcholkiSasiednie = new ArrayList<Wierzcholek>();
    }

    public Wierzcholek(String nazwa, Integer stopienNasycenia) {
        this.nazwa = nazwa;
        this.wierzcholkiSasiednie = new ArrayList<Wierzcholek>();
        this.stopienNasycenia = stopienNasycenia;
    }

    public Integer getKolor() {
        return kolor;
    }

    public void setKolor(Integer kolor) {
        this.kolor = kolor;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public List<Wierzcholek> getWierzcholkiSasiednie() {
        return wierzcholkiSasiednie;
    }

    public void setWierzcholkiSasiednie(List<Wierzcholek> wierzcholkiSasiednie) {
        this.wierzcholkiSasiednie = wierzcholkiSasiednie;
    }

    public void dodajSasiada(Wierzcholek w) {
        if(wierzcholkiSasiednie.add(w)) w.getWierzcholkiSasiednie().add(this);

    }

    public void wypiszSasiadow() {
        for(Wierzcholek w:wierzcholkiSasiednie) {
            System.out.println("Sasiad " + getNazwa() + ": " + w.getNazwa());
        }
    }

    public void pokolorujZachalnnie(Integer ileKolorow) {
        Integer[] tmp = new Integer[ileKolorow];
        for(Wierzcholek w: wierzcholkiSasiednie) {
            if(w.getKolor() != null) {
                tmp[w.getKolor()] = 1;
            }
        }
        int i = 0;
        while(tmp[i] != null && i <= ileKolorow-1) {
            i++;
        }
        this.kolor = i;
    }

    @Override
    public String toString() {
        return "Wierzcholek{" +
                "nazwa='" + nazwa + '\'' +
                ", kolor=" + kolor +
                ", stopien="+getStopie()+
                ", stopieNasycenia="+stopienNasycenia+
                '}';
    }

    public Integer getStopie() {
        return wierzcholkiSasiednie.size();
    }

    public void setStopienNasycenia() {
        Integer stopienNasycenia = 0;
        for(Wierzcholek w: wierzcholkiSasiednie) if(w.getKolor() != null) stopienNasycenia++;
        this.stopienNasycenia = stopienNasycenia;
    }

    public Integer getStopienNasycenia() {
        return stopienNasycenia;
    }
}
