/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Toprak
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Program zar oyunu ile alakalıdır.
        // Yapımcısı Toprak Hüriyet'tir.
        
        
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        
        
        int m = dice1.getZarDegeri() + dice2.getZarDegeri();
        System.out.println("Mehmet Zarlar: "+ dice1.getZarDegeri() +" "+ dice2.getZarDegeri());
        
        dice1.degisZarDegeri();
        dice2.degisZarDegeri();
        
                int a = dice1.getZarDegeri() + dice2.getZarDegeri();

                System.out.println("Ahmet Zarlar: "+ dice1.getZarDegeri() +" "+ dice2.getZarDegeri());

        
        if (a>m)
            System.out.println("Ahmet Kazandı");
            else if (m>a)
            System.out.println("Mehmet Kazandı");
            else
                System.out.println("Berabere");
            
            
        
        
    }
    
}
