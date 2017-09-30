package clases.cartas;

import clases.Carta;
import clases.Numero;
import clases.Pinta;

public class Espada extends Carta {
    public Espada(Numero numero){
        super(Pinta.ESPADA, numero);
        //super.pinta = Pinta.ESPADA;
        //super.numero = numero;
    }
}
