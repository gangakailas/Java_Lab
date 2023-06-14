/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author mkailasnath
 */
public class ValueMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Value v=new Value();
        v.seta(25);
        v.setb(4);
        v.findprod();
        
        System.out.print("a="+v.geta());
        System.out.print("b="+v.getb());
        System.out.print("a*b="+v.getprod());
        
        
    }
    
}
