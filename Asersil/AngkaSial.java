/* Nama File    : AngkaSial.java
 * Deskripsi    : contoh penerapan exception custom
 * Pembuat      : M. Daffa' Atstsaqif/24060123120039
 * Tanggal      : 8 Maret 2025
 */

package Asersil;

public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka == 13){
            throw new AngkaSialException();
        }
        System.out.println(angka + "bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try{
            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);
        }catch(AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("hati hati memasukkan angka!!!");
        }
    }
}

// JAWABAN :
/*Ketika eksepsi terjadi pada pemanggilan as.cobaAngka(13), program langsung masuk ke blok catch,
  sehingga baris 12 (as.cobaAngka(12);) tidak dieksekusi. 
  Namun, baris 21 (System.out.println("hati hati memasukkan angka!!!");) tetap dieksekusi karena berada dalam blok catch,
  yang menangani eksepsi yang terjadi sebelumnya.*/
