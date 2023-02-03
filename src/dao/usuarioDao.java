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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.usuarioModel;

/**
 *
 * @author Aluno
 */
public class usuarioDao {

    private Connection conexao;

    public usuarioDao() throws SQLException, ClassNotFoundException {
        this.conexao = dbConnection.abrirConexaoComBancoDeDados();
    }

    public void cadastrarUsuario(usuarioModel usuariomodel) throws SQLException {
        if (usuariomodel.getIdUsuario() == 0) {
            inserirusuario(usuariomodel);
        } else {
            atualizarusuario(usuariomodel);
        }
    }

    private void inserirusuario(usuarioModel usuariomodel) throws SQLException {
        String sql = "insert into usuario values(default, ?, ?, ?, ?)";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, usuariomodel.getNomeUsuario());
            stmt.setString(2, usuariomodel.getCargoUsuario());
            stmt.setString(3, usuariomodel.getEmailUsuario());
            stmt.setString(4, usuariomodel.getSenhaUsuario());
            stmt.execute();
        } catch (SQLException ex) {
            throw new SQLException(ex + "Erro ao inserir usuário");
        } finally {
            dbConnection.encerrarConexao(conexao, stmt, rs);
        }
    }

    private void atualizarusuario(usuarioModel usuariomodel) throws SQLException {
        String sql = "update usuario set nome = ?, cargo = ?, email = ?, senha = ? where idUsuario = ?";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            stmt = conexao.prepareStatement(sql);
            stmt.setString(1, usuariomodel.getNomeUsuario());
            stmt.setString(2, usuariomodel.getCargoUsuario());
            stmt.setString(3, usuariomodel.getEmailUsuario());
            stmt.setString(4, usuariomodel.getSenhaUsuario());
            stmt.setInt(5, usuariomodel.getIdUsuario());
            stmt.execute();
        } catch (SQLException ex) {
            throw new SQLException("Erro ao atualizar usuario");
        } finally {
            dbConnection.encerrarConexao(conexao, stmt, rs);
        }

    }

    public void gravarUsuario(usuarioModel usuariomodel) throws SQLException {
        if (usuariomodel.getIdUsuario() == 0) {
            inserirusuario(usuariomodel);
        } else {
            atualizarusuario(usuariomodel);
        }
    }
    
    public boolean validarUsuario(String usuario, String senha) throws ClassNotFoundException, SQLException{
        Connection con = dbConnection.abrirConexaoComBancoDeDados();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean validar = false;
        
        try{
            stmt = con.prepareStatement("SELECT * FROM usuario where nome = ? and senha = ?");
            stmt.setString(1, usuario);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            
            if(rs.next()){
                validar = true;
            }
        } catch(SQLException ex){
            Logger.getLogger(usuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            dbConnection.encerrarConexao(con, stmt, rs);
        }
        return validar;
    }

}
