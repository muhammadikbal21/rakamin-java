package firstProgram;

import java.util.Scanner;

public class Percabangan {

    public void panggilPercabanganIf() {
        Scanner scanner = new Scanner(System.in);
        String validText = "Ikbal";
        System.out.println("Siapa Anda?: ");

        String text = scanner.nextLine();

        if (text.equals(validText)) {
            System.out.println("Welcome, " + text);
        } else {
            System.out.println("Sorry bro!");
        }

    }

    public void panggilPercabanganSwitchCase() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Hari menurut angka (1 - 7) : ");
        int intHari = scanner.nextInt();
        String stringHari = "Hari ";

        switch (intHari) {
            case 1:
                System.out.println(stringHari + "Senin");
                break;
            case 2:
                System.out.println(stringHari + "Selasa");
                break;
            case 3:
                System.out.println(stringHari + "Rabu");
                break;
            case 4:
                System.out.println(stringHari + "Kamis");
                break;
            case 5:
                System.out.println(stringHari + "Jumat");
                break;
            case 6:
                System.out.println(stringHari + "Sabtu");
                break;
            case 7:
                System.out.println(stringHari + "Minggu");
                break;
            default:
                System.out.println(stringHari + "Potter");
        }
    }




}
