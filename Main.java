public class Main {
    public static void main(String[] args) {
        // Membuat objek dari subclass
        Sepeda sepeda = new Sepeda("Polygon");
        MobilBensin avanza = new MobilBensin("Toyota Avanza");
        MobilListrik tesla = new MobilListrik("Tesla Model 3");
        MotorListrik gesits = new MotorListrik("Gesits G1");

        // Polimorfisme: Array bertipe abstract class Kendaraan
        Kendaraan[] armada = { sepeda, avanza, tesla, gesits };

        System.out.println("=== PENGUJIAN ABSTRACT CLASS KENDARAAN ===");
        for (Kendaraan k : armada) {
            System.out.println("\n[Kendaraan: " + k.getMerk() + "]");
            k.bergerak(); // Method abstract yang dioverride oleh masing-masing kelas
            k.klakson();  // Method konkrit dari abstract class Kendaraan
        }

        System.out.println("\n=== PENGUJIAN INTERFACE ISIDAYA (KENDARAAN LISTRIK) ===");
        // Hanya objek yang mengimplementasikan interface IsiDaya
        IsiDaya[] kendaraanRamahLingkungan = { tesla, gesits };
        for (IsiDaya el : kendaraanRamahLingkungan) {
            el.isiDaya();
        }
    }
}
