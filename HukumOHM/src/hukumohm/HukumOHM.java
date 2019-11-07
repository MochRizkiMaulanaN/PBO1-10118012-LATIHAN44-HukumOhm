/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hukumohm;

import java.util.Scanner;

/**
 * NAMA      : Moch Rizki Maulana N
 * KELAS     : IF-1
 * NIM       : 10118012
 * Deskripsi Program   : Program ini berisi program menghitung hasil tegangan
 *
 * @author Moch Rizki Maulana N
 */
public class HukumOHM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.print("Kuat Arus (Ampere) : ");
        float k = input.nextFloat();
        System.out.print("Hambatan (Ohm): ");
        float h=input.nextFloat();
        Baterai b = new Baterai(k, h);
        System.out.println("Hasil Tegangan : "+b.hitungTegangan()+"Ohm");
    }
    
}
