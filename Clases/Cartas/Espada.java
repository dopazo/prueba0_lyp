package Clases.Cartas;

import Clases.Carta;
import Clases.Numero;
import Clases.Pinta;

public class Espada extends Carta {
    public Espada(Numero numero){
        super.pinta = Pinta.ESPADA;
        super.numero = numero;
    }
}
