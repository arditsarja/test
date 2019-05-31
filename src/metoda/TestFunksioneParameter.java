package metoda;

public class TestFunksioneParameter {


    public static void thuajPershdendetje(String emer) {
        System.out.println("Pershendetje " + emer);
    }

    public static void thuajMirupafshim(String emer) {
        System.out.println("Mirupafshim" + emer);
    }

    public static void gjejShumen(double a, double b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        thuajPershdendetje("Beni");
        thuajMirupafshim("Arta");
        gjejShumen(9.2, 6);
    }


}
