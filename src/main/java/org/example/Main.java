package org.example;


import firstProgram.FirstProgram;
import firstProgram.Percabangan;
import firstProgram.Perulangan;

public class Main {
    public static void main(String[] args) {

//        FirstProgram.cobaStaticVoid();
//        System.out.println("");

//        FirstProgram objNonStatic = new FirstProgram();
//        objNonStatic.cobaVoid();
//        System.out.println("");

        int hasilPerkalian = FirstProgram.cobaNonVoid(10, 4);
        System.out.println("Ini adalah method tanpa tipe data void: " + hasilPerkalian);

//        Percabangan panggilText = new Percabangan();
//        panggilText.panggilPercabanganIf();
//        System.out.println("");

//        Percabangan panggilNamahari = new Percabangan();
//        panggilNamahari.panggilPercabanganSwitchCase();

//        Perulangan.cobaPerulanganFor();
//        Perulangan.cobaPerulanganWhile();
//        Perulangan.cobaPerulanganDoWHile();
    }

}