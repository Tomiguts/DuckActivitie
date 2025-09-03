/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TipoDePato;
import paticos.Paticos;
import PaticosInterface.FlyBehavior;
import PaticosInterface.QuackBehavior;
<<<<<<< HEAD

public class DecoyDuck extends Paticos {
    public DecoyDuck (){
        super();
=======
import PaticosInterface.FlyNoWay;
import PaticosInterface.FlyRocketPowered;
import PaticosInterface.MuteQuack;

public class DecoyDuck extends Paticos {
    private int flyAttempts = 0;
    public DecoyDuck (){
        super();
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
>>>>>>> master
    }
    
    @Override
    public void display(){
<<<<<<< HEAD
        System.out.println("im a Decoy duck");
    };
    
    public void FlyNoWay (){
        flyBehavior.NoFly();
    }
    
    public void MuteQuack (){
        quackBehavior.MuteQuack();
=======
        System.out.println("I'm a Decoy duck");
    };
    
    public void FlyNoWay (){
        flyAttempts++;
        if (flyAttempts == 1) {
            System.out.println("Intento #" + flyAttempts + ":");
            flyBehavior.fly(); 
        } else {
            System.out.println("Intento #" + flyAttempts + ":");
            flyBehavior = new FlyRocketPowered(); 
            flyBehavior.fly();
        }
    }
 
    public void MuteQuack (){
        quackBehavior.quack();
>>>>>>> master
    }
}
