package MODUL1;

import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        // TODO Create Database
        Database db=new Database();
        menu menu1=new menu();
        menu1.setname("Soto Ayam");
        menu1.setkategory('Makanan');
        menu1.setharga('Rp. 15000');

        menu menu2 = new Database();
        menu2.setname("Es Lemon Tea");
        menu2.setkategory('Minuman');
        menu2.setharga('Rp. 5000');

        menu menu3 = new Database();
        menu3.setname("Roti Bakar");
        menu3.setkategory('Dessert');
        menu3.setharga('Rp. 5000');
        // TODO Create Menu
    }
        // TODO Insert Menu to Database


        // TODO Display Main Menu

        // TODO Create User

        // Display Menu
