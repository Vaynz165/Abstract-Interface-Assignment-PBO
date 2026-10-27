public abstract class Kendaraan {
    protected String merk;

    public Kendaraan(String merk) {
        this.merk = merk;
    }

    // Method abstract: wajib diimplementasikan oleh setiap subclass
    public abstract void bergerak();

    // Method konkrit: dapat langsung digunakan oleh semua subclass
    public void klakson() {
        System.out.println(merk + " membunyikan klakson: Tin... Tin!");
    }

    public String getMerk() {
        return merk;
    }
}
