import java.util.Scanner;
import java.io.Console;
public class Tester {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        Console c = System.console();
        int jumlah = 0;
        int jawab;
        do {
            System.out.println("=========================================");
            System.out.println("| Apakah Anda Prodi Teknik  Informatika?|");
            System.out.println("| Ketik 1 Untuk YA                      |");
            System.out.println("| Ketik 2 Untuk TIDAK                   |");
            System.out.println("| Ketik 3 Untuk KELUAR                  |");
            System.out.println("=========================================");
            System.out.print("Masukan Jawaban Anda: ");
            jawab = inputUser.nextInt();
            switch (jawab) {
                case 1:
                    System.out.println("Ada Berapa Teman Anda?");
                    System.out.print("Masukan Jawaban Anda : ");
                    jumlah = inputUser.nextInt();
                    for (int i = 0; i < jumlah; i++) {
                        System.out.print("Nama Teman ke-" + (i + 1) + ": ");
                        String nama = c.readLine();
                        System.out.print("NIM Teman ke-" + (i + 1) + ": ");
                        int nim = inputUser.nextInt();
                        System.out.print("Usia Teman ke-" + (i + 1) + ": ");
                        int umur = inputUser.nextInt();
                        Mahasiswa mhs = new Mahasiswa(nama, nim, umur);
                        mhs.cetak();
                        System.out.println("\n\n");

                    }

                    break;

                case 2:
                    for (int i = 0; i < 1; i++) {
                        System.out.print("Nama Teman: ");
                        String nama2 = c.readLine();
                        System.out.print("NIM Teman : ");
                        int nim2 = inputUser.nextInt();
                        System.out.print("Usia Teman : ");
                        int umur2 = inputUser.nextInt();
                        Mahasiswa mhs = new Mahasiswa(nama2, nim2, umur2);
                        mhs.cetak();
                        System.out.println("\n\n");
                    }
                    break;

                case 3:
                    Mahasiswa mhs = new Mahasiswa(null, jawab, 0);
                    mhs.penutup();
                    break;

                default:
                    System.out.println("masukan anda tidak tersedia");
                    System.out.println("\n");
            }
        } while (jawab != 3); 
    }
}
