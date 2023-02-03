/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.produtoDao;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.produtoModel;

/**
 *
 * @author Aluno
 */
public class produtoController {
    public boolean gravarProduto(produtoModel produtomodel) {
        try {
            produtoDao produtoDAO = new produtoDao();
            produtoDAO.gravarProduto(produtomodel);
            JOptionPane.showMessageDialog(null, "Gravado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro interno", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
     public boolean inserirProduto(produtoModel produtoModel) {
        try {
            produtoDao produtoDAO = new produtoDao();
            produtoDAO.gravarProduto(produtoModel);
            JOptionPane.showMessageDialog(null, "Inserido com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro interno", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
