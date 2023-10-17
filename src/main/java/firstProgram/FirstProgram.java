package firstProgram;

public class FirstProgram {

    // static dapat dipanggil tanpa membuat object baru
    public static void cobaStaticVoid() {
        System.out.println("Ini Method Public static void");
    }

    // non-static harus membuat object baru jika method nya ingin dipanggil
    public void cobaVoid() {
        System.out.println("Ini Method Public void atau non static");
    }

    // void adalah bentukan tipe data yang tidak dapat me-return nilai
    // tanpa void, kita dapat mengganti dengan tipe data lain, contohnya int.
    // disini kita dapat me-return nilainya
    public static int cobaNonVoid(int a, int b) {
        return a * b;
    }
}
