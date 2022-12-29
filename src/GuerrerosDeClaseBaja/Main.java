package GuerrerosDeClaseBaja;

import PaqueteNumeroUno.*;

public class Main {

    public static void main(String... args) {
        SaiyajinClaseBaja[] a = new SaiyajinClaseBaja[3];
        
       a[0] = new Goku();
       a[1] = new Raditz();
       a[2] = new Bardock();
       
       
       for(int i = 0; i < 3; i++){
           System.out.println(a[i].toString());
       }
    }
}
