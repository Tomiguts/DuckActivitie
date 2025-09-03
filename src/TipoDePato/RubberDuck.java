/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TipoDePato;

import paticos.Paticos;
import PaticosInterface.FlyBehavior;
import PaticosInterface.QuackBehavior;
import PaticosInterface.FlyNoWay;
import PaticosInterface.Squeak;

/**
 *
 * @author Estudiantes
 */
public class RubberDuck extends Paticos {
    public RubberDuck() {
        super();
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
    }
    
    @Override
    public void display() {
        System.out.println("i'm a Rubber Duck.");
    }
    
    public void FlyWithWings(){
        flyBehavior.fly();
    }
    
    public void Quack (){
        quackBehavior.quack();    
    }
}
