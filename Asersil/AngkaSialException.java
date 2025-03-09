/* Nama File    : AngkaSialException.java
 * Deskripsi    : contoh pembuatan exception custom
 * Pembuat      : M. Daffa' Atstsaqif/24060123120039
 * Tanggal      : 8 Maret 2025
 */

package Asersil;

public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super("jangan memasukkan angka 13 karena sial");
    }
}
