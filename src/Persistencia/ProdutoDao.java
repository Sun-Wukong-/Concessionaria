package Persistencia;

import Modelo.Produto;
import Visao.ProdutoFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Wukong
 */
public class ProdutoDao {
    
    	private final Connection connection;
	
	// Conecção
	public ProdutoDao() throws SQLException {
		this.connection = ConnectionFactory.getConnection();
	}
        
    //Adicionar no BD
   public void adicionar(Produto produto) {
       ProdutoFrame alunoFrame = new ProdutoFrame();
        String sql = "insert into produto " +
             "(modelo,marca,ano,cor,preco)" +
             " values (?,?,?,?,?)";
 
        try {
           // seta os valores
           try ( // prepared statement para inserção
                   PreparedStatement stmt = connection.prepareStatement(sql)) {
               // seta os valores
               stmt.setString(1,produto.getModelo());
               stmt.setString(2,produto.getMarca());
               stmt.setInt(3, produto.getAno());
               stmt.setString(4,produto.getCor());
               stmt.setDouble(5,produto.getPreco());
               
               // executa
               stmt.execute();
           }
        }catch (SQLException e) {
            throw new RuntimeException(e);
        } 
    }
   
     //Alterar BD
    public void alterar(Produto produto) {
        String sql = "update produto set modelo=?, marca=? , ano=?, cor=?, preco=? "+
            "where codigoProduto=? ";
        
        try {
            try (PreparedStatement stmt = connection
                    .prepareStatement(sql)) {
                stmt.setString(1,produto.getModelo());
                stmt.setString(2,produto.getMarca());
                stmt.setInt(3, produto.getAno());
                stmt.setString(4,produto.getCor());
                stmt.setDouble(5,produto.getPreco());
                stmt.setLong(6, produto.getCodigo());
                stmt.executeUpdate();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }   
    }
    
    //Remover BD
    public void remover(Produto produto, int id) {
        try {
             PreparedStatement stmt = connection
                     .prepareStatement("delete from produto where codigoProduto=?");
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
            sql = "select codigoProduto as CodigoProduto, marca as Marca, modelo as Modelo, ano as Ano, cor as Cor, preco as Preco from produto";

            pst = connection.prepareStatement(sql);
            rs = pst.executeQuery();     
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
       return rs;
    }

    
}
