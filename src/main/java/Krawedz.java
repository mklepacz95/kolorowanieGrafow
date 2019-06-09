public class Krawedz {

    private Wierzcholek poprzednik;
    private Wierzcholek nastepnik;
    private String nazwa;

    public Krawedz(Wierzcholek poprzednik, Wierzcholek nastepnik, String nazwa) {
        this.poprzednik = poprzednik;
        this.nastepnik = nastepnik;
        this.nazwa = nazwa;
    }

    public Wierzcholek getPoprzednik() {
        return poprzednik;
    }

    public void setPoprzednik(Wierzcholek poprzednik) {
        this.poprzednik = poprzednik;
    }

    public Wierzcholek getNastepnik() {
        return nastepnik;
    }

    public void setNastepnik(Wierzcholek nastepnik) {
        this.nastepnik = nastepnik;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return "Krawedz{" +
                "poprzednik=" + poprzednik.getNazwa() +
                ", nastepnik=" + nastepnik.getNazwa() +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }
}
