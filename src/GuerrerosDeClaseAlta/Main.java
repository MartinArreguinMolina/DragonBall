package GuerrerosDeClaseAlta;

import PaqueteNumeroUno.*;

public class Main {

    public static void main(String... args) {
        SaiyajinClaseAlta[] a = new SaiyajinClaseAlta[3];

        a[0] = new Vegueta();
        a[1] = new Napa();
        a[2] = new Broly();
        
        for(int i = 0; i < 3; i++){
            System.out.println(a[i]);
        }

    }

}
