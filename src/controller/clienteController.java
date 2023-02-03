/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.clienteDao;
import dao.fornecedorDao;
import dao.veiculoDao;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.clienteModel;
import model.fornecedorModel;
import view.CadastroCliente;
import view.Cliente;

/**
 *
 * @author Guilherme
 */
public class clienteController {

    public void abrirCliente(JFrame ViewAtual){
        Cliente cliente = new Cliente();
        cliente.setVisible(true);
        ViewAtual.dispose();
    }
    
    public void abrirTelaCliente() throws ParseException{
        Cliente cliente = new Cliente();
        cliente.setVisible(true);
    }
    
    public void abrirCadastroCliente() throws ParseException{
        CadastroCliente cadcliente = new CadastroCliente();
        cadcliente.setVisible(true);
    }
    
//    public void abrirCadastroCliente(JFrame viewAtual){
//        CadastroCliente cadcliente = new CadastroCliente();
//        cadcliente.setVisible(true);
//        viewAtual.dispose();
//    }
    
    public void abrirCadastroCliente(clienteModel clientemodel) throws ParseException{
        CadastroCliente cadcliente = new CadastroCliente(clientemodel);
        cadcliente.setVisible(true);
    }
    
    public boolean gravarCliente(clienteModel clientemodel) {
        try {
            clienteDao clienteDAO = new clienteDao();
            clienteDAO.gravarCliente(clientemodel);
            JOptionPane.showMessageDialog(null, "Gravado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro interno", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean inserirCliente(clienteModel clientemodel) {
        try {
            clienteDao clienteDAO = new clienteDao();
            clienteDAO.gravarCliente(clientemodel);
            JOptionPane.showMessageDialog(null, "Inserido com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro interno", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    public clienteModel consultarCliente(int IdCliente) {
        try {
            clienteDao clidao = new clienteDao();
            return clidao.consultarCliente(IdCliente);
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro interno", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public List<clienteModel> pesquisarCliente(String NomeCliente) {
        try {
            clienteDao clidao = new clienteDao();
            return clidao.pesquisarCliente(NomeCliente);
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro interno", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public boolean excluirCliente(int IdCliente) {
        try {
            clienteDao clientedao = new clienteDao();
            clientedao.excluirCliente(IdCliente);
            JOptionPane.showMessageDialog(null, "Excluído com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro interno", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
