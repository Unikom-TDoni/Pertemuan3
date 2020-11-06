/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.master;

import java.util.Scanner;
import id.tdoni.tunjangan.*;
/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk menghitung tunjangan
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("==================== Program Tunjangan ====================");
        var scanner = new Scanner(System.in);
        var dataKaryawan = buatDataKaryawan(scanner);
        var kalkulatorTunjangan = new KalkulatorTunjanganKaryawan(dataKaryawan);
        tampilkanPerhitunganTunjangan(kalkulatorTunjangan);
    }
    
    private static DataKaryawan buatDataKaryawan(Scanner scanner){
        float gajiPokok;
        StatusKaryawan status;
        
        System.out.println("Berapa Gaji Pokok Anda Perbulan ? : Rp. ");
        gajiPokok = scanner.nextFloat();
        
        System.out.println("Status Anda ? (Menikah/Belum) : ");
        try {
            status = StatusKaryawan.valueOf(scanner.next());
        }
        catch(Exception e) {
            status = StatusKaryawan.Belum;
        }
        
        return new DataKaryawan(gajiPokok, status);
    }
    
    private static void tampilkanPerhitunganTunjangan(KalkulatorTunjanganKaryawan kalkulatorTunjangan)
    {
        System.out.println("\n==================== Hasil Perhitungan Gaji Anda ====================");
        System.out.printf("Gaji Pokok \t\t : Rp %.1f%n", kalkulatorTunjangan.getGajiPokok());
        System.out.printf("Tunjangan \t\t : Rp %.1f%n", kalkulatorTunjangan.getTotalTunjangan());
        System.out.printf("Total Gaji \t\t : Rp %.1f%n", kalkulatorTunjangan.getTotalGaji());
    }
}
