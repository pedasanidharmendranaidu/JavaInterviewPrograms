package javaInterfaces;

public interface Animal {
    int i=10;
  void   sound();
  void foood();
  void colour();

  default void living(){
      System.out.println(" living on ground and in water");
  }
  default void drink(){
      System.out.println("drink wonter");

  }

}
