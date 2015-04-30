package Persistencia;

import Visao.ProdutoAlterarFrame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Wukong
 */
public class ProdutoAlterarDao {
    
   // a conexão com o banco de dados
   private Connection connection;
 
   public ProdutoAlterarDao() throws SQLException {
     this.connection = new ConnectionFactory().getConnection();
   }
    
        public void preencherComboCodigo(ProdutoAlterarFrame produoFrame){
            try {
                String sql = "select * from produtoF order by codigoProduto";
                PreparedStatement pst = connection.prepareStatement(sql);
                ResultSet rs = pst.executeQuery();

                while (rs.next()) { 
                    int codigo = rs.getInt("codigoProduto");
                    produoFrame.getjComboBoxCodigo().addItem(codigo);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    
        
    public void preencherCodigoText(ProdutoAlterarFrame produtoFrame){
        try{
            String var = produtoFrame.getjComboBoxCodigo().getSelectedItem().toString();
            String sql = "select marca,modelo,ano,cor,preco from produtoF where codigoProduto = ?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, var);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                String cor = rs.getString("cor");
                int ano = rs.getInt("ano");
                double preco = rs.getDouble("preco");
                
                produtoFrame.getjTextFieldMarca().setText(marca);
                produtoFrame.getjTextFieldModelo().setText(modelo);
                produtoFrame.getjTextFieldCor().setText(cor);
                produtoFrame.getjTextFieldAno().setText(String.valueOf(ano));
                produtoFrame.getjTextFieldPreco().setText(String.valueOf(preco));
            }
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
}
