package polimorfismo1;

public class animalEstimacao{
    public String nome;
    public int idade;

    public void andar(){
        System.out.println(nome + " andando");
    }

    public void brincar(String objeto){
        System.out.println(nome + " brincando com " + objeto);
    }

    public void fazerSom(String som){
        System.out.println(som);
    }

    public void idade(){
        System.out.println(nome + "tem " + idade);
    }
}
