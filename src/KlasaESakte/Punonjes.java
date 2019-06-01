package KlasaESakte;

public class Punonjes  extends Person {
    String kompania;

    public Punonjes(String emer, String mbiemer, int mosha, String kompania) {
        super(emer, mbiemer, mosha);
        setKompania(kompania);
    }
    public Punonjes() {
        super();
        this.kompania = "e pacaktuar";
    }

    public String getKompania() {
        return kompania;
    }

    public void setKompania(String kompania) {
        this.kompania = kompania;
    }
}
