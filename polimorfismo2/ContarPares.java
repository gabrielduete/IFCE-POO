package polimorfismo2;

public class ContarPares extends Contador {
    @Override
    public void contar(){
        for(int i = 0; i <= 100; i++){
            if ( i % 2 != 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
