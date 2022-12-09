package MODUL2_BTARI;

public class MainApp {
    public static void main(String[] args) {
        TransportasiAir watertransport = new TransportasiAir(4, 20000);
        watertransport.informasi();
        watertransport.berlayar();
        watertransport.berlabuh();
        System.out.println("");

        Sampan munculinSampan = new Sampan(20, 50000, 2);
        munculinSampan.informasi();
        munculinSampan.berlayar();
        munculinSampan.berlabuh();
        munculinSampan.berlabuh(2);
        System.out.println("");

        Kapal tampiKapal = new Kapal(50, 100000, "Diesel");
        tampiKapal.informasi();
        tampiKapal.berlayar();
        tampiKapal.berlayar(20);
        tampiKapal.berlabuh();
    }
}
