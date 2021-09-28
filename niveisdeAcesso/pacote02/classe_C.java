package niveisdeAcesso.pacote02;

import niveisdeAcesso.classe_A;

public class classe_C extends classe_A {

    public classe_C(){
        this.n1 = "Teste";
        this.x1 = 10;

        this.metodo01();
        this.metodo02(50);
        
    }

    public static void main(String[] args) {
        classe_A a = new classe_A();
        

        a.metodo02(90);
        
        classe_C c = new classe_C();
        c.n1 = "test";
    }
}
