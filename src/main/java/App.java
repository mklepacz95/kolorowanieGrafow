public class App {

    public static void main(String[] args) {
        System.out.println("Wystartowalem");

        Wierzcholek w0 = new Wierzcholek("0",2);
        Wierzcholek w1 = new Wierzcholek("1",10);
        Wierzcholek w2 = new Wierzcholek("2",2);
        Wierzcholek w3 = new Wierzcholek("3",4);
        Wierzcholek w4 = new Wierzcholek("4",1);
        Wierzcholek w5 = new Wierzcholek("5",5);

        Graf g = new Graf();
        g.dodajWierzcholekDoGrafu(w0);
        g.dodajWierzcholekDoGrafu(w1);
        g.dodajWierzcholekDoGrafu(w2);
        g.dodajWierzcholekDoGrafu(w3);
        g.dodajWierzcholekDoGrafu(w4);
        g.dodajWierzcholekDoGrafu(w5);
        w0.dodajSasiada(w1);
        w0.dodajSasiada(w4);
        w1.dodajSasiada(w2);
        w1.dodajSasiada(w4);
        w1.dodajSasiada(w5);
        w2.dodajSasiada(w3);
        w3.dodajSasiada(w4);
        w3.dodajSasiada(w5);
        w4.dodajSasiada(w5);

        //System.out.println(g.toString());
        //g.wypiszGraf();
        g.pokolorujSlf();
        g.wypiszGraf();
        /*
        w1.wypiszSasiadow();
        w3.wypiszSasiadow();
        w2.wypiszSasiadow();
        */
    }

}
