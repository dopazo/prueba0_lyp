package Clases.Cartas;

import Clases.Carta;
import Clases.Numero;
import Clases.Pinta;

public class Trebol extends Carta {
    public Trebol(Numero numero) {
        super.pinta = Pinta.TREBOL;
        super.numero = numero;
    }
}
