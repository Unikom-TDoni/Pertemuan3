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
public enum Warna {
    
    NONE("\u001B[0m"),
    MERAH("\u001B[31m"),
    HIJAU("\u001B[32m"),
    KUNING("\u001B[33m"),
    BIRU("\u001B[34m"),
    UNGU("\u001B[35m"),
    BIRUMUDA("\u001B[36m"),
    PUTIH("\u001B[37m"),
    
    BGMERAH("\u001B[41m"),
    BGHIJAU("\u001B[42m"),
    BGKUNING("\u001B[43m"),
    BGBIRU("\u001B[44m"),
    BGUNGU("\u001B[45m");
    
    private final String ANSI_CODE;
    
    private Warna(String ansiCode) {
        ANSI_CODE = ansiCode;
    }
    
    public String getAnsiCode() {
        return ANSI_CODE;
    }
}
