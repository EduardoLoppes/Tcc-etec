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
import model.veiculoModel;
import view.CadastroVeiculo;
import view.Veiculo;

/**
 *
 * @author Aluno
 */
public class veiculoController {

    public void abrirVeiculo(JFrame ViewAtual) {
        Veiculo veiculo = new Veiculo();
        veiculo.setVisible(true);
        ViewAtual.dispose();
    }
    
    public void abrirTelaVeiculo() throws ParseException{
        Veiculo veiculo = new Veiculo();
        veiculo.setVisible(true);
    }
    
    public void abrirCadastroVeiculo() throws ParseException{
        CadastroVeiculo cadveiculo = new CadastroVeiculo();
        cadveiculo.setVisible(true);
    }

//    public void abrirCadastroVeiculo(JFrame ViewAtual) {
//        CadastroVeiculo cadveiculo = new CadastroVeiculo();
//        cadveiculo.setVisible(true);
//        ViewAtual.dispose();
//    }
    
    public void abrirCadastroVeiculo(veiculoModel veiculomodel) throws ParseException{
        CadastroVeiculo cadveiculo = new CadastroVeiculo();
        cadveiculo.setVisible(true);
    }

    public boolean gravarVeiculo(veiculoModel veiculomodel) {
        try {
            veiculoDao veiculoDAO = new veiculoDao();
            veiculoDAO.gravarVeiculo(veiculomodel);
            JOptionPane.showMessageDialog(null, "Gravado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro interno", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean inserirVeiculo(veiculoModel veiculomodel) {
        try {
            veiculoDao veiculoDAO = new veiculoDao();
            veiculoDAO.gravarVeiculo(veiculomodel);
            JOptionPane.showMessageDialog(null, "Inserido com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro interno", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public veiculoModel consultarVeiculo(int IdVeiculo) {
        try {
            veiculoDao veidao = new veiculoDao();
            return veidao.consultarVeiculo(IdVeiculo);
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro interno", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public List<veiculoModel> pesquisarVeiculo(String NomeVeiculo) {
        try {
            veiculoDao veidao = new veiculoDao();
            return veidao.pesquisarVeiculo(NomeVeiculo);
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro interno", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public boolean excluirVeiculo(int IdVeiculo) {
        try {
            veiculoDao veiculodao = new veiculoDao();
            veiculodao.excluirVeiculo(IdVeiculo);
            JOptionPane.showMessageDialog(null, "Excluído com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            return true;
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Erro interno", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
