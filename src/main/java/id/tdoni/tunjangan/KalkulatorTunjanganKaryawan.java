/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.tunjangan;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk menghitung tunjangan
 */
public final class KalkulatorTunjanganKaryawan {
    private final DataKaryawan dataKaryawan;
    private final float percentTunjangan = 0.35f;
    
    public KalkulatorTunjanganKaryawan(DataKaryawan dataKaryawan) {
        this.dataKaryawan = dataKaryawan;
    }
    
    public float getTotalGaji(){
        return dataKaryawan.gajiPokok + getTotalTunjangan();
    }
    
    public float getTotalTunjangan(){
        return dataKaryawan.status == StatusKaryawan.Menikah ? dataKaryawan.gajiPokok * percentTunjangan : 0;
    }
    
    public float getGajiPokok() {
        return dataKaryawan.gajiPokok;
    }
}
