/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.master;

import java.util.Scanner;
import id.tdoni.nilaiterbesarterkecil.*;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk mencari nilai terbesar terkecil
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("==== Program Terbesar Terkecil Nilai Mahasiswa ====");
        
        var scanner = new Scanner(System.in);
        var petugas = buatDataPetugas(scanner);
        var dataMahasiswaCollection = buatBanyakDataMahasiswa(scanner);
        var kalkulator = new KalkulatorNilaiTerbesarTerkecilMahasiswa(dataMahasiswaCollection);
        
        tampilkanNilaiTerbesarTerkecilMahasiswa(kalkulator);
        tampilkanDataPetugas(petugas);
    }
    
    private static DataMahasiswa[] buatBanyakDataMahasiswa(Scanner scanner) {
        System.out.println("Masukan Banyaknya Mahasiswa : ");
        
        var jumlahMahasiswa = scanner.nextInt();
        var mahasiswaDataCollection = new DataMahasiswa[jumlahMahasiswa];
        
        for (int i = 1; i <= jumlahMahasiswa; i++) {
            System.out.printf("Nilai mahasiswa ke-%d : %n", i);
            mahasiswaDataCollection[i-1] = new DataMahasiswa(scanner.nextInt());
        }
        
        return mahasiswaDataCollection;
    }
    
    private static void tampilkanNilaiTerbesarTerkecilMahasiswa(KalkulatorNilaiTerbesarTerkecilMahasiswa kalkulator) {
        System.out.println();
        System.out.println("==== Hasil Nilai Mahasiswa ====");
        
        int index = 1;
        for (var nilaiMahasiswa : kalkulator.getMahasiswaNilaiCollection())
            System.out.printf("Hasil Nilai Mahasiswa ke-%d : %d%n",index++ , nilaiMahasiswa);
        
        System.out.println();
        System.out.printf("Nilai Terbesar Adalah %d\n", kalkulator.getNilaiTerbesar());
        System.out.printf("Nilai Terkecil Adalah %d", kalkulator.getNilaiTerkecil());
        System.out.println("\n");
    }
    
    private static DataPetugas buatDataPetugas(Scanner scanner) {
        System.out.println("Masukan Nama Petugas : ");
        return new DataPetugas(scanner.nextLine());
    }
    
    private static void tampilkanDataPetugas(DataPetugas dataPetugas)
    {
        System.out.printf("Petugas : %s", dataPetugas.getNama());
    }
}
