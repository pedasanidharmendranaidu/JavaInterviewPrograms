package javaInterfaces;

public class Dog implements Animal{
    @Override
    public void sound() {
        System.out.println("bowwwwwwwwwwwwwwww");
    }

    @Override
    public void foood() {
        System.out.println("kukka biscuits------chiken biryani");
    }

    @Override
    public void colour() {

        System.out.println("blackkkkkkkkkkkk");


    }

    @Override
    public void living() {
        System.out.println("living on ground");
    }
}
