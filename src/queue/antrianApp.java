/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author user
 */
public class antrianApp {
    public static void main(String[] args){
        antrian antrian = new antrian(10);
        antrian.enqueue(147);
        antrian.display();
        System.out.println("");
        antrian.enqueue(6);
        antrian.display();
        System.out.println("");
        System.out.println("nilai yang paling depan = " + antrian.peek());
        System.out.println("Nama saya adalah Ega Permana Putra");
        System.out.println("");
        antrian.enqueue(7);
        antrian.display();
        System.out.println("");
        System.out.println("yang diambil dari antrian = " + antrian.dequeue());
        antrian.display();
        System.out.println("");

    }
    
}