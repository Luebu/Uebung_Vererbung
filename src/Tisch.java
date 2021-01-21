public class Tisch {
    int index;
    boolean besetzt=false;
    public Tisch(int pIndex, boolean pBesetzt){
        setIndex(pIndex);
    }

    public void setBesetzt(boolean pBesetzt) {
        besetzt = pBesetzt;
    }

    public void setIndex(int pIndex) {
        index = pIndex;
    }

    public boolean getBesetzt() {
        return besetzt;
    }

    public int getIndex() {
        return index;
    }

}
