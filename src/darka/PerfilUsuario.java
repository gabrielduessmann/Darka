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
public class PerfilUsuario {
    public static int vida = 550;
    public static int dano = 0; 
    public static int defesa = 0;
    public static int qtdeBomba = 0;
    public static int qtdePot = 0;
    /*atributo para saber aonde em que tela o usuário está, para quando ele for pro inventário, 
    /o software saber para que tela terá que voltar*/
    public static int checkpoint = 0;
    
    /*variável para saber quando se item já foi pego ou não
    quando o usuário pegar o item, ir para o inventário e voltar para a tela, 
    os itens não serão mostrados novamente */
    //telaHistoria7
    public static boolean bomba1 = true;
    public static boolean bomba2 = true;
    public static boolean bomba3 = true;
    
    //telaHistoria5
    public static boolean espada = true;
    public static boolean pot1 = true;
    public static boolean pot2 = true;
    public static boolean pot3 = true;
    
}
