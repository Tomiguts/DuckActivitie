/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TipoDePato;
import paticos.Paticos;
import PaticosInterface.FlyBehavior;
import PaticosInterface.QuackBehavior;

public class MallardDucks extends Paticos {
    public MallardDucks() {
        super();
    }
    
    @Override
    public void display() {
        System.out.println("Soy un pato Mallard.");
    }
    
    public void FlyWithWings(){
        flyBehavior.fly();
    }
    
    public void Quack (){
        quackBehavior.quack();    
    }
}
