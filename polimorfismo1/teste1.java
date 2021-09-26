package polimorfismo1;

public class teste1 {
    public static void main(String[] args) {
    Gato gato = new Gato();

    gato.nome = "Bruce";
    gato.idade = 1;

    gato.brincar("lã");
    gato.andar();
    gato.fazerSom("Miaaaau");

    Cachorro dog = new Cachorro();

    dog.nome = "teste";
    dog.idade = 5;

    dog.brincar("osso");
    dog.andar();
    dog.fazerSom("AU AU AU");

}}
