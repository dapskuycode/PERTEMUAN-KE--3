/* Nama File    : ExceptionOnArray.java
 * Deskripsi    : menangani error saat mengakses indeks array yang di luar batas dengan try-catch-finally.
 * Pembuat      : M. Daffa' Atstsaqif/24060123120039
 * Tanggal      : 8 Maret 2025
 */

package Asersil;

public class ExceptionOnArray {
    public static void main(String[] args){
        Integer[] arrayInteger = new Integer[4];
        try{
            arrayInteger[2] = 11;
            arrayInteger[4] = 10;
        }catch(ArrayIndexOutOfBoundsException exception){
            // exception.printStackTrace();
        }finally{
            System.out.println("Clean up code ...");
        }
    }
}
