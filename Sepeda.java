public class Sepeda extends Kendaraan {
    public Sepeda(String merk) {
        super(merk);
    }

    @Override
    public void bergerak() {
        System.out.println(merk + " melaju dengan dikayuh oleh pengendara.");
    }

    @Override
    public void klakson() {
        System.out.println(merk + " membunyikan bel: Kring... Kring!");
    }
}
