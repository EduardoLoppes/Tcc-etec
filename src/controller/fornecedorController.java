/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.fornecedorDao;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.fornecedorModel;
import view.CadastroFornecedor;
import view.Fornecedor;

/**
 *
 * @author Aluno
 */
public class fornecedorController {

    public void abrirFornecedor(JFrame ViewAtual) {
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setVisible(true);
        ViewAtual.dispose();
    }

    public void abrirTelaFornecedor() throws ParseException {
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setVisible(true);
    }
    
    public void abrirCadastroFornecedor() throws ParseException{
        CadastroFornecedor cadfornecedor = new CadastroFornecedor();
        cadfornecedor.setVisible(true);
    }
    
//    public void abrirCadastroFornecedor(JFrame ViewAtual) {
//        CadastroFornecedor cadfornecedor = new CadastroFornecedor();
//        cadfornecedor.setVisible(true);
//        ViewAtual.dispose();
//    }
    
    public void abrirCadastroFornecedor(fornecedorModel fornecedormodel) throws ParseException{
        CadastroFornecedor fornecedor = new CadastroFornecedor(fornecedormodel);
        fornecedor.setVisible(true);
    }

    public boolean gravarFornecedor(fornecedorModel fornecedormodel) {
        try {
            fornecedorDao fornecedorDAO = new fornecedorDao();
            fornecedorDAO.gravarFornecedor(fornecedormodel);
            JOptionPane.showMessageDialog(null, "Gravado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro interno", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean inserirFornecedor(fornecedorModel fornecedormodel) {
        try {
            fornecedorDao fornecedorDAO = new fornecedorDao();
            fornecedorDAO.gravarFornecedor(fornecedormodel);
            JOptionPane.showMessageDialog(null, "Inserido com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro interno", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public fornecedorModel consultarFornecedor(int IdFornecedor) {
        try {
            fornecedorDao fornecedordao = new fornecedorDao();
            return fornecedordao.consultarFornecedor(IdFornecedor);
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro interno", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public List<fornecedorModel> pesquisarFornecedor(String NomeFornecedor) {
        try {
            fornecedorDao fornecedordao = new fornecedorDao();
            return fornecedordao.pesquisarFornecedor(NomeFornecedor);
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro interno", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public boolean excluirFornecedor(int IdFornecedor) {
        try {
            fornecedorDao fornecedordao = new fornecedorDao();
            fornecedordao.excluirFornecedor(IdFornecedor);
            JOptionPane.showMessageDialog(null, "Excluído com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro interno", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
