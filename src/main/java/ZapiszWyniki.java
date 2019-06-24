import java.io.*;

public class ZapiszWyniki {

    public void zapiszWyniki(int ileWierzcholkow, long ileMs) {
        File raport = new File("raport/raport.txt");
        try {
            BufferedWriter pw = new BufferedWriter(new FileWriter(raport, true));
            pw.append("\r\n"+ileWierzcholkow+";"+ileMs+"ms"+";SLF");
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Nie znlazlo pliku raport.txt");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
