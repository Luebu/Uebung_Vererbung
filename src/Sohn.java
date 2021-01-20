public class Sohn extends Geschaeft {
    boolean tisch1 = false;
    boolean tisch2 = false;
    boolean tisch3 = false;
    boolean tisch4 = false;
    boolean tisch5 = false;
    boolean tisch6 = false;
    String k = "Kirschen";
    String b = "Blaubeeren";
    String n = "Nüsse";

    @Override
    public void selbstmischung(int auswahl1, int auswahl2) {
        int preis1=0;
        switch(auswahl1){
            case 0:
                preis1 = 1;
                break;
            case 1:
                preis1 = 2;
                break;
            case 2:
                preis1 = 2;
                break;
            case 3:
                preis1 = 3;
                break;
            //Blaubeeren
            case 4:
                preis1 = 3;
                break;
            case 5:
                preis1 = 3;
                break;
            case 6:
                preis1 = 3;
                break;
            default:
                System.out.println("Flasche");
                break;
        }
        int preis2=0;
        switch(auswahl2){
            case 0:
                preis2 = 1;
                break;
            case 1:
                preis2 = 2;
                break;
            case 2:
                preis2 = 2;
                break;
            case 3:
                preis2 = 3;
                break;
            case 4:
                preis2 = 3;
                break;
            case 5:
                preis2 = 3;
                break;
            case 6:
                preis2 = 3;
                break;
            default:
                System.out.println("Flasche");
                break;
        }
        preis = preis1 + preis2;
    }
}
