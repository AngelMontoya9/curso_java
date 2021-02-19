/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

/**
 *
 * @author HP
 */
class Main {
    public static void main(String [] args){
        int x=1;
        int anterior=0;
        int temp;
        while(true){
            System.out.println(x);
            temp=x;
            x=x+anterior;
            if(x>100){
                break;
            }
        }
    }
    
}
