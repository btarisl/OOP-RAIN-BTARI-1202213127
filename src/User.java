import java.util.Scanner;

public class User {
    String usernama;
    int nohp;
    public void setnusernama(String usernama){
        this.usernama= usernama;
    }
    public void setnohp(int nohp){
        this.nohp=nohp;
    }
    public void Register(){
        System.out.println("\nRegister Success");
        System.out.println("Name: "+ usernama);
        System.out.println("No. Handphone: "+ nohp);
    }
        
}

    // TODO Create Attribute of User; Name and Phone Number then Create Setter

    // TODO Create Method to Register User and Display User's Name and Phone Number and success message



