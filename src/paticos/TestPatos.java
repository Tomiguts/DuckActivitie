/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paticos;

import TipoDePato.DecoyDuck;
import TipoDePato.MallardDucks;

/**
 *
 * @author Tomas
 */
public class TestPatos {
    
    public static void main(String[] args) {
        MallardDucks mallard = new MallardDucks();
        DecoyDuck decoy = new DecoyDuck();
        
        decoy.display();  
        System.out.println("Primer intento de vuelo");
        decoy.FlyNoWay();
        System.out.println("Segundo intento de vuelo");
        decoy.FlyNoWay();
        decoy.MuteQuack();
        
        mallard.display();        
        mallard.FlyWithWings();     
        mallard.Quack();   

    }
}
