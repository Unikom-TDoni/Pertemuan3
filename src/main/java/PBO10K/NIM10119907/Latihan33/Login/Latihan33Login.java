/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119907.Latihan33.Login;
import java.util.Scanner;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk user login
 */
public class Latihan33Login {

    private static String usName;
    private static String passWord;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        var scanner = new Scanner(System.in);
        
        System.out.println("Masukan Username = ");
        usName = scanner.nextLine();
        
        System.out.println("Masukan Password = ");
        passWord = scanner.nextLine();
        
        System.out.println();
        
        var user = new User();
        user.pengecekanLogin(usName, passWord);
    }
}
