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
public final class TestKepribadianWarna {
    private final DataPasien dataPasien;
    private final DataTestKepribadianWarna dataTest = new DataTestKepribadianWarna();
    
    public TestKepribadianWarna(DataPasien dataPasien) {
        this.dataPasien = dataPasien;
    }
    
    public String[] getHasilTest() {
        try {
            var key = Warna.valueOf(dataPasien.getWarnaFavorit());
            return dataTest.getKepribadian(key);
        } catch(Exception e) {
            return new String[]{};
        }
    }
    
    public DataPasien getDataPasien() {
        return dataPasien;
    }
}
