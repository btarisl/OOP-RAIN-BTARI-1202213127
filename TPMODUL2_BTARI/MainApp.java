public class MainApp{

    public static void main(String[] args) {
        Perangkat munculperangkat = new Perangkat("Adata", 2, 1.80f);
        munculperangkat.informasi();

        System.out.println(" ");

        Laptop munculaptop = new Laptop("Seagate", 8, 2.40f, true );
        munculaptop.informasi();
        munculaptop.bukaGame("Dota 2");
        munculaptop.kirimEmail("niceyuk@gmail.com");
        munculaptop.kirimEmail("aanarji@gmail.com", "rusmango@gmail.com");

        System.out.println(" ");

        Handphone munculhp = new Handphone("Sandisk", 3, 2.20f, false);
        munculhp.informasi();
        munculhp.telfon(623456789);
        munculhp.kirimSMS(620987654);
        munculhp.kirimSMS(625678901, 629012345);
       
        






    }
}