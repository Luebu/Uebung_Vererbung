import java.util.*;

public class Renoviert extends Geschaeft {
    private ArrayList<Produkt> auswahlmenue = new ArrayList<Produkt>();
    private ArrayList<Tisch> tische = new ArrayList<Tisch>();
    @Override
    public void auswahlmenue(int pAuswahl1, int pAuswahl2) {
        int preis1=auswahlmenue.get(pAuswahl1).getPreis();
        int preis2=auswahlmenue.get(pAuswahl2).getPreis();
        preis = preis1 + preis2;
    }
    public void sitzen(int platznummer){
        if(tische.get(platznummer).getBesetzt()){
            System.out.println("Ist besetzt");
        }else{
            tische.get(platznummer).setBesetzt(true);
        }
    }
}
