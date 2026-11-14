package P8.Tugas;

public class Lingkaran extends BangunDatar {
    private float jari;
    private final float phi = 3.14f;

    private float luas() {
        return this.phi * this.jari * this.jari;
    }

    private float keliling() {
        return 2 * this.phi * this.jari;
    }

    public void setJari(float jari) {
        this.jari = jari;
    }

    public float getJari() {
        return this.jari;
    }

    public float getLuas() {
        return luas();
    }

    public float getKeliling() {
        return keliling();
    }
}