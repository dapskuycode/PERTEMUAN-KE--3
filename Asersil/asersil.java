/* Nama File    : Asersil.java
 * Deskripsi    : Program untuk menunjukkan asersi.
 * Pembuat      : M. Daffa' Atstsaqif/24060123120039
 * Tanggal      : 8 Maret 2025
 */

package Asersil;

public class asersil {
    public static void main(String[] args){
        int x = 0;
        if(x > 0){
            System.out.println("x bilangan positif");
        }else{
            assert(x < 0):"ada kesalahan kode";
            System.out.println("x bilangan negatif");
        }
    }
}
