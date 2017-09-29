package Clases.Cartas;

import Clases.Carta;
import Clases.Numero;
import Clases.Pinta;

public class Corazon extends Carta {
    public Corazon(Numero numero) {
        super.pinta = Pinta.CORAZON;
        super.numero = numero;
    }
}
