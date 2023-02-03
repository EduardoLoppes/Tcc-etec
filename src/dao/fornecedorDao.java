/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import connection.dbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.fornecedorModel;
import model.produtoModel;
import model.usuarioModel;

/**
 *
 * @author Aluno
 */
public class fornecedorDao {

    private Connection conexao;

    public fornecedorDao() throws SQLException, ClassNotFoundException {
        this.conexao = dbConnection.abrirConexaoComBancoDeDados();
    }

    public void cadastrarFornecedor(fornecedorModel fornecedormodel) throws SQLException {
        if (fornecedormodel.getIdFornecedor() == 0) {
            inserirfornecedor(fornecedormodel);
        } else {
            atualizarfornecedor(fornecedormodel);
        }
    }

    private void inserirfornecedor(fornecedorModel fornecedormodel) throws SQLException {
        String sql = "insert into fornecedor values(default, ?, ?, ?)";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, fornecedormodel.getNomeFornecedor());
            stmt.setString(2, fornecedormodel.getCnpjFornecedor());
            stmt.setString(3, fornecedormodel.getTelefoneFornecedor());
            stmt.execute();
        } catch (SQLException ex) {

            throw new SQLException(ex + "Erro ao inserir fornecedor");
        } finally {
            dbConnection.encerrarConexao(conexao, stmt, rs);
        }
    }

    private void atualizarfornecedor(fornecedorModel fornecedormodel) throws SQLException {
        String sql = "update fornecedor set nomeFornecedor = ?, cnpjFornecedor = ?, telefoneFornecedor = ? where idFornecedor = ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, fornecedormodel.getNomeFornecedor());
            stmt.setString(2, fornecedormodel.getCnpjFornecedor());
            stmt.setString(3, fornecedormodel.getTelefoneFornecedor());
            stmt.setInt(4, fornecedormodel.getIdFornecedor());
            stmt.execute();
        } catch (SQLException ex) {
            throw new SQLException("Erro ao atualizar fornecedor");
        } finally {
            dbConnection.encerrarConexao(conexao, stmt, rs);
        }

    }

    public fornecedorModel consultarFornecedor(int Id_Fornecedor) throws SQLException {
        String sql = "select * from fornecedor where idFornecedor = ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        fornecedorModel fornecedormodel = null;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, Id_Fornecedor);
            rs = stmt.executeQuery();
            while (rs.next()) {
                fornecedormodel = new fornecedorModel();
                fornecedormodel.setIdFornecedor(rs.getInt("idFornecedor"));
                fornecedormodel.setNomeFornecedor(rs.getString("nomeFornecedor"));
                fornecedormodel.setCnpjFornecedor(rs.getString("cnpjFornecedor"));
                fornecedormodel.setTelefoneFornecedor(rs.getString("telefoneFornecedor"));
            }
        } catch (SQLException ex) {
            throw new SQLException("Erro ao consultar fornecedor");
        } finally {
            dbConnection.encerrarConexao(conexao, stmt, rs);
        }
        return fornecedormodel;
    }

    public List<fornecedorModel> pesquisarFornecedor(String NomeFornecedor) throws SQLException {
        String sql = "select * from fornecedor where nomeFornecedor ilike ? order by idFornecedor";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<fornecedorModel> listaFornecedor = null;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, "%" + NomeFornecedor + "%");
            rs = stmt.executeQuery();
            listaFornecedor = new ArrayList<>();
            while (rs.next()) {
                fornecedorModel fornecedormodel = new fornecedorModel();
                fornecedormodel.setIdFornecedor(rs.getInt("idFornecedor"));
                fornecedormodel.setNomeFornecedor(rs.getString("nomeFornecedor"));
                fornecedormodel.setCnpjFornecedor(rs.getString("cnpjFornecedor"));
                fornecedormodel.setTelefoneFornecedor(rs.getString("telefoneFornecedor"));
                listaFornecedor.add(fornecedormodel);
            }
        } catch (SQLException ex) {
            throw new SQLException("Erro ao pesquisar fornecedor");
        } finally {
            dbConnection.encerrarConexao(conexao, stmt, rs);
        }
        return listaFornecedor;
    }

    public void gravarFornecedor(fornecedorModel fornecedormodel) throws SQLException {
        if (fornecedormodel.getIdFornecedor() == 0) {
            inserirfornecedor(fornecedormodel);
        } else {
            atualizarfornecedor(fornecedormodel);
        }
    }

    public void excluirFornecedor(int IdFornecedor) throws SQLException {
        String sql = "delete from fornecedor where idFornecedor = ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, IdFornecedor);
            stmt.execute();
        } catch (SQLException ex) {
            throw new SQLException("Erro ao excluir fornecedor");
        } finally {
            dbConnection.encerrarConexao(conexao, stmt, rs);
        }
    }
}
