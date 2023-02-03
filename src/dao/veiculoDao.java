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
import model.veiculoModel;

/**
 *
 * @author Aluno
 */
public class veiculoDao {
    
    private Connection conexao;
    
    public veiculoDao() throws SQLException, ClassNotFoundException {
        this.conexao = dbConnection.abrirConexaoComBancoDeDados();
    }
    public void cadastrarveiculo(veiculoModel veiculomodel) throws SQLException {
        if (veiculomodel.getIdVeiculo()== 0) {
            inserirveiculo(veiculomodel);
        } else {
            atualizarveiculo(veiculomodel);
        }
    }
    private void inserirveiculo(veiculoModel veiculomodel) throws SQLException {
        String sql = "insert into veiculo values(default, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = null;
        ResultSet rs = null;      
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, veiculomodel.getModelo());
            stmt.setString(2, veiculomodel.getMarca());
            stmt.setString(3, veiculomodel.getCor());
            stmt.setString(4, veiculomodel.getCidadeVeiculo());
            stmt.setString(5, veiculomodel.getPlaca());
            stmt.setString(6, veiculomodel.getAnoDeFabricacao());
            stmt.setString(7, veiculomodel.getChassi());
            stmt.setString(8, veiculomodel.getRenavam());
            stmt.setString(9, veiculomodel.getNumeroDoMotor());
            stmt.setString(10, veiculomodel.getQuilometragemVeiculo());
            stmt.setString(11, veiculomodel.getTipoCombustivel());
            stmt.execute();
        } catch (SQLException ex) {

            throw new SQLException(ex + "Erro ao inserir veiculo");
        } finally {
            dbConnection.encerrarConexao(conexao, stmt, rs);
        }
    }
    
    private void atualizarveiculo(veiculoModel veiculomodel) throws SQLException {
        String sql = "update veiculo set modelo = ?, marca = ?, cor = ?, cidadeVeiculo = ?, placa = ?, anoDeFabricacao = ?, chassi = ?, renavam = ?, numeroDoMotor = ?, quilometragemVeiculo = ?, tipoCombustivel = ? where idVeiculo = ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, veiculomodel.getModelo());
            stmt.setString(2, veiculomodel.getMarca());
            stmt.setString(3, veiculomodel.getCor());
            stmt.setString(4, veiculomodel.getCidadeVeiculo());
            stmt.setString(5, veiculomodel.getPlaca());
            stmt.setString(6, veiculomodel.getAnoDeFabricacao());
            stmt.setString(7, veiculomodel.getChassi());
            stmt.setString(8, veiculomodel.getRenavam());
            stmt.setString(9, veiculomodel.getNumeroDoMotor());
            stmt.setString(10, veiculomodel.getQuilometragemVeiculo());
            stmt.setString(11, veiculomodel.getTipoCombustivel());
            stmt.setInt(12, veiculomodel.getIdVeiculo());
            stmt.execute();
        } catch (SQLException ex) {
            throw new SQLException("Erro ao atualizar produto");
        } finally {
            dbConnection.encerrarConexao(conexao, stmt, rs);
        }
    }
    
    public veiculoModel consultarVeiculo(int Id_Veiculo) throws SQLException {
        String sql = "select * from veiculo where idVeiculo= ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        veiculoModel veiculomodel = null;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, Id_Veiculo);
            rs = stmt.executeQuery();
            while (rs.next()) {
                veiculomodel = new veiculoModel();
                veiculomodel.setIdVeiculo(rs.getInt("idVeiculo"));
                veiculomodel.setModelo(rs.getString("modelo"));
                veiculomodel.setMarca(rs.getString("marca"));
                veiculomodel.setCor(rs.getString("cor"));
                veiculomodel.setCidadeVeiculo(rs.getString("cidadeVeiculo"));
                veiculomodel.setPlaca(rs.getString("placa"));
                veiculomodel.setAnoDeFabricacao(rs.getString("anoDeFabricacao"));
                veiculomodel.setChassi(rs.getString("chassi"));
                veiculomodel.setRenavam(rs.getString("renavam"));
                veiculomodel.setNumeroDoMotor(rs.getString("numeroDoMotor"));
                veiculomodel.setQuilometragemVeiculo(rs.getString("quilometragemVeiculo"));
                veiculomodel.setTipoCombustivel(rs.getString("tipoCombustivel"));
            }
        } catch (SQLException ex) {
            throw new SQLException("Erro ao consultar veiculo");
        } finally {
            dbConnection.encerrarConexao(conexao, stmt, rs);
        }
        return veiculomodel;
    }
    
    private void inserirVeiculo(veiculoModel veiculomodel) throws SQLException {
        String sql = "insert into veiculo values(default, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, veiculomodel.getModelo());
            stmt.setString(2, veiculomodel.getMarca());
            stmt.setString(3, veiculomodel.getCor());
            stmt.setString(4, veiculomodel.getCidadeVeiculo());
            stmt.setString(5, veiculomodel.getPlaca());
            stmt.setString(6, veiculomodel.getAnoDeFabricacao());
            stmt.setString(7, veiculomodel.getChassi());
            stmt.setString(8, veiculomodel.getRenavam());
            stmt.setString(9, veiculomodel.getNumeroDoMotor());
            stmt.setString(10, veiculomodel.getQuilometragemVeiculo());
            stmt.setString(11, veiculomodel.getTipoCombustivel());
            stmt.execute();
        } catch (SQLException ex) {
            throw new SQLException(ex + "Erro ao inserir veiculo");
        } finally {
            dbConnection.encerrarConexao(conexao, stmt, rs);
        }
    }
    
    public List<veiculoModel> pesquisarVeiculo(String NomeVeiculo) throws SQLException {
        String sql = "select * from veiculo where marca ilike ? order by idVeiculo";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<veiculoModel> listaVeiculo = null;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, "%" + NomeVeiculo + "%");
            rs = stmt.executeQuery();
            listaVeiculo = new ArrayList<>();
            while (rs.next()) {
                veiculoModel veiculomodel = new veiculoModel();
                veiculomodel.setIdVeiculo(rs.getInt("idVeiculo"));
                veiculomodel.setModelo(rs.getString("modelo"));
                veiculomodel.setMarca(rs.getString("marca"));
                veiculomodel.setCor(rs.getString("cor"));
                veiculomodel.setCidadeVeiculo(rs.getString("cidadeVeiculo"));
                veiculomodel.setPlaca(rs.getString("placa"));
                veiculomodel.setAnoDeFabricacao(rs.getString("anoDeFabricacao"));
                veiculomodel.setChassi(rs.getString("chassi"));
                veiculomodel.setRenavam(rs.getString("renavam"));
                veiculomodel.setNumeroDoMotor(rs.getString("numeroDoMotor"));
                veiculomodel.setQuilometragemVeiculo(rs.getString("quilometragemVeiculo"));
                veiculomodel.setTipoCombustivel(rs.getString("tipoCombustivel"));
                listaVeiculo.add(veiculomodel);
            }
        } catch (SQLException ex) {
            throw new SQLException("Erro ao pesquisar cliente");
        } finally {
            dbConnection.encerrarConexao(conexao, stmt, rs);
        }
        return listaVeiculo;
    }
    
    public void gravarVeiculo(veiculoModel veiculomodel) throws SQLException {
        if (veiculomodel.getIdVeiculo()== 0) {
           inserirveiculo(veiculomodel);
        } else {
            atualizarveiculo(veiculomodel);
        }
    } 
    
    public void excluirVeiculo(int IdVeiculo) throws SQLException {
        String sql = "delete from veiculo where idVeiculo= ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setInt(1, IdVeiculo);
            stmt.execute();
        } catch (SQLException ex) {
            throw new SQLException("Erro ao excluir veiculo");
        } finally {
            dbConnection.encerrarConexao(conexao, stmt, rs);
        }
    }
}
