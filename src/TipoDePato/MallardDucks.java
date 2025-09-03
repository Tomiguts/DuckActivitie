/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TipoDePato;
import paticos.Paticos;
import PaticosInterface.FlyBehavior;
import PaticosInterface.QuackBehavior;
<<<<<<< HEAD
=======
import PaticosInterface.FlyWithWings;
import PaticosInterface.Quack;
>>>>>>> master

public class MallardDucks extends Paticos {
    public MallardDucks() {
        super();
<<<<<<< HEAD
=======
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
>>>>>>> master
    }
    
    @Override
    public void display() {
<<<<<<< HEAD
        System.out.println("Soy un pato Mallard.");
=======
        System.out.println("I'm a Mallard Duck.");
>>>>>>> master
    }
    
    public void FlyWithWings(){
        flyBehavior.fly();
    }
    
<<<<<<< HEAD
    public void Quack (){
=======
    public void Quack(){
>>>>>>> master
        quackBehavior.quack();    
    }
}
