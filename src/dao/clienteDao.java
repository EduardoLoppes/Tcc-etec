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
import model.clienteModel;
import model.fornecedorModel;

/**
 *
 * @author Guilherme
 */
public class clienteDao {

    private Connection conexao;

    public clienteDao() throws SQLException, ClassNotFoundException {
        this.conexao = dbConnection.abrirConexaoComBancoDeDados();
    }

    public void cadastrarCliente(clienteModel clientemodel) throws SQLException {
        if (clientemodel.getIdCliente() == 0) {
            inserircliente(clientemodel);
        } else {
            atualizarcliente(clientemodel);
        }
    }

    private void inserircliente(clienteModel clientemodel) throws SQLException {
        String sql = "insert into cliente values(default, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, clientemodel.getNomeCliente());
            stmt.setString(2, clientemodel.getDataDeNascimentoCliente());
            stmt.setString(3, clientemodel.getCpfCliente());
            stmt.setString(4, clientemodel.getCepCliente());
            stmt.setString(5, clientemodel.getEnderecoCliente());
            stmt.setString(6, clientemodel.getCidadeCliente());
            stmt.setString(7, clientemodel.getBairroCliente());
            stmt.setString(8, clientemodel.getEstadoCliente());
            stmt.setString(9, clientemodel.getCelularCliente());
            stmt.setString(10, clientemodel.getEmailCliente());
            stmt.execute();
        } catch (SQLException ex) {

            throw new SQLException(ex + "Erro ao inserir cliente");
        } finally {
            dbConnection.encerrarConexao(conexao, stmt, rs);
        }
    }

    private void atualizarcliente(clienteModel clientemodel) throws SQLException {
        String sql = "update cliente set nomeCliente= ?, dataDeNascimentoCliente= ?, cpfCliente= ?, cepCliente= ?, enderecoCliente= ?, cidadeCliente = ?, bairroCliente = ?, estadoCliente = ?, celularCliente = ?, emailCliente = ?   where idCliente= ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, clientemodel.getNomeCliente());
            stmt.setString(2, clientemodel.getDataDeNascimentoCliente());
            stmt.setString(3, clientemodel.getCpfCliente());
            stmt.setString(4, clientemodel.getCepCliente());
            stmt.setString(5, clientemodel.getEnderecoCliente());
            stmt.setString(6, clientemodel.getCidadeCliente());
            stmt.setString(7, clientemodel.getBairroCliente());
            stmt.setString(8, clientemodel.getEstadoCliente());
            stmt.setString(9, clientemodel.getCelularCliente());
            stmt.setString(10, clientemodel.getEmailCliente());
            stmt.setInt(11, clientemodel.getIdCliente());
            stmt.execute();
        } catch (SQLException ex) {
            throw new SQLException("Erro ao atualizar cliente");
        } finally {
            dbConnection.encerrarConexao(conexao, stmt, rs);
        }

    }
    
    public clienteModel consultarCliente(int Id_Cliente) throws SQLException {
        String sql = "select * from cliente where idCliente= ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        clienteModel clientemodel = null;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, Id_Cliente);
            rs = stmt.executeQuery();
            while (rs.next()) {
                clientemodel = new clienteModel();
                clientemodel.setIdCliente(rs.getInt("idCliente"));
                clientemodel.setNomeCliente(rs.getString("nomeCliente"));
                clientemodel.setDataDeNascimentoCliente(rs.getString("dataDeNascimentoCliente"));
                clientemodel.setCpfCliente(rs.getString("cpfCliente"));
                clientemodel.setCepCliente(rs.getString("cepCliente"));
                clientemodel.setEnderecoCliente(rs.getString("enderecoCliente"));
                clientemodel.setCidadeCliente(rs.getString("cidadeCliente"));
                clientemodel.setBairroCliente(rs.getString("bairroCliente"));
                clientemodel.setEstadoCliente(rs.getString("estadoCliente"));
                clientemodel.setCelularCliente(rs.getString("celularCliente"));
                clientemodel.setEmailCliente(rs.getString("emailCliente"));
            }
        } catch (SQLException ex) {
            throw new SQLException("Erro ao consultar cliente");
        } finally {
            dbConnection.encerrarConexao(conexao, stmt, rs);
        }
        return clientemodel;
    }
    
    private void inserirCliente(clienteModel clientemodel) throws SQLException {
        String sql = "insert into cliente values(default, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, clientemodel.getNomeCliente());
            stmt.setString(2, clientemodel.getDataDeNascimentoCliente());
            stmt.setString(3, clientemodel.getCpfCliente());
            stmt.setString(4, clientemodel.getCepCliente());
            stmt.setString(5, clientemodel.getEnderecoCliente());
            stmt.setString(6, clientemodel.getCidadeCliente());
            stmt.setString(7, clientemodel.getBairroCliente());
            stmt.setString(8, clientemodel.getEstadoCliente());
            stmt.setString(9, clientemodel.getCelularCliente());
            stmt.setString(10, clientemodel.getEmailCliente());
            stmt.execute();
        } catch (SQLException ex) {
            throw new SQLException(ex + "Erro ao inserir cliente");
        } finally {
            dbConnection.encerrarConexao(conexao, stmt, rs);
        }
    }
    
    public List<clienteModel> pesquisarCliente(String NomeCliente) throws SQLException {
        String sql = "select * from cliente where nomeCliente ilike ? order by idCliente";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<clienteModel> listaCliente = null;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, "%" + NomeCliente + "%");
            rs = stmt.executeQuery();
            listaCliente = new ArrayList<>();
            while (rs.next()) {
                clienteModel clientemodel = new clienteModel();
                clientemodel.setIdCliente(rs.getInt("idCliente"));
                clientemodel.setNomeCliente(rs.getString("nomeCliente"));
                clientemodel.setDataDeNascimentoCliente(rs.getString("dataDeNascimentoCliente"));
                clientemodel.setCpfCliente(rs.getString("cpfCliente"));
                clientemodel.setCepCliente(rs.getString("cepCliente"));
                clientemodel.setEnderecoCliente(rs.getString("enderecoCliente"));
                clientemodel.setCidadeCliente(rs.getString("cidadeCliente"));
                clientemodel.setBairroCliente(rs.getString("bairroCliente"));
                clientemodel.setEstadoCliente(rs.getString("estadoCliente"));
                clientemodel.setCelularCliente(rs.getString("celularCliente"));
                clientemodel.setEmailCliente(rs.getString("emailCliente"));
                listaCliente.add(clientemodel);
            }
        } catch (SQLException ex) {
            throw new SQLException("Erro ao pesquisar cliente");
        } finally {
            dbConnection.encerrarConexao(conexao, stmt, rs);
        }
        return listaCliente;
    }
    
    public void gravarCliente(clienteModel clientemodel) throws SQLException {
        if (clientemodel.getIdCliente() == 0) {
            inserirCliente(clientemodel);
        } else {
            atualizarcliente(clientemodel);
        }
    }
    
    public void excluirCliente(int IdCliente) throws SQLException {
        String sql = "delete from cliente where idCliente= ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, IdCliente);
            stmt.execute();
        } catch (SQLException ex) {
            throw new SQLException("Erro ao excluir cliente");
        } finally {
            dbConnection.encerrarConexao(conexao, stmt, rs);
        }
    }
}
