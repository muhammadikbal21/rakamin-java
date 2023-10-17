package firstProgram;

import java.util.Scanner;

public class Perulangan {
    public static void cobaPerulanganFor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mau di looping berapa kali? : ");
        int nilai = scanner.nextInt();

        for (int i = 1; i <= nilai; i++) {
            System.out.println("ini loopingan yang ke-" + i);
        }
    }

    public static void cobaPerulanganWhile() {
        int nilai = 1;

        while (nilai <= 5) {
            System.out.println("ini while yang ke-" + nilai);
            nilai++;
        }
    }

    public static void cobaPerulanganDoWHile() {
        int nilai = 1;

        do {
            System.out.println("ini do while yang ke-" + nilai);
            nilai++;
        }
        while (nilai <= 5);
    }
}
