package P8.Tugas;

public class Persegi extends BangunDatar {
    private float sisi;

    private float luas() {
        return this.sisi * this.sisi;
    }

    private float keliling() {
        return 4 * this.sisi;
    }

    public void setSisi(float sisi) {
        this.sisi = sisi;
    }

    public float getSisi() {
        return this.sisi;
    }

    public float getLuas() {
        return luas();
    }

    public float getKeliling() {
        return keliling();
    }
}