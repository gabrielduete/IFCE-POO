package dueloMonstros;
import java.util.Random;

public class Monstro {
    private Random gerador = new Random();
    private String nome;
    private int life;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setLife(int life){
        this.life = life;
    }

    public int getLife(){
        return life;
    }

    public int atacar(){

        int ataque = gerador.nextInt(30);

        return ataque;
    }

    public int defender(){

        int defesa = gerador.nextInt(30);

        return defesa;
    }

    public void danoSofrido(int dano){
        this.life -= dano;
    }

}
