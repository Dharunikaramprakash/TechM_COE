package example;

abstract class Animal {
    abstract void makeSound();
    public void makenoise(){
        System.out.println("The animal makes noise");

    }

}
 class Dog extends Animal{
     @Override


    public void makeSound(){
         System.out.println("The dog is barking");

    }
}
class InheritenceAbstration{
    public static void main(String[] args){
        Dog d1=new Dog();
        d1.makenoise();
        d1.makeSound();


    }
}