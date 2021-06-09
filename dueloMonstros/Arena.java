package dueloMonstros;
import java.util.Random;

public abstract class Arena {
    public void startFight(Monstro m1, Monstro m2){
        Random gerador = new Random();
        
        Monstro lutador1, lutador2;

        int first = gerador.nextInt(2);

        if(first == 0 ){
            lutador1 = m1;
            lutador2 = m2;
        }else{
            lutador1 = m2;
            lutador2 = m1;
        }

        int count = 0;
        int ataque, defesa, dano;

        while(true){
            if(count % 2 == 0){
                ataque = lutador1.atacar();
                defesa = lutador2.defender();

                dano = ataque - defesa;

                if(ataque > defesa){
                    lutador2.danoSofrido(dano);
                }else{
                    lutador1.danoSofrido(dano);}
                
            }else{
                ataque = lutador2.atacar();
                defesa = lutador1.defender();
                
                dano = ataque - defesa;

                if(ataque > defesa){
                    lutador1.danoSofrido(dano);
                }else{
                    lutador2.danoSofrido(dano);
                }

                dano = ataque - defesa;
            }

            if(lutador1.getLife() <= 0  || lutador2.getLife() <= 0 ){
                break;
            }
            
            count ++;

        }

        if (lutador1.getLife() <= 0 ){
            System.out.println("O JOGO ACABOU! O " + lutador1.getNome() + "MORREU!");
        }else{
            System.out.println("O JOGO ACABOU! O " + lutador2.getNome() + "MORREU!");
        }
    }
    
}
