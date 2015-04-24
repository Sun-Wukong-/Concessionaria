package Controle;

import Modelo.Produto;
import Persistencia.ProdutoDao;
import Visao.ProdutoFrame;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Wukong
 */
public class ProdutoControle {
    
    //Consultar BD
    public void consultar(ProdutoFrame produtoFrame) throws SQLException {
        ProdutoDao dao = new ProdutoDao();
        produtoFrame.getjTableProduto().setModel(DbUtils.resultSetToTableModel(dao.atualizarTabela()));
    }
    
    // Assegurar que Campos estão Preenchidos
    public boolean validarCampos(ProdutoFrame produtoFrame) {
        if (produtoFrame.getjTextFieldMarca().getText().equals("")) {
            JOptionPane.showMessageDialog(produtoFrame, "Digite a Marca");
            produtoFrame.getjTextFieldMarca().requestFocus();
            return false;
        }
        if (produtoFrame.getjTextFieldModelo().getText().equals("")) {
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
            JOptionPane.showMessageDialog(produtoFrame, "Digite o Preço");
            produtoFrame.getjTextFieldPreco().requestFocus();
            return false;
        }
        return true;
    }
    
    //Limpar Campos
    public void limparTela(ProdutoFrame produoFrame) {
        produoFrame.getjTextFieldMarca().setText("");
        produoFrame.getjTextFieldModelo().setText("");
        produoFrame.getjTextFieldAno().setText("");
        produoFrame.getjTextFieldCor().setText("");
        produoFrame.getjTextFieldPreco().setText("");
    }
    
    //Gravar no BD
    public void Inserir(ProdutoFrame produtoFrame) throws SQLException {
        Produto produto = new Produto();
        produto.setMarca(produtoFrame.getjTextFieldMarca().getText());
        produto.setModelo(produtoFrame.getjTextFieldModelo().getText());
        produto.setAno(Integer.parseInt(produtoFrame.getjTextFieldAno().getText()));
        produto.setCor(produtoFrame.getjTextFieldCor().getText());
        produto.setPreco(Double.parseDouble(produtoFrame.getjTextFieldPreco().getText()));
        ProdutoDao dao = new ProdutoDao();
        dao.adicionar(produto);
    }
    
        //Metodo para Salvar Campos após Verificação
    public void salvarCampos(ProdutoFrame produtoFrame) throws SQLException {
        if (validarCampos(produtoFrame)) {
            Inserir(produtoFrame);
            JOptionPane.showMessageDialog(produtoFrame, "Cadastro Salvo com Sucesso");
            limparTela(produtoFrame);
            consultar(produtoFrame);
        }
    }
    
    // Deletar um Registro 
    public void Deletar(Produto produto){
        try{
            int id;  
            id = Integer.parseInt(JOptionPane.showInputDialog("Informe o Id do Registro para ser Deletado"));
            
            ProdutoDao dao = new ProdutoDao();
            dao.remover(produto, id);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Cancelado");
        }
    }
    
}
