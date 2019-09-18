package core;

interface Moveable {
    default void move(){
        System.out.println("I am moving");
    }
}

public class Animal implements Moveable{

    public void move(){
        System.out.println("I am running");
    }

    public static void main(String[] args){
        Animal tiger = new Animal();
        tiger.move();       //I am moving
    }

}