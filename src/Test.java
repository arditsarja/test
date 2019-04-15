public class Test {


    public static void main(String[] args) {
        String[] emer = new String[3];
        String[] mbiemer = new String[3];

//        menyra 1
        emer[0] = "Albert";

//        meyra 2
        String emerPersoni = "Hivjon";
        emer[1] = emerPersoni;


        emer[2] = "Jonida";
        mbiemer[0] = "Vorfaj";
        mbiemer[1] = "Kukaj";
        mbiemer[2] = "Gjoni";

        System.out.println(emer[0]);
        System.out.println(mbiemer[0]);
        System.out.println(emer[1]);
        System.out.println(mbiemer[1]);
        System.out.println(emer[2]);
        System.out.println(mbiemer[2]);


        String tem = emer[2];
        emer[2] = emer[1];
        emer[1] = emer[0];
        emer[0] = tem;

        tem = mbiemer[2];
        mbiemer[2] = mbiemer[1];
        mbiemer[1] = mbiemer[0];
        mbiemer[0] = tem;


        System.out.println(emer[0]);
        System.out.println(mbiemer[0]);
        System.out.println(emer[1]);
        System.out.println(mbiemer[1]);
        System.out.println(emer[2]);
        System.out.println(mbiemer[2]);

    }


}
