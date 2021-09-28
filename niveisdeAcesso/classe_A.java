package niveisdeAcesso;

public class classe_A {
    protected int x1;
    protected String n1;
    
    protected void metodo01(){
        System.out.println("Sou público");
    }

    public void metodo02(int a){
        System.out.println("Sou público e sobrecarregado " + a);
    }


}
