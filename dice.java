/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Toprak
 */
public class Dice {
    
    private int ZarDegeri;
    
    
    public Dice() {
    this.ZarDegeri = (int) (Math.random()*6)+1;
}
    
    public void setZarDegeri(){
        this.ZarDegeri = ZarDegeri;
    }
    
    public int getZarDegeri(){
        return ZarDegeri;
    }
    
    public void degisZarDegeri(){
        this.ZarDegeri = (int) (Math.random()*6)+1;
    }
}


