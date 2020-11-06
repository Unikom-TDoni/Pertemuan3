/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.bangundatar;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk kalkulasi lingkaran
 */
public final class KalkulatorLingkaran extends KalkulatorBangunDatar {

    private final Lingkaran lingkaran;
    
    public KalkulatorLingkaran(Lingkaran lingkaran){
        this.lingkaran = lingkaran;
    }
    
    public float getJariJari() {
        return lingkaran.diameter / 2;
    }
    
    @Override
    public Double getLuas() {
        return (0.25f * Math.PI) * Math.pow(lingkaran.diameter, 2);
    }
    
    @Override
    public Double getKeliling() {
        return Math.PI * lingkaran.diameter;
    }
}
