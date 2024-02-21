import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class  Codlab196{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data diri
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan jenis kelamin (P/L): ");
        String jenisKelaminInput = input.nextLine();
        char jenisKelamin = jenisKelaminInput.toUpperCase().charAt(0);
        System.out.print("Masukkan tanggal lahir (yyyy-mm-dd): ");
        String tanggalLahirInput = input.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirInput);

        // Hitung umur
        LocalDate sekarang = LocalDate.now();
        Period period = Period.between(tanggalLahir, sekarang);
        int umur = period.getYears();

        // Tampilkan data diri
        System.out.println("\nData Diri:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin == 'L' ? "Laki-laki" : "Perempuan"));
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Umur: " + umur + " tahun");

        input.close();
    }
}