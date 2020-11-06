/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tdoni.testkepribadianwarna;

import java.util.Map;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk melihat sifat warna
 */
public final class DataTestKepribadianWarna {
    final Map<Warna, String[]> kepribadianCollection = Map.of(
            Warna.MERAH, new String[] {
                "Periang",
                "Pemberani",
                "Berani Mengambil Resiko Dalam Setiap Langkah",
                "Menyukai Tantangan",
                "Kurang Sabar",
                "Bersahabat",
                "Dapat Menahan Marah Namun Juka Sudah Tahap Puncak Toleransi, Kemarahannya Akan Sulit Dikontrol",
                "Memiliki Energi Kehangatan Dan Cinta"
            },
            
            Warna.HIJAU, new String[] {
                "Romantis",
                "Menyukai Hal Yang Berbau Alami Dan Keindahan",
                "Teguh Pada Perinsip",
                "Mengiginkan Kesempurnaan",
                "Mudah Cemburu",
                "Mudah Merasa Iri",
                "Menjunjung Tinggi Suatu Nilai Toleransi Dan Kepercayaan"
            },
            
            Warna.KUNING, new String[] {
                "Optimis",
                "Suka Bergaul",
                "Periang",
                "Senang Menolong",
                "Lincah Dan Aktif",
                "Tidak Suka Meremehkan Kekurangan Orang Lain",
                "Loyal",
                "Hangat",
                "Meskipun Karakternya Optimis Dan Idealis, Seringkali Goyah Dan Tidak Stabil",
                "Cenderung Penakut"
            },
            
            Warna.BIRU, new String[] {
                "Menyenangkan",
                "Bijaksana",
                "Pembawaan Diri Tenang Saat Menghadapi Masalah",
                "Dinamis",
                "Senang Berbagi",
                "Bersahabat",
                "Tidak Terlalu Suka Menjadi Sorotan Banyak Orang",
                "Menyembunyikan Perasaan Karena Karakternya Yang Cenderung Mencari Jalan Damai"
            },
            
            Warna.UNGU, new String[] {
                "Optimis",
                "Tidak Pernah Ragu",
                "Menurutnya Pasangan Yang Ideal Adalah Yang Memiliki Mental Yang Kuat",
                "Memiliki Ambisi Yang Besar",
                "Memiliki Empati Yang Besar",
                "Memiliki Sisi Misterius Sebab Seringkali Menutupi Perasaannya",
                "Terkadang Bersikap Keras Kepala Dan Angkuh"
            }
    );
    
    String[] getKepribadian(Warna key) {
        return kepribadianCollection.get(key);
    }
}
