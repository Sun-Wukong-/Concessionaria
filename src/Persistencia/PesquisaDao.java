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
    
     public void preencherJTableAdicionais(PesquisaFrame pesquisaFrame) {
        try {
            String var = pesquisaFrame.getjComboBoxRegistroVendedor().getSelectedItem().toString();
            String sql = "select count(codigoVendedor) as vendedor,sum(preco + valorAcessorio - desconto) as total from venda join produto where codigoVendedor = ? and codigoProduto = Produto_codigoProduto";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setInt(1, Integer.parseInt(var));
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
    
}
