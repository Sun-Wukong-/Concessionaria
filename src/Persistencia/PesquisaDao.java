package Persistencia;

import Visao.PesquisaFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Wukong
 */
public class PesquisaDao {
    
    private final Connection connection;
	
	// Conecção
	public PesquisaDao() throws SQLException {
		this.connection = ConnectionFactory.getConnection();
	}
    
    public void limparJtable(PesquisaFrame pesquisaFrame){
        try{

            DefaultTableModel dtm = (DefaultTableModel) pesquisaFrame.getjTableAdicionais().getModel();
            DefaultTableModel dtm2 = (DefaultTableModel) pesquisaFrame.getjTableBasicas().getModel();
            
            dtm.setNumRows(0);
            dtm.setNumRows(0);

        }catch(Exception e){
        }
    }    
        
    public void preencherComboVendedor(PesquisaFrame pesquisaFrame){
            try {
                String sql = "select DISTINCT codigoVendedor from venda order by codigoVendedor";
                PreparedStatement pst = connection.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();

                while (rs.next()) { 
                        int codigo = rs.getInt("codigoVendedor");
                        pesquisaFrame.getjComboBoxRegistroVendedor().addItem(codigo);    
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
   }
    
     public void preencherJTableAdicionarVendedor(PesquisaFrame pesquisaFrame) {
        try {
            String var = pesquisaFrame.getjComboBoxRegistroVendedor().getSelectedItem().toString();
            String sql = "select count(codigoVendedor) as vendedor,sum(preco + valorAcessorio - desconto) as total from venda join produto where codigoVendedor = ? and codigoProduto = Produto_codigoProduto";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1,(var));
            ResultSet rs = pst.executeQuery();
            
            DefaultTableModel model = (DefaultTableModel) pesquisaFrame.getjTableAdicionais().getModel();
            model.setRowCount(0);
            while (rs.next()) { 
                int vendedor = rs.getInt("vendedor");
                int total = rs.getInt("total");
                Object[][] data = {{vendedor,total}};
                model.insertRow(pesquisaFrame.getjTableAdicionais().getRowCount(), new Object[] {vendedor,total});
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
     
     public void preencherComboData(PesquisaFrame pesquisaFrame){
            try {
                String sql = "select DISTINCT data from venda order by data";
                PreparedStatement pst = connection.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();

                while (rs.next()) { 
                        String data = rs.getString("data");
                        pesquisaFrame.getjComboBoxDataVenda().addItem(data);    
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
   }
     
    public void preencherJTableAdicionarData(PesquisaFrame pesquisaFrame) {
        try {
            String var = pesquisaFrame.getjComboBoxDataVenda().getSelectedItem().toString();
            String sql = "select count(data) as vendedor,sum(preco + valorAcessorio - desconto) as total from venda join produto where data = ? and codigoProduto = Produto_codigoProduto";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, var);
            ResultSet rs = pst.executeQuery();
            
            DefaultTableModel model = (DefaultTableModel) pesquisaFrame.getjTableAdicionais().getModel();
            model.setRowCount(0);
            while (rs.next()) { 
                int vendedor = rs.getInt("vendedor");
                int total = rs.getInt("total");
                Object[][] data = {{vendedor,total}};
                model.insertRow(pesquisaFrame.getjTableAdicionais().getRowCount(), new Object[] {vendedor,total});
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void preencherComboVenda(PesquisaFrame pesquisaFrame){
            try {
                String sql = "select codigoVenda from venda order by codigoVenda";
                PreparedStatement pst = connection.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();

                while (rs.next()) { 
                        int codigo = rs.getInt("codigoVenda");
                        pesquisaFrame.getjComboBoxVenda().addItem(codigo);    
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
   }
     
    public void preencherJTableAdicionarVenda(PesquisaFrame pesquisaFrame) {
        try {
            String var = pesquisaFrame.getjComboBoxVenda().getSelectedItem().toString();
            String sql = sql = "select codigoVenda as CodigoVenda, codigoVendedor as RegistroVendedor, data as Data, Produto_codigoProduto as CodigoProduto, desconto as Desconto, valorAcessorio as ValorAcessorio, "
                    + "( produto.preco + venda.valorAcessorio - venda.desconto "
                    + ") as ValorTotal "
                    + "from venda,produto where codigoVenda = ? and codigoProduto = Produto_codigoProduto";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, var);
            ResultSet rs = pst.executeQuery();
            
            DefaultTableModel model = (DefaultTableModel) pesquisaFrame.getjTableBasicas().getModel();
            model.setRowCount(0);
            while (rs.next()) { 
                int codigoVenda = rs.getInt("CodigoVenda");
                int codigoVendedor = rs.getInt("RegistroVendedor");
                String dataVenda = rs.getString("Data");
                int codigoProduto = rs.getInt("CodigoProduto");
                double desconto = rs.getDouble("Desconto");
                double acessorio = rs.getDouble("ValorAcessorio");
                double valorTotal = rs.getDouble("ValorTotal");
                Object[][] data = {{codigoVenda,codigoVendedor,dataVenda,codigoProduto,desconto,acessorio,valorTotal}};
                model.insertRow(pesquisaFrame.getjTableBasicas().getRowCount(), new Object[] {codigoVenda,codigoVendedor,dataVenda,codigoProduto,desconto,acessorio,valorTotal});
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
