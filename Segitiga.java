package P8.Tugas;

public class Segitiga extends BangunDatar {
    private float alas;
    private float tinggi;

    private float luas() {
        return (this.alas * this.tinggi) / 2;
    }

    private float keliling() {
        float sisiMiring = (float) Math.sqrt((this.alas * this.alas) + (this.tinggi * this.tinggi));
        return this.alas + this.tinggi + sisiMiring;
    }

    public void setAlas(float alas) {
        this.alas = alas;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public float getAlas() {
        return this.alas;
    }

    public float getTinggi() {
        return this.tinggi;
    }

    public float getLuas() {
        return luas();
    }

    public float getKeliling() {
        return keliling();
    }
}