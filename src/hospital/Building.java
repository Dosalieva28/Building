package hospital;

public class Building {
    private int kollichestvoEtajei;
    private int ploshadZdaniya;
    private String adress;
    public Building(){

    }

    public Building(int kollichestvoEtajei, int ploshadZdaniya, String adress) {
        this.kollichestvoEtajei = kollichestvoEtajei;
        this.ploshadZdaniya = ploshadZdaniya;
        this.adress = adress;
    }

    public int getKollichestvoEtajei() {
        return kollichestvoEtajei;
    }

    public void setKollichestvoEtajei(int kollichestvoEtajei) {
        this.kollichestvoEtajei = kollichestvoEtajei;
    }

    public int getPloshadZdaniya() {
        return ploshadZdaniya;
    }

    public void setPloshadZdaniya(int ploshadZdaniya) {
        this.ploshadZdaniya = ploshadZdaniya;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Building{" +
                "kollichestvoEtajei=" + kollichestvoEtajei +
                ", ploshadZdaniya=" + ploshadZdaniya +
                ", adress='" + adress + '\'' +
                '}';
    }
}
