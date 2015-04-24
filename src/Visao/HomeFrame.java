package Visao;

public class HomeFrame extends javax.swing.JFrame {

    public HomeFrame() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelHead = new javax.swing.JPanel();
        JLabelTitulo = new javax.swing.JLabel();
        JPanelBody = new javax.swing.JPanel();
        JButtonProduto = new javax.swing.JButton();
        JButtonPesquisa = new javax.swing.JButton();
        JLabelProduto = new javax.swing.JLabel();
        JLabelPesquisa = new javax.swing.JLabel();
        JLabelVenda = new javax.swing.JLabel();
        jButtonVenda = new javax.swing.JButton();
        JMenuBar = new javax.swing.JMenuBar();
        JMenuCadastro = new javax.swing.JMenu();
        JMenuItemProduto = new javax.swing.JMenuItem();
        jMenuItemVenda = new javax.swing.JMenuItem();
        jMenuItemPesquisa = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        JPanelHead.setBackground(new java.awt.Color(204, 204, 204));
        JPanelHead.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JLabelTitulo.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        JLabelTitulo.setText("Concessionaria");

        javax.swing.GroupLayout JPanelHeadLayout = new javax.swing.GroupLayout(JPanelHead);
        JPanelHead.setLayout(JPanelHeadLayout);
        JPanelHeadLayout.setHorizontalGroup(
            JPanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelHeadLayout.createSequentialGroup()
                .addComponent(JLabelTitulo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        JPanelHeadLayout.setVerticalGroup(
            JPanelHeadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JLabelTitulo)
        );

        JPanelBody.setBackground(java.awt.Color.white);
        JPanelBody.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controle Produtos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        JButtonProduto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JButtonProduto.setText("Gerenciar Produtos");
        JButtonProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JButtonProdutoMouseClicked(evt);
            }
        });
        JButtonProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonProdutoActionPerformed(evt);
            }
        });

        JButtonPesquisa.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JButtonPesquisa.setText("Pesquisa");
        JButtonPesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JButtonPesquisaMouseClicked(evt);
            }
        });
        JButtonPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonPesquisaActionPerformed(evt);
            }
        });

        JLabelProduto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        JLabelProduto.setIcon(new javax.swing.ImageIcon("C:\\Users\\Wukong\\Desktop\\Arquivos\\Google Drive\\Git\\UCB.LPIV.Concessionaria\\src\\Visao\\Imagens\\icone-carro.gif")); // NOI18N
        JLabelProduto.setText("Produto");

        JLabelPesquisa.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        JLabelPesquisa.setIcon(new javax.swing.ImageIcon("C:\\Users\\Wukong\\Desktop\\Arquivos\\Google Drive\\Git\\UCB.LPIV.Concessionaria\\src\\Visao\\Imagens\\icone-consulta.png")); // NOI18N
        JLabelPesquisa.setText("Pesquisa");

        JLabelVenda.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        JLabelVenda.setIcon(new javax.swing.ImageIcon("C:\\Users\\Wukong\\Desktop\\Arquivos\\Google Drive\\Git\\UCB.LPIV.Concessionaria\\src\\Visao\\Imagens\\icone_venda.gif")); // NOI18N
        JLabelVenda.setText("Venda");

        jButtonVenda.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonVenda.setText("Gerenciar Vendas");
        jButtonVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonVendaMouseClicked(evt);
            }
        });
        jButtonVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelBodyLayout = new javax.swing.GroupLayout(JPanelBody);
        JPanelBody.setLayout(JPanelBodyLayout);
        JPanelBodyLayout.setHorizontalGroup(
            JPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelBodyLayout.createSequentialGroup()
                        .addComponent(JLabelProduto)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelBodyLayout.createSequentialGroup()
                        .addGroup(JPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLabelPesquisa)
                            .addComponent(JLabelVenda))
                        .addGap(18, 18, 18)))
                .addGroup(JPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButtonProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JButtonPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        JPanelBodyLayout.setVerticalGroup(
            JPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButtonProduto)
                    .addComponent(JLabelProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabelVenda)
                    .addComponent(jButtonVenda))
                .addGap(18, 18, 18)
                .addGroup(JPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabelPesquisa)
                    .addComponent(JButtonPesquisa))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JMenuCadastro.setText("Cadastro");
        JMenuCadastro.setToolTipText("");

        JMenuItemProduto.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        JMenuItemProduto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JMenuItemProduto.setText("Produto");
        JMenuItemProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemProdutoActionPerformed(evt);
            }
        });
        JMenuCadastro.add(JMenuItemProduto);

        jMenuItemVenda.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemVenda.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenuItemVenda.setText("Vendas");
        jMenuItemVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemVendaActionPerformed(evt);
            }
        });
        JMenuCadastro.add(jMenuItemVenda);

        jMenuItemPesquisa.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItemPesquisa.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenuItemPesquisa.setText("Pesquisa");
        jMenuItemPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemPesquisaActionPerformed(evt);
            }
        });
        JMenuCadastro.add(jMenuItemPesquisa);

        JMenuBar.add(JMenuCadastro);

        setJMenuBar(JMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanelHead, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPanelHead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPanelBody, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonPesquisaActionPerformed

    private void JButtonProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonProdutoMouseClicked
        ProdutoFrame frame = new ProdutoFrame();
        frame.setVisible(true);

    }//GEN-LAST:event_JButtonProdutoMouseClicked

    private void JMenuItemProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemProdutoActionPerformed
        ProdutoFrame frame = new ProdutoFrame();
        frame.setVisible(true);
    }//GEN-LAST:event_JMenuItemProdutoActionPerformed

    private void JButtonProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonProdutoActionPerformed
        // TO add your handling code here:
    }//GEN-LAST:event_JButtonProdutoActionPerformed

    private void JButtonPesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonPesquisaMouseClicked
        PesquisaFrame frame = new PesquisaFrame();
        frame.setVisible(true);
    }//GEN-LAST:event_JButtonPesquisaMouseClicked

    private void jButtonVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonVendaMouseClicked
        VendaFrame frame = new VendaFrame();
        frame.setVisible(true);
    }//GEN-LAST:event_jButtonVendaMouseClicked

    private void jMenuItemVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemVendaActionPerformed
        VendaFrame frame = new VendaFrame();
        frame.setVisible(true);
    }//GEN-LAST:event_jMenuItemVendaActionPerformed

    private void jMenuItemPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemPesquisaActionPerformed
        PesquisaFrame frame = new PesquisaFrame();
        frame.setVisible(true);
    }//GEN-LAST:event_jMenuItemPesquisaActionPerformed

    private void jButtonVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVendaActionPerformed

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
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HomeFrame frame = new HomeFrame();
                frame.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonPesquisa;
    private javax.swing.JButton JButtonProduto;
    private javax.swing.JLabel JLabelPesquisa;
    private javax.swing.JLabel JLabelProduto;
    private javax.swing.JLabel JLabelTitulo;
    private javax.swing.JLabel JLabelVenda;
    private javax.swing.JMenuBar JMenuBar;
    private javax.swing.JMenu JMenuCadastro;
    private javax.swing.JMenuItem JMenuItemProduto;
    private javax.swing.JPanel JPanelBody;
    private javax.swing.JPanel JPanelHead;
    private javax.swing.JButton jButtonVenda;
    private javax.swing.JMenuItem jMenuItemPesquisa;
    private javax.swing.JMenuItem jMenuItemVenda;
    // End of variables declaration//GEN-END:variables
}
