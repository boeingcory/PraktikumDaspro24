import java.util.Scanner;

public class StudiKasus2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nama mahasiswa  : ");
        String nama = sc.nextLine();

        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        String jenisKegiatan = sc.nextLine().toUpperCase();

        System.out.print("Jumlah dokumen : ");
        int jumlahDokumen = sc.nextInt();

        System.out.print("Peringkat juara : ");
        int peringkatJuara = sc.nextInt();

        if (jumlahDokumen < 4) {
            int kurangDokumen = 4 - jumlahDokumen;
            System.out.println("Status : Dokumen tidak lengkap (kurang " + kurangDokumen + " dokumen). Dana penghargaan tidak diberikan.");
        } else {
            if (jenisKegiatan.equals("BELMAWA") || jenisKegiatan.equals("BAKORMA") || jenisKegiatan.equals("MANDIRI")) {
                if (peringkatJuara >= 1 && peringkatJuara <= 3) {
                    System.out.println("Status : Selamat, " + nama + " mendapatkan dana penghargaan juara " + peringkatJuara + "!");
                } else {
                    System.out.println("Status : Tidak lolos pendanaan.");
                }
                        }
        }

    }
}