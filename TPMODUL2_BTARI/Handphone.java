public class Handphone extends Perangkat{

    public boolean fingerprint;
    
    public Handphone(String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint;
    }

    public void informasi(){
        if (this.fingerprint == true){
            System.out.println("Handphone ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " GB dan processor secepat " + processor + "0 Ghz. Selain itu handphone ini memiliki fingerprint");

        }else{
            System.out.println("Handphone ini memiliki drive tipe " + drive + " dengan ram sebesar " + ram + " GB dan processor secepat " + processor + "0 Ghz. Selain itu handphone ini TIDAK memiliki fingerprint");
        }
    }

    public void telfon(int no_hp){
        System.out.println("Handphone berhasil menyambungkn telfon ke No " + no_hp);
    }

    public void kirimSMS(int no_hp){
        System.out.println("Handphone berhasil mengirim SMS ke No " + no_hp);
    }

    public void kirimSMS(int no_hp1, int no_hp2){
        System.out.println("Handphone berhasil mengirim SMS ke No " + no_hp1 + " dan "+ no_hp2);
    }
}
