/* Nama File    : Asersi2.java
 * Deskripsi    : menghitung keliling lingkaran berdasarkan jari-jari yang diberikan. Jika jari-jari ≤ 0, maka assertion akan menampilkan pesan error.
 * Pembuat      : M. Daffa' Atstsaqif/24060123120039
 * Tanggal      : 8 Maret 2025
 */
    
package Asersil;

class Lingkaran{
    private double jariJari;
    public Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    public double hitungKeliling(){
        double keliling = 2*Math.PI*jariJari;
        return keliling;
    }
}

public class Asersil2 {
    public static void main(String[] args){
        double jariJari = 0;
        assert(jariJari > 0):"jari jari tidak boleh nol";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}

// jawaban :
/*Kode di atas memiliki kesalahan dalam penggunaan assertion.
  Assertion (assert(jariJari > 0)) dilakukan setelah nilai jari-jari 
  diinisialisasi dengan 0, sehingga tetap memungkinkan pembuatan objek Lingkaran(0),
  yang tidak valid. Selain itu, assertion tidak akan berjalan tanpa mengaktifkan flag -ea.*/
