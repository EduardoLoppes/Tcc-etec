/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.clienteController;
import controller.fornecedorController;
import controller.loginController;
import controller.veiculoController;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.veiculoModel;

/**
 *
 * @author Guilherme
 */
public class Veiculo extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
    public Veiculo() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtVeiculo = new javax.swing.JLabel();
        btnAdicionarVeiculo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtPesquisarVeiculo = new javax.swing.JTextField();
        btnPesquisarFornecedor = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblVeiculo = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        txtHome6 = new javax.swing.JLabel();
        txtCliente6 = new javax.swing.JLabel();
        txtFornecedor6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtVeiculo6 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");
        jMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setExtendedState(6);
        setUndecorated(true);

        jPanel2.setBackground(new java.awt.Color(93, 96, 98));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Close_25px.png"))); // NOI18N
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        txtVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txtVeiculo.setForeground(new java.awt.Color(37, 45, 73));
        txtVeiculo.setText("Veículo");

        btnAdicionarVeiculo.setBackground(new java.awt.Color(255, 255, 255));
        btnAdicionarVeiculo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdicionarVeiculo.setForeground(new java.awt.Color(0, 0, 0));
        btnAdicionarVeiculo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_car_25px_1.png"))); // NOI18N
        btnAdicionarVeiculo.setText("Adicionar");
        btnAdicionarVeiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarVeiculoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(37, 45, 73));
        jLabel2.setText("Nome do Fornecedor:");

        txtPesquisarVeiculo.setBackground(new java.awt.Color(255, 255, 255));
        txtPesquisarVeiculo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPesquisarVeiculo.setForeground(new java.awt.Color(0, 0, 0));
        txtPesquisarVeiculo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        btnPesquisarFornecedor.setBackground(new java.awt.Color(255, 255, 255));
        btnPesquisarFornecedor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_search_25px.png"))); // NOI18N
        btnPesquisarFornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarFornecedorActionPerformed(evt);
            }
        });

        tblVeiculo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador do Veiculo", "Modelo", "Marca", "Cor", "Cidade de Veículo", "Placa", "Ano de Fabricação", "Chassi", "Renavam", "Número do Motor", "Quilometragem ", "Combustível"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVeiculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVeiculoMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblVeiculo);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisarVeiculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPesquisarFornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAdicionarVeiculo)
                        .addGap(2, 2, 2))
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE)
                    .addComponent(txtVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(txtVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtPesquisarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAdicionarVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPesquisarFornecedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 391, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));

        txtHome6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_home_35px.png"))); // NOI18N
        txtHome6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtHome6MouseClicked(evt);
            }
        });

        txtCliente6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_user_35px.png"))); // NOI18N
        txtCliente6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        txtCliente6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCliente6MouseClicked(evt);
            }
        });

        txtFornecedor6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_truck_35px_1.png"))); // NOI18N
        txtFornecedor6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtFornecedor6MouseClicked(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_Menu_35px_1.png"))); // NOI18N

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_settings_35px.png"))); // NOI18N

        txtVeiculo6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8_car_35px.png"))); // NOI18N
        txtVeiculo6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtVeiculo6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFornecedor6)
                                    .addComponent(txtCliente6)
                                    .addComponent(txtHome6)
                                    .addComponent(jLabel17)))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(txtVeiculo6)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(txtHome6)
                .addGap(18, 18, 18)
                .addComponent(txtCliente6)
                .addGap(18, 18, 18)
                .addComponent(txtFornecedor6)
                .addGap(18, 18, 18)
                .addComponent(txtVeiculo6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel18)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void btnAdicionarVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarVeiculoActionPerformed
