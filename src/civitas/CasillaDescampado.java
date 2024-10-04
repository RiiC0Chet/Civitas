/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package civitas;

/**
 *
 * @author jlric
 */
public class CasillaDescampado extends CasillaCalle
{
   CasillaDescampado(String n, float precio_Compra, float precio_Edificar, float precio_Base_alquiler)
   {
       super(n, precio_Compra, precio_Edificar, precio_Base_alquiler);
   }
   
   @Override
    boolean construirCasa(Jugador jugador)
    {
        return false;
    }
    
    @Override
    boolean construirHotel(Jugador jugador)
    {
        return false;
    }
   
    @Override
    public String toString()
    {
        return super.toString() + (". Ademas es una casilla descampado");
    }
    
}
