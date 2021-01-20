public class Geschaeft {
    int preis;
    String menue1="Vanille und Banane";
    String menue2 = "Schoko und Erdbeere";
    String menue3 = "Schoko und Vanille";

    String s = "Schokolade";
    String v = "Vanille";
    String e = "Erdbeeren";
    String ba= "Banane";

    public int Kasse(int geldgegeben){
        int wechelsgeld;
        wechelsgeld=geldgegeben-preis;
        return wechelsgeld;
    }
    public void menue(int auswahl){
        switch(auswahl){
            case 0:
                preis = 5;
                break;
            case 1:
                preis = 5;
                break;
            case 2:
                preis = 5;
                break;
            default:
                System.out.println("Flasche");
                break;
        }
    }
    public void selbstmischung(int auswahl1, int auswahl2){
        int preis1=0;
        switch(auswahl1){
            case 0:
                preis1 = 2;
                break;
            case 1:
                preis1 = 2;
                break;
            case 2:
                preis1 = 3;
                break;
            case 3:
                preis1 = 3;
                break;
            default:
                System.out.println("Kannst du kein Menü lesen oder was!!");

                break;
        }
        int preis2=0;
        switch(auswahl2){
            case 0:
                preis2 = 2;
                break;
            case 1:
                preis2 = 2;
                break;
            case 2:
                preis2 = 3;
                break;
            case 3:
                preis2 = 3;
                break;
            default:
                System.out.println("Kannst du kein Menü lesen oder was!!");

                break;
        }
        preis=preis1+preis2;
    }
}
