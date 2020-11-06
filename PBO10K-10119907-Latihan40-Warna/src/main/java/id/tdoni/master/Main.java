/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.master;

import id.tdoni.testkepribadianwarna.*;
import java.util.Scanner;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk melihat sifat warna
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var scanner = new Scanner(System.in);
        TestKepribadianWarna testKepribadianWarna;
        
        System.out.println(Warna.MERAH.getAnsiCode() + "YUK " + Warna.HIJAU.getAnsiCode()
                + "CHECK " + Warna.KUNING.getAnsiCode() + "KEPRIBADIANMU " + Warna.BIRUMUDA.getAnsiCode() 
                + "DARI " + Warna.UNGU.getAnsiCode() + "WARNA " + Warna.BIRU.getAnsiCode() + "FAVORITMU \n" 
                + Warna.NONE.getAnsiCode());
        
        System.out.printf("%s %s \tMERAH\t %s%n", Warna.BGMERAH.getAnsiCode(), Warna.PUTIH.getAnsiCode(), Warna.NONE.getAnsiCode());
        System.out.printf("%s %s \tHIJAU\t %s%n", Warna.BGHIJAU.getAnsiCode(), Warna.PUTIH.getAnsiCode(), Warna.NONE.getAnsiCode());
        System.out.printf("%s %s \tKUNING\t %s%n", Warna.BGKUNING.getAnsiCode(), Warna.PUTIH.getAnsiCode(), Warna.NONE.getAnsiCode());
        System.out.printf("%s %s \tBIRU\t %s%n", Warna.BGBIRU.getAnsiCode(), Warna.PUTIH.getAnsiCode(), Warna.NONE.getAnsiCode());
        System.out.printf("%s %s \tUNGU\t %s%n", Warna.BGUNGU.getAnsiCode(), Warna.PUTIH.getAnsiCode(), Warna.NONE.getAnsiCode());
        
        testKepribadianWarna = new TestKepribadianWarna(buatDataPasien(scanner));
        tampilkanHasilTest(testKepribadianWarna);
    }
    
    private static DataPasien buatDataPasien(Scanner scanner) {
        System.out.println("\nPilih Warna Favoritmu : ");
        var warnaFavorit = scanner.nextLine().toUpperCase();
        System.out.println("Nama Kamu : ");
        var nama = scanner.nextLine();
        return new DataPasien(nama, warnaFavorit);
    }
    
    private static void tampilkanHasilTest(TestKepribadianWarna testKepribadianWarna) {
        var dataPasien = testKepribadianWarna.getDataPasien();
        var hasilTestKepribadianPasien = testKepribadianWarna.getHasilTest();
                
        var namaPasien = dataPasien.getNama();
        var warnaFavoritPasien = dataPasien.getWarnaFavorit();
        var jumlahKepribadian = hasilTestKepribadianPasien.length;
        
        System.out.printf("\n==== HASIL TEST KEPRIBADIAN %S ====\n", namaPasien);
        if(jumlahKepribadian == 0){
            System.out.println("Ooops... Belum Teridentifikasi");
            return;
        }
        
        System.out.printf("Warna Favoritmu Adalah : %s%s%s\n", Warna.valueOf(warnaFavoritPasien).getAnsiCode(), warnaFavoritPasien, Warna.NONE.getAnsiCode());
        for (int i = 0; i < jumlahKepribadian; i++) {
            if (jumlahKepribadian - 1 != i) {
                System.out.printf("%d. %s,\n", i + 1, hasilTestKepribadianPasien[i]);
            } else {
                System.out.printf("%d. %s.", i + 1, hasilTestKepribadianPasien[i]);
            }
        }
        
    }
}
