/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.master;
import id.tdoni.ratarata.*;
import java.util.Scanner;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk menghitung rata rata
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var scanner = new Scanner(System.in);
        var dataMahasiswaCollection = buatBanyakDataMahasiswa(scanner);
        var kalkulator = new KalkulatorRataRataMahasiswa(dataMahasiswaCollection);
        tampilkanRataRataNilaiMahasiswa(kalkulator);
    }
    
    private static DataMahasiswa[] buatBanyakDataMahasiswa(Scanner scanner) {
        System.out.println("Masukan Banyaknya Mahasiswa : ");
        
        var jumlahMahasiswa = scanner.nextInt();
        var dataMahasiswaCollection = new DataMahasiswa[jumlahMahasiswa];
        
        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.printf("Nilai mahasiswa ke-%d : %n", i);
            dataMahasiswaCollection[i-1] = new DataMahasiswa(scanner.nextFloat());
        }
        
        return dataMahasiswaCollection;
    }
    
    private static void tampilkanRataRataNilaiMahasiswa(KalkulatorRataRataMahasiswa kalkulator){
        System.out.println();
        System.out.printf("Maka, Rata Rata Nilainya Adalah %.1f", kalkulator.getRataRataNilai());
    }
    
}
