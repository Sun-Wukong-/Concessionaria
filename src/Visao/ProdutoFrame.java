package Visao;


public class ProdutoFrame extends javax.swing.JFrame {
             
    public ProdutoFrame() {
        initComponents();
        setDefaultCloseOperation(TurmaFrame.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTituloProduto = new javax.swing.JPanel();
        LabelTituloProduto = new javax.swing.JLabel();
        PanelMenuProduto = new javax.swing.JPanel();
        ToolBarMenuAluno = new javax.swing.JToolBar();
        jButtonConsultarAluno = new javax.swing.JButton();
        ButtonAlterar = new javax.swing.JButton();
        ButtonExcluir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        ButtonSalvar = new javax.swing.JButton();
        ButtonLimpar = new javax.swing.JButton();
        ButtonVoltar = new javax.swing.JButton();
        PanelBodyAluno = new javax.swing.JPanel();
        jLabelMarca = new javax.swing.JLabel();
        jTextMarca = new javax.swing.JTextField();
        jLabelModelo = new javax.swing.JLabel();
        jLabelCor = new javax.swing.JLabel();
        jTextFieldCor = new javax.swing.JTextField();
        jTextFieldModelo = new javax.swing.JTextField();
        jLabelAno = new javax.swing.JLabel();
        jTextFieldAno = new javax.swing.JTextField();
        jLabelPreco = new javax.swing.JLabel();
        jTextFieldPreco = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPanelProduto = new javax.swing.JScrollPane();
        jTableProduto = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });

        PanelTituloProduto.setBackground(new java.awt.Color(255, 255, 255));

        LabelTituloProduto.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        LabelTituloProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/apresentacao/imagens/DiarioClasseImagemAluno.png"))); // NOI18N
        LabelTituloProduto.setText("Produto");

