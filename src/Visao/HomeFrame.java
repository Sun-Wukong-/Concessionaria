package apresentacao;

import controle.TelaControle;
import static controle.TelaControle.TelaAula;

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
        JButtonAula = new javax.swing.JButton();
        JLabelProduto = new javax.swing.JLabel();
        JLabelAula = new javax.swing.JLabel();
        JLabelAluno = new javax.swing.JLabel();
        jButtonAluno = new javax.swing.JButton();
        JMenuBar = new javax.swing.JMenuBar();
        JMenuCadastro = new javax.swing.JMenu();
        JMenuItemTurma = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

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
                .addGap(0, 246, Short.MAX_VALUE))
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

        JButtonAula.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JButtonAula.setText("Gerenciar Aulas");
        JButtonAula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JButtonAulaMouseClicked(evt);
            }
        });
        JButtonAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonAulaActionPerformed(evt);
            }
        });

        JLabelProduto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        JLabelProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/imagens/DiarioClasseImagemTurma.png"))); // NOI18N
        JLabelProduto.setText("Produto");

        JLabelAula.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        JLabelAula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/imagens/DiarioClasseImagemAula.gif"))); // NOI18N
        JLabelAula.setText("Aula");

        JLabelAluno.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        JLabelAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/imagens/DiarioClasseImagemAluno.png"))); // NOI18N
        JLabelAluno.setText("Aluno");

        jButtonAluno.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonAluno.setText("Gerenciar Alunos");
        jButtonAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAlunoMouseClicked(evt);
            }
        });
        jButtonAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlunoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelBodyLayout = new javax.swing.GroupLayout(JPanelBody);
        JPanelBody.setLayout(JPanelBodyLayout);
        JPanelBodyLayout.setHorizontalGroup(
            JPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelBodyLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLabelProduto)
                    .addComponent(JLabelAluno)
                    .addComponent(JLabelAula))
                .addGap(18, 18, 18)
                .addGroup(JPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(JButtonAula, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JButtonProduto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                    .addComponent(jButtonAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(JLabelAluno)
                    .addComponent(jButtonAluno))
                .addGap(18, 18, 18)
                .addGroup(JPanelBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLabelAula)
                    .addComponent(JButtonAula))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        JMenuCadastro.setText("Cadastro");
        JMenuCadastro.setToolTipText("");

        JMenuItemTurma.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        JMenuItemTurma.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        JMenuItemTurma.setText("Turma");
        JMenuItemTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMenuItemTurmaActionPerformed(evt);
            }
        });
        JMenuCadastro.add(JMenuItemTurma);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenuItem1.setText("Aluno");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        JMenuCadastro.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jMenuItem2.setText("Aula");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        JMenuCadastro.add(jMenuItem2);

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

    private void JButtonAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonAulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JButtonAulaActionPerformed

    private void JButtonProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonProdutoMouseClicked
        if(TelaControle.TelaTurma != null){
            TelaControle.TelaTurma.setVisible(true);
        }else{
          TelaControle.TelaTurma = new TurmaFrame();
          TelaControle.TelaTurma.setVisible(true);          
         }       
        TelaControle.TelaHome.setVisible(false);
    }//GEN-LAST:event_JButtonProdutoMouseClicked

    private void JMenuItemTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMenuItemTurmaActionPerformed
         if(TelaControle.TelaTurma != null){
            TelaControle.TelaTurma.setVisible(true);
        }else{
          TelaControle.TelaTurma = new TurmaFrame();
          TelaControle.TelaTurma.setVisible(true);          
         }       
        TelaControle.TelaHome.setVisible(false);
    }//GEN-LAST:event_JMenuItemTurmaActionPerformed

    private void JButtonProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonProdutoActionPerformed
        // TO add your handling code here:
    }//GEN-LAST:event_JButtonProdutoActionPerformed

    private void JButtonAulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JButtonAulaMouseClicked
       if(TelaControle.TelaAula != null){
            TelaControle.TelaAula.setVisible(true);
        }else{
          TelaControle.TelaAula = new AulaFrame();
          TelaControle.TelaAula.setVisible(true);          
         }       
        TelaControle.TelaHome.setVisible(false);
    }//GEN-LAST:event_JButtonAulaMouseClicked

    private void jButtonAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAlunoMouseClicked
          if(TelaControle.TelaAluno != null){
            TelaControle.TelaAluno.setVisible(true);
        }else{
          TelaControle.TelaAluno = new AlunoFrame();
          TelaControle.TelaAluno.setVisible(true);          
         }       
        TelaControle.TelaHome.setVisible(false);
    }//GEN-LAST:event_jButtonAlunoMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
           if(TelaControle.TelaAluno != null){
            TelaControle.TelaAluno.setVisible(true);
        }else{
          TelaControle.TelaAluno = new AlunoFrame();
          TelaControle.TelaAluno.setVisible(true);          
         }       
        TelaControle.TelaHome.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        if(TelaControle.TelaAula != null){
            TelaControle.TelaAula.setVisible(true);
        }else{
          TelaControle.TelaAula = new AulaFrame();
          TelaControle.TelaAula.setVisible(true);          
         }       
        TelaControle.TelaHome.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButtonAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAlunoActionPerformed

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
                TelaControle.TelaHome = new HomeFrame();
                TelaControle.TelaHome.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonAula;
    private javax.swing.JButton JButtonProduto;
    private javax.swing.JLabel JLabelAluno;
    private javax.swing.JLabel JLabelAula;
    private javax.swing.JLabel JLabelProduto;
    private javax.swing.JLabel JLabelTitulo;
    private javax.swing.JMenuBar JMenuBar;
    private javax.swing.JMenu JMenuCadastro;
    private javax.swing.JMenuItem JMenuItemTurma;
    private javax.swing.JPanel JPanelBody;
    private javax.swing.JPanel JPanelHead;
    private javax.swing.JButton jButtonAluno;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
