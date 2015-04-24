package Visao;

import Controle.ProdutoControle;
import Modelo.Produto;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Wukong
 */
public class ProdutoFrame extends javax.swing.JFrame {

    /**
     * Creates new form ProdutoFrame
     */
    public ProdutoFrame() {
        initComponents();
        setDefaultCloseOperation(ProdutoFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTituloProduto = new javax.swing.JPanel();
        jLabelTituloProduto = new javax.swing.JLabel();
        jPanelMenuTurma = new javax.swing.JPanel();
        ToolBarMenuTurma = new javax.swing.JToolBar();
        jButtonConsultar = new javax.swing.JButton();
        jButtonAlterar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jButtonSalvar = new javax.swing.JButton();
        jButtonLimpar = new javax.swing.JButton();
        jPanelBodyTurma = new javax.swing.JPanel();
        jLabelMarca = new javax.swing.JLabel();
        jTextFieldMarca = new javax.swing.JTextField();
        jTextFieldModelo = new javax.swing.JTextField();
        jLabelModelo = new javax.swing.JLabel();
        jTextFieldAno = new javax.swing.JTextField();
        jLabelAno = new javax.swing.JLabel();
        jLabelCor = new javax.swing.JLabel();
        jLabelPreco = new javax.swing.JLabel();
        jTextFieldPreco = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jTextFieldCor = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPanelProduto = new javax.swing.JScrollPane();
        jTableProduto = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelTituloProduto.setBackground(new java.awt.Color(255, 255, 255));

        jLabelTituloProduto.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabelTituloProduto.setIcon(new javax.swing.ImageIcon("C:\\Users\\Wukong\\Desktop\\Arquivos\\Google Drive\\Git\\UCB.LPIV.Concessionaria\\src\\Visao\\Imagens\\cars_pixar_4_95485.jpg")); // NOI18N
        jLabelTituloProduto.setText("Carro");

        javax.swing.GroupLayout jPanelTituloProdutoLayout = new javax.swing.GroupLayout(jPanelTituloProduto);
        jPanelTituloProduto.setLayout(jPanelTituloProdutoLayout);
        jPanelTituloProdutoLayout.setHorizontalGroup(
            jPanelTituloProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloProduto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelTituloProdutoLayout.setVerticalGroup(
            jPanelTituloProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTituloProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloProduto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelMenuTurma.setBackground(new java.awt.Color(204, 204, 204));

        ToolBarMenuTurma.setBackground(new java.awt.Color(204, 204, 204));
        ToolBarMenuTurma.setRollover(true);

        jButtonConsultar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonConsultar.setText("Consultar");
        jButtonConsultar.setFocusable(false);
        jButtonConsultar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonConsultar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });
        ToolBarMenuTurma.add(jButtonConsultar);

        jButtonAlterar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonAlterar.setText("Alterar");
        jButtonAlterar.setFocusable(false);
        jButtonAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarActionPerformed(evt);
            }
        });
        ToolBarMenuTurma.add(jButtonAlterar);

        jButtonExcluir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonExcluir.setText("Excluir");
        jButtonExcluir.setFocusable(false);
        jButtonExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });
        ToolBarMenuTurma.add(jButtonExcluir);
        ToolBarMenuTurma.add(jSeparator1);

        jButtonSalvar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.setFocusable(false);
        jButtonSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });
        ToolBarMenuTurma.add(jButtonSalvar);

        jButtonLimpar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonLimpar.setText("Limpar");
        jButtonLimpar.setFocusable(false);
        jButtonLimpar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonLimpar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimparActionPerformed(evt);
            }
        });
        ToolBarMenuTurma.add(jButtonLimpar);

        javax.swing.GroupLayout jPanelMenuTurmaLayout = new javax.swing.GroupLayout(jPanelMenuTurma);
        jPanelMenuTurma.setLayout(jPanelMenuTurmaLayout);
        jPanelMenuTurmaLayout.setHorizontalGroup(
            jPanelMenuTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMenuTurmaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ToolBarMenuTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelMenuTurmaLayout.setVerticalGroup(
            jPanelMenuTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMenuTurmaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ToolBarMenuTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanelBodyTurma.setBackground(new java.awt.Color(204, 204, 204));
        jPanelBodyTurma.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações Basicas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jLabelMarca.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelMarca.setText("Marca");

        jTextFieldMarca.setColumns(20);

        jTextFieldModelo.setColumns(20);
        jTextFieldModelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldModeloActionPerformed(evt);
            }
        });

        jLabelModelo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelModelo.setText("Modelo");

        jTextFieldAno.setColumns(20);

        jLabelAno.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelAno.setText("Ano");

        jLabelCor.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelCor.setText("Cor");

        jLabelPreco.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelPreco.setText("Preço");

        jTextFieldPreco.setColumns(2);

        javax.swing.GroupLayout jPanelBodyTurmaLayout = new javax.swing.GroupLayout(jPanelBodyTurma);
        jPanelBodyTurma.setLayout(jPanelBodyTurmaLayout);
        jPanelBodyTurmaLayout.setHorizontalGroup(
            jPanelBodyTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyTurmaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBodyTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBodyTurmaLayout.createSequentialGroup()
                        .addGroup(jPanelBodyTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelBodyTurmaLayout.createSequentialGroup()
                                .addComponent(jLabelMarca)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jLabelModelo)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 59, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanelBodyTurmaLayout.createSequentialGroup()
                        .addComponent(jLabelAno)
                        .addGap(31, 31, 31)
                        .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelCor)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldCor, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelPreco)
                        .addGap(28, 28, 28)
                        .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanelBodyTurmaLayout.setVerticalGroup(
            jPanelBodyTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBodyTurmaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBodyTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMarca)
                    .addComponent(jTextFieldMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelModelo)
                    .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBodyTurmaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAno)
                    .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCor)
                    .addComponent(jTextFieldCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPreco))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Carros Cadastrados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jScrollPanelProduto.setBackground(new java.awt.Color(204, 204, 204));

        jTableProduto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jTableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CodigoCarro", "Marca", "Modelo", "Ano", "Cor", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableProdutoMouseClicked(evt);
            }
        });
        jScrollPanelProduto.setViewportView(jTableProduto);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPanelProduto)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPanelProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTituloProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelMenuTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelBodyTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTituloProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMenuTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBodyTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        ProdutoControle controle = new ProdutoControle();
        try {
            controle.consultar(this);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarActionPerformed
        ProdutoAlterarFrame frame = new ProdutoAlterarFrame();
        frame.setVisible(true);
    }//GEN-LAST:event_jButtonAlterarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        ProdutoControle controle = new ProdutoControle();
        Produto produto = new Produto();
        controle.Deletar(produto);
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        ProdutoControle controle = new ProdutoControle();
        try {
            controle.salvarCampos(this);
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimparActionPerformed
        ProdutoControle controle = new ProdutoControle();
        controle.limparTela(this);
    }//GEN-LAST:event_jButtonLimparActionPerformed

    private void jTextFieldModeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldModeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldModeloActionPerformed

    private void jTableProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableProdutoMouseClicked

    }//GEN-LAST:event_jTableProdutoMouseClicked

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
            java.util.logging.Logger.getLogger(ProdutoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProdutoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProdutoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProdutoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProdutoFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar ToolBarMenuTurma;
    private javax.swing.JButton jButtonAlterar;
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonLimpar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabelAno;
    private javax.swing.JLabel jLabelCor;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelModelo;
    private javax.swing.JLabel jLabelPreco;
    private javax.swing.JLabel jLabelTituloProduto;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelBodyTurma;
    private javax.swing.JPanel jPanelMenuTurma;
    private javax.swing.JPanel jPanelTituloProduto;
    private javax.swing.JScrollPane jScrollPanelProduto;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTableProduto;
    private javax.swing.JTextField jTextFieldAno;
    private javax.swing.JTextField jTextFieldCor;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldModelo;
    private javax.swing.JTextField jTextFieldPreco;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the jTableProduto
     */
    public javax.swing.JTable getjTableProduto() {
        return jTableProduto;
    }

    /**
     * @param jTableProduto the jTableProduto to set
     */
    public void setjTableProduto(javax.swing.JTable jTableProduto) {
        this.jTableProduto = jTableProduto;
    }

    /**
     * @return the jTextFieldAno
     */
    public javax.swing.JTextField getjTextFieldAno() {
        return jTextFieldAno;
    }

    /**
     * @param jTextFieldAno the jTextFieldAno to set
     */
    public void setjTextFieldAno(javax.swing.JTextField jTextFieldAno) {
        this.jTextFieldAno = jTextFieldAno;
    }

    /**
     * @return the jTextFieldCor
     */
    public javax.swing.JTextField getjTextFieldCor() {
        return jTextFieldCor;
    }

    /**
     * @param jTextFieldCor the jTextFieldCor to set
     */
    public void setjTextFieldCor(javax.swing.JTextField jTextFieldCor) {
        this.jTextFieldCor = jTextFieldCor;
    }

    /**
     * @return the jTextFieldMarca
     */
    public javax.swing.JTextField getjTextFieldMarca() {
        return jTextFieldMarca;
    }

    /**
     * @param jTextFieldMarca the jTextFieldMarca to set
     */
    public void setjTextFieldMarca(javax.swing.JTextField jTextFieldMarca) {
        this.jTextFieldMarca = jTextFieldMarca;
    }

    /**
     * @return the jTextFieldModelo
     */
    public javax.swing.JTextField getjTextFieldModelo() {
        return jTextFieldModelo;
    }

    /**
     * @param jTextFieldModelo the jTextFieldModelo to set
     */
    public void setjTextFieldModelo(javax.swing.JTextField jTextFieldModelo) {
        this.jTextFieldModelo = jTextFieldModelo;
    }

    /**
     * @return the jTextFieldPreco
     */
    public javax.swing.JTextField getjTextFieldPreco() {
        return jTextFieldPreco;
    }

    /**
     * @param jTextFieldPreco the jTextFieldPreco to set
     */
    public void setjTextFieldPreco(javax.swing.JTextField jTextFieldPreco) {
        this.jTextFieldPreco = jTextFieldPreco;
    }
}
