import java.util.*;

public class Graf {

    private List<Wierzcholek> wierzcholki;
    private List<Krawedz> krawedzie;
    private int numberOfVerticles;

    public Graf() {
        wierzcholki = new ArrayList<Wierzcholek>();
        krawedzie = new ArrayList<Krawedz>();
    }

    public List<Wierzcholek> getWierzcholki() {
        return wierzcholki;
    }

    public void setWierzcholki(List<Wierzcholek> wierzcholki) {
        this.wierzcholki = wierzcholki;
    }

    public List<Krawedz> getKrawedzie() {
        return krawedzie;
    }

    public void setKrawedzie(List<Krawedz> krawedzie) {
        krawedzie = krawedzie;
    }

    public void dodajKrawedzDoGrafu(Krawedz krawedz) {
        getKrawedzie().add(krawedz);
    }

    public void dodajWierzcholekDoGrafu(Wierzcholek wierzcholek) {
        getWierzcholki().add(wierzcholek);
    }

    @Override
    public String toString() {
        return "Graf{" +
                "wierzcholki=" + wierzcholki.size() +
                ", Krawedzie=" + krawedzie.size() +
                '}';
    }

    public void wypiszGraf() {
        System.out.println("Wierzchołki: ");
        for (Wierzcholek w: wierzcholki) {
            System.out.println(w.toString());
        }
    }

    public void pokolorujSlf(){
        Collections.sort(wierzcholki, new SortByStopien());
        List<Wierzcholek> tmp = new ArrayList<>();
        for(Wierzcholek w:wierzcholki) tmp.add(w);
        while(tmp.size() != 0) {
            tmp.get(0).pokolorujZachalnnie(wierzcholki.size());
            tmp.remove(0);
            for(Wierzcholek w:tmp) w.setStopienNasycenia();
            Collections.sort(tmp, new SortByStopienNasycenia().reversed());
        }
    }

    private class SortByStopienNasycenia implements java.util.Comparator<Wierzcholek> {
        @Override
        public int compare(Wierzcholek o1, Wierzcholek o2) {
            return o1.getStopienNasycenia() - o2.getStopienNasycenia();
        }
    }

    private class SortByStopien implements Comparator<Wierzcholek> {
        @Override
        public int compare(Wierzcholek o1, Wierzcholek o2) {
            return o2.getStopie() - o1.getStopie();
        }
    }

}
