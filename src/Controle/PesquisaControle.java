package Controle;

import Persistencia.PesquisaDao;
import Visao.PesquisaFrame;
import java.sql.SQLException;

/**
 *
 * @author Wukong
 */
public class PesquisaControle {
    
    public void limparTela(PesquisaFrame pesquisaFrame) throws SQLException{
        pesquisaFrame.getjComboBoxDataVenda().setEnabled(false);
        pesquisaFrame.getjComboBoxVenda().setEnabled(false);
        pesquisaFrame.getjComboBoxRegistroVendedor().setEnabled(false);
        pesquisaFrame.getjComboBoxRegistroVendedor().setSelectedIndex(0);
        pesquisaFrame.getjComboBoxDataVenda().setSelectedIndex(0);
        pesquisaFrame.getjComboBoxVenda().setSelectedIndex(0);
        PesquisaDao dao = new PesquisaDao();
        dao.limparJtable(pesquisaFrame);
    }
    
    public void PesquisarVendedor(PesquisaFrame pesquisaFrame) throws SQLException{
        limparTela(pesquisaFrame);
        pesquisaFrame.getjComboBoxRegistroVendedor().setEnabled(true);
    }
    
    public void PesquisarData(PesquisaFrame pesquisaFrame) throws SQLException{
        limparTela(pesquisaFrame);
        pesquisaFrame.getjComboBoxDataVenda().setEnabled(true);
    }
    
     public void PesquisarVenda(PesquisaFrame pesquisaFrame) throws SQLException{
        limparTela(pesquisaFrame);
        pesquisaFrame.getjComboBoxVenda().setEnabled(true);
    }
    
}
