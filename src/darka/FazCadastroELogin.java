/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package darka;

import javax.swing.JOptionPane;

/**
 *
 * @author gabriel_duessmann
 */
public class FazCadastroELogin {
    public static boolean logaUsuario(String usuario, String senha) {
        boolean verificador = false;
        if (!(usuario.equals("") || senha.equals(""))) {
            if (usuario.equals(ArmazenaCadastroUsuario.usuario) && senha.equals(ArmazenaCadastroUsuario.senha)) {
                verificador = true;
            } else {
                JOptionPane.showMessageDialog(null, "Algum(ns) campo(s) não foi(ram) preenchido(s) corretamente.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Algum(ns) campo(s) não foi(ram) preenchido(s).");
        }
        return verificador;
    }
      
    public static boolean cadastraUsuario(String usuario, String senha, String repeteSenha) {
        boolean verificador = false;
        if (!(usuario.equals("") || senha.equals("") || repeteSenha.equals(""))) {
            if (senha.equals(repeteSenha)) {                
                ArmazenaCadastroUsuario.usuario = usuario;
                ArmazenaCadastroUsuario.senha = senha;
                ArmazenaCadastroUsuario.repeteSenha = repeteSenha;
                JOptionPane.showMessageDialog(null, "Cadastro do usuário "+ArmazenaCadastroUsuario.usuario+" realizado com sucesso."); 
                verificador = true;
    } else {
                JOptionPane.showMessageDialog(null, "As duas senhas não foram preenchidas corretamente.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Algum(ns) campo(s) não foi(ram) preenchido(s).");
        }
    return verificador;    
}
    
    public static boolean cadastraPersonagem(String nome, String sexo) {
        boolean verificador = false;
        if (!(nome.equals("") || sexo.equals(""))) {
            ArmazenaCadastroPersonagem.nome = nome;
            ArmazenaCadastroPersonagem.sexo = sexo;
            JOptionPane.showMessageDialog(null, "Cadastro de "+nome+" realizado com sucesso.");
            verificador = true;
        } else {
            JOptionPane.showMessageDialog(null, "Algum(ns) campo(s) não foi(ram) preenchido(s).");
        }
        return verificador;
    }
}
