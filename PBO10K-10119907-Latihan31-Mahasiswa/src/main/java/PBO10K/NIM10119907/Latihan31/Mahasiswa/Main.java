/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119907.Latihan31.Mahasiswa;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk menampilkan data mahasiswa
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa[] mahasiswaCollection =
        {
            new Mahasiswa(){{nim = "10110269"; nama = "Rizki Adam Kurniawan"; }},
            new Mahasiswa(){{nim = "10110270"; nama = "Indra Tiola"; }},
            new Mahasiswa(){{nim = "10110271"; nama = "Robi Tanzil Ganefi"; }},
            new Mahasiswa(){{nim = "10110269"; nama = "Muhammad Nur Awaludin"; }},
        };
        
        for (var mahasiswa : mahasiswaCollection)
            mahasiswa.perkenalkanDiri();
    }
}
