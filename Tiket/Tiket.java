/* Nama File    : Tiket.java
 * Deskripsi    : berisi method dari class tiket.
 * Pembuat      : M. Daffa' Atstsaqif/24060123120039
 * Tanggal      : 8 Maret 2025
 */

package Tiket;

public class Tiket {
    public static void pesanJumlahTiket(int jumlahTiket) {
        // Asumsi jumlah tiket yang tersedia (boleh diganti)
        int tiketTersedia = 100;

        // To DO : Assertion untuk memastikan jumlah pemesanan lebih dari 0
        assert jumlahTiket > 0 : "Jumlah tiket harus lebih dari 0";

        // To Do : Assertion untuk memastikan jumlah pemesanan tidak melebihi tiket yang tersedia
        assert jumlahTiket <= tiketTersedia : "Jumlah tiket melebihi stok yang tersedia";
        
        System.out.println("Pemesanan tiket sebanyak " + jumlahTiket + " berhasil.");
    }
        
    public static void isEWallet(int EWallet) {

        // To Do : Memeriksa apakah index e-wallet yang dipilih valid
        boolean isValid = EWallet >= 1 && EWallet <= 4;

        // To Do : Assertion untuk memastikan e-wallet yang dipilih valid
        assert isValid : "Pilihan e-wallet tidak valid";

        System.out.println("Pemesanan tiket selesai menggunakan e-wallet " + getEWallet(EWallet));
    }
        
    private static String getEWallet(int index) {
        switch (index) {
            case 1:
            return "OVO";
            case 2:
            return "GoPay";
            case 3:
            return "DANA";
            case 4:
            return "LinkAja";
            default:
            return "";
        }
    }
}
