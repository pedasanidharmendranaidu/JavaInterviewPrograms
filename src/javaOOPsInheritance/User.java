package javaOOPsInheritance;

public class User {

    public static void main(String[] args) {
       // Guest guest=new Guest();
      //  guest.read();
       /* Developer developer=new Developer();
        developer.read();
        developer.write();*/
       Developer admin=new Developer();
        admin.read();
        admin.write();
    //   admin.manage();
   Developer admin1=(Admin)new Admin();
        admin1.read();
        admin1.write();
       //    admin1.manage();

    }

}
