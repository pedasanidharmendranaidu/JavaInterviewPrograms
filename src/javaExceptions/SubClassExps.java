package javaExceptions;

import java.io.FileNotFoundException;

public class SubClassExps extends SuperClassExps {

    public void pedasani() {
        System.out.println("sub  pedasani()");
    }

    public void dharma() throws FileNotFoundException {
        //  super.dharma();
        System.out.println("sub dharma()");
//        try {
//            throw new FileNotFoundException();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

    public void naidu() throws RuntimeException {
        System.out.println("sub  naidu()");
      //  super.naidu();

    }

}
