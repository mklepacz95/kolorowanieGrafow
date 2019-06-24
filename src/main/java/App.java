public class App {

    public static void main(String[] args) {

        Graf g = new Graf();
        GeneratorGrafu generatorGrafu = new GeneratorGrafu(g);
        generatorGrafu.generujWierzcholki(19);
        //0
        g.getWierzcholki().get(0).dodajSasiada(g.getWierzcholki().get(1));
        g.getWierzcholki().get(0).dodajSasiada(g.getWierzcholki().get(5));
        g.getWierzcholki().get(0).dodajSasiada(g.getWierzcholki().get(8));
        g.getWierzcholki().get(0).dodajSasiada(g.getWierzcholki().get(13));
        //1
        g.getWierzcholki().get(1).dodajSasiada(g.getWierzcholki().get(2));
        g.getWierzcholki().get(1).dodajSasiada(g.getWierzcholki().get(3));
        g.getWierzcholki().get(1).dodajSasiada(g.getWierzcholki().get(5));
        //2
        g.getWierzcholki().get(2).dodajSasiada(g.getWierzcholki().get(3));
        g.getWierzcholki().get(2).dodajSasiada(g.getWierzcholki().get(5));
        g.getWierzcholki().get(2).dodajSasiada(g.getWierzcholki().get(9));
        g.getWierzcholki().get(2).dodajSasiada(g.getWierzcholki().get(10));
        //3
        g.getWierzcholki().get(3).dodajSasiada(g.getWierzcholki().get(6));
        g.getWierzcholki().get(3).dodajSasiada(g.getWierzcholki().get(10));
        g.getWierzcholki().get(3).dodajSasiada(g.getWierzcholki().get(17));
        //4
        g.getWierzcholki().get(4).dodajSasiada(g.getWierzcholki().get(6));
        g.getWierzcholki().get(4).dodajSasiada(g.getWierzcholki().get(7));
        g.getWierzcholki().get(4).dodajSasiada(g.getWierzcholki().get(11));
        g.getWierzcholki().get(4).dodajSasiada(g.getWierzcholki().get(17));
        //5
        g.getWierzcholki().get(5).dodajSasiada(g.getWierzcholki().get(8));
        g.getWierzcholki().get(5).dodajSasiada(g.getWierzcholki().get(10));
        //6
        g.getWierzcholki().get(6).dodajSasiada(g.getWierzcholki().get(10));
        g.getWierzcholki().get(6).dodajSasiada(g.getWierzcholki().get(12));
        //7
        g.getWierzcholki().get(7).dodajSasiada(g.getWierzcholki().get(12));
        //8
        g.getWierzcholki().get(8).dodajSasiada(g.getWierzcholki().get(13));
        g.getWierzcholki().get(8).dodajSasiada(g.getWierzcholki().get(14));
        g.getWierzcholki().get(8).dodajSasiada(g.getWierzcholki().get(18));
        //9
        g.getWierzcholki().get(9).dodajSasiada(g.getWierzcholki().get(15));
        g.getWierzcholki().get(9).dodajSasiada(g.getWierzcholki().get(19));
        //10
        g.getWierzcholki().get(10).dodajSasiada(g.getWierzcholki().get(11));
        g.getWierzcholki().get(10).dodajSasiada(g.getWierzcholki().get(16));
        //11
        g.getWierzcholki().get(11).dodajSasiada(g.getWierzcholki().get(15));
        g.getWierzcholki().get(11).dodajSasiada(g.getWierzcholki().get(16));
        //12
        //13
        //14
        g.getWierzcholki().get(14).dodajSasiada(g.getWierzcholki().get(15));
        g.getWierzcholki().get(14).dodajSasiada(g.getWierzcholki().get(19));
        //15
        g.getWierzcholki().get(15).dodajSasiada(g.getWierzcholki().get(17));
        g.getWierzcholki().get(15).dodajSasiada(g.getWierzcholki().get(19));
        //16
        //17
        //18
        long start = System.nanoTime();
        g.pokolorujSlf();
        long stop = System.nanoTime();
        g.wypiszGraf((stop-start)/1000000);
        System.out.println("G1: " + (stop-start)/1000000 + " ms");
        g.getWierzcholki().get(11).toString();
        //for(Wierzcholek w:g.getWierzcholki()) w.wypiszSasiadow();

        Graf g2 = new Graf();
        GeneratorGrafu generatorGrafuG2 = new GeneratorGrafu(g2);
        generatorGrafuG2.generujWierzcholki(23);
        generatorGrafuG2.generujKrawedzie(12);
        start = System.nanoTime();
        g2.pokolorujSlf();
        stop = System.nanoTime();
        g2.wypiszGraf((stop-start)/1000000);
        System.out.println("G2: " + (stop-start)/1000000 + " ms");
    }

}
