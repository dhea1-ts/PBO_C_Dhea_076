// Kelas RekeningBank
class RekeningBank {
    String nomorRekening;
    String namaPemilik;
    double saldo;

    // Constructor
    RekeningBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    // Method untuk menampilkan informasi rekening
    void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp" + saldo);
        System.out.println();
    }

    // Method untuk setor uang
    void setorUang(double jumlah) {
        saldo += jumlah;
        System.out.println(namaPemilik + " menyetor Rp" + jumlah + ". Saldo sekarang: Rp" + saldo + "\n");
    }

    // Method untuk tarik uang
    void tarikUang(double jumlah) {
        if (saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Berhasil) Saldo sekarang: Rp" + saldo);
        } else {
            System.out.println(namaPemilik + " menarik Rp" + jumlah + ". (Gagal, Saldo tidak mencukupi) Saldo saat ini: Rp" + saldo);
        }
    }
}

// Kelas Main untuk menjalankan program
public class codelab2 {
    public static void main(String[] args) {
        // Membuat objek RekeningBank
        RekeningBank rekening1 = new RekeningBank("076", "twwya;", 500000000);
        RekeningBank rekening2 = new RekeningBank("135", "anomali", 100000000);

        // Menampilkan informasi rekening awal
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();

        // Simulasi transaksi
        rekening1.setorUang(3500000);
        rekening2.setorUang(2000000);

        rekening1.tarikUang(25000000);
        rekening2.tarikUang(750000);

        // Menampilkan informasi rekening setelah transaksi
        System.out.println();
        rekening1.tampilkanInfo();
        rekening2.tampilkanInfo();
    }
}