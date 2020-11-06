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
 * Deskripsi Program : Program ini digunakan untuk menampilkan data film
 */
public class User {
    private static final String username = "RizkiAdam";
    private static final String password = "terbaikselalu";
    private boolean statusAkun;
    
    private boolean checkAkun(String parUserName, String parPassword)
    {
        return username.equals(parUserName) && password.equals(parPassword);
    }
    
    private void hasilLogin(boolean status,String parUsername)
    {
        if(status)
            System.out.printf("***HALLO %s***\nSelamat Datang di Aplikasi ini", parUsername);
        else
            System.out.println("Ooops, Username atau Password anda salah");
    }
    
    public void pengecekanLogin(String parUserName, String parPassword)
    {
        statusAkun = checkAkun(parUserName,parPassword);
        hasilLogin(statusAkun, parUserName.toUpperCase());
    }
}
