public class Laptop extends Perangkat{

    public boolean webcam;


    public Laptop(String drive, int ram, float processor, boolean webcam){
        super(drive, ram, processor);
        this.webcam = webcam;
    }

    public void informasi(){
        if (this.webcam == true) {
            System.out.println("Perangkat ini tidak diketahui memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " GB dan processor secepat " + processor + "0 Ghz. Selain itu laptop ini juga memiliki Webcam");

        }else{
            System.out.println("Perangkat ini tidak diketahui memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " GB dan processor secepat " + processor + "0 Ghz. Selain itu laptop ini juga TIDAK memiliki Webcam");
        }
    }

    public void bukaGame(String nama_game){
        System.out.println("Laptop berhasil membuka game " + nama_game);
    }

    public void kirimEmail(String email){
        System.out.println("Laptop berhasil mengirim Email ke " + email);
    }

    public void kirimEmail(String email1, String email2){
        System.out.println("Laptop berhasil mengirim Email ke " + email1 + " dan " + email2);
    }






}

