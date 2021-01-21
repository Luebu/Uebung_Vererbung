public class Produkt {
    String name;
    int preis;
    public Produkt(String pName, int pPreis){
        setName(pName);
        setPreis(pPreis);
    }

    public void setName(String pName) {
        name = pName;
    }

    public void setPreis(int pPreis) {
        preis = pPreis;
    }

    public String getName() {
        return name;
    }

    public int getPreis() {
        return preis;
    }
}
