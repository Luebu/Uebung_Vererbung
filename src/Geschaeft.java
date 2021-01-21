import java.util.*;
public class Geschaeft {
    int preis;
    private ArrayList<Produkt> menue = new ArrayList<Produkt>();
    private ArrayList<Produkt> auswahlmenue = new ArrayList<Produkt>();
    public int Kasse(int geldgegeben){
        int wechelsgeld;
        wechelsgeld=geldgegeben-preis;
        return wechelsgeld;
    }
    public void menue(int pAuswahl){
        preis=menue.get(pAuswahl).getPreis();
    }
    public void auswahlmenue(int pAuswahl1, int pAuswahl2){
        int preis1=auswahlmenue.get(pAuswahl1).getPreis();

        int preis2=auswahlmenue.get(pAuswahl2).getPreis();

        preis=preis1+preis2;
    }
}
