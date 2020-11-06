/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.ratarata;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk menghitung rata rata
 */
public final class KalkulatorRataRataMahasiswa {
    private final DataMahasiswa mahasiswaDataCollection[];
    
    public KalkulatorRataRataMahasiswa(DataMahasiswa[] mahasiswaDataCollection) {
        this.mahasiswaDataCollection = mahasiswaDataCollection;
    }
    
    public float getRataRataNilai()
    {
        float sumNilai = 0;
        for (var mahasiswaData : mahasiswaDataCollection)
            sumNilai += mahasiswaData.nilai;
        return sumNilai / mahasiswaDataCollection.length;
    }
}
