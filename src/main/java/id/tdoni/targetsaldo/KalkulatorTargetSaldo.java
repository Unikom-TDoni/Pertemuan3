/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.targetsaldo;
import java.util.LinkedHashMap;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk menampilkan Target saldo tabungan
 */
public final class KalkulatorTargetSaldo {
    
    private final float saldoAwal = 3500000;
    private final float saldoTarget = 6000000;
    private final float bungaBulanan = 8/100f;

    public LinkedHashMap<Integer, Float> getHasilPerhitunganSaldoBulanan()
    {
        int indexBulan = 1;
        float saldoBulanan = saldoAwal;
        var saldoCollection = new LinkedHashMap<Integer, Float>();
        while (saldoBulanan <= saldoTarget) {
            saldoBulanan += bungaBulanan * saldoBulanan;
            saldoCollection.put(indexBulan++, saldoBulanan);
        }
        return saldoCollection;
    }
}
