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
public final class DataKaryawan {
    final float gajiPokok;
    final StatusKaryawan status;
    
    public DataKaryawan(float gajiPokok, StatusKaryawan status) {
        this.gajiPokok = gajiPokok;
        this.status = status;
    }
}
