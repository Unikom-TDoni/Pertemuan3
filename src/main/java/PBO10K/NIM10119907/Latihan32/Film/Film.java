/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119907.Latihan32.Film;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk menampilkan data film
 */
public class Film {
    public String filmName;
    public String filmGenre;
    public double filmRating;
    public int filmDuration;
    
    public void nowPlaying()
    {
        System.out.println("Judul Film : ".concat(filmName));
        System.out.println("Genre Film : ".concat(filmGenre));
        System.out.printf("Rating Film : %.1f\n", filmRating);
        System.out.printf("Duration Film : %d Menit\n", filmDuration);
        System.out.println();
    }
}
