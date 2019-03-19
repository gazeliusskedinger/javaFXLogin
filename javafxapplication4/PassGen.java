/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication4;

/**
 *
 * @author root
 */
public class PassGen {
    public static void main(String[] args){
        String pass = "GoBananas";
        Authenticate a = new Authenticate();
        System.out.println(a.hash(pass.toCharArray()));
              
    }
            
    
}
