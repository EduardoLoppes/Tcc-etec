/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.dbConnection;
import java.sql.*;
import model.produtoModel;

/**
 *
 * @author Aluno
 */
public class produtoDao {
    private Connection conexao;
    
    public produtoDao() throws SQLException, ClassNotFoundException {
        this.conexao = dbConnection.abrirConexaoComBancoDeDados();
    }
    public void cadastrarProduto(produtoModel produtomodel) throws SQLException {
        if (produtomodel.getIdProduto()== 0) {
            inserirproduto(produtomodel);
        } else {
            atualizarproduto(produtomodel);
        }
    }
     private void inserirproduto(produtoModel produtomodel) throws SQLException {
        String sql = "insert into produto values(default, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = null;
        ResultSet rs = null;      
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, produtomodel.getNomeDoProduto());
            stmt.setString(2, produtomodel.getCategoriaDoProduto());
            stmt.setString(3, produtomodel.getFabricanteDoProduto());
            stmt.setString(4, produtomodel.getCodigoDeBarras());
            stmt.setInt(5, produtomodel.getIdProduto());
            stmt.setInt(6, produtomodel.getQuantidadeDoProduto());
            stmt.setDouble(7, produtomodel.getValorTotalDoProduto());
            stmt.execute();
        } catch (SQLException ex) {

            throw new SQLException(ex + "Erro ao inserir produto");
        } finally {
            dbConnection.encerrarConexao(conexao, stmt, rs);
        }
    }
    private void atualizarproduto(produtoModel produtomodel) throws SQLException {
        String sql = "update produto set nomeDoProduto = ?, categoriaDoProduto = ?, fabricanteDoProduto = ?, codigoDeBarras = ?, quantidadeDoProduto = ?, valorTotalDoProduto = ? where idProduto = ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, produtomodel.getNomeDoProduto());
            stmt.setString(2, produtomodel.getCategoriaDoProduto());
            stmt.setString(3, produtomodel.getFabricanteDoProduto());
            stmt.setString(4, produtomodel.getCodigoDeBarras());
            stmt.setInt(5, produtomodel.getQuantidadeDoProduto());
            stmt.setDouble(6, produtomodel.getValorTotalDoProduto());
            stmt.setInt(7, produtomodel.getIdProduto());
            stmt.execute();
        } catch (SQLException ex) {
            throw new SQLException("Erro ao atualizar produto");
        } finally {
            dbConnection.encerrarConexao(conexao, stmt, rs);
        }

    }
     public void gravarProduto(produtoModel produtomodel) throws SQLException {
        if (produtomodel.getIdProduto()== 0) {
           inserirproduto(produtomodel);
        } else {
            atualizarproduto(produtomodel);
        }
    }
}
