package com.company;

public class Gato {

    private static final int ENERGIA_FIJADA = 12;

    private int energia;

    public Gato(int energia) {
        this.energia = energia;
    }

    public void comer(Raton raton){
        energia = energia + energiaGanada(raton);
    }

    public int energiaGanada(Raton raton){
        return ENERGIA_FIJADA + raton.getPeso();
    }

    public void correr(Raton raton, int metros){
        if (meConvieneComerA(raton, metros)) {
            if (energia < 0){
             energia = energiaPerdida(raton, metros);
            }
            }
        }

    public int energiaPerdida(Raton raton, int metros){
        return energia - metros / 2;
    }

    public boolean meConvieneComerA(Raton raton, int metros){
        return energiaGanada(raton) > energiaPerdida(raton, metros);
            }

    public int calcularVelocidad(){
        return 5 + energia/10;
    }

    @Override
    public String toString() {
        return "La energia de Tom es " + energia;
    }
}
