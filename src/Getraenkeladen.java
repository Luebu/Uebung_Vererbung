public class Getraenkeladen extends Geschaeft {

    @Override
    public void menue(int auswahl) {
        switch(auswahl){
            case 0:
                preis = 10;
                break;
            case 1:
                preis = 2;
                break;
            case 2:
                preis = 1;
                break;
            default:
                System.out.println("Flasche");
                break;
        }
    }
}
