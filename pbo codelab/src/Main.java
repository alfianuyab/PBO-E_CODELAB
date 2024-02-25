import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama : ");
        String nama = scanner.nextLine().trim();

        System.out.print("Masukkan Jenis Kelamin (P / L): ");
        char jenisKelamin = scanner.next().charAt(0);

        System.out.println("\nMasukkan Tanggal Lahir (Tahun Bulan Hari)");
        System.out.print("Tahun : ");
        int tahun = scanner.nextInt();
        System.out.print("Bulan : ");
        int bulan = scanner.nextInt();
        System.out.print("Hari   : ");
        int hari = scanner.nextInt();

        String jenisKelaminStr = "";
        if (jenisKelamin == 'P') {
            jenisKelaminStr = "Perempuan";
        } else if (jenisKelamin == 'L') {
            jenisKelaminStr = "Laki-laki";
        } else {
            System.out.println("Jenis Kelamin tidak valid!");
            System.exit(0);
        }

        LocalDate tanggalLahir = LocalDate.of(tahun, bulan, hari);
        LocalDate sekarang = LocalDate.now();
        int umur = Period.between(tanggalLahir, sekarang).getYears();

        System.out.println("\nData Diri:");
        System.out.println("Nama          : " + nama);
        System.out.println("Jenis Kelamin : " + jenisKelaminStr);
        System.out.println("Tanggal Lahir : " + tanggalLahir);
        System.out.println("Umur          : " + umur + " tahun");
    }
}