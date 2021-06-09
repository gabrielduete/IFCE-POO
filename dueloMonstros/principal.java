package dueloMonstros;

public class principal {
    public static void main(String[] args) {
        
        Monstro m1 = new Monstro();

        m1.setNome("Darius");
        m1.setLife(30);
        
        Monstro m2 = new Monstro();
        m2.setNome("Sett");
        m2.setLife(30);

        Arena arena = new Arena();

        arena.startFight(m1, m2);
    }
}
