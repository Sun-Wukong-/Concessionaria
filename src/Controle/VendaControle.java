package Controle;
import Modelo.Venda;
import Persistencia.VendaDao;
import Visao.VendaFrame;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Wukong
 */
public class VendaControle {
    
    //Consultar BD
    public void consultar(VendaFrame vendaFrame) throws SQLException {
        VendaDao dao = new VendaDao();
        vendaFrame.getjTableVenda().setModel(DbUtils.resultSetToTableModel(dao.atualizarTabela()));
    }
    
    // Assegurar que Campos estão Preenchidos
    public boolean validarCampos(VendaFrame vendaFrame) {
        if(((JTextField)vendaFrame.getjDateChooserVenda().getDateEditor().getUiComponent()).getText().equals("")){
            JOptionPane.showMessageDialog(vendaFrame, "Selecione a Data");
            vendaFrame.getjDateChooserVenda().requestFocus();
            return false;
        }
        if (vendaFrame.getjTextFieldRegistroVendedor().getText().equals("")) {
            JOptionPane.showMessageDialog(vendaFrame, "Digite o Registro do Vendedor");
            vendaFrame.getjTextFieldRegistroVendedor().requestFocus();
            return false;
        }
        if (vendaFrame.getjTextFieldDesconto().getText().equals("")) {
            JOptionPane.showMessageDialog(vendaFrame, "Digite o Desconto");
            vendaFrame.getjTextFieldDesconto().requestFocus();
            return false;
        }
        if (vendaFrame.getjTextFieldValorAcessorio().getText().equals("")) {
            JOptionPane.showMessageDialog(vendaFrame, "Digite o Valor do Acessorio");
            vendaFrame.getjTextFieldValorAcessorio().requestFocus();
            return false;
        }
        if(vendaFrame.getjComboBoxProduto().getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(vendaFrame, "Selecione o Codigo do Produto");
            vendaFrame.getjComboBoxProduto().requestFocus();
            return false;
        }
        return true;
    }
    
    //Limpar Campos
    public void limparTela(VendaFrame vendaFrame) {
        ((JTextField)vendaFrame.getjDateChooserVenda().getDateEditor().getUiComponent()).setText("");;
        vendaFrame.getjComboBoxProduto().setSelectedIndex(0);
        vendaFrame.getjTextFieldRegistroVendedor().setText("");
        vendaFrame.getjTextFieldDesconto().setText("");
        vendaFrame.getjTextFieldValorAcessorio().setText("");
    }
    
    //Gravar no BD
    public void Inserir(VendaFrame vendaFrame) throws SQLException {
        Venda venda = new Venda();
        VendaDao dao = new VendaDao();
        venda.setData(((JTextField)vendaFrame.getjDateChooserVenda().getDateEditor().getUiComponent()).getText());
        venda.setRegistroVendedor(Long.parseLong(vendaFrame.getjTextFieldRegistroVendedor().getText()));
        venda.setDesconto(Double.parseDouble(vendaFrame.getjTextFieldDesconto().getText()));
        venda.setValorAcessórios(Double.parseDouble(vendaFrame.getjTextFieldValorAcessorio().getText()));
        venda.setCódigoProduto(Long.parseLong(vendaFrame.getjComboBoxProduto().getSelectedItem().toString()));

        dao.adicionar(venda);
    }
    
        //Metodo para Salvar Campos após Verificação
    public void salvarCampos(VendaFrame vendaFrame) throws SQLException {
        if (validarCampos(vendaFrame)) {
            Inserir(vendaFrame);
            JOptionPane.showMessageDialog(vendaFrame, "Cadastro Salvo com Sucesso");
            limparTela(vendaFrame);
            consultar(vendaFrame);
        }
    }
    
    // Deletar um Registro 
    public void Deletar(Venda venda){
        try{
            int id;  
            id = Integer.parseInt(JOptionPane.showInputDialog("Informe o Id do Registro para ser Deletado"));
            
            VendaDao dao = new VendaDao();
            dao.remover(venda, id);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Cancelado");
        }
    }
    
}