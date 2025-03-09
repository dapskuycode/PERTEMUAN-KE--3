/* Nama File    : JumlahPesananMelebihiStokException.java
 * Deskripsi    : menangani error saat jumlah pesanan yang dibuat melebihi stok yang ada.
 * Pembuat      : M. Daffa' Atstsaqif/24060123120039
 * Tanggal      : 8 Maret 2025
 */

package santapanEnak;

public class JumlahPesananMelebihiStokException extends Exception{
    public JumlahPesananMelebihiStokException(String message){
        super(message);
    }
}