//        CadastroVeiculo cadveiculo = new CadastroVeiculo();
//        cadveiculo.setVisible(true);
        veiculoController veiculo = new veiculoController();
        try {
            veiculo.abrirCadastroVeiculo();
        } catch (Exception ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAdicionarVeiculoActionPerformed

    private void txtHome6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHome6MouseClicked
        loginController home = new loginController();
        home.abrirHome(this);
    }//GEN-LAST:event_txtHome6MouseClicked

    private void txtCliente6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCliente6MouseClicked
        clienteController cliente = new clienteController();
        cliente.abrirCliente(this);
    }//GEN-LAST:event_txtCliente6MouseClicked

    private void txtFornecedor6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFornecedor6MouseClicked
        fornecedorController fornecedor = new fornecedorController();
        fornecedor.abrirFornecedor(this);
    }//GEN-LAST:event_txtFornecedor6MouseClicked

    private void txtVeiculo6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtVeiculo6MouseClicked
        veiculoController veiculo = new veiculoController();
        veiculo.abrirVeiculo(this);
    }//GEN-LAST:event_txtVeiculo6MouseClicked

    private void btnPesquisarFornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarFornecedorActionPerformed
        veiculoController veiculocontroller = new veiculoController();
        List<veiculoModel> listaVeiculo = veiculocontroller.pesquisarVeiculo(txtPesquisarVeiculo.getText());
        if (listaVeiculo != null) {
            DefaultTableModel modeloTabela = (DefaultTableModel) tblVeiculo.getModel();
            modeloTabela.setRowCount(0);
            for (veiculoModel veiculomodel : listaVeiculo) {
                modeloTabela.addRow(new Object[]{
                    veiculomodel.getIdVeiculo(),
                    veiculomodel.getModelo(),
                    veiculomodel.getMarca(),
                    veiculomodel.getCor(),
                    veiculomodel.getCidadeVeiculo(),
                    veiculomodel.getPlaca(),
                    veiculomodel.getAnoDeFabricacao(),
                    veiculomodel.getChassi(),
                    veiculomodel.getRenavam(),
                    veiculomodel.getNumeroDoMotor(),
                    veiculomodel.getQuilometragemVeiculo(),
                    veiculomodel.getTipoCombustivel()
                });
            }
        }
    }//GEN-LAST:event_btnPesquisarFornecedorActionPerformed

    private void tblVeiculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVeiculoMouseClicked
        if (evt.getClickCount() == 2 && tblVeiculo.getSelectedRow() != -1) {
            try {
                veiculoModel veiculomodel = new veiculoModel();
                veiculomodel.setIdVeiculo(Integer.parseInt(tblVeiculo.getValueAt(tblVeiculo.getSelectedRow(), 0).toString()));
                veiculomodel.setModelo(tblVeiculo.getValueAt(tblVeiculo.getSelectedRow(), 1).toString());
                veiculomodel.setMarca(tblVeiculo.getValueAt(tblVeiculo.getSelectedRow(), 2).toString());
                veiculomodel.setCor(tblVeiculo.getValueAt(tblVeiculo.getSelectedRow(), 3).toString());
                veiculomodel.setCidadeVeiculo(tblVeiculo.getValueAt(tblVeiculo.getSelectedRow(), 4).toString());
                veiculomodel.setPlaca(tblVeiculo.getValueAt(tblVeiculo.getSelectedRow(), 5).toString());
                veiculomodel.setAnoDeFabricacao(tblVeiculo.getValueAt(tblVeiculo.getSelectedRow(), 6).toString());
                veiculomodel.setChassi(tblVeiculo.getValueAt(tblVeiculo.getSelectedRow(), 7).toString());
                veiculomodel.setRenavam(tblVeiculo.getValueAt(tblVeiculo.getSelectedRow(), 8).toString());
                veiculomodel.setNumeroDoMotor(tblVeiculo.getValueAt(tblVeiculo.getSelectedRow(), 9).toString());
                veiculomodel.setQuilometragemVeiculo(tblVeiculo.getValueAt(tblVeiculo.getSelectedRow(), 10).toString());
                veiculomodel.setTipoCombustivel(tblVeiculo.getValueAt(tblVeiculo.getSelectedRow(), 11).toString());
                veiculoController veiculocontroller = new veiculoController();
                veiculocontroller.abrirCadastroVeiculo(veiculomodel);
            } catch (Exception ex) {
                Logger.getLogger(CadastroFornecedor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_tblVeiculoMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Veiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Veiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Veiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Veiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Veiculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionarVeiculo;
    private javax.swing.JButton btnPesquisarFornecedor;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tblVeiculo;
    private javax.swing.JLabel txtCliente6;
    private javax.swing.JLabel txtFornecedor6;
    private javax.swing.JLabel txtHome6;
    private javax.swing.JTextField txtPesquisarVeiculo;
    private javax.swing.JLabel txtVeiculo;
    private javax.swing.JLabel txtVeiculo6;
    // End of variables declaration//GEN-END:variables
}
