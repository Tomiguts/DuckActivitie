/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TipoDePato;
import paticos.Paticos;
import PaticosInterface.FlyBehavior;
import PaticosInterface.QuackBehavior;
import PaticosInterface.FlyWithWings;
import PaticosInterface.Quack;

public class MallardDucks extends Paticos {
    public MallardDucks() {
        super();
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    
    @Override
    public void display() {
        System.out.println("I'm a Mallard Duck.");
    }
    
    public void FlyWithWings(){
        flyBehavior.fly();
    }
    
    public void Quack(){
        quackBehavior.quack();    
    }
}
