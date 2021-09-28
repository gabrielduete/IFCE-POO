package niveisdeAcesso.pacote02;

public class classe_D {

    public void testarClasseInterna(){
        classe_F f = new classe_F();
        f.acao();
    }

    public class classe_F{
        public void acao(){
            System.out.println("Ação da classe Interna F");
        }
    }
}
