import java.util.Random;

public class GeneratorGrafu {
    private Graf g;
    private Random random;

    public GeneratorGrafu(Graf g) {
        this.g = g;
        this.random = new Random();
    }

    public Graf getG() {
        return g;
    }

    public void setG(Graf g) {
        this.g = g;
    }

    public void generujWierzcholki(int n) {
        for(int i = 0; i <=n;i++) {
            this.g.dodajWierzcholekDoGrafu(new Wierzcholek(String.valueOf(i)));
        }
    }

    public void generujKrawedzie(int n) {
        int ileWierzolkow = g.getWierzcholki().size();
        for(int i = 0; i<=n;i++) {
            g.getWierzcholki().get(random.nextInt(ileWierzolkow)).dodajSasiada(g.getWierzcholki().get(random.nextInt(ileWierzolkow)));
        }
    }
}
