/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paticos;

import PaticosInterface.QuackBehavior;
import PaticosInterface.FlyBehavior;

public abstract class Paticos{
    public FlyBehavior flyBehavior;
    public QuackBehavior quackBehavior;
    
    public Paticos(){ }
    
    public abstract void display();
    
    public void perfomFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }
    
    public void swim(){
        System.out.println("All ducks float, even decoys!");
    }
}


