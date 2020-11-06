/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.master;

import java.util.Scanner;
import id.tdoni.bangundatar.*;
import java.util.InputMismatchException;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk kalkulasi lingkaran
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("==================== Perhitungan Lingkaran ====================");
        var scanner = new Scanner(System.in);
        var kalkulator = new KalkulatorLingkaran(buatLingkaran(scanner));
        tampilkanHasilPerhitunganLingkaran(kalkulator);
    }
    
    private static Lingkaran buatLingkaran(Scanner scanner) {
        float diameter = 0;
        boolean isInputValid = false;
        while (!isInputValid) {
            try {
                System.out.println("Masukan Nilai Diameter Lingkaran : ");
                diameter = scanner.nextFloat();
                isInputValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Nilai Diameter Tidak Sesuai.\n");
                scanner.next();
            }
        }
        return new Lingkaran(diameter);
    }
    
    private static void tampilkanHasilPerhitunganLingkaran(KalkulatorLingkaran kalkulator) {
        System.out.println();
        System.out.println("==================== Hasil Perhitungan Lingkaran ====================");
        System.out.printf("Jari Jari Lingkaran = %.0f cm\n", kalkulator.getJariJari());
        System.out.printf("Luas Lingkaran = %.2f cm\n", kalkulator.getLuas());
        System.out.printf("Keliling Lingkaran = %.2f cm\n", kalkulator.getKeliling());
    }
    
}
