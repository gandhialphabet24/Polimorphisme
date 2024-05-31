package POLIMORPHISME;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        
        phone redmiNote8= new Xiaomi();

        phoneUser saya = new phoneUser(redmiNote8);

        saya.turnOnThePhone();

        Scanner input = new Scanner(System.in);
        String aksi;

    while (true) {
        System.out.println("=== APLIKASI INTERFACE ===");
        System.out.println("[1] Nyalakan HP");
        System.out.println("[2] Matikan HP");
        System.out.println("[3] Perbesar Volume");
        System.out.println("[4] Kecilkan Volume");
        System.out.println("[0] Keluar");
        System.out.println("--------------------------");
        System.out.print("Pilih aksi> ");
        aksi = input.nextLine();
        
        if(aksi.equalsIgnoreCase("1")){
            saya.turnOnThePhone();
        } else if (aksi.equalsIgnoreCase("2")){
            saya.turnOffThePhone();
        } else if (aksi.equalsIgnoreCase("3")){
            saya.makePhoneLouder();
        } else if (aksi.equalsIgnoreCase("4")){
            saya.makePhoneSilent();
        } else if (aksi.equalsIgnoreCase("0")){
            System.exit(0);
        } else {
            System.out.println("Kamu memilih aksi yang salah!");
            }
        }
    }
}