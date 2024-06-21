/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carreras;

import javax.swing.JLabel;
import javax.swing.SwingUtilities;

/**
 *
 * @author hamst
 */
public class Carreras extends Thread{
    private JLabel carrito;
    private carrera p;
    
    public Carreras(JLabel carrito, carrera p){
        this.carrito=carrito;
        this.p=p;
    }
    
    public void run(){
        int c1, c2, c3, c4, c5;
        while(true){
            try {
                sleep((int)(Math.random()*30));
                /*Se agrega los coches que van a correr en gui*/
                c1=p.gettsuru().getLocation().x;
                c2=p.getatoz().getLocation().x;
                c3=p.gettinaco().getLocation().x;
                if(c1<p.getKaguazaki().getLocation().x-20&&
                   c2<p.getKaguazaki().getLocation().x-20&&
                   c3<p.getKaguazaki().getLocation().x-20){
                    carrito.setLocation(carrito.getLocation().x+5,carrito.getLocation().y);
                    p.repaint();
                }else{
                    p.anunciarGanador(carrito);
                    break;
                    
                }
                
            }   catch(Exception e){
            
            }
            
        }
    }
    public static void main(String[] args){

        SwingUtilities.invokeLater(() -> {
            new carrera().setVisible(true);
        });

    }
    
    
}
