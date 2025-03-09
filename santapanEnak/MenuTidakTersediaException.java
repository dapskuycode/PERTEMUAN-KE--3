/* Nama File    : MenuTidakTersedia.Exception.java
 * Deskripsi    : menangani error saat menu yang dipesan tidak tersedia.
 * Pembuat      : M. Daffa' Atstsaqif/24060123120039
 * Tanggal      : 8 Maret 2025
 */


package santapanEnak;

public class MenuTidakTersediaException extends Exception{
    public MenuTidakTersediaException(String message) {
        super(message);
    }
}
