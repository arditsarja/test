package metoda;

public class TestFunksioneKthenDicka {


    public static String thuajPershdendetje(String emer) {
        return "Pershendetje " + emer;
    }

    public static String thuajPershdendetje() {
        return "Pershendetje te gjithe";
    }

    public static String thuajMirupafshim(String emer) {
        return "Mirupafshim " + emer;
    }


    public static double gjejShumen(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(thuajPershdendetje("Beni"));
        System.out.println(thuajPershdendetje());
        System.out.println(thuajMirupafshim("Arta"));
        System.out.println(gjejShumen(5.3, 9));
    }


}
