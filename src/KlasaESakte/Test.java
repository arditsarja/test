package KlasaESakte;

public class Test {


    public static void main(String[] args) {
        Person personi = new Person("John", "Doe", 20);


        System.out.println(personi.getEmer());
        System.out.println(personi.getMbiemer());
        System.out.println(personi.getMosha());

        Punonjes punonjes = new Punonjes();

        System.out.println(punonjes.getEmer());
        System.out.println(punonjes.getMbiemer());
        System.out.println(punonjes.getMosha());
        System.out.println(punonjes.getKompania());


        punonjes.setEmer("Ardit");
        punonjes.setMbiemer("");
        punonjes.setKompania("ATC");
        punonjes.setMosha(-25);


        System.out.println(punonjes.getEmer());
        System.out.println(punonjes.getMbiemer());
        System.out.println(punonjes.getMosha());
        System.out.println(punonjes.getKompania());


    }


}
