public class MobilBensin extends Kendaraan {
    public MobilBensin(String merk) {
        super(merk);
    }

    @Override
    public void bergerak() {
        System.out.println(merk + " melaju dengan membakar bahan bakar bensin.");
    }
}
