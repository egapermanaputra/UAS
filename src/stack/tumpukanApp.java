/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack;

/**
 *
 * @author user
 */
public class tumpukanApp {
    public static void main (String [] args) {
        tumpukan tumpukan= new tumpukan(10);
        tumpukan.push(147);
        tumpukan.baca();
        System.out.print("");
        tumpukan.push(2);
        tumpukan.baca();
        System.out.print("");
        System.out.println("Nama saya adalah Ega Permana Putra");
        long nilaipop = tumpukan.pop();
        System.out.println("nilai yang dihapus = "+ nilaipop);
        tumpukan.baca();
        System.out.println("");
        System.out.println("");
        tumpukan.push(3);
        tumpukan.baca();
        System.out.print("");
        tumpukan.push(5);
        tumpukan.baca();
        
      }
        
}