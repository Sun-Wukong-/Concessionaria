package Persistencia;

import Modelo.Venda;
import Visao.VendaFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Wukong
 */
public class VendaDao {
    
    	private final Connection connection;
	
	// Conecção
	public VendaDao() throws SQLException {
		this.connection = ConnectionFactory.getConnection();
	}
        
    //Adicionar no BD
   public void adicionar(Venda venda) {
       VendaFrame vendaFrame = new VendaFrame();
        String sql = "insert into venda " +
             "(data,codigoVendedor,desconto,valorAcessorio,Produto_codigoProduto)" +
             " values (?,?,?,?,?)";
        try {
           // seta os valores
           try ( // prepared statement para inserção
                   PreparedStatement stmt = connection.prepareStatement(sql)) {
               // seta os valores
               stmt.setString(1,venda.getData());
               stmt.setLong(2,venda.getRegistroVendedor());
               stmt.setDouble(3, venda.getDesconto());
               stmt.setDouble(4,venda.getValorAcessórios());
               stmt.setLong(5, venda.getCódigoProduto());
               
               // executa
               stmt.execute();
           }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        } 
    }
    
    //Remover do BD
    public void remover(Venda venda, int id) {
        try {
             PreparedStatement stmt = connection
                     .prepareStatement("delete from venda where codigoVenda=?");
             stmt.setInt(1, id);
             stmt.execute();
             stmt.close();
         } catch (SQLException e) {
             throw new RuntimeException(e);
         }
     } 
   
    //Atualizar Tabela
    public ResultSet atualizarTabela(){
        PreparedStatement pst = null;
        ResultSet rs = null;
        
        try {
            String sql;
            sql = "select codigoVenda as CodigoVenda, codigoVendedor as RegistroVendedor, data as Data, Produto_codigoProduto as CodigoProduto, desconto as Desconto, valorAcessorio as ValorAcessorio, "
                    + "( produto.preco + venda.valorAcessorio - venda.desconto "
                    + ") as ValorTotal " //Calculo do Valor Total
                    + "from venda,produto where codigoProduto = Produto_codigoProduto";

            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();     
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
       return rs;
    }
   
    //Prrenche ComboBox com Código de Produto
    public void preencherComboCodigo(VendaFrame vendaFrame){
            try {
                String sql = "select * from produto order by codigoProduto";
                PreparedStatement pst = connection.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();

                while (rs.next()) { 
                    int codigo = rs.getInt("codigoProduto");
                    vendaFrame.getjComboBoxProduto().addItem(codigo);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
   }
}