        javax.swing.GroupLayout PanelTituloProdutoLayout = new javax.swing.GroupLayout(PanelTituloProduto);
        PanelTituloProduto.setLayout(PanelTituloProdutoLayout);
        PanelTituloProdutoLayout.setHorizontalGroup(
            PanelTituloProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTituloProduto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTituloProdutoLayout.setVerticalGroup(
            PanelTituloProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTituloProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LabelTituloProduto)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelMenuProduto.setBackground(new java.awt.Color(204, 204, 204));

        ToolBarMenuAluno.setBackground(new java.awt.Color(204, 204, 204));
        ToolBarMenuAluno.setRollover(true);

        jButtonConsultarAluno.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonConsultarAluno.setText("Consultar");
        jButtonConsultarAluno.setFocusable(false);
        jButtonConsultarAluno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonConsultarAluno.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButtonConsultarAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarAlunoActionPerformed(evt);
            }
        });
        ToolBarMenuAluno.add(jButtonConsultarAluno);

        ButtonAlterar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ButtonAlterar.setText("Alterar");
        ButtonAlterar.setFocusable(false);
        ButtonAlterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonAlterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAlterarActionPerformed(evt);
            }
        });
        ToolBarMenuAluno.add(ButtonAlterar);

        ButtonExcluir.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ButtonExcluir.setText("Excluir");
        ButtonExcluir.setFocusable(false);
        ButtonExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExcluirActionPerformed(evt);
            }
        });
        ToolBarMenuAluno.add(ButtonExcluir);
        ToolBarMenuAluno.add(jSeparator1);

        ButtonSalvar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ButtonSalvar.setText("Salvar");
        ButtonSalvar.setFocusable(false);
        ButtonSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarActionPerformed(evt);
            }
        });
        ToolBarMenuAluno.add(ButtonSalvar);

        ButtonLimpar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ButtonLimpar.setText("Limpar");
        ButtonLimpar.setFocusable(false);
        ButtonLimpar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonLimpar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonLimparActionPerformed(evt);
            }
        });
        ToolBarMenuAluno.add(ButtonLimpar);

        ButtonVoltar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ButtonVoltar.setText("Fechar");
        ButtonVoltar.setFocusable(false);
        ButtonVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ButtonVoltar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonVoltarActionPerformed(evt);
            }
        });
        ToolBarMenuAluno.add(ButtonVoltar);

        javax.swing.GroupLayout PanelMenuProdutoLayout = new javax.swing.GroupLayout(PanelMenuProduto);
        PanelMenuProduto.setLayout(PanelMenuProdutoLayout);
        PanelMenuProdutoLayout.setHorizontalGroup(
            PanelMenuProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelMenuProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ToolBarMenuAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelMenuProdutoLayout.setVerticalGroup(
            PanelMenuProdutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelMenuProdutoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ToolBarMenuAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelBodyAluno.setBackground(new java.awt.Color(204, 204, 204));
        PanelBodyAluno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações Basicas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jLabelMarca.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelMarca.setText("Marca");

        jTextMarca.setColumns(20);

        jLabelModelo.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelModelo.setText("Modelo");

        jLabelCor.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jLabelCor.setText("Matricula:");

        jTextFieldCor.setColumns(10);

        jLabelAno.setText("Ano");

        jLabelPreco.setText("Preço");

        javax.swing.GroupLayout PanelBodyAlunoLayout = new javax.swing.GroupLayout(PanelBodyAluno);
        PanelBodyAluno.setLayout(PanelBodyAlunoLayout);
        PanelBodyAlunoLayout.setHorizontalGroup(
            PanelBodyAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBodyAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBodyAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(PanelBodyAlunoLayout.createSequentialGroup()
                        .addComponent(jLabelCor)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelBodyAlunoLayout.createSequentialGroup()
                        .addComponent(jLabelMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(PanelBodyAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelModelo)
                    .addComponent(jLabelPreco))
                .addGap(18, 18, 18)
                .addGroup(PanelBodyAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                    .addComponent(jTextFieldPreco))
                .addGap(18, 18, 18)
                .addComponent(jLabelAno)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelBodyAlunoLayout.setVerticalGroup(
            PanelBodyAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelBodyAlunoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelBodyAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelMarca)
                    .addComponent(jLabelModelo)
                    .addComponent(jLabelAno)
                    .addComponent(jTextFieldAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelBodyAlunoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCor)
                    .addComponent(jTextFieldCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPreco)
                    .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Alunos Cadastrados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N

        jScrollPanelProduto.setBackground(new java.awt.Color(204, 204, 204));
        jScrollPanelProduto.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jTableProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CodigoAluno", "Matricula", "Nome", "Turma"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableProduto.setEnabled(false);
        jScrollPanelProduto.setViewportView(jTableProduto);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPanelProduto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPanelProduto, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
        );

        jScrollPanelProduto.getAccessibleContext().setAccessibleName("");
        jScrollPanelProduto.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTituloProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelMenuProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelBodyAluno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelTituloProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelMenuProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelBodyAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarActionPerformed
        AlunoControle controle = new AlunoControle();
        controle.salvarCampos(this);
    }//GEN-LAST:event_ButtonSalvarActionPerformed

    private void ButtonLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonLimparActionPerformed
        AlunoControle controle = new AlunoControle();
        controle.limparTela(this);
    }//GEN-LAST:event_ButtonLimparActionPerformed

    private void ButtonAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAlterarActionPerformed
        if(TelaControle.TelaAlunoAlter != null){
            TelaControle.TelaAlunoAlter.setVisible(true);
        }else{
            TelaControle.TelaAlunoAlter = new AlunoAlterarFrame();
            TelaControle.TelaAlunoAlter.setVisible(true);          
        }       
            TelaControle.TelaAluno.setVisible(false);
    }//GEN-LAST:event_ButtonAlterarActionPerformed

    private void ButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExcluirActionPerformed
        AlunoControle controle = new AlunoControle();
        Aluno aluno = new Aluno();
        controle.Deletar(aluno);
    }//GEN-LAST:event_ButtonExcluirActionPerformed

    private void jButtonConsultarAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarAlunoActionPerformed
       AlunoControle controle = new AlunoControle();
       controle.consultar(this);
    }//GEN-LAST:event_jButtonConsultarAlunoActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained

    }//GEN-LAST:event_formFocusGained

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        AlunoDao dao = new AlunoDao();
        dao.preencherCombo(this);
    }//GEN-LAST:event_formWindowOpened

    private void ButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonVoltarActionPerformed
        TelaControle.TelaAluno.setVisible(false);
        TelaControle.TelaHome.setVisible(true);
    }//GEN-LAST:event_ButtonVoltarActionPerformed

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
    private javax.swing.JButton ButtonAlterar;
    private javax.swing.JButton ButtonExcluir;
    private javax.swing.JButton ButtonLimpar;
    private javax.swing.JButton ButtonSalvar;
    private javax.swing.JButton ButtonVoltar;
    private javax.swing.JLabel LabelTituloProduto;
    private javax.swing.JPanel PanelBodyAluno;
    private javax.swing.JPanel PanelMenuProduto;
    private javax.swing.JPanel PanelTituloProduto;
    private javax.swing.JToolBar ToolBarMenuAluno;
    private javax.swing.JButton jButtonConsultarAluno;
    private javax.swing.JLabel jLabelAno;
    private javax.swing.JLabel jLabelCor;
    private javax.swing.JLabel jLabelMarca;
    private javax.swing.JLabel jLabelModelo;
    private javax.swing.JLabel jLabelPreco;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPanelProduto;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JTable jTableProduto;
    private javax.swing.JTextField jTextFieldAno;
    private javax.swing.JTextField jTextFieldCor;
    private javax.swing.JTextField jTextFieldModelo;
    private javax.swing.JTextField jTextFieldPreco;
    private javax.swing.JTextField jTextMarca;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the jTableAluno
     */
    public javax.swing.JTable getjTableAluno() {
        return jTableProduto;
    }

    /**
     * @param jTableAluno the jTableAluno to set
     */
    public void setjTableAluno(javax.swing.JTable jTableAluno) {
        this.jTableProduto = jTableAluno;
    }

    /**
     * @return the jTextFieldMatriculaAluno
     */
    public javax.swing.JTextField getjTextFieldMatriculaAluno() {
        return jTextFieldCor;
    }

    /**
     * @param jTextFieldMatriculaAluno the jTextFieldMatriculaAluno to set
     */
    public void setjTextFieldMatriculaAluno(javax.swing.JTextField jTextFieldMatriculaAluno) {
        this.jTextFieldCor = jTextFieldMatriculaAluno;
    }

    /**
     * @return the jTextNomeAluno
     */
    public javax.swing.JTextField getjTextNomeAluno() {
        return jTextMarca;
    }

    /**
     * @param jTextNomeAluno the jTextNomeAluno to set
     */
    public void setjTextNomeAluno(javax.swing.JTextField jTextNomeAluno) {
        this.jTextMarca = jTextNomeAluno;
    }
}
