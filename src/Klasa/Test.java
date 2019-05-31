package Klasa;

public class Test {


    public static void main(String[] args) {
        Person personi = new Person("John", "Doe", 20);
        Punonjes punonjes = new Punonjes();

        System.out.println(personi.getEmer());
        System.out.println(personi.getMbiemer());
        System.out.println(personi.getMosha());

        System.out.println(punonjes.getEmer());
        System.out.println(punonjes.getMbiemer());
        System.out.println(punonjes.getMosha());
        System.out.println(punonjes.getKompania());


        punonjes.setEmer("Ardit");
        punonjes.mbiemer = "Sarja";
        punonjes.mosha = -25;
        punonjes.setKompania("ATC");


        System.out.println(punonjes.getEmer());
        System.out.println(punonjes.getMbiemer());
        System.out.println(punonjes.getMosha());
        System.out.println(punonjes.getKompania());

        punonjes.setMosha(-25);

        System.out.println(punonjes.getEmer());
        System.out.println(punonjes.getMbiemer());
        System.out.println(punonjes.getMosha());
        System.out.println(punonjes.getKompania());


    }


}
