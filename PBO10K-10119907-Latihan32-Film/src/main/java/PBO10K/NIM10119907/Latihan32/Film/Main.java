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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Film filmCollection[] = {
            new Film(){{filmName = "Venom"; filmGenre = "Action, Horor, Scifi"; filmRating = 8.5; filmDuration = 120;}},
            new Film(){{filmName = "Small Foot"; filmGenre = "Animation"; filmRating = 9.0; filmDuration = 96;}},
            new Film(){{filmName = "Crazy Rich Asian"; filmGenre = "Comedy"; filmRating = 7.8; filmDuration = 119;}},
            new Film(){{filmName = "Asih"; filmGenre = "Horor"; filmRating = 6.0; filmDuration = 100;}},
        };
        
        System.out.println("=== Daftar Film Yang Sedang Tayang ===\n");
        for (var film : filmCollection)
            film.nowPlaying();
    }
}
