package Clases.Cartas;

import Clases.Carta;
import Clases.Numero;
import Clases.Pinta;

public class Rombo extends Carta {
    public Rombo(Numero numero) {
        super.pinta = Pinta.ROMBO;
        super.numero = numero;
    }
}
