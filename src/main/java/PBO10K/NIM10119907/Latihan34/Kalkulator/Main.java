/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119907.Latihan34.Kalkulator;
import java.util.Scanner;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk kalkulator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var scanner = new Scanner(System.in);
        var kalkulator = new Kalkulator();
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        
        System.out.println("Masukan Angka Ke-1 : ");
        kalkulator.value1 = scanner.nextDouble();
        
        System.out.println("Masukan Angka Ke-2 : ");
        kalkulator.value2 = scanner.nextDouble();
        
        System.out.println();
        System.out.printf("Hasil Pertambahan : %.1f\n", kalkulator.tambahBilangan());
        System.out.printf("Hasil Pengurangan : %.1f\n", kalkulator.kurangBilangan());
        System.out.printf("Hasil Perkalian : %.1f\n", kalkulator.kaliBilangan());
        System.out.printf("Hasil Pembagian : %.2f\n", kalkulator.bagiBilangan());
        System.out.printf("Hasil Sisa : %.1f\n", kalkulator.sisaBilangan());
    }
    
}
