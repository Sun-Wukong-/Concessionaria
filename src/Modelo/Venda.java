package Modelo;

/**
 *
 * @author Wukong
 */
public class Venda {
    
    private long identificadorVenda;
    private String dataVenda;
    private long registroVendedor;
    private long códigoProduto; 
    private float descontoVenda;
    private float valorAcessórios;
    private float valorTotalVenda;

    /**
     * @return the identificadorVenda
     */
    public long getIdentificadorVenda() {
        return identificadorVenda;
    }

    /**
     * @param identificadorVenda the identificadorVenda to set
     */
    public void setIdentificadorVenda(long identificadorVenda) {
        this.identificadorVenda = identificadorVenda;
    }

    /**
     * @return the dataVenda
     */
    public String getDataVenda() {
        return dataVenda;
    }

    /**
     * @param dataVenda the dataVenda to set
     */
    public void setDataVenda(String dataVenda) {
        this.dataVenda = dataVenda;
    }

    /**
     * @return the registroVendedor
     */
    public long getRegistroVendedor() {
        return registroVendedor;
    }

    /**
     * @param registroVendedor the registroVendedor to set
     */
    public void setRegistroVendedor(long registroVendedor) {
        this.registroVendedor = registroVendedor;
    }

    /**
     * @return the códigoProduto
     */
    public long getCódigoProduto() {
        return códigoProduto;
    }

    /**
     * @param códigoProduto the códigoProduto to set
     */
    public void setCódigoProduto(long códigoProduto) {
        this.códigoProduto = códigoProduto;
    }

    /**
     * @return the descontoVenda
     */
    public float getDescontoVenda() {
        return descontoVenda;
    }

    /**
     * @param descontoVenda the descontoVenda to set
     */
    public void setDescontoVenda(float descontoVenda) {
        this.descontoVenda = descontoVenda;
    }

    /**
     * @return the valorAcessórios
     */
    public float getValorAcessórios() {
        return valorAcessórios;
    }

    /**
     * @param valorAcessórios the valorAcessórios to set
     */
    public void setValorAcessórios(float valorAcessórios) {
        this.valorAcessórios = valorAcessórios;
    }

    /**
     * @return the valorTotalVenda
     */
    public float getValorTotalVenda() {
        return valorTotalVenda;
    }

    /**
     * @param valorTotalVenda the valorTotalVenda to set
     */
    public void setValorTotalVenda(float valorTotalVenda) {
        this.valorTotalVenda = valorTotalVenda;
    }

    
}
