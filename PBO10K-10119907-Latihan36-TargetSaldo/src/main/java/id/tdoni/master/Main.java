/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.master;

import id.tdoni.targetsaldo.KalkulatorTargetSaldo;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk menampilkan Target saldo tabungan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        var kalkulatorTargetSaldo = new KalkulatorTargetSaldo();
        tampilkanHasilPerhitunganSaldo(kalkulatorTargetSaldo);
    }
    
    private static void tampilkanHasilPerhitunganSaldo(KalkulatorTargetSaldo kalkulatorTargetSaldo) {
        var hasilPerhitunganSaldo = kalkulatorTargetSaldo.getHasilPerhitunganSaldoBulanan();
        hasilPerhitunganSaldo.forEach((indexBulan, saldoBulanan) -> {
            var thousandFormat = String.format("%,.0f%n", saldoBulanan).replace(',', '.');
            System.out.printf("Saldo di bulan ke-%d Rp. %s", indexBulan, thousandFormat);
        });
    }
}
