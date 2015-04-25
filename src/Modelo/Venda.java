package Modelo;

/**
 *
 * @author Wukong
 */
public class Venda {
    
    private long codigo;
    private String data;
    private long registroVendedor;
    private long códigoProduto; 
    private double desconto;
    private double valorAcessórios;

    /**
     * @return the codigo
     */
    public long getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
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
     * @return the desconto
     */
    public double getDesconto() {
        return desconto;
    }

    /**
     * @param desconto the desconto to set
     */
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    /**
     * @return the valorAcessórios
     */
    public double getValorAcessórios() {
        return valorAcessórios;
    }

    /**
     * @param valorAcessórios the valorAcessórios to set
     */
    public void setValorAcessórios(double valorAcessórios) {
        this.valorAcessórios = valorAcessórios;
    }
}
