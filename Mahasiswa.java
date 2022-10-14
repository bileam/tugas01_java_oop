public class Mahasiswa {
    public String namaLengkap;
    public int nim;
    public int usia;

    Mahasiswa(){

    }

    Mahasiswa(String a, int b, int c) {
        namaLengkap = a;
        nim = b;
        usia = c;

    }

    public String nama() {
        return namaLengkap;
    }

    public int Nim() {
        return nim;
    }

    public int umur() {
        return usia;
    }

    public void cetak() {
        // for(int i=0;i<jumlah;i++){
        System.out.println("\n\nData Berhasil Di Tambahkan");
        System.out.println("============================================");
        System.out.println("Nama yang anda masukan adalah: " + namaLengkap);
        System.out.println("Nim yang anda masukan adalah: " + nim);
        System.out.println("usia yang anda masukkan adalah: " + usia);

         //}
    }

    public void penutup() {
        System.out.println("Terima Kasih");
    }
}
