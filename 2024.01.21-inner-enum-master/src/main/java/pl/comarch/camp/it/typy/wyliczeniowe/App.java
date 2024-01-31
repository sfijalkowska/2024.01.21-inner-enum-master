package pl.comarch.camp.it.typy.wyliczeniowe;

public class App {
    public static void main(String[] args) {
        Client client = new Client();
        client.setId(5);
        client.setName("Janusz");
        client.setSurname("Kowalski");
        client.setSex(Client.Sex.MEN);

        Client client2 = new Client();
        client2.setId(10);
        client2.setName("Jadzia");
        client2.setSurname("Malinowska");
        client2.setSex(Client.Sex.WOMAN);

        Client.Sex sex = Client.Sex.MEN;
        Client.Sex sex2 = Client.Sex.WOMAN;
        Client.Sex sex3 = Client.Sex.OTHER;

        Console ps5 = Console.XBOX;

        System.out.println(ps5.getBrand());
        System.out.println(ps5.getModel());
        System.out.println(ps5.getProcessor());
        System.out.println(ps5.getGpu());

        //Console console = new Console("Asdf", "Asdf", "asdf", "asdfa");

        //Console2 console2 = Console2.PS5;

        Console console1 = Console.PS5;
        System.out.println(console1);
        //console1.setModel("Jakis");

        //
        //
        //
        //

        Console console2 = Console.PS5;
        System.out.println(console2);


        Console console3 = Console.PS5;
        System.out.println(console3);

        if(console3 == Console.PS4) {
            System.out.println("To jest PS5 !!");
        }


        Client2.Sex2 sex4 = Client2.Sex2.MEN;

        Client.Sex sex1 = Client.Sex.MEN;
    }
}
