import java.util.Scanner;
/**
 * Siakad13
 */
public class Siakad13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String nama, nim;
        String kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiAkhir, nilaiUjian;

       

        System.out.println("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.println("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.println("Masukkan kelas: ");
        kelas = sc.nextLine();
        System.out.println("Masukkan nomor absen");
        absen = sc.nextByte();

        System.out.println("Masukkan nilai kuis: ");
        nilaiKuis = sc.nextDouble ();
        System.out.println("Masukkan nilai tugas:");
        nilaiTugas = sc.nextDouble();
        System.out.println("Masukkan nilai Ujian:");
        nilaiUjian = sc.nextDouble();
     

        nilaiAkhir = (nilaiKuis * 20/100 + nilaiTugas * 15/100 + nilaiUjian * 65/100);

        if (nilaiAkhir>= 80 && nilaiAkhir<= 100) {
            System.out.println('A' );
            System.out.println("Sangat Baik" );
        }
        if (nilaiAkhir>= 73 && nilaiAkhir<= 80) {
            System.out.println("B+" );
            System.out.println("Lebih dari Baik" );
        }
        if (nilaiAkhir>= 65 && nilaiAkhir<= 73) {
            System.out.println("B" );
            System.out.println("Baik" );
        }
        if (nilaiAkhir>= 60 && nilaiAkhir<= 65) {
            System.out.println("C+" );
            System.out.println("Lebih dari Cukup" );
        }
        if (nilaiAkhir>= 50 && nilaiAkhir<= 60) {
            System.out.println("C" );
            System.out.println("Cukup" );
        }
        if (nilaiAkhir>= 39 && nilaiAkhir<= 50) {
            System.out.println("D" );
            System.out.println("Kurang" );
        }
        if (nilaiAkhir<= 39) {
            System.out.println("E" );
            System.out.println("Gagal" );
        }

        System. out.println("Nama: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);


    }
}