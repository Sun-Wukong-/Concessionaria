package Controle;

import Modelo.Produto;
import Persistencia.ProdutoDao;
import Visao.ProdutoAlterarFrame;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Wukong
 */
public class ProdutoAlterarControle {
    
    public void limparTela(ProdutoAlterarFrame produtoFrame){
        produtoFrame.getjComboBoxCodigo().setSelectedIndex(0);
        produtoFrame.getjTextFieldMarca().setText("");
        produtoFrame.getjTextFieldModelo().setText("");
        produtoFrame.getjTextFieldAno().setText("");
        produtoFrame.getjTextFieldCor().setText("");
        produtoFrame.getjTextFieldPreco().setText("");
    }
    
    public boolean validarCampos(ProdutoAlterarFrame produtoFrame){
        if(produtoFrame.getjComboBoxCodigo().getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(produtoFrame, "Selecione o Código");
            produtoFrame.getjComboBoxCodigo().requestFocus();
            return false;
        }
        
        if (produtoFrame.getjTextFieldMarca().getText().equals("")) {
            JOptionPane.showMessageDialog(produtoFrame, "Digite a Marca");
            produtoFrame.getjTextFieldMarca().requestFocus();
            return false;
        }
        if (produtoFrame.getjTextFieldMarca().getText().equals("")) {
            JOptionPane.showMessageDialog(produtoFrame, "Digite o Modelo");
            produtoFrame.getjTextFieldModelo().requestFocus();
            return false;
        }
        if (produtoFrame.getjTextFieldAno().getText().equals("")) {
            JOptionPane.showMessageDialog(produtoFrame, "Digite o Ano");
            produtoFrame.getjTextFieldAno().requestFocus();
            return false;
        }
        if (produtoFrame.getjTextFieldCor().getText().equals("")) {
            JOptionPane.showMessageDialog(produtoFrame, "Digite a Cor");
            produtoFrame.getjTextFieldCor().requestFocus();
            return false;
        }
        if (produtoFrame.getjTextFieldPreco().getText().equals("")) {
            JOptionPane.showMessageDialog(produtoFrame, "Selecione o Preço");
            produtoFrame.getjTextFieldPreco().requestFocus();
            return false;
        }
        return true;
    }

    public void Atualizar(ProdutoAlterarFrame produtoFrame) throws SQLException{
        if(validarCampos(produtoFrame)){
            Produto produto = new Produto();
            boolean test = false; 
            produto.setCodigo(Integer.parseInt(produtoFrame.getjComboBoxCodigo().getSelectedItem().toString()));
            produto.setMarca(produtoFrame.getjTextFieldMarca().getText());
            produto.setModelo(produtoFrame.getjTextFieldModelo().getText());
            produto.setAno(Integer.parseInt(produtoFrame.getjTextFieldAno().getText()));
            produto.setCor(produtoFrame.getjTextFieldCor().getText());
            produto.setPreco(Double.parseDouble(produtoFrame.getjTextFieldPreco().getText()));
            test = true;
            if(test){
                ProdutoDao dao = new ProdutoDao();
                dao.alterar(produto);
                JOptionPane.showMessageDialog(produtoFrame, "Cadastro Atualizado com Sucesso");
                limparTela(produtoFrame);
            }
        }
    }
}
