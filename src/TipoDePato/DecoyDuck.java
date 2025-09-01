/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TipoDePato;
import paticos.Paticos;
import PaticosInterface.FlyBehavior;
import PaticosInterface.QuackBehavior;

public class DecoyDuck extends Paticos {
    public DecoyDuck (){
        super();
    }
    
    @Override
    public void display(){
        System.out.println("im a Decoy duck");
    };
    
    public void FlyNoWay (){
        flyBehavior.NoFly();
    }
    
    public void MuteQuack (){
        quackBehavior.MuteQuack();
    }
}
