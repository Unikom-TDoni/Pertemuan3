/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBO10K.NIM10119907.Latihan34.Kalkulator;

/**
 *
 * @author
 * Nama     : T Doni
 * Kelas    : IF10K
 * NIM      : 10119907
 * Deskripsi Program : Program ini digunakan untuk kalkulator
 */
public class Kalkulator {
    public double value1;
    public double value2;
    
    public double tambahBilangan()
    {
        return value1 + value2;
    }
    
    public double kurangBilangan() 
    {
        return value1 - value2;
    }
    
    public double kaliBilangan() 
    {
        return value1 * value2;
    }
    
    public double bagiBilangan()
    {
        return value1 / value2;
    }
    
    public double sisaBilangan()
    {
        return value1 % value2;
    }
}
