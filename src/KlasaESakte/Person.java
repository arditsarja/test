package KlasaESakte;

public class Person {
    private String emer, mbiemer;
    private int mosha;

    public Person() {
        this.emer = "i pacaktuar";
        this.mbiemer = "i pacaktuar";
        this.mosha = 0;
    }

    public Person(String emer, String mbiemer, int mosha) {
        setEmer(emer);
        setMbiemer(mbiemer);
        setMosha(mosha);
    }

    public String getEmer() {
        return emer;
    }

    public void setEmer(String emer) {
        this.emer = emer;
    }

    public String getMbiemer() {
        return mbiemer;
    }

    public void setMbiemer(String mbiemer) {

        if (mbiemer == null || mbiemer.equals("")) {
            this.mbiemer = "i pacaktuar";
        } else {

            this.mbiemer = mbiemer;
        }
    }

    public int getMosha() {
        return mosha;
    }

    public void setMosha(int mosha) {
        if (mosha < 0) {
            mosha = mosha * (-1);
        }
        this.mosha = mosha;
    }
}
