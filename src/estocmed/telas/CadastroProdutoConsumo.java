/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estocmed.telas;


import estocmed.logs.Log;
import estocmed.logs.LogDAO;
import estocmed.produtoconsumo.ProdutoConsumo;
import estocmed.produtoconsumo.ProdutoConsumoDAO;
import estocmed.produtoconsumo.ProdutoConsumoTableModel;
import estocmed.tipodoproduto.TipoDoProduto;
import estocmed.tipodoproduto.TipoDoProdutoDAO;
import estocmed.tipodoproduto.TipoDoProdutoTableModel;
import estocmed.usuario.Usuario;
import estocmed.util.Util;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Adriano Lima
 */
public class CadastroProdutoConsumo extends javax.swing.JDialog {

    ProdutoConsumo produto = new ProdutoConsumo();
    ProdutoConsumoDAO produtoDAO;
    TipoDoProduto tipoProduto;
    TipoDoProdutoDAO tipoProdutoDAO;
    Log log = new Log();
    LogDAO logDAO = new LogDAO();
    /**
     * Creates new form TelaCadastroUsuario
     */
    Usuario usuario;

    public CadastroProdutoConsumo(java.awt.Frame parent, boolean modal, Usuario usuario) {

        initComponents();
        getRootPane().setDefaultButton(btSalvar);
        txtTipoProduto.setEnabled(false);
        this.usuario = usuario;
        produtoDAO = new ProdutoConsumoDAO(this.usuario);
        tipoProduto = new TipoDoProduto();
        tipoProdutoDAO = new TipoDoProdutoDAO(this.usuario);
        btLimparActionPerformed(null);
        setModal(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupo = new javax.swing.ButtonGroup();
        grupoMedida = new javax.swing.ButtonGroup();
        jlNomeUsuario = new javax.swing.JLabel();
        txtTipoProduto = new javax.swing.JTextField();
        btnTipoProduto = new javax.swing.JButton();
        btVoltar = new javax.swing.JButton();
        btPesquisar = new javax.swing.JButton();
        btExcluir = new javax.swing.JButton();
        btLimpar = new javax.swing.JButton();
        jLObrigatorioNome2 = new javax.swing.JLabel();
        btSalvar = new javax.swing.JButton();
        txtNomeProduto = new javax.swing.JTextField();
        jlNomeUsuario3 = new javax.swing.JLabel();
        jLObrigatorioNome1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(602, 421));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        jlNomeUsuario.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlNomeUsuario.setText("Tipo do Produto:");
        getContentPane().add(jlNomeUsuario);
        jlNomeUsuario.setBounds(60, 210, 130, 20);

        txtTipoProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtTipoProduto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 44, 143), 1, true));
        txtTipoProduto.setMaximumSize(new java.awt.Dimension(8, 200));
        txtTipoProduto.setMinimumSize(new java.awt.Dimension(8, 200));
        txtTipoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(txtTipoProduto);
        txtTipoProduto.setBounds(60, 230, 450, 30);

        btnTipoProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnTipoProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/add20-20.png"))); // NOI18N
        btnTipoProduto.setContentAreaFilled(false);
        btnTipoProduto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTipoProduto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTipoProduto.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTipoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTipoProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(btnTipoProduto);
        btnTipoProduto.setBounds(520, 230, 30, 30);

        btVoltar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/voltar.png"))); // NOI18N
        btVoltar.setText("Voltar");
        btVoltar.setContentAreaFilled(false);
        btVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btVoltar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btVoltar);
        btVoltar.setBounds(20, 340, 90, 70);

        btPesquisar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/pesquisar.png"))); // NOI18N
        btPesquisar.setText("Pesquisar");
        btPesquisar.setContentAreaFilled(false);
        btPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btPesquisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btPesquisar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPesquisarActionPerformed(evt);
            }
        });
        getContentPane().add(btPesquisar);
        btPesquisar.setBounds(260, 340, 100, 73);

        btExcluir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/excluir.png"))); // NOI18N
        btExcluir.setText("Excluir");
        btExcluir.setContentAreaFilled(false);
        btExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btExcluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btExcluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btExcluir);
        btExcluir.setBounds(370, 340, 80, 70);

        btLimpar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/limpar.png"))); // NOI18N
        btLimpar.setText("Limpar");
        btLimpar.setContentAreaFilled(false);
        btLimpar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLimpar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btLimpar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimparActionPerformed(evt);
            }
        });
        getContentPane().add(btLimpar);
        btLimpar.setBounds(160, 340, 80, 70);

        jLObrigatorioNome2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioNome2.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioNome2.setText("*");
        getContentPane().add(jLObrigatorioNome2);
        jLObrigatorioNome2.setBounds(510, 220, 10, 30);

        btSalvar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/Salvar.png"))); // NOI18N
        btSalvar.setText("Salvar");
        btSalvar.setContentAreaFilled(false);
        btSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSalvar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btSalvar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btSalvar);
        btSalvar.setBounds(500, 340, 80, 70);

        txtNomeProduto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtNomeProduto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 44, 143), 1, true));
        txtNomeProduto.setMaximumSize(new java.awt.Dimension(8, 200));
        txtNomeProduto.setMinimumSize(new java.awt.Dimension(8, 200));
        txtNomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(txtNomeProduto);
        txtNomeProduto.setBounds(60, 143, 450, 30);

        jlNomeUsuario3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jlNomeUsuario3.setText("Nome do Produto:");
        getContentPane().add(jlNomeUsuario3);
        jlNomeUsuario3.setBounds(60, 120, 150, 20);

        jLObrigatorioNome1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLObrigatorioNome1.setForeground(new java.awt.Color(204, 0, 0));
        jLObrigatorioNome1.setText("*");
        getContentPane().add(jLObrigatorioNome1);
        jLObrigatorioNome1.setBounds(510, 130, 20, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/birdpoint/imagens/CadastroDeProduto.png"))); // NOI18N
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        getContentPane().add(jLabel6);
        jLabel6.setBounds(2, 0, 600, 420);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPesquisarActionPerformed

        List<ProdutoConsumo> lista;
        lista = (produtoDAO.listar());
        ProdutoConsumoTableModel itm = new ProdutoConsumoTableModel(lista);
        Object objetoRetorno = PesquisaGenerica.exibeTela(itm, "Produto");
        if (objetoRetorno != null) {
            produto = produtoDAO.consultarObjetoId("idProduto", objetoRetorno);
            tipoProduto = tipoProdutoDAO.consultarObjetoId("idTipoProduto", produto.getTipoProduto().getIdTipoProduto());
            
            
            txtNomeProduto.setText(produto.getNomeProdutoConsumo());
            txtTipoProduto.setText(tipoProduto.getTipoProduto());

        }

    }//GEN-LAST:event_btPesquisarActionPerformed

    private void btExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirActionPerformed
        produtoDAO.excluir(produto);
        btLimparActionPerformed(null);
    }//GEN-LAST:event_btExcluirActionPerformed

    private void btLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimparActionPerformed
        Util.limparCamposGenerico(this);
        btExcluir.setEnabled(false);
        produto = new ProdutoConsumo();
    }//GEN-LAST:event_btLimparActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        if (txtNomeProduto.getText().equals("") || txtTipoProduto.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Prencha todos os campos !!");
        } else {
            produto.setNomeProdutoConsumo(txtNomeProduto.getText());
            if (produto.getIdProduto() == 0) {
                produto.setTipoProduto(tipoProduto);
            } else {
//                produto.setFornecedor(fornecedorDAO.consultarObjetoId("idFornecedor", produto.getFornecedor().getIdFornecedor()));
//                produto.setTipoProduto(tipoProdutoDAO.consultarObjetoId("idTipoProduto", produto.getTipoProduto().getIdTipoProduto()));
                produto.setTipoProduto(tipoProduto);
            }

            produtoDAO.salvar(produto);

            btLimparActionPerformed(null);

        }

    }//GEN-LAST:event_btSalvarActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void txtNomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeProdutoActionPerformed

    private void txtTipoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoProdutoActionPerformed

    private void btnTipoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTipoProdutoActionPerformed
        List<TipoDoProduto> lista;
        lista = (tipoProdutoDAO.listar());
        TipoDoProdutoTableModel itm = new TipoDoProdutoTableModel(lista);
        Object objetoRetorno = PesquisaGenerica.exibeTela(itm, "Tipo de Produto");
        if (objetoRetorno != null) {
            tipoProduto = tipoProdutoDAO.consultarObjetoId("idTipoProduto", objetoRetorno);

            txtTipoProduto.setText(tipoProduto.getTipoProduto());
            txtTipoProduto.setEnabled(false);

        }
    }//GEN-LAST:event_btnTipoProdutoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroProdutoConsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutoConsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutoConsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutoConsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CadastroProdutoConsumo dialog = new CadastroProdutoConsumo(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btExcluir;
    private javax.swing.JButton btLimpar;
    private javax.swing.JButton btPesquisar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JButton btnTipoProduto;
    private javax.swing.ButtonGroup grupo;
    private javax.swing.ButtonGroup grupoMedida;
    private javax.swing.JLabel jLObrigatorioNome1;
    private javax.swing.JLabel jLObrigatorioNome2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jlNomeUsuario;
    private javax.swing.JLabel jlNomeUsuario3;
    private javax.swing.JTextField txtNomeProduto;
    private javax.swing.JTextField txtTipoProduto;
    // End of variables declaration//GEN-END:variables
}
