/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.testkepribadianwarna;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk melihat sifat warna
 */
public final class DataPasien {
    private final String nama;
    private final String warnaFavorit;
    
    public DataPasien(String nama, String warnaFavorit){
        this.nama = nama;
        this.warnaFavorit = warnaFavorit;
    }
    
    public String getNama(){
        return nama;
    }
    
    public String getWarnaFavorit() {
        return warnaFavorit;
    }
}
