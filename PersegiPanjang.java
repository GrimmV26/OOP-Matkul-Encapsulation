package P8.Tugas;

public class PersegiPanjang extends BangunDatar {
    private float panjang;
    private float lebar;

    private float luas() {
        return this.panjang * this.lebar;
    }

    private float keliling() {
        return 2 * (this.panjang + this.lebar);
    }

    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    public float getPanjang() {
        return this.panjang;
    }

    public float getLebar() {
        return this.lebar;
    }

    public float getLuas() {
        return luas();
    }

    public float getKeliling() {
        return keliling();
    }
}