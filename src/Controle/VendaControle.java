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
    public boolean Inserir(VendaFrame vendaFrame) throws SQLException {
        Venda venda = new Venda();
        try{
            venda.setData(((JTextField)vendaFrame.getjDateChooserVenda().getDateEditor().getUiComponent()).getText());
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(vendaFrame, "Erro Formato Campo Data");
            return false;
        }
        try{
            venda.setRegistroVendedor(Long.parseLong(vendaFrame.getjTextFieldRegistroVendedor().getText()));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(vendaFrame, "Erro Formato Campo Registro Vendedor");
            return false;
        }
        try{
            venda.setDesconto(Double.parseDouble(vendaFrame.getjTextFieldDesconto().getText()));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(vendaFrame, "Erro Formato Campo Desconto");
            return false;
        }
        try{
            venda.setValorAcessórios(Double.parseDouble(vendaFrame.getjTextFieldValorAcessorio().getText()));
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(vendaFrame, "Erro Formato Campo Valor Acessorio");
            return false;
        }
        venda.setCódigoProduto(Long.parseLong(vendaFrame.getjComboBoxProduto().getSelectedItem().toString()));
        
        VendaDao dao = new VendaDao();
        dao.adicionar(venda);
        return true;
    }
    
        //Metodo para Salvar Campos após Verificação
    public void salvarCampos(VendaFrame vendaFrame) throws SQLException {
        if (validarCampos(vendaFrame)) {
            if(Inserir(vendaFrame)){
                JOptionPane.showMessageDialog(vendaFrame, "Cadastro Salvo com Sucesso");
                limparTela(vendaFrame);
                consultar(vendaFrame);
            }
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