package P8.Tugas;

public class Main {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        persegi.setSisi(5);
        System.out.println("=== Persegi ===");
        System.out.println("Sisi      : " + persegi.getSisi());
        System.out.println("Luas      : " + persegi.getLuas());
        System.out.println("Keliling  : " + persegi.getKeliling());
        System.out.println();

        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setJari(7);
        System.out.println("=== Lingkaran ===");
        System.out.println("Jari-jari : " + lingkaran.getJari());
        System.out.println("Luas      : " + lingkaran.getLuas());
        System.out.println("Keliling  : " + lingkaran.getKeliling());
        System.out.println();

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.setPanjang(8);
        persegiPanjang.setLebar(4);
        System.out.println("=== Persegi Panjang ===");
        System.out.println("Panjang   : " + persegiPanjang.getPanjang());
        System.out.println("Lebar     : " + persegiPanjang.getLebar());
        System.out.println("Luas      : " + persegiPanjang.getLuas());
        System.out.println("Keliling  : " + persegiPanjang.getKeliling());
        System.out.println();

        Segitiga segitiga = new Segitiga();
        segitiga.setAlas(6);
        segitiga.setTinggi(8);
        System.out.println("=== Segitiga ===");
        System.out.println("Alas      : " + segitiga.getAlas());
        System.out.println("Tinggi    : " + segitiga.getTinggi());
        System.out.println("Luas      : " + segitiga.getLuas());
        System.out.println("Keliling  : " + segitiga.getKeliling());
    }
}