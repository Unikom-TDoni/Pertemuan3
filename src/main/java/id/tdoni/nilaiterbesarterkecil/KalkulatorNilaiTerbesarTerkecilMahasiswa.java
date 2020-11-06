/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.nilaiterbesarterkecil;

import java.util.Arrays;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk mencari nilai terbesar terkecil
 */
public final class KalkulatorNilaiTerbesarTerkecilMahasiswa {
    
    private final DataMahasiswa[] dataMahasiswaCollection;
    
    public KalkulatorNilaiTerbesarTerkecilMahasiswa(DataMahasiswa[] dataMahasiswaCollection) {
        this.dataMahasiswaCollection = dataMahasiswaCollection;
    }
    
    public int getNilaiTerkecil(){
        return Arrays.stream(dataMahasiswaCollection)
                .mapToInt(mahasiswa -> mahasiswa.nilai)
                .min()
                .getAsInt();
    }
    
    public int getNilaiTerbesar() {
       return Arrays.stream(dataMahasiswaCollection)
               .mapToInt(mahasiswa -> mahasiswa.nilai)
               .max()
               .getAsInt();
    }
    
    public int[] getMahasiswaNilaiCollection() {
        return Arrays.stream(dataMahasiswaCollection)
                .mapToInt(mahasiswa -> mahasiswa.nilai)
                .toArray();
    }
}
