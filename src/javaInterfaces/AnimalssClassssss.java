package javaInterfaces;

public class AnimalssClassssss {
    public static void main(String[] args) {
        Animal animal=new Dog();
        animal.sound();
        animal.foood();
        animal.colour();
        animal.drink();
        animal.living();
        System.out.println(" animal variable  : "+animal.i);
        System.out.println("**********************************************************");
        Animal animal1=new Lion();
        animal1.sound();
        animal1.foood();
        animal1.colour();
        animal1.drink();
       // Animal.drink();
        System.out.println(" animal variable  : "+animal1.i);
        System.out.println("*****************************************************");

        Animal croc=new Crocodile();
        croc.sound();
        croc.foood();
        croc.drink();
        croc.living();
        croc.colour();
        System.out.println(" "+croc.i);



    }
}
