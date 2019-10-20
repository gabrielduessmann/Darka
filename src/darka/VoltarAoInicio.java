/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darka;

/**
 *
 * @author gabriel_duessmann
 */
public class VoltarAoInicio {
    
    public static void reinicia() {
   
        PerfilUsuario.vida = 550;
        PerfilUsuario.dano = 0;
        PerfilUsuario.defesa = 0;
        PerfilUsuario.qtdeBomba = 0;
        PerfilUsuario.qtdePot = 0;
        PerfilUsuario.checkpoint = 0;
        PerfilUsuario.bomba1 = true;
        PerfilUsuario.bomba2 = true;
        PerfilUsuario.bomba3 = true;
        PerfilUsuario.espada = true;
        PerfilUsuario.pot1 = true;
        PerfilUsuario.pot2 = true;
        PerfilUsuario.pot3 = true; 
        
        PerfilInimigos.vidaEsqueleto =500;
        PerfilInimigos.vidaMeskim =1200;
        PerfilInimigos.vidaZabba =1000;
        PerfilInimigos.vidaBossForca =600;
        PerfilInimigos.vidaBossDefesa =15000;
        PerfilInimigos.contDefesas =0;
        
        
    }
    
    
}
