/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civitas;

import java.util.ArrayList;

/**
 *
 * @author jlric
 */
public class SorpresaUrbanizar extends Sorpresa
{
    SorpresaUrbanizar(String texto ,  int valor , MazoSorpresa mazo){
 
        super(texto,valor,mazo);
    }
    
    @Override
    public void aplicarAJugador(int actual, ArrayList<Jugador> todos)
    {
        informe(actual, todos);
    }
    
}
