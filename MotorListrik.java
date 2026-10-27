public class MotorListrik extends Kendaraan implements IsiDaya {
    public MotorListrik(String merk) {
        super(merk);
    }

    @Override
    public void bergerak() {
        System.out.println(merk + " meliuk gesit di jalanan tanpa suara knalpot.");
    }

    @Override
    public void isiDaya() {
        System.out.println(merk + " sedang menukar / mengisi ulang baterai listrik.");
    }
}
