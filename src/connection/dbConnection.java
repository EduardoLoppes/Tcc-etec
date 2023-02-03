/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.*;

/**
 *
 * @author Guilherme
 */
public class dbConnection {
    public static Connection abrirConexaoComBancoDeDados() throws ClassNotFoundException, SQLException {
        try {
            Class.forName("org.postgresql.Driver");
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/usuario", "postgres", "123");
        } catch (SQLException ex) {
            throw new SQLException("Erro de conexão com o banco de dados");
        } catch (ClassNotFoundException ex) {
            throw new ClassNotFoundException("Driver do banco de dados não encontrado");
        }
    }

    public static void encerrarConexaoComBancoDeDados(Connection con, PreparedStatement stmt, ResultSet rs) throws SQLException {
        try {
            if (con != null) {
                con.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            throw new SQLException("Erro ao encerrar conexão com o banco de dados");
        }
    }
    public static void encerrarConexao(Connection con, PreparedStatement stmt) throws SQLException {
        encerrarConexaoComBancoDeDados(con, stmt, null);
    }

    public static void encerrarConexao(Connection con, PreparedStatement stmt, ResultSet rs) throws SQLException {
        encerrarConexaoComBancoDeDados(con, stmt, rs);
    }
}
