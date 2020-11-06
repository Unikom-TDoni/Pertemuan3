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
public class Mahasiswa 
{
    public String nim;
    public String nama;
    
    public void perkenalkanDiri(){
        System.out.println("Hello Everyone");
        System.out.println("My NIM is ".concat(nim));
        System.out.println("My Name is ".concat(nama));
        System.out.println();
    }
}
