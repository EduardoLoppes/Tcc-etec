/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.text.ParseException;
import javax.swing.JFrame;
import view.Home;
import view.Login;

/**
 *
 * @author Guilherme
 */
public class loginController {
    
    public void abrirLogin(JFrame ViewAtual){
        Login login = new Login();
        login.setVisible(true);
        ViewAtual.dispose();
    }
    
    public void abrirHome(JFrame ViewAtual){
        Home home = new Home();
        home.setVisible(true);
        ViewAtual.dispose();
    }
    
    public void abrirTelaHome() throws ParseException{
        Home home = new Home();
        home.setVisible(true);
    }
}
