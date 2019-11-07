/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hukumohm;

/**
 *
 * @author LENOVO
 */
public class Baterai {
    private float kuatArus;
    private float hambatan;
    
    Baterai(){
        kuatArus=0f;
        hambatan=0f;
    }
    
    Baterai(float kuatArus,float hambatan){
        this.kuatArus=kuatArus;
        this.hambatan=hambatan;
    }
    
    public float getKuatArus(){
        return kuatArus;
    }
    
    public float getHambatan(){
        return hambatan;
    }
    
    public float hitungTegangan(){
        return kuatArus*hambatan;
    }
}
