package dueloMonstros;
import java.util.Random;

public class Arena {
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
                System.out.println(lutador1.getNome() + " atacou com força: " + ataque);

                defesa = lutador2.defender();
                System.out.println(lutador2.getNome() + " defendeu com força: " + defesa);

                dano = Math.abs(ataque - defesa);

                if(ataque > defesa){

                    lutador2.danoSofrido(dano);
                    System.out.println(lutador2.getNome() + " sofreu dano de: " + dano);
                    System.out.println(lutador2.getNome() + " possui life: " + lutador2.getLife());
                    System.out.println();

                }else{

                    lutador1.danoSofrido(dano);
                    System.out.println(lutador1.getNome() + " sofreu dano de: " + dano);}
                    System.out.println(lutador1.getNome() + " possui life: " + lutador1.getLife());
                    System.out.println();
                
            }else{
                ataque = lutador2.atacar();
                System.out.println(lutador2.getNome() + " atacou com força: " + ataque);

                defesa = lutador1.defender();
                System.out.println(lutador1.getNome() + " defendeu com força: " + defesa);
                
                dano = Math.abs(ataque - defesa);

                if(ataque > defesa){
                    lutador1.danoSofrido(dano);
                    System.out.println(lutador1.getNome() + " sofreu dano de: " + dano);
                    System.out.println(lutador1.getNome() + " possui life: " + lutador1.getLife());
                    System.out.println();

                }else{
                    lutador2.danoSofrido(dano);
                    System.out.println(lutador2.getNome() + " sofreu dano de: " + dano);
                    System.out.println(lutador2.getNome() + " possui life: " + lutador2.getLife());
                    System.out.println();

                }

                dano = Math.abs(ataque - defesa);
            }

            if(lutador1.getLife() <= 0  || lutador2.getLife() <= 0 ){
                break;
            }
            
            count ++;
        }

        if (lutador1.getLife() <= 0 ){
            System.out.println("O JOGO ACABOU! " + lutador1.getNome() + " MORREU!");
        }else{
            System.out.println("O JOGO ACABOU! " + lutador2.getNome() + " MORREU!");
        }
    }
    
}
