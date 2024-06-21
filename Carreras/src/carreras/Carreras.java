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
        int c1, c2, c3;
        while(true){
            c1=0;
            c2=0;
            c3=0;
            try {
                sleep((int)(Math.random()*38));
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
                    break;
                }
                
            }   catch(Exception e){
                
            }
        }
        if(c1>c2 && c1>c3){
                    p.anunciarGanador("Ganó el tsuru tuneado");
                    }else if(c2>c1 && c2>c3){
                        p.anunciarGanador("Ganó el atoz");
                        }else if(c3>c1 && c3>c2){
                            p.anunciarGanador("Ganó el tinaco");
                            }else{
                                p.anunciarGanador("Empate");
                                } 
    }
    public static void main(String[] args){

        SwingUtilities.invokeLater(() -> {
            new carrera().setVisible(true);
        });

    }
    
    
}
