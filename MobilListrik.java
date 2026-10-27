public class MobilListrik extends Kendaraan implements IsiDaya {
    public MobilListrik(String merk) {
        super(merk);
    }

    @Override
    public void bergerak() {
        System.out.println(merk + " melaju senyap bertenaga motor listrik.");
    }

    @Override
    public void isiDaya() {
        System.out.println(merk + " sedang mengisi daya di SPKLU fast-charging.");
    }
}
