/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.usuarioDao;
import java.sql.SQLException;
import java.text.ParseException;
import javax.swing.JOptionPane;
import model.usuarioModel;
import view.CadastroUsuario;

/**
 *
 * @author Aluno
 */
public class usuarioController {
        
    public void abrirCadastroUsuario() throws ParseException{
        CadastroUsuario cadastroUsuario = new CadastroUsuario();
        cadastroUsuario.setVisible(true);
    }
    
    public boolean gravarUsuario(usuarioModel usuariomodel) {
        try {
            usuarioDao usuarioDAO = new usuarioDao();
            usuarioDAO.gravarUsuario(usuariomodel);
            JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro interno", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
     public boolean inserirUsuario(usuarioModel usuariomodel) {
        try {
            usuarioDao usuarioDAO = new usuarioDao();
            usuarioDAO.gravarUsuario(usuariomodel);
            JOptionPane.showMessageDialog(null, "Inserido com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro interno", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}

