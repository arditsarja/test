public class TestKlasa {

    public static void main(String[] args) {
        Person[] person = new Person[3];
        Person person0 = new Person();
        Person person1 = new Person();
        Person person2 = new Person();

        person0.emer = "Albert";
        person0.mbiemer = "Vorfaj";
        person1.emer = "Hivjon";
        person1.mbiemer = "Kukaj";
        person2.emer = "Jonida";
        person2.mbiemer = "Gjoni";

        person[0] = person0;
        person[1] = person1;
        person[2] = person2;

        System.out.println(person[0].emer);
        System.out.println(person[0].mbiemer);
        System.out.println(person[1].emer);
        System.out.println(person[1].mbiemer);
        System.out.println(person[2].emer);
        System.out.println(person[2].mbiemer);

        Person tem = person[2];
        person[2] = person[1];
        person[1] = person[0];
        person[0] = tem;

        System.out.println(person[0].emer);
        System.out.println(person[0].mbiemer);
        System.out.println(person[1].emer);
        System.out.println(person[1].mbiemer);
        System.out.println(person[2].emer);
        System.out.println(person[2].mbiemer);

    }


}
